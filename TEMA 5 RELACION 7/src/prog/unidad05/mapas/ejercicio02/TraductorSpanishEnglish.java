package prog.unidad05.mapas.ejercicio02;
import prog.unidad05.mapas.ejercicio01.*;
import java.util.Scanner;

public class TraductorSpanishEnglish {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    DiccionarioSpanishEnglish diccionario = new DiccionarioSpanishEnglish();
    
    do {
      System.out.print("Introduzca una palabra a traducir al ingles (vacia para terminar): ");
      String palabra = sc.nextLine();
    
      if (palabra.isEmpty()) {
        break;
      }
      System.out.printf("La palabra español \"%s\" significa \"%s\" en ingles%n", palabra, diccionario.traducir(palabra));
    } while (true);
  }

}
