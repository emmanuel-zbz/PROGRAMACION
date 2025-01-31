package prog.unidad05.listas.ejercicio04;
import java.util.List;
import java.util.ArrayList;

public class ListaPalabrasRepetidas {
  List<String> lista;
  
  public ListaPalabrasRepetidas() {
    lista = new ArrayList<>();
  }
  
  
  public void add(String cadena) {
    if (!lista.contains(cadena)) {
      lista.add(cadena);
    }
  }
  
  public String toString() {
    String resultado = "(";
    for (int i = 0; i < lista.size(); i++) {
      resultado += "\"";
      resultado += lista.get(i);
      resultado += "\"";
      if (i < lista.size() - 1) {
        resultado += ",";
        resultado += " ";
      }
    }
     resultado += ")";
    return resultado;
  }
  

}
