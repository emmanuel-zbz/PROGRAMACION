import java.util.Scanner;
import java.util.Locale;

public class CalculoEvaluacion {
public static final double PORCENTAJE_EXAMENES = 0.55;
public static final double PORCENTAJE_EXAMENEN_FINAL = 0.30;
public static final double PORCENTAJE_TRABAJO_FINAL = 0.15;

public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  
 System.out.print("Introduce la nota del primer examen : ");
 Double notaPrimerExamen = Double.parseDouble(sc.nextLine());
 System.out.print("Introduce la nota del segundo examen : ");
 Double notaSegundoExamen = Double.parseDouble(sc.nextLine());
 System.out.print("Introduce la nota del tercer examen : ");
 Double notaTercerExamen = Double.parseDouble(sc.nextLine());
 
 System.out.print("Introduce la nota del examen final : ");
 Double notaExamenFinal = Double.parseDouble(sc.nextLine());


 System.out.print("Introduce la nota del trabajo : ");
 Double notaTrabajo = Double.parseDouble(sc.nextLine());
 
 Double notaEvaluacion = ((notaPrimerExamen + notaSegundoExamen + notaTercerExamen) / 3) * PORCENTAJE_EXAMENES + notaExamenFinal * PORCENTAJE_EXAMENEN_FINAL + notaTrabajo * PORCENTAJE_TRABAJO_FINAL;
 
 System.out.printf(Locale.US, "La nota total de la evaluacion es de %f", notaEvaluacion);
}
}
