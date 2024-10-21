import java.util.Scanner;
import java.util.Locale;

public class CalculoLlenadoPiscina {
 public static final double PRECIO_POR_LITRO_AGUA = 0.50;
 
public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
 
System.out.printf("El precio por litro de agua es de 0.40 euros%n");

System.out.print("Introduzca el largo de la piscina: ");
Double largo = Double.parseDouble(sc.nextLine());
System.out.print("Introduzca el ancho de la piscina: ");
Double ancho = Double.parseDouble(sc.nextLine());
System.out.print("Introduzca la profundidad de la piscina: ");
Double profundidad = Double.parseDouble(sc.nextLine());

Double litrosNecesarios = largo * ancho * profundidad;
Double costoTotal = litrosNecesarios * PRECIO_POR_LITRO_AGUA;

System.out.printf(Locale.US, "El costo total de llenado de la piscina asciende a %f euros", costoTotal);


}

}
