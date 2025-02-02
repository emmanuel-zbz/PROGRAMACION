package prog.unidad05.genericos.ejercicio01;
import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.List;

public class Pila<T> {
  
   private List<T> pila;
  
  
  
  public Pila() {
    pila = new ArrayList<>();
  }
  
  public void push(T elemento) {
    pila.add(elemento);
  }
  
  public T pop() {
    return pila.removeLast();
  }

  public boolean esVacia() {
    return pila.isEmpty();
  }
  
  public int getNumeroElementos() {
    return pila.size();
  }
}
