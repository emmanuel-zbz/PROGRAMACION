import java.util.Locale;

public class CuentaCorriente {  
 public static void main(String[] args) {
    
    // Creamos la cuenta
    CuentaCorriente cuenta = new CuentaCorriente("11111");
    
    // Ingresamos 1000 euros
    cuenta.ingresar(1000);
    
    // Imprimimos el saldo
    System.out.printf(Locale.US, "El saldo de la cuenta es %f%n", cuenta.getSaldo());
  }

}
