import java.util.Scanner;

public class NumeroComprendidoEntre20Y30 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
 System.out.print("Introduzca su numero entero: ");
 int suNumero = Integer.parseInt(sc.nextLine());
 
 boolean verificador = (suNumero >= 20) && (suNumero < 30);
 
 System.out.printf("¿El numero está comprendido entre lo pedido?: %b", verificador);
  }

}
