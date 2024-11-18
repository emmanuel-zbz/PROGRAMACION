package prog.unidad04.atributos;

import java.util.Scanner;

/**
 * Prueba la clase Pizza
 */
public class PruebaPizza {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Introduzca la cantidad de pizzas a crear (1 o mas): ");
    int pizzasACrear = Integer.parseInt(sc.nextLine());
    
    for (int i = 1; i <= pizzasACrear; i++) {
      Pizza pizza = new Pizza();
      
      System.out.printf("Introduce el tamaño de la pizza %d (mediana/familiar): ", i);
      pizza.tamanio = sc.nextLine();
      
      System.out.printf("Introduce el tipo de la pizza %d (margarita/cuatro queso/funghi): ", i);
      pizza.tipo = sc.nextLine();
      
      System.out.printf("Servir la pizza? (s/n): ");
      char servir = sc.nextLine().charAt(0);

      Pizza.creadas++;
      pizza.estado = "pedida";
      if (servir == 's') {
        pizza.estado = "servida";
        Pizza.servidas++;
      }
      
      System.out.printf("Datos de la pizza %d%n", i);
      System.out.printf("Tamaño: %s%n", pizza.tamanio);
      System.out.printf("Tipo: %s%n", pizza.tipo);
      System.out.printf("Estado: %s%n", pizza.estado);
      System.out.printf("Pizzas totales creadas: %d%n", Pizza.creadas);
      System.out.printf("Pizzas totales servidas: %d%n", Pizza.servidas);
    }
    
  }

}
