package prog.unidad05.mapas.ejercicio01;
import java.util.Map;
import java.util.Set;
import java.util.HashMap;

public class DiccionarioSpanishEnglish {
  private Map<String, String> diccionario;
  
  public DiccionarioSpanishEnglish() {
    diccionario = new HashMap<>();
    
    diccionario.put("girar", "spin");
    diccionario.put("sorpresa", "surprise");
    diccionario.put("maceta", "pot");
    diccionario.put("historiador", "historian");
    diccionario.put("enjuagar", "rinse");
    diccionario.put("casilla", "square");
    diccionario.put("signo", "sign");
    diccionario.put("importar", "import");
    diccionario.put("profesional", "professional");
    diccionario.put("ficha", "piece");
    diccionario.put("patines", "skates");
    diccionario.put("historia", "history");
    diccionario.put("tornillo", "screw");
    diccionario.put("cantante", "singer");
    diccionario.put("insulto", "insult");
    diccionario.put("firma", "signature");
    diccionario.put("lechuga ", "lechuga ");
    diccionario.put("tiza", "chalk");
    diccionario.put("adoptar", "adopt");
    diccionario.put("pila", "battery");
    diccionario.put("ciudad", "city");
    diccionario.put("rail", "rail");
    diccionario.put("frontera", "border");
    diccionario.put("prisionero", "prisoner");
    diccionario.put("capullo", "cocoon");
    diccionario.put("anchoa", "anchovy");
    diccionario.put("opinión", "opinion");
    diccionario.put("pierna", "leg");
    diccionario.put("hábito", "habit");
    diccionario.put("hueso", "bone");
    
  }
  
  public String traducir(String palabra) {
    if (palabra == null) {
      throw new NullPointerException();
    } 
    
    
    if (diccionario.containsKey(palabra.toLowerCase())) {
      return diccionario.get(palabra.toLowerCase());
    } else {
      throw new NullPointerException();
    } 
    
    
  }
  
  public Set<String> getPalabrasSpanish(){
    return diccionario.keySet();
  }

}
