package prog.unidad04.actividad403.ejercicio04;

import java.util.Scanner;

public class VendeEntradas {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
   
    
    Zona platea;
    Zona palco;
    Zona atico;
    try {
      platea = new Zona(150);
      palco = new Zona(50);
      atico = new Zona(100);
    } catch (ZonaException e) {
      // TODO Auto-generated catch block
      System.out.println("ESTO NO VA A SALIR PERO EN CASO DE QUE SI");
      return;
    }

    
    int gestor = 0;
    do {
      System.out.println("GESTION DE ENTRADAS");
      System.out.println("-------------------");
      
      System.out.println("1.- Mostrar asientos libres por zona");
      System.out.println("2.- Vender asientos");
      System.out.println("3.- Salir del programa");
      System.out.print("Elija una opción (1, 2, 3): ");
       gestor = Integer.parseInt(sc.nextLine());
       
      if (gestor == 1) {
        System.out.println("ASIENTOS LIBRES POR ZONA");
        System.out.println("------------------------");
        System.out.println("Zona Platea: " + platea.getEntradasPorVender());
        System.out.println("Zona Palco: " + palco.getEntradasPorVender());
        System.out.println("Zona Ático: " + atico.getEntradasPorVender());
        System.out.println("");

      }
      if (gestor == 2) {
        System.out.println("VENTA DE ENTRADAS");
        System.out.println("-----------------");
        System.out.print("Seleccione la zona en la que se localizan los asientos a vender (1 = Platea, 2 = Palco, 3 = Ático): ");
        int numeroZona = Integer.parseInt(sc.nextLine());
        
        Zona zona;
        if(numeroZona == 1) {
          zona = platea;
        } else if (numeroZona == 2) {
          zona = palco;
        } else {
          zona = atico;
        }
        System.out.print("Introduzca el número de asientos a vender: ");
        int entradas = Integer.parseInt(sc.nextLine());
          try {
            zona.vender(entradas);
          } catch (ZonaException e) {
            System.out.printf("No se pudo realizar la venta de entradas. La razon es: \"%s\"%n", e.getMessage());
          }
      } 
    } while (gestor != 3);
    
  }
}
