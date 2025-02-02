package prog.unidad05.listas.ejercicio03;
import java.util.List;
import java.util.ArrayList;
import java.util.Random;

public class EstadisticasParImparApp {
  
  List<Integer> lista;
  Random generador;
  
  public EstadisticasParImparApp() {
    lista = new ArrayList<>();
    generador = new Random();
  } 

  public static void main(String[] args) {
    EstadisticasParImparApp app = new EstadisticasParImparApp();
    app.run();

  }

  private void run() {
    generaLista();
    
    imprimeLista();
    imprimeListaPar();
    imprimeListaImpar();
    
    imprimeDatosPar();
    imprimeDatosImpar();
    
  }
  
  private void imprimeDatosPar() {
    int suma = calculaSumaPares();
    double media = calculaMediaPares();
    int minimo = calculaMinimoPares();
    int maximo = calculaMaximoPares();
    
    System.out.printf("La suma de los elementos de la lista par es de %d%n", suma);
    System.out.printf("La media de los elementos de la lista par es de %f%n", media);
    System.out.printf("El minimo de los elementos de la lista par es de %d y el maximo vale %d%n", minimo, maximo);
  }

  private int calculaSumaPares() {
    int suma = 0;
    
    for (int num: lista) {
      if (num % 2 == 0) {
        suma += num;
      }
    }
    
    return suma;
  }

  private double calculaMediaPares() {
    double suma = calculaSumaPares();
    
    return suma / lista.size();
  }

  private int calculaMinimoPares() {
    int minimo = lista.get(0);
    
    for (int i = 0; i < lista.size(); i++) {
      if (lista.get(i) % 2 == 0) {
        if (lista.get(i) < minimo) {
          minimo = lista.get(i);
        } 
      }
    }
    return minimo;
  }

  private int calculaMaximoPares() {
    int maximo = lista.get(0);
    
    for (int i = 0; i < lista.size(); i++) {
      if (lista.get(i) % 2 == 0) {
        if (lista.get(i) > maximo) {
          maximo = lista.get(i);
        } 
      }
    }
    return maximo;
  }

  

  private void imprimeDatosImpar() {
    int suma = calculaSumaImpar();
    double media = calculaMediaImpar();
    int minimo = calculaMinimoImpar();
    int maximo = calculaMaximoImpar();
    
    System.out.printf("La suma de los elementos de la lista impar es de %d%n", suma);
    System.out.printf("La media de los elementos de la lista impar es de %f%n", media);
    System.out.printf("El minimo de los elementos de la lista impar es de %d y el maximo vale %d", minimo, maximo);
    
  }

  private int calculaSumaImpar() {
    int suma = 0;
    
    for (int num: lista) {
      if (num % 2 != 0) {
        suma += num;
      }
    }
    
    return suma;
  }

  private double calculaMediaImpar() {
    double suma = calculaSumaImpar();
    
    return suma / lista.size();
  }

  private int calculaMinimoImpar() {
    int minimo = lista.get(0);
    
    for (int i = 0; i < lista.size(); i++) {
      if (lista.get(i) % 2 != 0) {
        if (lista.get(i) < minimo) {
          minimo = lista.get(i);
        } 
      }
    }
    return minimo;
  }

  private int calculaMaximoImpar() {
    int maximo = lista.get(0);
    
    for (int i = 0; i < lista.size(); i++) {
      if (lista.get(i) % 2 != 0) {
        if (lista.get(i) > maximo) {
          maximo = lista.get(i);
        } 
      }
    }
    return maximo;
  }

  private void imprimeListaPar() {
    String resultado = "(";
    boolean primerPar = true;
    
    for (int i = 0; i < lista.size(); i++) {
      if (lista.get(i) % 2 == 0) {
        if (!primerPar) {
          resultado += ", ";
        }
        resultado += lista.get(i);
        primerPar = false;
      }
    }
    
    resultado += ")";
    System.out.println("La lista de pares es: " + resultado);
}


  private void imprimeListaImpar() {
    String resultado = "(";
    boolean primerPar = true;
    
    for (int i = 0; i < lista.size(); i++) {
      if (lista.get(i) % 2 != 0) {
        if (!primerPar) {
          resultado += ", ";
        }
        resultado += lista.get(i);
        primerPar = false;
      }
    }
    
    resultado += ")";
    System.out.println("La lista de impares es: " + resultado);
    
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
