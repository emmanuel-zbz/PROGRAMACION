package prog.unidad05.arraysuni.ejercicio07;
import java.util.Scanner;

public class SuperArray {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Super Array");
    long[] array = new long[30];
    
    System.out.print("Introduce un numero entero cualquiera: ");
    int numero = Integer.parseInt(sc.nextLine());
    
    
    array[0] = numero;
    
    for (int i = 1; i < array.length; i++) {
      array[i] = (array[(i-1)] + 1) * 2;
    }
    
    System.out.println("El array al reves es:");
    
    for (int i = array.length - 1; i >= 0; i--) {
      System.out.printf("%d, ", array[i]);
    }
    

  }

}
