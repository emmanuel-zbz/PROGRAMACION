import es.iespablopicasso.programacion.unidad02.actividad0201.GranHermano;

public class GranHermanoAPP {
  
  public static void main(String [] args) {
    
    GranHermano hermano1 = new GranHermano(40);
    GranHermano hermano2 = new GranHermano(34);
    GranHermano hermano3 = new GranHermano(20);

    
    System.out.printf("La cantidad de objetos es de: %d", GranHermano.getNumeroObjetosCreados());
    
    
  }

}
