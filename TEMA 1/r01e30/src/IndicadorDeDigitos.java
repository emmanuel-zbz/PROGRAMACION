import java.util.Scanner;

public class IndicadorDeDigitos {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
  System.out.print("Introduce tu numero: ");
  Double numero = Double.parseDouble(sc.nextLine());
  
  boolean verificador = (numero >= 10) && (numero < 100);
  
  System.out.printf("¿Su numero esta comprendido entre lo pedido?: %b", verificador);
  }

}
