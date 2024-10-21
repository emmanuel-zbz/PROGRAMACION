import java.util.Scanner;

public class VerificadorTresEdades {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
   System.out.print("Introdue la primera edad: ");
   int edad1 = Integer.parseInt(sc.nextLine());
   System.out.print("Introdue la segunda edad: ");
   int edad2 = Integer.parseInt(sc.nextLine());
   System.out.print("Introdue la tercera edad: ");
   int edad3 = Integer.parseInt(sc.nextLine());
   
   boolean verificador = (edad1 >= edad2) && (edad2 >= edad3);
   
   System.out.printf("¿Es correcto el orden?: %b", verificador);
  }

}
