import java.util.Locale;
import java.util.Scanner;

public class CalculoVolumenConos {
  public static final double CONSTANTE_PI = 3.1415;
  
  public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
	
	System.out.print("Ingrese el radio: ");
	Double radio = Double.parseDouble(sc.nextLine());
	
	System.out.print("Ingrese la altura: ");
	Double altura = Double.parseDouble(sc.nextLine());
	
	double volumen =  (CONSTANTE_PI * radio * radio * altura) / 3;
	
	System.out.printf("El volumen del cono es %f", volumen);
	
  }
}
