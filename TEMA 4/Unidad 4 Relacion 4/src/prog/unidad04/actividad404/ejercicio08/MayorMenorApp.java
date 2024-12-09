package prog.unidad04.actividad404.ejercicio08;
import prog.unidad04.actividad404.ejercicio07.*;
import java.util.Locale;
import java.util.Scanner;


public class MayorMenorApp {

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
    
    MayorMenor numerin = new MayorMenor(numero);
    
    for (int i = 2; i <= numeral; ) {
      try {
        System.out.printf("Introduce el numero (%d): ", i);
         numero = Integer.parseInt(sc.nextLine());
         numerin.add(numero);
         i++;
      } catch (NumberFormatException e) {
        
      }
    }
    System.out.printf(Locale.US, "El mayor de los numeros introducidos es %d y el menor es %d", numerin.getMayor(), numerin.getMenor());
  }

}

