package prog.unidad05.arraysuni.ejercicio08;
import java.util.Random;

public class DividirPorLaMedia {

  public static void main(String[] args) {
    
    Random generador = new Random();
    
    System.out.println("DIVIDIR POR LA MEDIA");
    
    
    int[] arrayAleatorio = new int[50];
    
    
    for (int i = 0; i < arrayAleatorio.length; i++) {
      arrayAleatorio[i] = generador.nextInt(501) + 300;
    }

  }

}
