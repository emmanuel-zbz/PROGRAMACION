import java.util.Scanner;

public class CalculoDeOperadores {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Introduce el primer numero: ");
    int numero1 = Integer.parseInt(sc.nextLine());
    
    System.out.print("Introduce el segundo numero: ");
    int numero2 = Integer.parseInt(sc.nextLine());
    
    int suma = numero1 + numero2;
    int diferencia = numero1 - numero2;
    int producto = numero1 * numero2;
    int cociente = numero1 / numero2;
    int modulo = numero1 % numero2;

    System.out.printf("La suma de los 2 numeros es %d%n", suma);
    System.out.printf("La diferencia de los 2 numeros es %d%n", diferencia);
    System.out.printf("El producto de los 2 numeros es %d%n", producto);
    System.out.printf("El cociente de los 2 numeros es %d%n", cociente);
    System.out.printf("El modulo de los 2 numeros es %d%n", modulo);
    
  }
  

  
}
