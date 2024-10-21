import java.util.Scanner;
import java.util.Locale;

public class CalculoPresupuestoPorDepartamento {
 public static final double PORCENTAJE_DE_GINECOLOGIA = 0.4;
 public static final double PORCENTAJE_DE_TRAUMATOLOGIA = 0.35;
 public static final double PORCENTAJE_DE_PEDIATRIA = 0.25;
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
   System.out.print("Introduce el presupuesto anual del hospital: ");
   Double presupuestoAnualHospital = Double.parseDouble(sc.nextLine());
   
   Double presupuestoGinecologia = presupuestoAnualHospital * PORCENTAJE_DE_GINECOLOGIA;
   Double presupuestoTraumatologia = presupuestoAnualHospital * PORCENTAJE_DE_TRAUMATOLOGIA;
   Double presupuestoPediatria = presupuestoAnualHospital * PORCENTAJE_DE_PEDIATRIA;
   
   System.out.printf(Locale.US, "El presupuesto para Ginecologia es de %f euros, para Traumatologia de %f euros y para Pediatria %f euros.", presupuestoGinecologia, presupuestoTraumatologia, presupuestoPediatria);
  }

}
