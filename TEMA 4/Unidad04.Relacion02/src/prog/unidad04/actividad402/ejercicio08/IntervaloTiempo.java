package prog.unidad04.actividad402.ejercicio08;

public class IntervaloTiempo {
  
  private int horas;
  
  private int minutos;
  
  private int segundos;
  
  public IntervaloTiempo(int horas, int minutos, int segundos) {
    
    while(segundos >= 60) {
      segundos -= 60;
      minutos++;
    }
    
    this.segundos = segundos;
    this.minutos = minutos;
    this.horas = horas;
  }

  public IntervaloTiempo suma(IntervaloTiempo otro) {
    
    int segundosTemporales = segundos + otro.segundos;
    int segundosReales = segundosTemporales % 60;
    int minutosExtra = segundosTemporales / 60;
    
    int minutosTemporales = minutos + otro.minutos + minutosExtra;
    int minutosReales = minutosTemporales % 60;
    int horasExtra = minutosTemporales / 60;
    
    int horasReales = horas + otro.horas + horasExtra;
    
    IntervaloTiempo sumado = new IntervaloTiempo(horasReales, minutosReales, segundosReales);
    
    return sumado;
  }
  
  
  public IntervaloTiempo resta(IntervaloTiempo otro) {
    
    int segundosReales = 0;
    int segundosTemporales = segundos - otro.segundos;
    int minutosRestado = 0;
    if (segundosTemporales < 0) {
      segundosReales = segundosTemporales + 60;
      minutosRestado++;
    } else {
      segundosReales = segundosTemporales;
    }
    
    int minutosReales = 0;
    int horasRestado = 0;
    int minutosTemporales = minutos - otro.minutos - minutosRestado;
    if (minutosTemporales < 0) {
      minutosReales = minutosTemporales + 60;
      horasRestado++;
    } else {
      minutosReales = minutosTemporales;
    }
  
    int horasReales = horas - otro.horas - horasRestado;
    
    IntervaloTiempo restado = new IntervaloTiempo(horasReales, minutosReales, segundosReales);
    return restado;

  }
}
