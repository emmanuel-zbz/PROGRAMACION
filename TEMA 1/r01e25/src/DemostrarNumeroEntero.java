import java.util.Scanner;


public class DemostrarNumeroEntero {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
 
 System.out.print("Introduce el numero entero: ");
 int numero = Integer.parseInt(sc.nextLine());
 
 boolean parImpar = (numero % 2) == 0;
 
 System.out.printf("¿Es %d par?: %b", numero, parImpar);
 
  }

}
