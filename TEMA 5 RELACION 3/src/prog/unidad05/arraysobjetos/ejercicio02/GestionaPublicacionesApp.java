package prog.unidad05.arraysobjetos.ejercicio02;
import java.util.Scanner;

public class GestionaPublicacionesApp {
  
  private static final int OPCION_SALIR = 0;
  private static final int OPCION_AGREGAR = 1;
  private static final int OPCION_MOSTRAR = 2;
  private static final int OPCION_BUSCAR_TITULO= 3;
  private static final int OPCION_BUSCAR_ANYO= 4;
  
  Publicacion[] publicaciones;
  Scanner sc;
  
  public GestionaPublicacionesApp() {
    publicaciones = new Publicacion[0];
    sc = new Scanner(System.in);
  }

  

  public static void main(String[] args) {
    GestionaPublicacionesApp app = new GestionaPublicacionesApp();
    
    app.run();
  }



  private void run() {
    int opcion = -1;
    
    do {
      opcion = imprimeMenu();
      switch (opcion) {
      case OPCION_AGREGAR:
        agregarPublicacion();
        break;
      case OPCION_MOSTRAR:
        mostrarPublicacion();
        break;
      case OPCION_BUSCAR_TITULO:
        buscarTitulo();
        break;
      case OPCION_BUSCAR_ANYO:
        buscarAnyo();
        break;
      }
      
    } while (opcion != 0);
  
    
  }



  private int imprimeMenu() {
    imprimeTitulo("Gestion de Libros");
    System.out.println("(1) Agregar libro");
    System.out.println("(2) Mostrar todos los libros");
    System.out.println("(3) Buscar libro por titulo");
    System.out.println("(4) Buscar libro por año de publicacion");
    System.out.println("(0) Salir de la aplicacion");
    System.out.print("Introduzca una opcion (0-4): ");
    int opcion = Integer.parseInt(sc.nextLine());
    
    return opcion;
  }



  private static void imprimeTitulo(String titulo) {
    System.out.println(titulo.toUpperCase());
    for(int i = 0; i < titulo.length(); i++) {
      System.out.print("-");
    }
    System.out.println();
  }



  private void agregarPublicacion() {
    imprimeTitulo("agregar publicacion");
    
    System.out.print("¿Qué tipo de publicacioón quiere crear, libro o revista? (l/r): ");
    char opcion = sc.nextLine().charAt(0);
    
    switch (opcion) {
    case 'r':
      agregaRevista();
      break;
    case 'l':
      agregaLibro();
      break;
  }
    
  }



  private void agregaRevista() {
    System.out.print("Introduzca el titulo de la revista: ");
    String titulo = sc.nextLine();
    System.out.print("Introduzca el nombre del autor de la revista: ");
    String autor = sc.nextLine();
    System.out.print("Introduzca el año de publicacion de la revista: ");
    int anyo = Integer.parseInt(sc.nextLine());    
    
    ampliaArray();
    
    Publicacion nueva = new Publicacion(titulo, autor, anyo);
    
    publicaciones[publicaciones.length - 1] = nueva;
  }



  private void ampliaArray() {
    Publicacion[] nuevaPublicacion = new Publicacion[publicaciones.length + 1];
    
    for (int i = 0; i < publicaciones.length; i++) {
      nuevaPublicacion[i] = publicaciones[i];
    }
    
    publicaciones = nuevaPublicacion;
    
  }



  private void agregaLibro() {
    System.out.print("Introduzca el titulo del libro: ");
    String titulo = sc.nextLine();
    System.out.print("Introduzca el nombre del autor del libro: ");
    String autor = sc.nextLine();
    System.out.print("Introduzca el año de publicacion del libro: ");
    int anyo = Integer.parseInt(sc.nextLine()); 
    
    ampliaArray();
    
    Publicacion nueva = new Publicacion(titulo, autor, anyo);
    
    publicaciones[publicaciones.length - 1] = nueva;
    
  }



  private void mostrarPublicacion() {
    // TODO Auto-generated method stub
    
  }



  private void buscarTitulo() {
    // TODO Auto-generated method stub
    
  }



  private void buscarAnyo() {
    // TODO Auto-generated method stub
    
  }

}
