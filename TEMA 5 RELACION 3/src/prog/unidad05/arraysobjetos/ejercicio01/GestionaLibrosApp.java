package prog.unidad05.arraysobjetos.ejercicio01;
import java.util.Scanner;

public class GestionaLibrosApp {
  
  private static final int OPCION_SALIR = 0;
  private static final int OPCION_AGREGAR = 1;
  private static final int OPCION_MOSTRAR = 2;
  private static final int OPCION_BUSCAR_TITULO = 3;
  private static final int OPCION_BUSCAR_ANYO = 4;
  
  
  private Libro[] libros;
  Scanner sc;
  
  public GestionaLibrosApp() {
    libros = new Libro[0];
    sc = new Scanner(System.in);
  }

  public static void main(String[] args) {
    GestionaLibrosApp app = new GestionaLibrosApp();
    app.run();
  }

  private void run() {
    
      int opcion = -1;
      
      do {
        opcion = imprimeMenu();
        switch (opcion) {
        case OPCION_AGREGAR:
          agregarLibro();
          break;
        case OPCION_MOSTRAR:
          mostrarLibro();
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

  private void buscarTitulo() {
    imprimeTitulo("buscar libro por titulo");
    System.out.print("Introduzca el texto de busqueda (no puede dejarse en blanco): ");
    String titulo = sc.nextLine();
    
    int contador = 0;
    for (int i = 0; i < libros.length; i++) {
      if (libros[i].getTitulo().contains(titulo)) {
        contador++;
        System.out.printf("Titulo: %s, Autor: %s, Año publicacion: %d%n", libros[i].getTitulo(), libros[i].getAutor(), libros[i].getAnyoPublicacion());
      }
    }
    System.out.printf("Se encontraron %d coincidencias%n", contador);
  }

  private void buscarAnyo() {
    imprimeTitulo("buscar libro por año de publicacion");
    System.out.print("Introduzca el año de publicacion a buscar: ");
    int anyo = Integer.parseInt(sc.nextLine());
    
    int contador = 0;
    for (int i = 0; i < libros.length; i++) {
      if (libros[i].getAnyoPublicacion() == anyo) {
        contador++;
        System.out.printf("Titulo: %s, Autor: %s, Año publicacion: %d%n", libros[i].getTitulo(), libros[i].getAutor(), libros[i].getAnyoPublicacion());
      }
    }
    System.out.printf("Se encontraron %d coincidencias%n", contador);
    
  }

  private void mostrarLibro() {
    imprimeTitulo("mostrar libros");
    for (int i = 0; i < libros.length; i++) {
      System.out.printf("Titulo: %s, Autor: %s, Año publicacion: %d%n", libros[i].getTitulo(), libros[i].getAutor(), libros[i].getAnyoPublicacion());
    }
    
  }

  private void agregarLibro() {
    imprimeTitulo("agregar libro");
    System.out.print("Introduzca el titulo del libro: ");
    String titulo = sc.nextLine();
    System.out.print("Introduzca el nombre del autor del libro: ");
    String autor = sc.nextLine();
    System.out.print("Introduzca el año de publicacion del libro: ");
    int anyo = Integer.parseInt(sc.nextLine());
    
    ampliaArray();
    
    Libro libro = new Libro(titulo, autor, anyo);
    
    libros[libros.length - 1] =  libro;
  }

  private void ampliaArray() {
    
    Libro[] nuevoArray = new Libro[libros.length + 1];
    
    for (int i = 0; i < libros.length; i++) {
      nuevoArray[i] = libros[i];
    }
    
    libros = nuevoArray;
    
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

}
