package prog.unidad03.repeticion;
import java.util.Scanner;

public class NumerosCrecientesApp {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Introduce un numero entero: ");
    int numero = Integer.parseInt(sc.nextLine());
    
    int numeroAnterior = 0;
    do {
      numeroAnterior = numero;
      System.out.printf("Introduce un numero mayor que %d (o uno menor para terminar): ", numeroAnterior);
       numero = Integer.parseInt(sc.nextLine());
    } while (numeroAnterior < numero);
    
    
    if (numeroAnterior > numero) {
      System.out.printf("El numero %d no es mayor que %d. Terminando programa.", numero, numeroAnterior);

    }
  }
}
