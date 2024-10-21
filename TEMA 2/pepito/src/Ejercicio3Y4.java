import java.util.Locale;

public class Ejercicio3Y4 {

  public static void main(String[] args) {

    Persona persona1 = new Persona();
   

    persona1.edad = 33;
    persona1.peso = 80.43;
    persona1.numeroHijos = 1;
    
    Persona persona2 = persona1;
    
    persona2.peso = 79.65;
    
    System.out.printf(Locale.US, "La persona 1 tiene %d años, pesa %f kilos y tiene %d hijos%n", persona1.edad, persona1.peso, persona1.numeroHijos);
    System.out.printf(Locale.US, "La persona 1 tiene %d años, pesa %f kilos y tiene %d hijos", persona2.edad, persona2.peso, persona2.numeroHijos);

    
    

  }

}
