import java.util.Scanner;
import java.util.Locale;

public class CalculoAreaRectangulo {
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    //Pedimos la base
    System.out.print("Introduce la base del rectangulo: ");
    double base = Double.parseDouble(sc.nextLine());
    //pedimos la altura
    System.out.print("Introduce la altura del rectangulo: ");
    double altura = Double.parseDouble(sc.nextLine());
    //calculamos el area
    double area = base * altura;
    
    System.out.printf(Locale.US, "El area del rectangulo es %f", area);
    
    
    
  }

}
