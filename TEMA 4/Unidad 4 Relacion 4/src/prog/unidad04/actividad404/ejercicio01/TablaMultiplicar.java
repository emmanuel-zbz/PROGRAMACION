package prog.unidad04.actividad404.ejercicio01;

public class TablaMultiplicar {
  private int numero;

  public TablaMultiplicar(int numero) {
    this.numero = numero;
  }
  
  public void imprimetabla() {
    System.out.println("TABLA DEL " + numero);
    for (int i = 1; i <= 10; i++) {
      
      System.out.printf(numero + " X %d = %d%n", i, (numero * i));
    }
  }
}
