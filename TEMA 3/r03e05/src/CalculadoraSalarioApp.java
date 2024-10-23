import java.util.Locale;
import java.util.Scanner;

public class CalculadoraSalarioApp {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Introduce el número de hora trabajadas: ");
    int horasTrabajadas = Integer.parseInt(sc.nextLine());

    if (horasTrabajadas > 40) {
      int horasPlus = (horasTrabajadas - 40);
      double salarioPlus = horasPlus * 20 + 640;
      System.out.printf(Locale.US, "El salario por trabajar 40 horas normales y %d horas extra es de %f euros", horasPlus, salarioPlus);

    } else {
      double salarioBase = horasTrabajadas * 16;
      System.out.printf(Locale.US, "El salario por trabajar %d horas es de %f euros", horasTrabajadas, salarioBase);

    }

  }

}