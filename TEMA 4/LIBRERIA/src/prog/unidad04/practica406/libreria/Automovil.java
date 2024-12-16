package prog.unidad04.practica406.libreria;

public class Automovil extends Vehiculo implements MaquinaConDistintivoAmbiental{
  
  public static final String COLOR_BLANCO = "blanco";

  public static final String COLOR_AZUL = "azul";
  
  public static final String COLOR_NEGRO = "negro";
  
  private String color;
  
  private int plazas;

  
  public Automovil(String matricula, Fecha fechaMatriculacion, String color, int plazas){
    super(matricula, fechaMatriculacion);
    
    
    if (color == null || fechaMatriculacion == null) {
      throw new NullPointerException();
    } 
    
    if (!color.equals(COLOR_AZUL) && !color.equals(COLOR_BLANCO) && !color.equals(COLOR_NEGRO) || plazas < 1) {
      throw new IllegalArgumentException("No se pudo crear el automóvil. Revise los datos para comprobar que todos son correctos.");
    } else {
      this.plazas = plazas;
      this.color = color;
    }
    
    
  }
  
  

  public String getColor() {
    return color;
  }



  public int getPlazas() {
    return plazas;
  }



  
  public String getDistintivo() {
    if (plazas == 1) {
      return "0";
    } 
    if (plazas >= 2 && plazas <= 3) {
      return "ECO";
    }
    if (plazas >= 4 && plazas <= 5) {
      return "A";
    } else {
      return "B";
    }
  }



  
  public String toString() {
    return "Matricula: " + getMatricula() + ", Fecha Matriculacion: " + getFechaMatriculacion() + ", Color: " + color + ", Num. Plazas: " + plazas;
  }
  
}