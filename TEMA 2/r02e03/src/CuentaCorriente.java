import java.util.Locale;

public class CuentaCorriente {

  public static void main(String[] args) {
    
   
    CuentaCorriente cuenta = new CuentaCorriente("11111");
    
    
    cuenta.ingresar(1000);
    
   
    System.out.printf(Locale.US, "El saldo de la cuenta es %f%n", cuenta.getSaldo());
    
    
    cuenta.retirar(1100);
    
    
    System.out.printf(Locale.US, "El saldo de la cuenta es %f%n", cuenta.getSaldo());
    
   
    cuenta.retirar(900);
    
    // Imprimimos el saldo
    System.out.printf(Locale.US, "El saldo de la cuenta es %f%n", cuenta.getSaldo());
    
    // Retiramos 100 euros
    cuenta.retirar(100);
    
    // Ingresamos 350 euros
    cuenta.ingresar(350);
    
    // Imprimimos el saldo
    System.out.printf(Locale.US, "El saldo de la cuenta es %f%n", cuenta.getSaldo());
    
    // Retiramos 400 euros
    cuenta.retirar(400);
    
    // Imprimimos el saldo
    System.out.printf(Locale.US, "El saldo de la cuenta es %f%n", cuenta.getSaldo());
    
  }

}