package prog.unidad05.arraysuni.ejercicio02;
import java.util.Random;

public class UtilidadesArrays {

	public static void main(String[] args) {
	  
	}
	
	
	public static int[] generaArrayEnteroAleatorio(int longitud, int valorMinimo, int valorMaximo) {
	   Random generador = new Random();

	  if (valorMinimo > valorMaximo) {
	    throw new IllegalArgumentException();
	  }
	  if (longitud < 1) {
	     throw new IllegalArgumentException();
	  }
    int[] array = new int[longitud];
    
    for (int i = 0; i < array.length; i++) {
      array[i] = generador.nextInt(valorMaximo - valorMinimo) + valorMinimo;
    }
    return array;
  }

}
