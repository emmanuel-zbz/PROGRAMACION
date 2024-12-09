package prog.unidad04.actividad403.ejercicio03;

public class Lavadora {
  
  private int PrecioBase = 200;
  
  private String Color = "blanco";
  
  private char ConsumoEnergetico = 'F';

  private int Peso = 15;
  
  private int Carga = 5;

  public Lavadora() {
  }

  public Lavadora(int precioBase, int peso) {
    PrecioBase = precioBase;
    Peso = peso;
  }

  public Lavadora(int precioBase, String color, char consumoEnergetico, int peso, int carga) {
    if (precioBase < 0) {
      throw new IllegalArgumentException("Precio incorrecto");
    }
    if (color != "blanco" && color != "negro" && color != "azul" && color != "rojo" && color != "gris") {
      throw new IllegalArgumentException("Color incorrecto");
    }
    if (consumoEnergetico != 'A' && consumoEnergetico != 'B' && consumoEnergetico != 'C' && consumoEnergetico != 'D' && consumoEnergetico != 'E' && consumoEnergetico != 'F') {
      throw new IllegalArgumentException("Consumo incorrecto");
    }
    if (peso <= 0) {
      throw new IllegalArgumentException("Peso incorrecto");
    }
    if (carga <= 0) {
      throw new IllegalArgumentException("Carga incorrecto");
    }
    PrecioBase = precioBase;
    Color = color;
    ConsumoEnergetico = consumoEnergetico;
    Peso = peso;
    Carga = carga;
  }

  public int getPrecioBase() {
    return PrecioBase;
  }

  public String getColor() {
    return Color;
  }

  public char getConsumoEnergetico() {
    return ConsumoEnergetico;
  }

  public int getPeso() {
    return Peso;
  }

  public int getCarga() {
    return Carga;
  }
  
  public double getPrecioFinal() {
    if (ConsumoEnergetico == 'A') {
      PrecioBase += 100;
    }
    if (ConsumoEnergetico == 'B') {
       PrecioBase += 80;
    }
    if (ConsumoEnergetico == 'C') {
       PrecioBase += 60;
    }
    if (ConsumoEnergetico == 'D') {
       PrecioBase += 50;
    }
    if (ConsumoEnergetico == 'E') {
       PrecioBase += 30;
    }
    if (ConsumoEnergetico == 'F') {
       PrecioBase += 10;
    }
    if (Peso < 20) {
      PrecioBase += 10;
    } else if (Peso >= 20 && Peso < 50) {
      PrecioBase += 50;
    } else if (Peso >= 50 && Peso < 80) {
      PrecioBase += 80;
    } else {
      PrecioBase += 100;
    }
    if (Carga > 30) {
      PrecioBase += 50;
    }
    return PrecioBase;
  }
  
  
}
