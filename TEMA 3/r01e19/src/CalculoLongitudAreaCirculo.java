import java.util.Scanner;
import java.util.Locale;

public class CalculoLongitudAreaCirculo {
  public static final double CONSTANTE_PI = 3.1415;
  
 public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  
 System.out.print("introduce el radio de la circunferencia: ");
 Double radio = Double.parseDouble(sc.nextLine());
 
 Double longitudCirculo = CONSTANTE_PI * (radio * 2);
 Double areaCirculo = CONSTANTE_PI * (radio * radio);
  
 System.out.printf(Locale.US, "La longitud del circulo es de %f y el area del mismo es de %f", longitudCirculo, areaCirculo);
 }
}
