import java.util.Locale;
import java.util.Scanner;

public class CalculoMediaDeseada {
 public static void main(String[] args) {
   
 Scanner sc = new Scanner(System.in);
  
  System.out.print("Introduce la media deseada: ");
  Double mediaDeseada = Double.parseDouble(sc.nextLine());
  
  System.out.print("Introduce tu primera nota: ");
  Double nota1 = Double.parseDouble(sc.nextLine());
  
  Double notaNecesaria = mediaDeseada * 2 - nota1;
  
  System.out.printf(Locale.US, "Para obtener una media de %f necesitas un %f", mediaDeseada, notaNecesaria);
    
 }

}
