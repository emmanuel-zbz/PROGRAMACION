import java.util.Locale;

import java.util.Scanner;

public class PesetasAEuros {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.print("Introduce tu cantidad de pesetas: ");

    double pesetas = Integer.parseInt(sc.nextLine());
    double euros = 0.00601;
    double resultado = pesetas * euros;

    System.out.printf(Locale.US, "La cantidad de %f pesetas equivalen a %f euros", pesetas, resultado);
  }
}
