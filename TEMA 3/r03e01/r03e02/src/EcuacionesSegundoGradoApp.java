import java.util.Scanner;
import java.util.Locale;
import java.lang.Math;

public class EcuacionesSegundoGradoApp {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.print("Introduce el valor de a: ");
    double a = Double.parseDouble(sc.nextLine());

    System.out.print("Introduce el valor de b: ");
    double b = Double.parseDouble(sc.nextLine());

    System.out.print("Introduce el valor de c: ");
    double c = Double.parseDouble(sc.nextLine());

    double discriminante = (b * b) - 4 * a * c;

    if (discriminante > 0) {
      System.out.println("La ecuación tiene 2 soluciones reales");
    } else if (discriminante == 0) {
      System.out.println("La ecuación tiene 1 soluciones reales");
    } else {
      System.out.println("La ecuación no tiene soluciones reales");
    }

    if ((discriminante > 0) || (discriminante == 1)) {
      double solucionRaiz1 = (-b + Math.sqrt((b * b) - 4 * a * c)) / (2 * a);
      double solucionRaiz2 = (-b - Math.sqrt((b * b) - 4 * a * c)) / (2 * a);

      System.out.printf(Locale.US, "La primera solucion es: %f%n", solucionRaiz1);
      System.out.printf(Locale.US, "La segunda solucion es: %f ", solucionRaiz2);

    }
  }

}
