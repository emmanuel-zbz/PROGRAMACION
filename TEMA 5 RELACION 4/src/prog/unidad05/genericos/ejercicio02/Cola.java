 package prog.unidad05.genericos.ejercicio02;
 import java.util.ArrayList;
 import java.util.EmptyStackException;
 import java.util.List;
 

public class Cola<T> {
  
  private List<T> cola;
  
  public Cola(){
    cola = new ArrayList<>();
  }
  
  public void push(T elemento) {
    cola.add(elemento);
  }
  
  public T pop() {
    int tamanyo = getNumeroElementos();
    
    if (tamanyo > 0) {
      T elemento = cola.get(0);
      cola.remove(0);
      
      return elemento;
    } else {
      throw new EmptyStackException();
    }
  }
  
  public boolean esVacia() {
    return cola.isEmpty();
  }
  
  public int getNumeroElementos() {
    return cola.size();
  }

}
