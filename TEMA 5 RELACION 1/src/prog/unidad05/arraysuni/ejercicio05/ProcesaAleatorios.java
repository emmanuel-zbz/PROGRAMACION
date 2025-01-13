package prog.unidad05.arraysuni.ejercicio05;
import java.util.Random;

public class ProcesaAleatorios {
  public static void main(String[] args) {
    
    
    Random generador = new Random();
    
    
    
    int[] array = new int[150];
    
    int minimo = array[0];
    int maximo = array[0];
    int contadorMinimo = 0;
    int contadorMaximo = 0;

    
    for (int i = 0; i < array.length; i++) {
      array[i] = generador.nextInt(300) + 1;
      
      minimo = array[0];
      
      if ((array[i] - minimo) <= 0) {
        minimo = array[i];
      }
      
      if ((array[i] - maximo) >= 0) {
        maximo = array[i];
      }
      
      if (array[i] == minimo) {
        contadorMinimo++;
      }
      
      if (array[i] == maximo) {
        contadorMaximo++;
      }
    }
    
    System.out.printf("El numero minimo es %d y aparece %d veces%n", minimo, contadorMinimo);
    System.out.printf("El numero maximo es %d y aparece %d veces%n", maximo, contadorMaximo);

  }
  
  

}
