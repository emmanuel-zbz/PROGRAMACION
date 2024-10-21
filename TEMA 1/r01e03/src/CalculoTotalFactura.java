import java.util.Locale;

public class CalculoTotalFactura {

  public static final double IVA = 1.21;
  
  public static void main(String[] args) {
    
    double base = 500;
    double precioFinal = base * IVA;
    
    System.out.printf(Locale.US, "El precio final es de %f euros", precioFinal);
    
  }
  
}
