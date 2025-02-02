package prog.unidad05.listas.ejercicio07;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;


public class GestionAlumnosApp {
  
  private static final int OPCION_ANYADIR = 1;
  private static final int OPCION_LISTAR = 2;
  private static final int OPCION_ELIMINAR= 3;
  Scanner sc;
  List<Alumno> lista;
  
  public GestionAlumnosApp() {
    sc = new Scanner(System.in);
    lista = new ArrayList<>();
  }
  

  public static void main(String[] args) {
    GestionAlumnosApp app = new GestionAlumnosApp();
    
    app.run();
  }


  private void run() {
    int opcion = -1;
    
    do {
      opcion = imprimeMenu();
      switch (opcion) {
      case OPCION_ANYADIR:
        anyadeAlumno();
        break;
      case OPCION_LISTAR:
        listaAlumnos();
        break;
      case OPCION_ELIMINAR:
        eliminaAlumno();
        break;
      }
      
      if (!compruebaOpcion(opcion)) {
        System.out.println("Opcion elegida incorrecta. Las opciones validas son entre 0 y 3");
        System.out.println();
      }
    } while (opcion != 0);
    
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
    System.out.println("0.- Salir de la aplicacion");
    System.out.print("Elija una opcion (0-3): ");
    int opcion = Integer.parseInt(sc.nextLine());
    
    return opcion;
  }


  private boolean compruebaOpcion(int opcion) {
    return opcion >= 0 && opcion <= 3;
  }


  private void imprimeCabera(String string) {
    System.out.println(string.toUpperCase());
    for (int i = 0; i < string.length(); i++) {
      System.out.print("-");
    }
    System.out.println();
  }

}
