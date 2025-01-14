package prog.unidad05.arraysuni.ejercicio04;

public class UtilidadesArrays {



  public static int getMinimoArrayEntero(int[] array) {
    if (array == null || array.length == 0) {
      throw new IllegalArgumentException();
    }
    int minimo = array[0];
    for (int i = 0; i < array.length; i++) {
      if ((array[i] - minimo) <= 0) {
        minimo = array[i];
      }
    }
    return minimo;
    
  }

  public static int getMaximoArrayEntero(int[] array) {
    if (array == null || array.length == 0) {
      throw new IllegalArgumentException();
    }
    int maximo = array[0];
    for (int i = 0; i < array.length; i++) {
      if ((array[i] - maximo) >= 0) {
        maximo = array[i];
      }
    }
    return maximo;
  }

  public static int enteroApareceEnArrayEntero(int[] array, int numero) {
    if (array == null || array.length == 0) {
      return 0;
    }
    int ocurrencia = 0;
    
    for(int i = 0; i < array.length; i++) {
      if (array[i] == numero) {
        ocurrencia++;
      }
    }
    return ocurrencia;
  }

}
