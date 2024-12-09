package prog.unidad04.actividad403.ejercicio08;


public class Fraccion {
  private int numerador;
  
  private int denominador;

  
  
  
  public Fraccion(int numerador, int denominador) {
    this.numerador = numerador;
    if (denominador == 0) {
      throw new IllegalArgumentException();
    }
    this.denominador = denominador;
  }

  
  public Fraccion suma(Fraccion otro) {
    int nuevoDen = denominador * otro.denominador;
    
    int nuevoNum = (numerador * otro.denominador) + (otro.numerador * denominador);
    
    return new Fraccion (nuevoNum, nuevoDen);
  }
  
  public Fraccion resta(Fraccion otro) {
    int nuevoDen = denominador * otro.denominador;
    
    int nuevoNum = (numerador * otro.denominador) - (otro.numerador * denominador);
    
    return new Fraccion (nuevoNum, nuevoDen);
  }
  
  public Fraccion multiplica(Fraccion otro) {
    int nuevoDen = denominador * otro.denominador;
    
    int nuevoNum = numerador * numerador;
    
    return new Fraccion (nuevoNum, nuevoDen);
  }
  
  public Fraccion divide(Fraccion otro) {
    int nuevoDen = denominador * otro.numerador;
    
    int nuevoNum = numerador * otro.denominador;
    
    return new Fraccion (nuevoNum, nuevoDen);
  }
  
  public void simplifica() {
    if (numerador % 2 == 0 && denominador % 2 ==0) {
      numerador /= 2;
      denominador /=2;
    }
    if (numerador % 3 == 0 && denominador % 3 ==0) {
      numerador /= 3;
      denominador /=3;
    }
    if (numerador % 5 == 0 && denominador % 5 ==0) {
      numerador /= 5;
      denominador /=5;
    }
    if (numerador % 7 == 0 && denominador % 7 ==0) {
      numerador /= 7;
      denominador /=7;
    }
    
  }


  @Override
  public String toString() {
    return "" + numerador + " / " + denominador;
  }
  
  
}