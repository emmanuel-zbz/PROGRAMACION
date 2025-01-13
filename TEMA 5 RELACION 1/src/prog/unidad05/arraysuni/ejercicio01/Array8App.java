package prog.unidad05.arraysuni.ejercicio01;
import java.util.Locale;
import java.util.Scanner;

/**
 * Aplicacion que realiza varias operaciones con un array de enteros
 */
public class Array8App {
  
  private static final int TAM_ARRAY = 8;

  public static void main(String[] args) {
    
    //Creamos un escaner para leer teclado
    Scanner sc = new Scanner(System.in);
    
    //Creamos el array
    double[] numeros = new double[TAM_ARRAY];
    
    System.out.println("OPERACIONES VARIAS SOBRE UN ARRAY DE 8 ELEMENTOS");
    
    System.out.println("A continuacion se van a solicitar 8 numeros reales");
    
    
    // Para cada elemento del array
    for (int i = 0; i < numeros.length; i++) {
      
      System.out.printf("Introduce el numero %d: ", (i + 1));
      numeros[i] = Double.parseDouble(sc.nextLine());
    }
    
    
    
    double suma = 0;
    //Sumamos todos los elementos
    for (double numero: numeros) {
      suma += numero;
      
    }
    
    //Imprimimos el resultado
    System.out.printf(Locale.US, "La suma de todos los elementos vale %f%n", suma);

    double suma36 = 0;
    //Sumamos todos los elementos mayores de 36
    for (double numero: numeros) {
      if (numero > 36) {
        suma36 += numero;
      }
    }
    
    System.out.printf(Locale.US, "La suma de todos los elementos mayores de 36 vale %f%n", suma36);

    
    int suma50 = 0;
    //Contamos los elementos mayores de 50
    for (double numero: numeros) {
      if (numero > 50) {
        suma50++;
      }
    }
    
    System.out.printf(Locale.US, "La cantidad de elementos mayores a 50 es de %d%n", suma50);

    
    int numerosMedia = 0;
    
    double sumaEntre10Y30 = 0;
    //Hacemos la media de los valores entre 10 y 30
    for (double numero: numeros) {
      if (numero > 10 && numero < 30) {
        sumaEntre10Y30 += numero;
        numerosMedia++;
        
      }
    }
    
    System.out.printf(Locale.US, "La media de los %d elementos comprendidos entre 10 y 30 vale %f%n", numerosMedia, (sumaEntre10Y30 / numerosMedia));

    
  }

}
