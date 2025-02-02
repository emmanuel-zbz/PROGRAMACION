package prog.unidad05.mapas.ejercicio05;
import java.util.Scanner;
import java.util.Random;
import java.util.Map;
import java.util.HashMap;

public class CalculaModaApp {
  Scanner sc;
  Random generador;
  Map<Integer, Integer> moda;
  Map<Integer, Integer> aleatorios;
  public CalculaModaApp() {
    sc = new Scanner(System.in);
    generador = new Random();
    moda = new HashMap<>();
    aleatorios = new HashMap<>();
  }

  public static void main(String[] args) {
    CalculaModaApp app = new CalculaModaApp();
    
    app.run();

  }

  private void run() {
    System.out.print("Introduzca la cantidad de numeros de la serie: ");
    int numeros = Integer.parseInt(sc.nextLine());
    
    
    
    System.out.print("Valor minimo del intervalo para generar los valores aleatorios: ");
    int valorMinimo = Integer.parseInt(sc.nextLine());
    
    System.out.print("Valor maximo del intervalo para generar los valores aleatorios: ");
    int valorMaximo = Integer.parseInt(sc.nextLine());
    
    generaMapaAleatorios(numeros, valorMinimo, valorMaximo);
    
    imprimeSerie();
    
    
    
    calculaModa(valorMinimo, valorMaximo);
    
    
  }

  private void imprimeSerie() {
    System.out.print("La serie generada es: ");
    String resultado = "[";
    for (int i = 0; i < aleatorios.size(); i++) {
      resultado += aleatorios.get(i);
      if (i < aleatorios.size() - 1) {
        resultado += ", ";
      }
    }
    resultado += "]";
    System.out.print(resultado);
    
  }

  private void calculaModa(int valorMinimo, int valorMaximo) {
    for (int i = valorMinimo; i <= valorMaximo; i++) {
      moda.put(i, 0);
    }
    int indice = 0;
    for (int i = valorMinimo; i <=valorMaximo; i++) {
      if (aleatorios.get(indice) == i) {
        moda.put(i, moda.get(i) + 1);
        
      }
      indice ++;
    }
    
  }

  private void generaMapaAleatorios(int numeros, int valorMinimo, int valorMaximo) {
    for (int i = 0; i < numeros; i++) {
      aleatorios.put(i, generador.nextInt(valorMinimo, valorMaximo + 1));
    }
  }

}
