package prog.unidad03.repeticion;
import java.util.Scanner;

public class CalculaDivisoresApp {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Introduce un numero entero: ");
    int numero = Integer.parseInt(sc.nextLine());
    
    for (int i = 1; i <= numero; i++) {
      if (numero % i == 0) {
        System.out.printf("Es divisible por %d%n", i);
      }
    }
    

  }

}
