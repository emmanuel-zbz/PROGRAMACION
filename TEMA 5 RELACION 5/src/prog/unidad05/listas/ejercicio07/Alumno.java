package prog.unidad05.listas.ejercicio07;

public class Alumno {
  
  private String dni;
  
  private String nombre;
  
  private int edad;

  public Alumno(String dni, String nombre, int edad) {
    if (verificaTodo(dni, nombre, edad)) {
      this.dni = dni;
      this.nombre = nombre;
      this.edad = edad;
    } else {
      System.out.println("Error. Alguno de los datos proporcionados no es valido");
    }
    
  }

  
  
   public String getDni() {
    return dni;
  }



  protected boolean verificaTodo(String dni, String nombre, int edad) {
    if (dni.length() > 9 || dni.length() < 9) {
      return false;
    }
    if (nombre.isEmpty()) {
      return false;
    }
    if (edad < 0) {
      return false;
    }
    return true;
  }

   
  @Override
  public String toString() {
    return "DNI: " + dni + ", Nombre: " + nombre + ", Edad: " + edad;
  }

   
   
  
  
  

}
