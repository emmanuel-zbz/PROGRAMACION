import java.util.Scanner;
import java.util.Locale;

public class CalculoSalarioDelMes {
 public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
   
  System.out.print("Introduce el salario base: ");
  Double salarioBase = Double.parseDouble(sc.nextLine());
  
  System.out.print("Introduce el valor total de las ventas: ");
  Double valorVentas = Double.parseDouble(sc.nextLine());
  
  Double salarioTotal = salarioBase + valorVentas * 0.10;
  
  System.out.printf(Locale.US, "El salario correspondiente a los datos introducidos asciende a %f euros", salarioTotal);
 }

}
