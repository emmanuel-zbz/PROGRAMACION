
public class VerificadorParImpar {

  public static void main(String[] args) {
    
    int numero = 19;
    boolean ParOImpar = (numero % 2) == 0;
    
    System.out.printf("¿El número %d es par?: %b", numero, ParOImpar);
  }
}
