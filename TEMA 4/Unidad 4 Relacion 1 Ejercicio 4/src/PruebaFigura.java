import java.util.Scanner;
public class PruebaFigura {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Introduzca la cantidad de figuras a crear: (1 o mas): ");
    int figurasACrear = Integer.parseInt(sc.nextLine());
    
    for (int i = 1; i <= figurasACrear; i++) {

      System.out.print("Que tipo de figura quieres crear? (t = triangulo, c = circulo, r = rectangulo): ");
      char figura = sc.nextLine().charAt(0);
      
      if (figura == 't') {
        Triangulo triangulo = new Triangulo();
        Punto punto = new Punto();

       System.out.print("Introduce la coordenada X del primer vertice del triangulo: ");
       punto.x = Double.parseDouble(sc.nextLine());
       System.out.print("Introduce la coordenada Y del primer vertice del triangulo: ");
       punto.y = Double.parseDouble(sc.nextLine());
       
       triangulo.vertice1 = punto;
       
       punto = new Punto();
       
       System.out.print("Introduce la coordenada X del segundo vertice del triangulo: ");
       punto.x = Double.parseDouble(sc.nextLine());
       System.out.print("Introduce la coordenada Y del segundo vertice del triangulo: ");
       punto.y = Double.parseDouble(sc.nextLine());
       triangulo.vertice2 = punto;
       
       punto = new Punto();

       System.out.print("Introduce la coordenada X del tercer vertice del triangulo: ");
       punto.x = Double.parseDouble(sc.nextLine());
       System.out.print("Introduce la coordenada Y del tercer vertice del triangulo: ");
       punto.y = Double.parseDouble(sc.nextLine());
       triangulo.vertice3 = punto;
       
       System.out.printf("Datos del triangulo%n");
       System.out.printf("Primer vertice: (%f, %f)%n",triangulo.vertice1.x, triangulo.vertice1.y);
       System.out.printf("Segundo vertice: (%f, %f)%n",triangulo.vertice2.x, triangulo.vertice2.y);
       System.out.printf("Tercer vertice: (%f, %f)%n",triangulo.vertice3.x, triangulo.vertice3.y);

      }
      if (figura == 'r') {
        Rectangulo rectangulo = new Rectangulo();
        
        Punto punto = new Punto();

       System.out.print("Introduce la coordenada X de la primera esquina del rectangulo: ");
       punto.x = Double.parseDouble(sc.nextLine());
       System.out.print("Introduce la coordenada Y de la primera esquina del rectangulo: ");
       punto.y = Double.parseDouble(sc.nextLine());
       rectangulo.Esquina1 = punto;
       
       punto = new Punto();
       
       System.out.print("Introduce la coordenada X de la segunda esquina del rectangulo: ");
       punto.x = Double.parseDouble(sc.nextLine());
       System.out.print("Introduce la coordenada Y de la segunda esquina del rectangulo: ");
       punto.y = Double.parseDouble(sc.nextLine());
       rectangulo.Esquina2 = punto;

    
       System.out.printf("Datos del rectangulo%n");
       System.out.printf("Primera esquina del rectangulo: (%f, %f)%n",rectangulo.Esquina1.x, rectangulo.Esquina1.y);
       System.out.printf("Segunda esquina del rectangulo: (%f, %f)%n",rectangulo.Esquina2.x, rectangulo.Esquina2.y);
      }
      if (figura == 'c') {
       Circulo circulo = new Circulo();
        
       Punto punto = new Punto();

       System.out.print("Introduce la coordenada X del centro del circulo: ");
       punto.x = Double.parseDouble(sc.nextLine());
       System.out.print("Introduce la coordenada Y del centro del circulo: ");
       punto.y = Double.parseDouble(sc.nextLine());
       circulo.centro = punto;
       
       System.out.print("Introduce la longitud del radio del circulo: ");
       circulo.radio = Double.parseDouble(sc.nextLine());
       
      
       System.out.printf("Datos del circulo%n");
       System.out.printf("Centro: (%f, %f)%n", circulo.centro.x, circulo.centro.y);
       System.out.printf("Radio del circulo: %f%n", circulo.radio);
      }
      
    }

  }

}
