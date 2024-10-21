import java.util.Scanner;

public class NavajaSuizaCadenasApp {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Introduce la primera cadena: ");
    String cadena1 = sc.nextLine();

    System.out.print("Introduce la segunda cadena: ");
    String cadena2 = sc.nextLine();

    cadena1.length();
    cadena2.length();

    cadena1.isEmpty();
    cadena2.isEmpty();

    cadena1.isBlank();
    cadena1.isBlank();

    System.out.printf("La longitud de la primera cadena es %d%n", cadena1.length());
    System.out.printf("La longitud de la segunda cadena es %d%n", cadena2.length());

    System.out.printf("¿La primera cadena está vacía?: %b%n", cadena1.isEmpty());
    System.out.printf("¿La segunda cadena está vacía?: %b%n", cadena2.isEmpty());

    System.out.printf("¿La primera cadena está en blanco?: %%n", cadena1.isBlank());
    System.out.printf("¿La segunda cadena está en blanco?: %b%n", cadena2.isBlank());

    System.out.printf("La concatenacion es: " + cadena1 + cadena2 + "%n");

    System.out.printf("¿La primera cadena es igual que la segunda teniendo en cuenta las mayúsculas?: %b%n", cadena1.equals(cadena2));
    System.out.printf("¿La primera cadena es igual que la segunda teniendo en cuenta las mayúsculas?: %b%n", cadena1.equalsIgnoreCase(cadena2));

    System.out.printf("La primera es anterior o posterior alfabéticamente (teniendo en cuenta las mayúsculas)?:%d%n", cadena1.compareTo(cadena2));
    System.out.printf("La primera es anterior o posterior alfabéticamente (ignorando mayúsculas)?:%d%n", cadena1.compareToIgnoreCase(cadena2));

    System.out.printf("¿La primera cadena contiene a la segunda?: %b%n", cadena1.contains(cadena2));

    System.out.printf("¿La primera cadena empieza con la segunda?: %b%n", cadena1.startsWith(cadena2));
    System.out.printf("¿La primera cadena termina con la segunda?: %b%n", cadena1.endsWith(cadena2));

    System.out.printf("El primero caracter de la primera cadena es \"%s\" y el último caracter es \"%s\"%n", cadena1.charAt(0), cadena1.charAt(cadena1.length() - 1));

    System.out.printf("La primera cadena sin el primer carácter es: %s%n", cadena1.substring(1));

    System.out.printf("La primera cadena con todos sus letras en minúsculas es \"%s\" y con todas sus letras mayúsculas es \"%s\"", cadena1.toLowerCase(), cadena1.toUpperCase());

  }
}
