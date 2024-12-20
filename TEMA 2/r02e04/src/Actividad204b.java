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
    
    System.out.printf(Locale.US, "La suma de las 2 fracciones es: %d / %d %n", suma.getNumerador(), suma.getDenominador());
    System.out.printf(Locale.US, "La resta de las 2 fracciones es: %d / %d %n", resta.getNumerador(), resta.getDenominador());
    System.out.printf(Locale.US, "La multiplicacion de las 2 fracciones es: %d / %d %n", multiplicacion.getNumerador(), multiplicacion.getDenominador());
    System.out.printf(Locale.US, "La division de las 2 fracciones es: %d / %d %n", division.getNumerador(), division.getDenominador());

      paquete2.Fraccion sumaOtraVez = new paquete2.Fraccion(suma.getNumerador(), suma.getDenominador());
      paquete2.Fraccion sumaSimple = sumaOtraVez.simplifica();
     paquete2.Fraccion restaOtraVez = new paquete2.Fraccion(resta.getNumerador(), resta.getDenominador());
    paquete2.Fraccion restaSimple = restaOtraVez.simplifica();
   
   paquete2.Fraccion multiplicacionOtraVez = new paquete2.Fraccion(multiplicacion.getNumerador(), multiplicacion.getDenominador());
   paquete2.Fraccion multiplicacionSimple = multiplicacionOtraVez.simplifica();
   
   paquete2.Fraccion divisionOtraVez = new paquete2.Fraccion(division.getNumerador(), division.getDenominador());
   paquete2.Fraccion divisionSimple = divisionOtraVez.simplifica();
   
   
   
   System.out.printf(Locale.US, "La suma simlificada de las 2 fracciones es: %d%n", sumaSimple.getNum(), sumaSimple.getDen());
   System.out.printf(Locale.US, "La resta simlificada de las 2 fracciones es: %d%n", restaSimple.getNum(), restaSimple.getDen());
   System.out.printf(Locale.US, "La multiplicacion simlificada de las 2 fracciones es: %d%n", multiplicacionSimple.getNum(), multiplicacionSimple.getDen());
   System.out.printf(Locale.US, "La division simlificada de las 2 fracciones es: %d%n", divisionSimple.getNum(), divisionSimple.getDen());

  }

}
