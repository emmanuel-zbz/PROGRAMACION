package prog.unidad04.actividad403.ejercicio01;

public class Pizza {
  
  private String tamanyo;
  
  private String tipo;
  
  private String estado;

  private static int PizzasServidas;
  
  private static int PizzasCreadas;

  
  
  public Pizza(String tamanyo, String tipo) {
    if (tamanyo != "mediana" && tamanyo !="familiar") {
      throw new IllegalArgumentException("El tamaño de la pizza no es uno de los permitidos");
    } else if (tipo != "margarita" && tipo != "funghi" && tipo != "cuatro quesos") {
      throw new IllegalArgumentException("El tipo de la pizza no es uno de los permitidos");
    } else {
      this.tamanyo = tamanyo;
      this.tipo = tipo;
      this.estado = "pedida";
      PizzasCreadas++;
    }
  }


  


  public void sirve() throws PizzaAlreadyServedException{
    if (estado.equals("servida")) {
      throw new PizzaAlreadyServedException("La pizza ya está servida");
    } else {
      estado = "servida";
      PizzasServidas++;
    }
  }


  public static int getPizzasServidas() {
    return PizzasServidas;
  }


  public static int getPizzasCreadas() {
    return PizzasCreadas;
  }


  
  public String toString() {
    return "Pizza Tamaño: " + tamanyo + ", Tipo: " + tipo + ", Estado: " + estado;
  }
  
  
}
