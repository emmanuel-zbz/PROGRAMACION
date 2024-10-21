import java.util.Scanner;
import java.util.Locale;

public class ConversorLitrosAGalones {
public static final double LITROS_A_GALONES = 3.785;

 public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  
 System.out.print("Introduce la cantidad de litros: ");
 Double litros = Double.parseDouble(sc.nextLine());
 
 Double galones = litros * LITROS_A_GALONES;

System.out.printf(Locale.US, "La cantidad en galones es de %f", galones);
 
 }

}
