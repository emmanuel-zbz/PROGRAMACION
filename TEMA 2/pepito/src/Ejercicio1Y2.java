import java.util.Locale;

public class Ejercicio1Y2 {

  public static void main(String[] args) {

    Persona persona1 = new Persona();

    persona1.edad = 25;
    persona1.numeroHijos = 0;
    persona1.peso = 75.4;

    Persona persona2 = new Persona();

    persona2.edad = 65;
    persona2.numeroHijos = 3;
    persona2.peso = 65;

    boolean verificador = persona1 == persona2;

    System.out.printf(Locale.US, "La primera persona tiene %d años, %d hijos y pesa %f kilos%n", persona1.edad,
        persona1.numeroHijos, persona1.peso);

    System.out.printf(Locale.US, "La segunda persona tiene %d años, %d hijos y pesa %f kilos%n", persona2.edad,
        persona2.numeroHijos, persona2.peso);

    System.out.printf("¿Las variables apuntan al mismo objeto?: %b", verificador);
  }

}
