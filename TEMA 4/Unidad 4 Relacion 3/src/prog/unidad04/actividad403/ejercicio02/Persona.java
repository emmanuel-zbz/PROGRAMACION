package prog.unidad04.actividad403.ejercicio02;

public class Persona {
  
  private String nombre = "";
  
  private String DNI;
  
  private char sexo = 'M';
  
  private int edad = 0;
  
  private double peso = 0;
  
  private double altura = 0;

  public Persona() {
  }

  public Persona(String nombre, int edad, char sexo) {
    this.nombre = nombre;
    this.sexo = sexo;
    this.edad = edad;
  }

  public Persona(String nombre, int edad, char sexo, double peso, double altura) {
    this.nombre = nombre;
    if (edad < 0) {
      throw new IllegalArgumentException("La edad debe ser mayor o igual a 0");
    }
    if (sexo != 'M' && sexo != 'H') {
      throw new IllegalArgumentException("El sexo debe ser 'H' o 'M'");
    }
    if (peso < 0) {
      throw new IllegalArgumentException("El peso debe ser mayor o igual a 0");
    }
    if (altura < 0) {
      throw new IllegalArgumentException("La altura debe ser mayor o igual a 0");
    } 
      this.sexo = sexo;
      this.edad = edad;
      this.peso = peso;
      this.altura = altura;
    
  }

  
  public double getIMC() {
    if (altura == 0) {
      return 0;
    } else {
      return (peso) / ((altura) * (altura));
    }
  }
  
  public int getPesoCorrecto() {
    
    double imc = getIMC();
    
    if (imc < 20) {
      return -1;
    } else if (imc > 25) {
      return 1;
    } else {
      return 0;
    }
  }
  
  public boolean esMayorDeEdad() {
    return edad >= 18;
  }
  public void generarDNI() {
    
  }

  public String toString() {
    return "Nombre: \"" + nombre + "\", Edad: " + edad + ", Sexo: " + sexo + ", Peso: " + peso + ", Altura: " + altura;
  }
  
  
}