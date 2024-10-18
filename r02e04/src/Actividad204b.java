import paquete1.Fraccion;
import java.util.Scanner;
import java.util.Locale;

public class Actividad204b {
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Introduzca el numerador de la primera fraccion: ");
    int numerador1 = Integer.parseInt(sc.nextLine());
    System.out.print("Introduzca el denominador de la primera fraccion: ");
    int denominador1 = Integer.parseInt(sc.nextLine());
    
    Fraccion fraccion1 = new Fraccion(numerador1, denominador1);
    
    System.out.print("Introduzca el numerador de la segunda fraccion: ");
    int numerador2 = Integer.parseInt(sc.nextLine());
    System.out.print("Introduzca el denominador de la segunda fraccion: ");
    int denominador2 = Integer.parseInt(sc.nextLine());
    
    Fraccion fraccion2 = new Fraccion(numerador2, denominador2);
    
    Fraccion suma = fraccion1.suma(fraccion2);
    Fraccion resta = fraccion1.resta(fraccion2);
    Fraccion multiplicacion = fraccion1.producto(fraccion2);
    Fraccion division = fraccion1.division(fraccion2);
    
    System.out.printf(Locale.US, "La suma de las 2 fracciones es: %d", suma.);
    System.out.printf(Locale.US, "La resta de las 2 fracciones es: %d", resta);
    System.out.printf(Locale.US, "La multiplicacion de las 2 fracciones es: %f", multiplicacion);
    System.out.printf(Locale.US, "La divison de las 2 fracciones es: %f", division);






  }

}
