package prog.unidad05.listas.ejercicio08;

import java.util.ArrayList;
import java.util.List;

public class Alumno {
  
  private String dni;
  
  private String nombre;
  
  private int edad;
  
  private List<Double> calificaciones;

  public void getCalificaciones() {
    for (double calificacion: calificaciones) {
      System.out.println(calificacion);
    }
    System.out.println();
  }



  public void anyadeCalificacion(double calificacion) {
    calificaciones.add(calificacion);
  }



  public Alumno(String dni, String nombre, int edad) {
    if (verificaTodo(dni, nombre, edad)) {
      this.dni = dni;
      this.nombre = nombre;
      this.edad = edad;
      this.calificaciones = new ArrayList<>();
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
