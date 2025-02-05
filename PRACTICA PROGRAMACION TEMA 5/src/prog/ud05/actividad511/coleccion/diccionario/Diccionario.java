package prog.ud05.actividad511.coleccion.diccionario;

import java.util.Map;
import java.util.HashMap;

public class Diccionario<V> {
  
  private Map<String, V> diccionario;
  
  public Diccionario(){
    diccionario = new HashMap<>();
  }
  
  
  public boolean contieneNombre(String nombre) {
    return diccionario.containsKey(nombre);
  }
  
  
  public void add(String nombre, V valor) {
    if (diccionario.containsKey(nombre)){
      throw new DiccionarioException("YA ESTA ESE NOMBRE");
    }
    
    
    if (nombre == null){
      throw new NullPointerException();
    } 
    
    if (valor == null) {
      throw new NullPointerException();
    }
    
    diccionario.put(nombre, valor);
  }
  
  public V getEntrada(String nombre) {
    return diccionario.getOrDefault(nombre, null);
  }

}
