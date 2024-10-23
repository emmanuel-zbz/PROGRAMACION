import java.util.Scanner;

public class NumeroCifrasApp {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Introduce tu numero y te dire cuantas cifras tiene: ");
    int cifra = Integer.parseInt(sc.nextLine());
    
    if(cifra >= 1 && cifra < 10) {
      System.out.printf("El número %d tiene 1 cifra", cifra);
    }
    if(cifra >= 10 && cifra < 100) {
      System.out.printf("El número %d tiene 2 cifras", cifra);
    }
    if(cifra >= 100 && cifra < 1000) {
      System.out.printf("El número %d tiene 3 cifras", cifra);
    }
    if(cifra >= 1000) {
      System.out.printf("El numero %d tiene mas de 3 cifras", cifra);
    }
    
  }
}
