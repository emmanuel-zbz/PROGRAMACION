package prog.unidad05.listas.ejercicio05;
import java.util.List;
import java.util.ArrayList;

public class MezclaListasCadenas {
  
  public MezclaListasCadenas() {
   
  }
  
  public static List<String> union(List<String> lista, List<String> otraLista){
    List<String> listaUnida = new ArrayList<>();
    
    for (int i = 0; i < lista.size(); i++) {
      String elemento = lista.get(i);
      
      if (!listaUnida.contains(elemento)) {
        listaUnida.add(elemento);
      }
    }
    
    for (int i = 0; i < otraLista.size(); i++) {
      String elemento = otraLista.get(i);
      
      if (!listaUnida.contains(elemento)) {
        listaUnida.add(elemento);
      }
    }
    
    return listaUnida;
  }
  
  public static List<String> interseccion(List<String> lista, List<String> otraLista){
    if (lista == null || otraLista == null) {
      throw new NullPointerException();
    } 
    List<String> listaInterseccion = new ArrayList<>();
    
    for (int i = 0; i < lista.size(); i++) {
      if (otraLista.contains(lista.get(i)) && !listaInterseccion.contains(lista.get(i))) {
        listaInterseccion.add(lista.get(i));
      }
    }
    return listaInterseccion;
    
  }

  public static List<String> diferencia(List<String> lista, List<String> otraLista) {
    if (lista == null || otraLista == null) {
      throw new NullPointerException();
    } 
    List<String> listaDiferencia = new ArrayList<>();
    
    
    for (String elemento: lista) {
      if (!otraLista.contains(elemento) && !listaDiferencia.contains(elemento)) {
        listaDiferencia.add(elemento);
      }
    }
    
    return listaDiferencia;
  } 
   
}
