package prog.unidad04.practica406.libreria;

public class Vehiculo {
  
  private static final String ABECEDARIO = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
  
  private static int VehiculosMatriculados;

  private String matricula;

  private Fecha fechaMatriculacion;

  
  protected Vehiculo(String matricula, Fecha fechaMatriculacion) {
    
    this.matricula = matricula.replace(" ", "");
    
    
    for (int i = 4; i <= 6; i++) {
      if ((this.matricula.length() != 7) || ABECEDARIO.indexOf(this.matricula.charAt(i)) == -1) {
        throw new IllegalArgumentException("No se pudo crear el automóvil. Revise los datos para comprobar que todos son correctos");
      }
    }
    
    this.fechaMatriculacion = fechaMatriculacion;
    
    VehiculosMatriculados++;
  }

  

  
 
  public static int getVehiculosMatriculados() {
    return VehiculosMatriculados;
  }





  public String getMatricula() {
    return matricula;
  }





  public Fecha getFechaMatriculacion() {
    return fechaMatriculacion;
  }










  
  public String toString() {
    return "Vehiculo Matricula: " + matricula + ", Fecha Matriculacion: " + fechaMatriculacion;
  }
  
 
  
  
}