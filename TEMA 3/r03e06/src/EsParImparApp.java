import java.util.Scanner;

public class EsParImparApp {
  public static void main(String [] args) {
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Introduce tu numero: ");
    int numero = Integer.parseInt(sc.nextLine());
    
    if(numero % 2 == 0) {
      System.out.print("Su numero es par");
    }else {
      System.out.print("Su numero es impar");

    }
    
  }

}
