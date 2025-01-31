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
    int suma = calculaSumaPares()[0];
    double media = calculaMediaPares();
    int minimo = calculaMinimoPares();
    int maximo = calculaMaximoPares();
    
    System.out.printf("La suma de los elementos de la lista par es de %d%n", suma);
    System.out.printf("La media de los elementos de la lista par es de %f%n", media);
    System.out.printf("El minimo de los elementos de la lista par es de %d y el maximo vale %d%n", minimo, maximo);
  }

  private int[] calculaSumaPares() {
    int[] sumaYNumeros = new int[2];
    int suma = 0;
    int numerosPares = 0;
    
    for (int num: lista) {
      if (num % 2 == 0) {
        suma += num;
        numerosPares++;
      }
    }
    sumaYNumeros[0] = suma;
    sumaYNumeros[1] = numerosPares;
    return sumaYNumeros;
  }

  private double calculaMediaPares() {
    int[] resultadoPares = calculaSumaPares();
    double suma = resultadoPares[0];
    int numerosPares = resultadoPares[1];
    return suma / numerosPares;
  }

  private int calculaMinimoPares() {
    int minimo = obtenerMinimoInicialPar();
    
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
    int maximo = obtenerMaximoInicialPar();
    
    for (int i = 0; i < lista.size(); i++) {
      if (lista.get(i) % 2 == 0) {
        if (lista.get(i) > maximo) {
          maximo = lista.get(i);
        } 
      }
    }
    return maximo;
  }

  

  private int obtenerMaximoInicialPar() {
    for (int num : lista) {
      if (num % 2 == 0) {
          return num;
      }
    }
    return 0;
  }

  private void imprimeDatosImpar() {
    int suma = calculaSumaImpar()[0];
    double media = calculaMediaImpar();
    int minimo = calculaMinimoImpar();
    int maximo = calculaMaximoImpar();
    
    System.out.printf("La suma de los elementos de la lista impar es de %d%n", suma);
    System.out.printf("La media de los elementos de la lista impar es de %f%n", media);
    System.out.printf("El minimo de los elementos de la lista impar es de %d y el maximo vale %d", minimo, maximo);
  }

  private int[] calculaSumaImpar() {
    int[] sumaYNumeros = new int[2];
    
    int suma = 0;
    int numeros = 0;
    for (int num: lista) {
      if (num % 2 != 0) {
        suma += num;
        numeros++;
      }
    }
    sumaYNumeros[0] = suma;
    sumaYNumeros[1] = numeros;
    return sumaYNumeros;
  }

  private double calculaMediaImpar() {
    int[] resultadoImpares = calculaSumaImpar();
    double suma = resultadoImpares[0];
    int numerosImpares = resultadoImpares[1];
    return suma / numerosImpares;
  }


  private int calculaMinimoImpar() {
    int minimo = obtenerMinimoInicialImpar();
    
    for (int i = 0; i < lista.size(); i++) {
      if (lista.get(i) % 2 != 0) {
        if (lista.get(i) < minimo) {
          minimo = lista.get(i);
        } 
      }
    }
    return minimo;
  }

  private int obtenerMinimoInicialImpar() {
    for (int num : lista) {
      if (num % 2 != 0) {
          return num;
      }
    }
    return 0;
  }

  private int obtenerMinimoInicialPar() {
    for (int num : lista) {
      if (num % 2 == 0) {
          return num;
      }
      }
    return 0;
  }

  private int calculaMaximoImpar() {
    int maximo = obtenerMaximoInicialImpar();
    
    for (int i = 0; i < lista.size(); i++) {
      if (lista.get(i) % 2 != 0) {
        if (lista.get(i) > maximo) {
          maximo = lista.get(i);
        } 
      }
    }
    return maximo;
  }

  private int obtenerMaximoInicialImpar() {
    for (int num : lista) {
      if (num % 2 != 0) {
          return num;
      }
    }
    return 0;
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

