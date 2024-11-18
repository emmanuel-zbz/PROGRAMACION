package prog.unidad04.atributos;
import java.util.Scanner;

public class PruebaIntervaloTiempo {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Introduzca la cantida de intervalos a crear (1 o mas): ");
    int Intervalos = Integer.parseInt(sc.nextLine());
    
    for (int i = 1; i <= Intervalos; i++) {
      IntervaloTiempo intervalo = new IntervaloTiempo();
      System.out.printf("Introduzca las horas del intervalo %d (mayor o igual a 0): ", i);
      intervalo.horas = Integer.parseInt(sc.nextLine());

      System.out.printf("Introduzca las horas del intervalo %d (0-59): ", i);
      intervalo.minutos = Integer.parseInt(sc.nextLine());

      System.out.printf("Introduzca las horas del intervalo %d (0-59): ", i);
      intervalo.segundos = Integer.parseInt(sc.nextLine());
      
      System.out.printf("Datos del intervalo %d%n", i);
      System.out.printf("Horas: %d%n", intervalo.horas);
      System.out.printf("Minutos: %d%n", intervalo.minutos);
      System.out.printf("Segundos: %d%n", intervalo.segundos);


    }

  }

}
