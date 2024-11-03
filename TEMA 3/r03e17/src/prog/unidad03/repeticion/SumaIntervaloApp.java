package prog.unidad03.repeticion;
import java.util.Scanner;

public class SumaIntervaloApp {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    
    int comienzo = 0;
    int termino = 0;

    do {
      System.out.print("Introduce el numero de comienzo: ");
       comienzo = Integer.parseInt(sc.nextLine());
      System.out.print("Introduce el numero de fin: ");
       termino = Integer.parseInt(sc.nextLine());
       if (comienzo > termino) {
         System.out.printf("Error. El numero de inicio (%d) debe ser menor que el numero de final (%d)%n", comienzo, termino);
       }
    } while (termino < comienzo);
    
    int sumatorio = 0;
    
    for (int i = comienzo; i <= termino; i++) {
      sumatorio += i;
    }
    System.out.printf(" El valor de la suma desde %d hasta %d es %d", comienzo, termino, sumatorio);

  }
}
