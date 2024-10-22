import java.util.Scanner;

public class ClasificaTriangulosApp {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Introduce la longitud del primer lado: ");
    double lado1 = Double.parseDouble(sc.nextLine());

    System.out.print("Introduce la longitud del segundo lado: ");
    double lado2 = Double.parseDouble(sc.nextLine());

    System.out.print("Introduce la longitud del tercer lado: ");
    double lado3 = Double.parseDouble(sc.nextLine());

    if ((lado1 == lado2) && (lado2 == lado3)) {
      System.out.print("El triángulo es equilatero");
    } else if (((lado1 == lado2) || (lado1 == lado3)) || ((lado2 == lado1) || (lado2 == lado3))) {
      System.out.print("El triángulo es isoceles");
    } else {
      System.out.print("El triángulo es escaleno");

    }

  }
}
