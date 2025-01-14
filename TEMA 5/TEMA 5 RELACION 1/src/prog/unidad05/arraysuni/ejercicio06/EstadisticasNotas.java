package prog.unidad05.arraysuni.ejercicio06;


public class EstadisticasNotas {
  
  
  
  private int[] frecuencia;
  
  
  public EstadisticasNotas() {
     frecuencia = new int[11];

  }
  
  public void addCalificacion(int calificacion) {
    if (calificacion >= 0 && calificacion <= 10) {
      frecuencia[calificacion]++;
    } else {
      throw new IllegalArgumentException();
    }
    

  }
  
  public double calificacionMedia(){
     
    double total = 0;
    int numeral = 0;
    for (int i = 0; i < frecuencia.length; i++) {
      total += frecuencia[i] * i;
      numeral += frecuencia[i];
    }
    if (numeral > 0) {
      return total / numeral;
    } else {
      return 0;
    }
}
  
  public int calificacionModa() throws EstadisticasNotasException{
    
    int mayorFrecuencia = frecuencia[0];
    
    int lugarMayorFrecuencia = 0;
    for (int i = 0; i < frecuencia.length; i++) {
      if (frecuencia[i] > mayorFrecuencia) {
        mayorFrecuencia = frecuencia[i];
        lugarMayorFrecuencia = i;
      }
    }
    if (mayorFrecuencia == 0) {
      throw new EstadisticasNotasException();
    } else {
      return lugarMayorFrecuencia;
    }
  }
  

}