package prog.unidad04.practica406.principal;
import java.time.LocalDate;
import java.util.Scanner;
import prog.unidad04.practica406.libreria.*;

public class VehiculosApp {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    System.out.println("PRÁCTICA DE EMMANUEL. GESTIÓN DE VEHÍCULOS");
    
    System.out.print("Introduce la matrícula del automóvil (4 números, 0 ó más espacios y tres letras mayúsculas): ");
    String matriculaAutomovil = sc.nextLine();
    
    LocalDate fechaLocal = LocalDate.now();
    
    Fecha fechaHoy = new Fecha(fechaLocal.getDayOfMonth(), fechaLocal.getMonthValue(), fechaLocal.getYear());
    
    
    Fecha fechaAutomovil = null;
    try {
      System.out.print("Introduce el día de la fecha de matriculación del automóvil: ");
      int diaAutomovil = Integer.parseInt(sc.nextLine());

      System.out.print("Introduce el mes de la fecha de matriculación del automóvil: ");
      int mesAutomovil = Integer.parseInt(sc.nextLine());

      System.out.print("Introduce el año de la fecha de matriculación del automóvil: ");
      int anyoAutomovil = Integer.parseInt(sc.nextLine());

      fechaAutomovil = new Fecha(diaAutomovil, mesAutomovil, anyoAutomovil);
  } catch (Exception e) {
      System.out.println("Fecha incorrecta: " + e.getMessage());
  }
      
      
      Automovil automovil = null;
    try {
      System.out.print("Introduce el color del automóvil (blanco, negro, o azúl): ");
      String color = sc.nextLine();
      
      System.out.print("Introduce las plazas del automóvil (1 o mas): ");
      int plazas = Integer.parseInt(sc.nextLine());
     
       automovil = new Automovil(matriculaAutomovil, fechaAutomovil, color, plazas);
      
      
    } catch (Exception e) {
      // TODO Auto-generated catch block
      System.out.printf("%s%n", e.getMessage());
      
    }
    
    
    System.out.print("Introduce la matrícula de la motocicleta (4 números, 0 ó más espacios y tres letras mayúsculas): ");
    String matriculaMotocicleta = sc.nextLine();
     
    
    System.out.print("Introduce el día de la fecha de matriculación la motocicleta: ");
    int diaMotocicleta = Integer.parseInt(sc.nextLine());

    System.out.print("Introduce el mes de la fecha de matriculación la motocicleta: ");
    int mesMotocicleta = Integer.parseInt(sc.nextLine());

    System.out.print("Introduce el año de la fecha de matriculación la motocicleta: ");
    int anyoMotocicleta = Integer.parseInt(sc.nextLine());
    
    Fecha fechaMotocicleta = null;

    
     try {
      fechaMotocicleta = new Fecha(diaMotocicleta, mesMotocicleta, anyoMotocicleta);
    } catch (FechaException e) {
      // TODO Auto-generated catch block
      System.out.printf("%s%n", e.getMessage());
    }


     
     System.out.print("Introduzca la cilindrada de la motocicleta (50 o mas): ");
     int cilindrada = Integer.parseInt(sc.nextLine());
     
     Motocicleta motocicleta = new Motocicleta(matriculaMotocicleta, fechaMotocicleta, cilindrada);

     
     System.out.println("Los datos del automovil son:");
     
     System.out.printf("%s%n", automovil);
     System.out.printf("Su distintivo ambiental es %s%n", automovil.getDistintivo());

     
     System.out.println("Los datos de la motocicleta son:");
     System.out.printf("%s%n", motocicleta);
     System.out.printf("Su distintivo ambiental es %s%n", motocicleta.getDistintivo());

     System.out.printf("El automóvil lleva matriculado %s días%n", fechaAutomovil.diasEntre(fechaHoy));

     System.out.printf("La motocicleta lleva matriculado %s días%n", fechaMotocicleta.diasEntre(fechaHoy));

     if (fechaAutomovil.compara(fechaMotocicleta) < 0) {
       System.out.println("El automóvil se matriculó antes que la motocicleta");
     }
     
     if (fechaAutomovil.compara(fechaMotocicleta) == 0) {
       System.out.println("Ambos se matricularon el mismo día");
     }
     
     if (fechaAutomovil.compara(fechaMotocicleta) > 0) {
       System.out.println("La motocicleta se matriculó antes que el automóvil");
     }
     
     System.out.printf("Número de vehículos matriculados: %s", automovil.getVehiculosMatriculados());
  }

}
