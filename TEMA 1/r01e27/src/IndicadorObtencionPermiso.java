import java.util.Scanner;

public class IndicadorObtencionPermiso {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
  System.out.print("Introduce la edad: ");
  int edad = Integer.parseInt(sc.nextLine());
  
  boolean verificar = edad >= 18;
  
  System.out.printf("¿Puede obtener su permiso?: %b", verificar);
  }

}
