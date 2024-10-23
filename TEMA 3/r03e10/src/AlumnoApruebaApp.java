import java.util.Scanner;
import java.util.Locale;

public class AlumnoApruebaApp {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Introduce la nota de la primera evaluacion: ");
    double nota1 = Double.parseDouble(sc.nextLine());

    System.out.print("Introduce la nota de la segunda evaluacion: ");
    double nota2 = Double.parseDouble(sc.nextLine());

    System.out.print("Introduce la nota de la tercera evaluacion: ");
    double nota3 = Double.parseDouble(sc.nextLine());
    
    
    double notaMedia = (nota1 + nota2 + nota3) / 3;
    
    if(notaMedia >= 5) {
      System.out.printf(Locale.US, "El alumno ha aprobado con una nota media de %f", notaMedia);
    }else {
      System.out.printf(Locale.US, "El alumno ha suspendido con una nota media de %f", notaMedia);
    }
  }

}
