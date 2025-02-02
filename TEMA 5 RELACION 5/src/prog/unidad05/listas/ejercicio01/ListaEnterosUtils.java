package prog.unidad05.listas.ejercicio01;
import java.util.Random;
import java.util.ArrayList;
import java.util.List;

public class ListaEnterosUtils {

  
  public ListaEnterosUtils() {
    
  }
  
  public static List<Integer> generaListaEnterosAleatorios(int longitudMin, int longitudMax, int valorMin, int valorMax){
    if (compruebaListaBuena(longitudMin, longitudMax, valorMin, valorMax)) {
      List<Integer> lista = new ArrayList<>();
      Random generador = new Random();
      for (int i = 0; i < longitudMin; i++) {
        lista.add(generador.nextInt(valorMin, valorMax + 1));
      }
      return lista;
    } else {
      throw new IllegalArgumentException();
    }
    
  }
  
  public static String generaCadena(List<Integer> lista) {
    if (lista == null) {
      return "";
    }
    
    if (lista.isEmpty()) {
      return "()";
    }
    
    String resultado = "(";
    for (int i = 0; i < lista.size(); i++) {
      resultado += lista.get(i);
      if (i < lista.size() - 1) {
        resultado += ", ";
      }
    }
    resultado += ")";
    return resultado;
  }

  private static boolean compruebaListaBuena(int longitudMin, int longitudMax, int valorMin, int valorMax) {
    if (compruebaLongitud(longitudMin, longitudMax ) && compruebaValor(valorMin, valorMax)) {
      return true;
    } else {
      return false;
    }
    
  }

  private static boolean compruebaValor(int valorMin, int valorMax) {
    if (valorMax >= valorMin) {
      return true;
    } else {
      return false;
    }
    
  }

  private static boolean compruebaLongitud(int longitudMin, int longitudMax) {
    if (longitudMax >= longitudMin && longitudMin >= 0) {
      return true;
    } else {
      return false;
    }
  }
  
  
}
