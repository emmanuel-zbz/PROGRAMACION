package prog.unidad03.repeticion;
import java.util.Scanner;

public class TablaMultiplicarSimpleApp {
  public static void main(String [] args) {
    Scanner sc = new Scanner(System.in);
    
    System.out.print("De que numero quieres mostrar la tabla de multiplicar?: ");
    int tablaDe = Integer.parseInt(sc.nextLine());
    
    for (int i = 0; i <= 10; i++) {
      System.out.printf("%d X %d = %d%n", tablaDe, i, (tablaDe * i));
    }
  }

}
