package prog.unidad05.arraysuni.ejercicio03;
import java.util.Scanner;
import java.util.Random;

public class BusquedaNotasApp {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Random generador = new Random();
    
    System.out.println("BUSQUEDA DE CALIFICACIONES");
    
    boolean verificador = true;
    
    do {
      System.out.print("Introduzca la calificacion a buscar (0 a 10, negativa para terminar): ");
      int notaBuscada;
      try {
        notaBuscada = Integer.parseInt(sc.nextLine());
        if (notaBuscada < 0) {
          System.out.print("FIN DEL PROGRAMA");
          break;
        }
        int[] alumnos = new int[30];
        int alumnosEncontrados = 0;
        for (int i = 0; i < alumnos.length; i++) {
          alumnos[i] = generador.nextInt(30);
          if (alumnos[i] == notaBuscada) {
            alumnosEncontrados++;
          }
        }
        System.out.printf("Con la calificacion %d se han encontrado %d alumnos%n", notaBuscada, alumnosEncontrados);
      } catch (NumberFormatException e) {
        System.out.println("Entrada incorrecta. Debe introducir un numero entero entre 0 y 10, ambos incluidos");
      }
    } while (verificador);
  }

}
