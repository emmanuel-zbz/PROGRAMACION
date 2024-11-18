package prog.unidad04.atributos;
import java.util.Locale;
import java.util.Scanner;

public class ManejoPersonas {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    Scanner sc = new Scanner(System.in);
    
    Persona persona = new Persona();
    
    System.out.print("Introduzca la cantidad de lavadoras a crear (1 o mas): ");
    int personasACrear = Integer.parseInt(sc.nextLine());
    
    for (int i = 1; i <= personasACrear; i++) {
      System.out.printf("Introduce los datos de la persona %d%n", i);
      
      System.out.print("Introduce el nombre de la persona: ");
      persona.nombre = sc.nextLine();
      
      System.out.print("Introduce la edad de la persona: ");
      persona.edad = Integer.parseInt(sc.nextLine());
      
      System.out.print("Introduce el DNI de la persona (debe constar de 8 numeros y una letra): ");
      persona.DNI = sc.nextLine();
      
      System.out.print("Introduce el sexo de la persona (H = Hombre, M = mujer): ");
      persona.sexo = sc.nextLine().charAt(0);
      
      System.out.print("Introduce el peso de la persona: ");
      persona.peso = Double.parseDouble(sc.nextLine());
      
      System.out.print("Introduce la altura de la persona: ");
      persona.altura = Double.parseDouble(sc.nextLine());
      
      System.out.printf("Datos de la persona %d%n", i);
      System.out.printf("Nombre: %s%n", persona.nombre);
      System.out.printf("Edad: %d%n", persona.edad);
      System.out.printf("DNI: %s%n", persona.DNI);
      System.out.printf("Sexo: %s%n", persona.sexo);
      System.out.printf("Peso: %f%n", persona.peso);
      System.out.printf("Altura: %f%n", persona.altura);
  }
  }
}
