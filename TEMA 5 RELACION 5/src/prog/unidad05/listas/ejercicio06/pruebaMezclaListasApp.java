package prog.unidad05.listas.ejercicio06;
import java.util.Scanner;

import prog.unidad05.listas.ejercicio05.MezclaListasCadenas;

import java.util.List;
import java.util.ArrayList;


public class pruebaMezclaListasApp {
    Scanner sc;
    List<String> lista;
    List<String> otraLista;
    
    
    public pruebaMezclaListasApp() {
      sc = new Scanner(System.in);
      lista = new ArrayList<>();
      otraLista = new ArrayList<>();
    }
    
   
  public static void main(String[] args) {
    pruebaMezclaListasApp app = new pruebaMezclaListasApp();
    
    app.run();
    
  }


  private void run() {
    System.out.println("Introduce la primera lista de palabras");
    System.out.println("Introduce palabras, una por línea. Línea vacía para terminar.");
    while (true) {
        String entrada = sc.nextLine();
        if (entrada.isEmpty()) {
            break;
        }
        lista.add(entrada);
    }
    
    System.out.println("Introduce la segunda lista de palabras");
    System.out.println("Introduce palabras, una por línea. Línea vacía para terminar.");
    while (true) {
        String entrada = sc.nextLine();
        if (entrada.isEmpty()) {
            break;
        }
        otraLista.add(entrada);
    }
    
    
    System.out.println("La primera lista es: " + lista);
    System.out.println("La segunda lista es: " + otraLista);
    System.out.println("La union de ambas listas es: " + MezclaListasCadenas.union(lista, otraLista));
    System.out.println("La interseccion de ambas listas es: " + MezclaListasCadenas.interseccion(lista, otraLista));
    System.out.println("La diferencia de la primera lista menos la segunda es: " + MezclaListasCadenas.diferencia(lista, otraLista));
    System.out.println("La diferencia de la segunda lista menos la primera es: " + MezclaListasCadenas.diferencia(otraLista, lista));

    

    
    
    
  }


  
  
  

}
