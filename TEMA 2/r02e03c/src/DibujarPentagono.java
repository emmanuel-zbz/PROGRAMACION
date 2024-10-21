import java.util.Locale;

public class DibujarPentagono {
  public static void main(String [] args) {
    
    Lapiz lapiz = new Lapiz();
    lapiz.mueve(new Punto (25,55));
    lapiz.baja();
    
    lapiz.desplaza(20);
    lapiz.gira(72);
    lapiz.desplaza(20);
    lapiz.gira(72);
    lapiz.desplaza(20);
    lapiz.gira(72);
    lapiz.desplaza(20);
    lapiz.gira(72);
    lapiz.desplaza(20);
    
    Linea trazo1 = lapiz.getTrazo(1);
    Linea trazo2 = lapiz.getTrazo(2);
    Linea trazo3 = lapiz.getTrazo(3);
    Linea trazo4 = lapiz.getTrazo(4);
    Linea trazo5 = lapiz.getTrazo(5);

       

    
    System.out.printf("El numero de trazos es: %d%n", lapiz.getNumTrazos());
    
    System.out.printf(Locale.US, "El primer trazo va desde (%f,%f) a (%f,%f)%n", trazo1.getInicio().getX(), trazo1.getInicio().getY(), trazo1.getFin().getX(), trazo1.getFin().getY());
    System.out.printf(Locale.US, "El segundo trazo va desde (%f,%f) a (%f,%f)%n", trazo2.getInicio().getX(), trazo2.getInicio().getY(), trazo2.getFin().getX(), trazo2.getFin().getY());
    System.out.printf(Locale.US, "El tercero trazo va desde (%f,%f) a (%f,%f)%n", trazo3.getInicio().getX(), trazo3.getInicio().getY(), trazo3.getFin().getX(), trazo3.getFin().getY());
    System.out.printf(Locale.US, "El cuarto trazo va desde (%f,%f) a (%f,%f)%n", trazo4.getInicio().getX(), trazo4.getInicio().getY(), trazo4.getFin().getX(), trazo4.getFin().getY());
    System.out.printf(Locale.US, "El quinto trazo va desde (%f,%f) a (%f,%f)%n", trazo5.getInicio().getX(), trazo5.getInicio().getY(), trazo5.getFin().getX(), trazo5.getFin().getY());


    
    
      
  }

}
