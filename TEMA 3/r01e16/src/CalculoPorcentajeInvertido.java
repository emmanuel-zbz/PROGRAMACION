import java.util.Scanner;
import java.util.Locale;

public class CalculoPorcentajeInvertido {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
   System.out.print("Introduce el dinero total invertido: ");
   Double dineroTotalInvertido = Double.parseDouble(sc.nextLine());
   System.out.print("Introduce el dinero invertido por la primera persona: ");
   Double dineroPersona1 = Double.parseDouble(sc.nextLine());
   System.out.print("Introduce el dinero invertido por la segunda persona: ");
   Double dineroPersona2 = Double.parseDouble(sc.nextLine());
   
   double porcentajePersona1 = dineroPersona1 * 100 / dineroTotalInvertido;
   double porcentajePersona2 = dineroPersona2 * 100 / dineroTotalInvertido;
   double porcentajePersona3 = 100 - porcentajePersona1 - porcentajePersona2;
   
   System.out.printf(Locale.US, "El porcentaje invertido de la primera persona es del %f%%, el de la segunda persona es del %f%%, y el de la tercerda es del %f%%", porcentajePersona1, porcentajePersona2, porcentajePersona3);
  }

}
