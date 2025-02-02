package prog.unidad05.listas.ejercicio02;
import java.util.List;
import java.util.ArrayList;
import java.util.Random;


public class EstadisticasApp {
  
  List<Integer> lista;
  Random generador;
  
  public EstadisticasApp() {
    lista = new ArrayList<>();
    generador = new Random();
  } 
  
  
  public static void main(String[] args) {
    EstadisticasApp app = new EstadisticasApp();
    app.run();
  }



  private void run() {
    generaLista();
    
    imprimeLista();
    
    imprimeTodo();
  }


  private void imprimeTodo() {
    int suma = calculaSuma();
    double media = calculaMedia();
    int minimo = calculaMinimo();
    int maximo = calculaMaximo();
    
    System.out.printf("La suma de los elementos vale %d, su media vale %f. El valor minimo es %d y el maximo es %d", suma, media, minimo, maximo);
  }


  private int calculaMinimo() {
    int minimo = lista.get(0);
    
    for (int i = 0; i < lista.size(); i++) {
      if (lista.get(i) < minimo) {
        minimo = lista.get(i);
      }
    }
    return minimo;
  }


  private int calculaMaximo() {
    int maximo = lista.get(0);
    
    for (int i = 0; i < lista.size(); i++) {
      if (lista.get(i) > maximo) {
        maximo = lista.get(i);
      }
    }
    return maximo;
  }


  private double calculaMedia() {
    double suma = 0;
    
    
    for (int i = 0; i < lista.size(); i++) {
      suma += lista.get(i);
      }
    
    return (suma / lista.size());
  }


  private int calculaSuma() {
    int suma = 0;
    
    for (int i = 0; i < lista.size(); i++) {
      suma += lista.get(i);
      }
    
    return suma;
  }


  private void generaLista() {
    int longitud = generador.nextInt(10, 21);
    
    for (int i = 0; i < longitud; i++) {
      lista.add(generador.nextInt(0, 101));
    }
    
  }


  private void imprimeLista() {
    String resultado = "(";
    
    for (int i = 0; i < lista.size(); i++) {
      resultado += lista.get(i);
      if (i < lista.size() - 1) {
        resultado += ", ";
      }
    }
    resultado += ")";
    System.out.println("La lista generada es: " + resultado);
  }

}
