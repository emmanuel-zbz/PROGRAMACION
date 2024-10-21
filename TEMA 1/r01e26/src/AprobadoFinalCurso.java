import java.util.Scanner;
import java.util.Locale;

public class AprobadoFinalCurso {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
  System.out.print("Introduce la primera nota: ");
  Double nota1 = Double.parseDouble(sc.nextLine());
  System.out.print("Introduce la segunda nota: ");
  Double nota2 = Double.parseDouble(sc.nextLine());
  System.out.print("Introduce la tercera nota: ");
  Double nota3 = Double.parseDouble(sc.nextLine());
  
  double media = (nota1 + nota2 + nota3) / 3;
  
  boolean aprobadoFinal = media >= 5.0;
  
  System.out.printf("¿El alumno está aprobado?: %b", aprobadoFinal);

  }

}
