import java.util.Scanner;
import java.util.Locale;

public class NumerosComplejo {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.print("Introduce la parte real de tu primer numero complejo: ");
    double parteReal1 = Double.parseDouble(sc.nextLine());

    System.out.print("Introduce la parte imaginaria de tu segundo numero complejo: ");
    double parteImaginaria1 = Double.parseDouble(sc.nextLine());

    Complejo complejo1 = new Complejo(parteReal1, parteImaginaria1);

    System.out.print("Introduce la parte real de tu segundo numero complejo: ");
    double parteReal2 = Double.parseDouble(sc.nextLine());

    System.out.print("Introduce la parte imaginaria de tu segundo numero complejo: ");
    double parteImaginaria2 = Double.parseDouble(sc.nextLine());

    Complejo complejo2 = new Complejo(parteReal2, parteImaginaria2);

    Complejo suma = complejo1.sumar(complejo2);
    Complejo resta = complejo1.restar(complejo2);
    Complejo multiplicacion = complejo1.multiplicar(complejo2);
    Complejo division = complejo1.dividir(complejo2);

    System.out.printf(Locale.US, "La suma de los 2 numeros es %f + %fi%n", suma.getParteReal(), suma.getParteImaginaria());
    System.out.printf(Locale.US, "La resta de los 2 numeros es %f + %fi%n", resta.getParteReal(), resta.getParteImaginaria());
    System.out.printf(Locale.US, "La multiplicación de los 2 numeros es %f + %fi%n", multiplicacion.getParteReal(), multiplicacion.getParteImaginaria());
    System.out.printf(Locale.US, "La división de los 2 numeros es %f + %fi%n", division.getParteReal(), division.getParteImaginaria());

  }

}
