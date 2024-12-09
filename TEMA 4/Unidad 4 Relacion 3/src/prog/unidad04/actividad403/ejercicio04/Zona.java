package prog.unidad04.actividad403.ejercicio04;

public class Zona {
  
  private int EntradasPorVender;

  public Zona(int entradasPorVender) throws ZonaException {
   if (entradasPorVender > 0) {
     EntradasPorVender = entradasPorVender;
   } else {
     throw new ZonaException("El numero de entradas iniciales es menor que 1");
   }
  }
  
  public int getEntradasPorVender() {
    return EntradasPorVender;
  }

  public void vender(int entradas) throws ZonaException {
    if (EntradasPorVender >= entradas) {
      EntradasPorVender -= entradas;
  } else {
    throw new ZonaException("No hay suficientes entradas para realizar la venta");
  }
    }
  
  
}
