package prog.unidad04.practica406.libreria;

public class Motocicleta extends Vehiculo implements MaquinaConDistintivoAmbiental {
  
  private int cilindrada;

  public Motocicleta(String matricula, Fecha fechaMatriculacion, int cilindrada) {
    
    super(matricula, fechaMatriculacion);
    
    if (matricula == null || fechaMatriculacion == null) {
      throw new NullPointerException();
    }
    
    if (cilindrada >= 50) {
      this.cilindrada = cilindrada;
    } else {
      throw new IllegalArgumentException("Cilindrada mala");
    }
  
  }
  
  
  

  public int getCilindrada() {
    return cilindrada;
  }




  @Override
  public String getDistintivo() {
    if (cilindrada < 75) {
      return "0";
    }
    if (cilindrada >= 75 && cilindrada <= 125) {
      return "ECO";
    }
    if (cilindrada > 125 && cilindrada <= 500) {
      return "A";
    }
    return "B";
  }




  @Override
  public String toString() {
    return "Matricula: " + getMatricula() + ", Fecha Matriculacion: " + getFechaMatriculacion() + " Cilindrada: " + cilindrada;
  }

  
  
  
}

