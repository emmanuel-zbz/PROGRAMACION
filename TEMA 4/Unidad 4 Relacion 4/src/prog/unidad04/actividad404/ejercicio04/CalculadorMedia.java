package prog.unidad04.actividad404.ejercicio04;

public class CalculadorMedia {
  
  private double valorInicial;
  
  private int divisor = 0;
  
  public CalculadorMedia(double valorInicial) {
    this.valorInicial = valorInicial;
    divisor++;
  }
  
  public void add(double numero) {
    valorInicial += numero;
    divisor++;
  }
  
  public double getMedia() {
    return (valorInicial / divisor) ;
  }
}
