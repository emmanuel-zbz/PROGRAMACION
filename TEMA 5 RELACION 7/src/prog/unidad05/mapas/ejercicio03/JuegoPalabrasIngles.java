package prog.unidad05.mapas.ejercicio03;
import  prog.unidad05.mapas.ejercicio01.*;
import java.util.Scanner;
import java.util.Set;
import java.util.Random;



public class JuegoPalabrasIngles {
  Scanner sc;
  DiccionarioSpanishEnglish diccionario;
  Random generador;
  
  public JuegoPalabrasIngles() {
    sc = new Scanner(System.in);
    diccionario = new DiccionarioSpanishEnglish();
    generador = new Random();
  }

  public static void main(String[] args) {
    JuegoPalabrasIngles app = new JuegoPalabrasIngles();
    
    app.run();
    
  }

  private void run() {
    System.out.println("¿CUÁNTO SABES DE INGLÉS?");
    
   
    int palabrasAcertadas = 0;
    for (int i = 0; i < 5; i++) {
      String palabraEspanyol = palabraAlAzar(diccionario.getPalabrasSpanish());
      
      System.out.printf("Palabra nº%d. Dime cuál es la traducción al inglés de la palabra \"%s\": ", i + 1, palabraEspanyol);
      String palabraIngles = sc.nextLine();
      if (diccionario.traducir(palabraEspanyol).equalsIgnoreCase(palabraIngles)) {
        palabrasAcertadas++;
        System.out.println("ACERTASTE!");
      } else {
        System.out.printf("FALLASTE! La respuesta correcta es \"%s\"%n", diccionario.traducir(palabraEspanyol));
      }
    }
    
    System.out.printf("Acertaste %d de 5 palabras", palabrasAcertadas);
    
  }

  private String palabraAlAzar(Set<String> palabrasSpanish) {
    int contador = 0;
    int posicionPalabra = generador.nextInt(0, palabrasSpanish.size());
    
    for (String palabra: palabrasSpanish) {
      if (contador == posicionPalabra) {
        return palabra;
      }
      contador++;
    }
    return null;
  }
  

}
