package prog.unidad05.genericos.ejercicio03;


public class ArrayUtils<T> {

  
  public ArrayUtils() {
    
  }
  
  
  public static <T> void intercambiarElementos(T[] array, int indiceDesde, int indiceHasta) {
   
    
    T elemento = array[indiceDesde];
    array[indiceDesde] = array[indiceHasta];
    
    array[indiceHasta] = elemento;

  }
  
  
  public static <T> void invertirArray(T[] array) {
    int indice = 0;
    int indiceContrario = array.length - 1;
    while (indiceContrario > indice) {
      intercambiarElementos(array, indice, indiceContrario);
      indice++;
      indiceContrario--;
    }
  } 
  
}
