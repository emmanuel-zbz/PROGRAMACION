import java.util.Scanner;
import java.util.Locale;

public class CalculoSalarioSemanal {
	//Establecemos una constante que son los euros por hora
	public static final int EUROS_POR_HORA = 12;
	
  public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	//Pedimos las horas trabajadas
	System.out.print("Introduce el numero de horas: ");
	double horas = Double.parseDouble(sc.nextLine());
	
	//Deducimos el sueldo a partir de los datos
	double salario = horas * EUROS_POR_HORA;
	
	System.out.printf(Locale.US, "El sueldo correspondiente a %f horas asciende a los %f euros", horas, salario);
	
  }
}
