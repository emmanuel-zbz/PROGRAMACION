package prog.unidad03.seleccion;
import java.util.Locale;
import java.util.Scanner;

public class CalculaIMCApp {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Introduce tu peso en kg: ");
    double peso = Double.parseDouble(sc.nextLine());
    System.out.print("Introduce tu altura en metros: ");
    double altura = Double.parseDouble(sc.nextLine());
    
    double imc = peso / (altura * altura);
        
    if (imc < 16) {
     System.out.printf(Locale.US, "Su IMC es de %f, con un diagnóstico de Ingreso en hospital por infrapeso",imc);
    }
    
    if ((imc >= 16) && (imc < 17)) {
      System.out.printf(Locale.US, "Su IMC es de %f, con un diagnóstico de infrapeso",imc);
     }
    if ((imc >= 17) && (imc < 18)) {
      System.out.printf(Locale.US, "Su IMC es de %f, con un diagnóstico de bajo peso",imc);
     }
    if ((imc >= 18) && (imc < 25)) {
      System.out.printf(Locale.US, "Su IMC es de %f, con un diagnóstico de peso normal (saludable)",imc);
      }
    if ((imc >= 25) && (imc < 30)) {
      System.out.printf(Locale.US, "Su IMC es de %f, con un diagnóstico de Sobrepeso (obesidad grado I)",imc);
     }
    if ((imc >= 30) && (imc < 35)) {
      System.out.printf(Locale.US, "Su IMC es de %f, con un diagnóstico de Sobrepeso crónico (obesidad grado II)",imc);
     }
    if ((imc >= 35) && (imc <= 40)) {
      System.out.printf(Locale.US, "Su IMC es de %f, con un diagnóstico de Obesidad premorbida (obesidad grado III)",imc);     }
    if (imc > 40) {
      System.out.printf(Locale.US, "Su IMC es de %f, con un diagnóstico de Obesidad morbida (obesidad grado IV)",imc);      }
  }

}
