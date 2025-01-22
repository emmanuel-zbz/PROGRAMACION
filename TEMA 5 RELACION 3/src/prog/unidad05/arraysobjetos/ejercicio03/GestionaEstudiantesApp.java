package prog.unidad05.arraysobjetos.ejercicio03;
import java.util.Scanner;

public class GestionaEstudiantesApp {
  
  private static final int OPCION_AGREGAR = 1;
  private static final int OPCION_MOSTRAR = 2;
  private static final int OPCION_ELIMINAR = 3;
  private static final int OPCION_BUSCAR_NOMBRE = 4;
  private static final int OPCION_BUSCAR_DNI = 5;
  private static final int OPCION_SALIR = 0;


  
  


  
  Estudiante[] estudiantes;
  Scanner sc;
  
  public GestionaEstudiantesApp() {
    estudiantes = new Estudiante[0];
    sc = new Scanner(System.in);
  }

  public static void main(String[] args) {
    GestionaEstudiantesApp app = new GestionaEstudiantesApp();
    
    app.run();
    
  }

  private void run() {
    int opcion = -1;
    
    do {
      opcion = imprimeMenu();
      
      switch (opcion) {
      case OPCION_AGREGAR:
        agregarEstudiante();
        break;
      case OPCION_MOSTRAR:
        mostrarEstudiante();
        break;
      case OPCION_ELIMINAR:
        eliminarEstudiante();
        break;
      case OPCION_BUSCAR_NOMBRE:
        buscarNombre();
        break;
      case OPCION_BUSCAR_DNI:
        buscarDNI();
        break;
      case OPCION_SALIR:
        break;
      }
    } while (opcion != 0);
    
  }

  private void agregarEstudiante() {
    imprimeCabecera("agregar estudiante");
    System.out.print("Introduzca el DNI del estudiante (8 numeros y una letra mayuscula, sin espacios): ");
    String DNI = sc.nextLine();
    System.out.print("Introduzca el nombre del estudiante (entre 1 y 100 caracteres): ");
    String nombre = sc.nextLine();
    System.out.print("Introduzca el curso del estudiante (primero/segundo/master): ");
    String curso = sc.nextLine();
    
    Estudiante estudiante = new Estudiante(DNI, nombre, curso);
    
    ampliaArray();
    
    estudiantes[estudiantes.length - 1] = estudiante;
  }

  private void ampliaArray() {
    Estudiante[] nuevoEstudiante = new Estudiante[estudiantes.length + 1];
    
    for (int i = 0; i < estudiantes.length; i++) {
      nuevoEstudiante[i] = estudiantes[i];
    }
    
    estudiantes = nuevoEstudiante;
    
  }

  private void mostrarEstudiante() {
    imprimeCabecera("Mostrar estudiante");
    imprimeEstudiante();
  }

  private void imprimeEstudiante() {
    for (int i = 0; i < estudiantes.length; i++) {
      System.out.printf("DNI: %s, Nombre: %s, Curso: %s%n", estudiantes[i].getDni(), estudiantes[i].getNombre(), estudiantes[i].getCurso());
    }
  }

  private void eliminarEstudiante() {
    imprimeCabecera("Eliminar estudiante");
    
    System.out.print("Introduzca el DNI del estudiante a eliminar: ");
    String dniEliminar = sc.nextLine();
    
    disminuyeArray(dniEliminar);
    System.out.println("Estudiante eliminado");
  }

  private void disminuyeArray(String dniEliminar) {
    Estudiante[] estudianteMenos = new Estudiante[estudiantes.length - 1];
    
    for (int i = 0; i < estudianteMenos.length; i++) {
      if (estudiantes[i].getDni().equals(dniEliminar)) {
        i++;
        estudianteMenos[i - 1] = estudiantes[i];
        i--;
      } else {
        estudianteMenos[i] = estudiantes[i + 1];
      }
    }
    estudiantes = estudianteMenos;
  }

  private void buscarNombre() {
    System.out.print("Introduzca el texto de busqueda: ");
    String nombre = sc.nextLine();
    
    for (int i = 0; i < estudiantes.length; i++) {
      if (estudiantes[i].getNombre().contains(nombre)) {
        imprimeEstudiante();
      }
    }
  }

  private void buscarDNI() {
    // TODO Auto-generated method stub
    
  }

  private int imprimeMenu() {
    imprimeCabecera("gestion de estudiantes");
    System.out.println("(1) Agregar estudiante");
    System.out.println("(2) Mostrar todos los estudiantes");
    System.out.println("(3) Eliminar estudiante");
    System.out.println("(4) Buscar  estudiante por nombre");
    System.out.println("(5) Buscar estudiante por DNI");
    System.out.println("(0) Salir de la aplicacion");
    System.out.print("Introduzca una opcion (0-5): ");

    int opcion = Integer.parseInt(sc.nextLine());
    
    return opcion;
  }

  private void imprimeCabecera(String string) {
    System.out.println(string.toUpperCase());
    for (int i = 0; i < string.length(); i++) {
      System.out.print("-");
    }
    System.out.println();
    
  }

}
