package prog.unidad03.repeticion;
import java.util.Scanner;

public class CalculaFactorialApp {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Introduce el numero entero para saber su factorial: ");
    int numero = Integer.parseInt(sc.nextLine());
    
    long factorial = 1;
    
    for (int i = 1; i <= numero; i++) {
      factorial = factorial * i;
    }
    System.out.printf("El factorial de %d es %d", numero, factorial);
  }

}
