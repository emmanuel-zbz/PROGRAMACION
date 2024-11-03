package prog.unidad03.repeticion;
import java.util.Scanner;


public class DetectorPrimosApp {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Introduce tu numero entero para ver si es primo o no: ");
    int numero = Integer.parseInt(sc.nextLine());
    
    if (numero > 1) {
      int divisores = 0;
      
      for (int i = 2; i < numero; i++) {
        if (numero %i == 0) {
          divisores++;
        }
      }
      if (divisores > 1) {
        System.out.printf("El numero %d no es primo", numero);
      } else {
        System.out.printf("El numero %d es primo", numero);
      }
    }
  }

}
