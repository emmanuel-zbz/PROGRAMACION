package prog.unidad05.mapas.ejercicio04;
import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;


public class TerminalVentaApp {
  private static final String CODIGO_DESCUENTO = "ECODTO";
  Scanner sc;
  Map<String, Double> productos;
  Map<String, Integer> cantidadProductos;
  public TerminalVentaApp() {
    sc = new Scanner(System.in);
    
    productos = new HashMap<>();
    productos.put("avena", 2.21);
    productos.put("garbanzos", 2.39);
    productos.put("tomate", 1.59);
    productos.put("jengibre", 3.13);
    productos.put("quinoa", 4.50);
    productos.put("guisantes", 1.60);
    
    
    
    cantidadProductos = new HashMap<>();
    cantidadProductos.put("avena", 0);
    cantidadProductos.put("garbanzos", 0);
    cantidadProductos.put("tomate", 0);
    cantidadProductos.put("jengibre", 0);
    cantidadProductos.put("quinoa", 0);
    cantidadProductos.put("guisantes", 0);
  }

  public static void main(String[] args) {
    TerminalVentaApp app = new TerminalVentaApp();
    
    app.run();

  }

  private void run() {
    do {
      System.out.print("Introduzca el nombre del producto (vacio para terminar): ");
      String producto = sc.nextLine();
      if (producto.isEmpty()) {
        break;
      }
 
      if (productos.containsKey(producto)) {
        System.out.print("Introduzca ahora la cantidad de producto comprada (numero entero): ");
        int cantidad = Integer.parseInt(sc.nextLine());
        cantidadProductos.put(producto, cantidadProductos.get(producto) + cantidad);
      } else {
        System.out.printf("El producto espeficidado \"%s\" no esta a la venta en esta tienda%n", producto);
      }
    } while (true);
    
    
    System.out.print("Introduzca el codigo de descuento (vacio si no tiene): ");
    String descuento = sc.nextLine();
    
    
    imprimeRecibo(descuento);
    
    
  }

  private boolean aplicaDescuento(String descuento) {
   
    if (descuento == CODIGO_DESCUENTO) {
      return true;
    } else {
      return false;
    }
    
  }

  private void imprimeRecibo(String descuento) {
    double total = 0.0;
    if (aplicaDescuento(descuento)) {
      for (String producto: productos.keySet()) {
        int cantidad = cantidadProductos.get(producto);
        if (cantidad > 0) {
          double precio = productos.get(producto);
          double subtotal  = cantidad * precio;
          total += subtotal;
        }
      }
      total = total * 0.9;
     System.out.println("Producto  Precio  Cantidad  Subtotal");
     System.out.println("------------------------------------");
     for (int i = 0;)
    }
    
  }

  

  

}
