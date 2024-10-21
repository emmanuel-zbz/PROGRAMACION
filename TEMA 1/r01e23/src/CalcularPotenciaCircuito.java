import java.util.Scanner;
import java.util.Locale;

public class CalcularPotenciaCircuito {
  public static final Double RESISTENCIA = 4.0;
 public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
   
 //Pedimos el voltaje
  System.out.print("Introduce el voltaje: ");
  Double voltaje = Double.parseDouble(sc.nextLine());
  
  Double potencia = voltaje / RESISTENCIA;
  
 System.out.printf(Locale.US, "El valor de la potencia es de %f Amperios", potencia);
 }

}
