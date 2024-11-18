package prog.unidad04.atributos;
import java.util.Scanner;
public class PruebaFraccion {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Introduzca la cantidad de fracciones a crear: ");
    int fracciones = Integer.parseInt(sc.nextLine());
    
    for (int i = 1; i <= fracciones; i++) {
      Fraccion fraccion = new Fraccion();
      
      System.out.printf("Introduce el numerador de la fraccion %d: ", i);
      fraccion.numerador = Integer.parseInt(sc.nextLine());
      
      System.out.printf("Introduce el denominador de la fraccion %d: ", i);
      fraccion.denominador = Integer.parseInt(sc.nextLine());
      
      System.out.printf("Datos de la fraccion %d%n", i);
      System.out.printf("Numerador: %d%n", fraccion.numerador);
      System.out.printf("Denominador: %d%n", fraccion.denominador);
    }
    
  }

}
