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

  @Override
  public String toString() {
    String resultado = "(";
    for (int i = 0; i < lista.size(); i++) {
      
    }
    return "lista = " + lista;
  }
  
  
  
  

}
