package prog.unidad05.arraysuni.ejercicio06;


public class EstadisticasNotas {
  
  private int calificacionesTotal;
  
  private int contadorCalificaciones;
  
  
  public EstadisticasNotas() {
    this.calificacionesTotal = 0;
    this.contadorCalificaciones = 0;

  }
  
  public void addCalificacion(int calificacion) {
    if (calificacion >= 0 && calificacion <= 10) {
      calificacionesTotal += calificacion;
      contadorCalificaciones++;
    } else {
      throw new IllegalArgumentException();
    }
    

  }
  
  public double calificacionMedia() {
    if (contadorCalificaciones == 0) {
        return 0; // O lanzar una excepción, según tus requisitos
    }
    
    return (double) calificacionesTotal / contadorCalificaciones;
}
  
  public int calificacionModa() {
    
  }
  

}
