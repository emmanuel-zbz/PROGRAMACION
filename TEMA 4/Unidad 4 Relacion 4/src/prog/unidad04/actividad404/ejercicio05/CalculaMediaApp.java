package prog.unidad04.actividad404.ejercicio05;
import java.util.Scanner;
import prog.unidad04.actividad404.ejercicio04.*;
import java.util.Locale;

public class CalculaMediaApp {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    boolean verificador = false;
    int numeral = 0;
    do {
      try {
        System.out.print("Introduce la cantidad de numeros que vas a introducir (uno o mas): ");
         numeral = Integer.parseInt(sc.nextLine());
        verificador = true;
      } catch (NumberFormatException e) {
        System.out.println("Lo que se ha introducido no es un numero entero. Intentalo de nuevo.");
      }
    } while (!verificador);
    
    int numero = 0;
    verificador = false;
    do {
      try {
        System.out.print("Introduce el numero (1): ");
         numero = Integer.parseInt(sc.nextLine());
        verificador = true;
      } catch (NumberFormatException e) {
        System.out.println("Lo que se ha introducido no es un numero entero. Intentalo de nuevo.");
      }
    } while (!verificador);
    
    CalculadorMedia calculadora = new CalculadorMedia(numero);
    
    for (int i = 2; i <= numeral; ) {
      try {
        System.out.printf("Introduce el numero (%d): ", i);
         numero = Integer.parseInt(sc.nextLine());
         calculadora.add(numero);
         i++;
      } catch (NumberFormatException e) {
      }
      System.out.printf(Locale.US, "La media de los numeros introducidos es %f", calculadora.getMedia());
    }
  }

}
