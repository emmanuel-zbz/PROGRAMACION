package prog.unidad05.arraysobjetos.ejercicio01;

public class Libro {
  
  private String titulo;
  
  private String autor;
  
  private int AnyoPublicacion;
  
  public Libro(String titulo, String autor, int anyoPublicacion) {
    this.titulo = titulo;
    this.autor = autor;
    this.AnyoPublicacion = anyoPublicacion;
  }

  public String getTitulo() {
    return titulo;
  }

  public String getAutor() {
    return autor;
  }

  public int getAnyoPublicacion() {
    return AnyoPublicacion;
  }
  
  

}
