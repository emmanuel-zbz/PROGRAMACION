package prog.unidad04.actividad403.ejercicio06;

import java.util.Random;
import java.util.random.*;

 
public class TarjetaRegalo {
  Random random = new Random();
  private String id;
  
  private int saldo = 0;

  public TarjetaRegalo(int saldo) {
    if (saldo >= 0) {
      this.saldo = saldo;
    } else {
      throw new IllegalArgumentException();
    }
    
    this.id = generaid();
  }
  
  private String generaid() {
    int numero = random.nextInt(0, 1000000);
  
    return String.format("%05d", numero);
  }

  public void gasta(double dinero) {
    if (dinero > saldo) {
      throw new InsufficientFundsException();
    } else {
      saldo -= dinero;
    }
  }
  
  public TarjetaRegalo fusionaCon(TarjetaRegalo otro) {
   
    int nuevoSaldo = saldo + otro.saldo;
    
    saldo = 0;
    otro.saldo = 0;
    
    return new TarjetaRegalo(nuevoSaldo);
  }

  @Override
  public String toString() {
    return "TarjetaRegalo nº: " + id +  ", Saldo: " + saldo + "$";
  }
  
  
}
