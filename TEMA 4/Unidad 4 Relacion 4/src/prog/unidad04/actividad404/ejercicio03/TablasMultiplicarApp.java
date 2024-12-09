package prog.unidad04.actividad404.ejercicio03;

import prog.unidad04.actividad404.ejercicio01.*;

public class TablasMultiplicarApp {

  public static void main(String[] args) {
    
    for (int i = 1; i <= 10; i++) {
      TablaMultiplicar tabla = new TablaMultiplicar(i);
      tabla.imprimetabla();
    }
  }

}
