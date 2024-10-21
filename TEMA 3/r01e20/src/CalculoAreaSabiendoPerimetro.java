import java.util.Scanner;
import java.util.Locale;

public class CalculoAreaSabiendoPerimetro {
 public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  
 System.out.print("Introduce el valor de A: ");
 Double valorA = Double.parseDouble(sc.nextLine());
 System.out.print("Introduce el valor de B: ");
 Double valorB = Double.parseDouble(sc.nextLine());
 System.out.print("Introduce el valor de C: ");
 Double valorC = Double.parseDouble(sc.nextLine());
 
 //Para hacerlo podemos dividir la figura en 2, un triangulo y rectangulo, calcular sus areas y sumarlas:
 
 Double areaTriangulo = valorB * (valorA - valorC) / 2;
 Double areaRectangulo = valorB * valorC;
 Double areaTotal = areaTriangulo + areaRectangulo;
 
 System.out.printf(Locale.US, "El valor total del area de la figura es de %f ", areaTotal);
 
 }

}
