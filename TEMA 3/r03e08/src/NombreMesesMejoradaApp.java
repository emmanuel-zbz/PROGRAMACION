import java.util.Scanner;

public class NombreMesesMejoradaApp {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Introduce un numero entero del 1 al 12 y te diré que mes ocupa esa posición: ");
    int mes = Integer.parseInt(sc.nextLine());

    if (mes == 1) {
      System.out.print("El mes con posición 1 tiene el nombre de \"enero\"");
    }
    if (mes == 2) {
      System.out.print("El mes con posición 2 tiene el nombre de \"febrero\"");
    }
    if(mes == 3) {
      System.out.print("El mes con posición 3 tiene el nombre de \"marzo\"");
    }
    if(mes == 4) {
      System.out.print("El mes con posición 4 tiene el nombre de \"abril\"");
    }
    if(mes == 5) {
      System.out.print("El mes con posición 5 tiene el nombre de \"mayo\"");
    }
    if(mes == 6) {
      System.out.print("El mes con posición 6 tiene el nombre de \"junio\"");
    }
    if(mes == 7) {
      System.out.print("El mes con posición 7 tiene el nombre de \"julio\"");
    }
    if(mes == 8) {
      System.out.print("El mes con posición 8 tiene el nombre de \"agosto\"");
    }
    if(mes == 9) {
      System.out.print("El mes con posición 9 tiene el nombre de \"septiembre\"");
    }
    if(mes == 10) {
      System.out.print("El mes con posición 10 tiene el nombre de \"octubre\"");
    }
    if(mes == 11) {
      System.out.print("El mes con posición 11 tiene el nombre de \"noviembre\"");
    }
    if(mes == 12) {
      System.out.print("El mes con posición 12 tiene el nombre de \"diciembre\"");
    }else {
      System.out.print("El numero introducido no es correcto. Introduzca un número del 1 al 12");
    }

  }

}
