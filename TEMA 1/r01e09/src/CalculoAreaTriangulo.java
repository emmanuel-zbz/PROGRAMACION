import java.util.Locale;
import java.util.Scanner;

public class CalculoAreaTriangulo {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    //pedimos la base
    System.out.print("Ingresa la base del triangulo ");
    double base = Double.parseDouble(sc.nextLine());
    
    //pedimos la altura
    System.out.print("Ingresa la altura del triangulo; ");
    double altura = Double.parseDouble(sc.nextLine());
    
    //calculamos el area
    double area = base * altura / 2;
    
    System.out.printf(Locale.US, "El area del triangulo es %f", area);
    
  }

}
