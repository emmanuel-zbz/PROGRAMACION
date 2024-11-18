package prog.unidad04.atributos;
import java.util.Scanner;
import java.util.Locale;

public class ManejoLavadoras {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    Lavadora lavadora = new Lavadora();
    
    System.out.print("Introduzca la cantidad de lavadoras a crear (1 o mas): ");
    int lavadorasACrear = Integer.parseInt(sc.nextLine());
    
    for (int i = 1; i <= lavadorasACrear; i++) {
      System.out.printf("Introduce los datos de la lavadora %d%n", i);

      System.out.printf("Introduce el precio base de la lavadora: ", i);
      lavadora.precioBase = Double.parseDouble(sc.nextLine());
      
      System.out.printf("Introduce el color de la lavadora: ");
      lavadora.color= sc.nextLine();
      
      System.out.printf("Introduce la calificacion energetica de la lavadora (mayuscula entre A y F inclusive): ");
      lavadora.calificacionEnergetica= sc.nextLine();
      
      System.out.printf("Introduce el peso de la lavadora: ");
      lavadora.peso = Double.parseDouble(sc.nextLine());
      
      System.out.printf("Introduce la carga maxima de la lavadora: ");
      lavadora.cargaMaxima = Double.parseDouble(sc.nextLine());
      
      System.out.printf("Datos de la lavadora %d%n", i);
      System.out.printf("Precio base: %f%n", lavadora.precioBase);
      System.out.printf("Color: %s%n", lavadora.color);
      System.out.printf("Calificacion energetica: %s%n", lavadora.calificacionEnergetica);
      System.out.printf("Peso: %f%n", lavadora.peso);
      System.out.printf("Carga maxima: %f%n", lavadora.cargaMaxima);
    }
  }

}
