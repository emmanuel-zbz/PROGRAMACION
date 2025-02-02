package prog.unidad05.listas.ejercicio08;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;


public class GestionAlumnosConCalificacionesApp {
  
  private static final int OPCION_ANYADIR_ALUMNO = 1;
  private static final int OPCION_LISTAR_ALUMNOS = 2;
  private static final int OPCION_ELIMINAR = 3;
  private static final int OPCION_ANYADIR_CALIFICACION = 4;
  private static final int OPCION_LISTAR_CALIFICACIONES= 5;
  Scanner sc;
  List<Alumno> lista;
  
  public GestionAlumnosConCalificacionesApp() {
    sc = new Scanner(System.in);
    lista = new ArrayList<>();
  }
  

  public static void main(String[] args) {
    GestionAlumnosConCalificacionesApp app = new GestionAlumnosConCalificacionesApp();
    
    app.run();
  }


  private void run() {
    int opcion = -1;
    
    do {
      opcion = imprimeMenu();
      switch (opcion) {
      case OPCION_ANYADIR_ALUMNO:
        anyadeAlumno();
        break;
      case OPCION_LISTAR_ALUMNOS:
        listaAlumnos();
        break;
      case OPCION_ELIMINAR:
        eliminaAlumno();
        break;
      case OPCION_ANYADIR_CALIFICACION:
        anyadeCalificacion();
        break;
      case OPCION_LISTAR_CALIFICACIONES:
        listaCalificaciones();
        break;
      }
      
      if (!compruebaOpcion(opcion)) {
        System.out.println("Opcion elegida incorrecta. Las opciones validas son entre 0 y 3");
        System.out.println();
      }
    } while (opcion != 0);
    
  }


  private void anyadeCalificacion() {
    imprimeCabera("Añadir calificacion a un alumno");
    System.out.print("Introduzca el DNI del alumno al que quiere añadir una calificacion: ");
    String dniAnyadirCalificacion = sc.nextLine();
    
    for (int i = 0; i < lista.size(); i++) {
      if (lista.get(i).getDni().equals(dniAnyadirCalificacion)) {
        System.out.print("Introduzca ahora la calificacion a añadir: ");
        double calificacion = Double.parseDouble(sc.nextLine());
        lista.get(i).anyadeCalificacion(calificacion);
        System.out.println("Calificacion añadida con exito");
      }
    }
  }


  private void listaCalificaciones() {
    imprimeCabera("Listar calificaciones de un alumno");
    System.out.print("Introduzca el DNI del alumno del que quiere listar las calificaciones: ");
    String dniListarCalificaciones = sc.nextLine();
    
    for (Alumno alumno: lista) {
      if (alumno.getDni().equals(dniListarCalificaciones)) {
        System.out.println("Las calificaciones del alumno son:");
        alumno.getCalificaciones();
      }
    }
  }


  private void anyadeAlumno() {
    imprimeCabera("Añadir alumno");
    System.out.print("Introduzca el DNI del alumno (9 caracteres): ");
    String dni = sc.nextLine();
    
    System.out.print("Introduzca el nombre del alumno (no puede dejarse en blanco): ");
    String nombre = sc.nextLine();
    
    System.out.print("Introduzca la edad del alumno (debe ser mayor o igual a cero): ");
    int edad;
    try {
      edad = Integer.parseInt(sc.nextLine());
      Alumno alumno = new Alumno(dni, nombre, edad);
      
      if (alumno.verificaTodo(dni, nombre, edad)) {
        lista.add(alumno);
        System.out.println("Alumno añadido con exito");
      }
    } catch (NumberFormatException e) {
      System.out.println("Error. La edad introducida no es un numero valido");
    }
    
  }


  private void listaAlumnos() {
    imprimeCabera("Listar alumnos");
    
    if (!lista.isEmpty()) {
      for (Alumno alumno: lista) {
        System.out.println(alumno);
    }
      
    } else {
      System.out.println("No se han añadido alumnos");
    }
  }


  private void eliminaAlumno() {
    imprimeCabera("eliminar alumno");
    System.out.print("Introduzca el DNI del alumno a eliminar: ");
    String dniEliminar = sc.nextLine();
    
    boolean encontrado = false;
    for (int i = 0; i < lista.size(); i++) {
      if (lista.get(i).getDni().equals(dniEliminar)) {
        encontrado = true;
        lista.remove(i);
        System.out.println("Alumno eliminado con exito");
      } 
    }
    if (!encontrado) {
      System.out.println("Alumno no encontrado");
    }
    
  }


  private int imprimeMenu() {
    imprimeCabera("menu principal");
    System.out.println("1.- Añadir alumno");
    System.out.println("2.- Listar alumnos existentes");
    System.out.println("3.- Eliminar alumno");
    System.out.println("4.- Añadir calificacion a un alumno");
    System.out.println("5.- Listar calificaciones de un alumno");
    System.out.println("0.- Salir de la aplicacion");
    System.out.print("Elija una opcion (0-3): ");
    int opcion = Integer.parseInt(sc.nextLine());
    
    return opcion;
  }


  private boolean compruebaOpcion(int opcion) {
    return opcion >= 0 && opcion <= 5;
  }


  private void imprimeCabera(String string) {
    System.out.println(string.toUpperCase());
    for (int i = 0; i < string.length(); i++) {
      System.out.print("-");
    }
    System.out.println();
  }

}

