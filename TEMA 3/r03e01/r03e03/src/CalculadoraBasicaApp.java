import java.util.Scanner;
import java.util.Locale;

public class CalculadoraBasicaApp {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.print("Introduce la operación deseada (S para Sumar, R para Restar, P para Producto y D para División): ");
    char operacion = sc.nextLine().charAt(0);

    System.out.print("Introduce el primer operando: ");
    double operando1 = Double.parseDouble(sc.nextLine());

    System.out.print("Introduce el segundo operando: ");
    double operando2 = Double.parseDouble(sc.nextLine());

    double resultado = 0;

    switch (operacion) {
    case 'S':
      resultado = operando1 + operando2;
      break;
    case 'R':
      resultado = operando1 - operando2;
      break;
    case 'P':
      resultado = operando1 * operando2;
      break;
    case 'D':
      resultado = operando1 / operando2;
      break;
    }

    System.out.printf(Locale.US, "El resultado de la operación es: %f", resultado);

  }

}
