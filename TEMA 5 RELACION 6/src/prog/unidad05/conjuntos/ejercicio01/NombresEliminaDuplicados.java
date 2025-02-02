package prog.unidad05.conjuntos.ejercicio01;
import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;

public class NombresEliminaDuplicados {
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    Set<String> nombres = new HashSet<>();
    
    
    do {
      System.out.print("Introduzca un nombre (vacio para terminar): ");
      String nombre = sc.nextLine();
      if (nombre.isEmpty()) {
        break;
      }
      nombres.add(nombre);
    } while (true);
    System.out.println("Los nombre introducidos sin duplicados son: ");
    for (String nombre: nombres) {
      System.out.println(nombre);
    }
  }
}
