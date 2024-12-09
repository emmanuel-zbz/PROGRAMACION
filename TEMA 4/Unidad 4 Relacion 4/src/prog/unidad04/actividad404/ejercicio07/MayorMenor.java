package prog.unidad04.actividad404.ejercicio07;

public class MayorMenor {

  private int numero;
  
  private int mayor;
  
  private int menor;

  
  public MayorMenor(int numero) {
    
    this.numero = numero;
     mayor = numero;
     menor = numero;
  }
  
  public void add(int numeroOtro) {
    numero += numeroOtro;
    if (numeroOtro > mayor) {
      mayor = numeroOtro;
    }
    if (numeroOtro < menor) {
      menor = numeroOtro;
    }
  }
  
  public int getMayor() {
    return mayor;
  }
  
  public int getMenor() {
    return menor;
  }
}
