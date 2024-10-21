import java.util.Locale;

public class EurosAPesetas {
  
  public static double PESETAS_POR_EUROS = 166.386;
  
  public static void main(String[] args) {
    //cantidad de euros que tenemos
    double euros = 65;
    //calculamos la equivalencia en pesetas
    double pesetas = euros * PESETAS_POR_EUROS;
    System.out.printf(Locale.US, "La cantidad %f euros equivalea %f pesetas", euros, pesetas);
        
  }
}