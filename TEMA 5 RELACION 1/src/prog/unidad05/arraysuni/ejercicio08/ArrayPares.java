package prog.unidad05.arraysuni.ejercicio08;

public class ArrayPares {

  public static void main(String[] args) {
    System.out.println("NUMEROS PARES");
    
    int[] array = new int[21];
    
    
    System.out.print("Los primeros numeros pares son:");
    for (int i = 1; i < array.length; i++) {
      array[i] = i * 2;
      System.out.printf(" %d,", array[i]);
    }

  }

}
