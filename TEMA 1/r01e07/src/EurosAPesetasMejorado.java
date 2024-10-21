import java.util.Locale;
import java.util.Scanner;

public class EurosAPesetasMejorado {
  public static final double EUROS_A_PESETAS = 166.386;

  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    //
    System.out.print("Introduce tu cantidad de euros: ");
  
    
    double euros = Double.parseDouble(sc.nextLine());
    double pesetas = euros * EUROS_A_PESETAS;
    
    System.out.printf(Locale.US, "La cantidad de %f euros equivale a %f pesetas", euros, pesetas);
  }
}
