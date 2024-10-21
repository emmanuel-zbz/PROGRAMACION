import java.util.Scanner;
import java.util.Locale;

public class ConversorMbAKb {
  //Creamos una constante para pasar de Megas A Kilos
 public static final double MB_A_KB = 1024;
  
  public static void main(String[] args) {
    
    //Un scanner para poder leer teclado
   Scanner sc = new Scanner (System.in);
  
   //Pedimos los Megabytes
   System.out.print("Introduce los Megabytes: ");
   Double megas = Double.parseDouble(sc.nextLine());
   
   double kilobytes = megas * MB_A_KB;
   
   System.out.printf(Locale.US, "%f megabytes equivalen a %f kilobytes", megas, kilobytes);
  }

}
