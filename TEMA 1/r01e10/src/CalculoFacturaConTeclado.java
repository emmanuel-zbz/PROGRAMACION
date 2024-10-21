import java.util.Scanner;
import java.util.Locale;

public class CalculoFacturaConTeclado {
  public static void main(String[] args) {
    //Para leer desde teclado
    Scanner sc = new Scanner(System.in);
    
    //Pedimos la base imponible
    System.out.print("Introduce la base imponible: ");
    double base = Double.parseDouble(sc.nextLine());
    
    //Pedimos el porcentaje de IVA 
    System.out.print("Introduce el porcentaje del IVA: ");
    double iva = Double.parseDouble(sc.nextLine());
    
    double precioFinal = base * (iva / 100 + 1);
    
    System.out.printf(Locale.US, "El precio final es de %f", precioFinal);
    
  }

}
