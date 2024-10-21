import java.util.Scanner;
import java.util.Locale;

public class CalculoPrecioLlamada {
 public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
 
 System.out.print("Introduce el coste de establecimiento de llamada (en euros): ");
 Double costeEstablecimiento = Double.parseDouble(sc.nextLine());
 System.out.print("Introduce el coste de minuto de llamada (en euros): ");
 Double costeMinutos = Double.parseDouble(sc.nextLine());
 System.out.print("Introduce el tiempo de duracion de llamada (en segundos): ");
 Double tiempoDuracion = Double.parseDouble(sc.nextLine());
 
 double costeTotal = costeEstablecimiento + (costeMinutos * (tiempoDuracion / 60));
 
 System.out.printf(Locale.US, "El costeTotal por la llamada asciende a los %f euros", costeTotal);
 }

}
