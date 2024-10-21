import java.util.Locale;

public class DibujarTriangulo {
  public static void main(String[] args) {
    
    Lapiz lapiz = new Lapiz();
    lapiz.mueve(new Punto(20,35));
    
    lapiz.baja();
    lapiz.desplaza(30);
    lapiz.gira(120);
    lapiz.desplaza(30);
    lapiz.gira(120);
    lapiz.desplaza(30);
    
    Linea trazo1 = lapiz.getTrazo(1);
    Linea trazo2 = lapiz.getTrazo(2);
    Linea trazo3 = lapiz.getTrazo(3);


    
    System.out.printf("El numero de trazos es: %d%n", lapiz.getNumTrazos());
    
    System.out.printf(Locale.US, "El primer trazo va desde %f,%f a %f,%f%n", trazo1.getInicio().getX(), trazo1.getInicio().getY(), trazo1.getFin().getX(), trazo1.getFin().getY());
    System.out.printf(Locale.US, "El segundo trazo va desde %f,%f a %f,%f%n", trazo2.getInicio().getX(), trazo2.getInicio().getY(), trazo2.getFin().getX(), trazo2.getFin().getY());
    System.out.printf(Locale.US, "El tercer trazo va desde %f,%f a %f,%f%n", trazo3.getInicio().getX(), trazo3.getInicio().getY(), trazo3.getFin().getX(), trazo3.getFin().getY());

    
    
    
    
    
    
    
  }

}
