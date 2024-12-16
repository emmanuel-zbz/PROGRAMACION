package prog.unidad04.practica406.libreria;
import java.time.LocalDate;
import java.time.temporal.*;

public class Fecha {
  
  private int dia;
  
  private int mes;
  
  private String mesTexto;
  
  private int anyo;


  public Fecha(int dia, int mes, int anyo){
    
    if (anyo < 1900) {
      throw new IllegalArgumentException();
    }
    
    this.dia = dia;
    this.mes = mes;
    this.anyo = anyo;
    
    if (!esFechaValida(dia, mes, anyo)) {
      throw new IllegalArgumentException("Revisa la fecha.");
      
    }
    
  }
  
  
  public long diasEntre(Fecha fecha) {
    if (this.compara(fecha) >0) {
      throw new FechaException("La fecha inicio es meno que la otra");

    }
    LocalDate fechaHoy = LocalDate.of(this.anyo, this.mes, this.dia);
    
    LocalDate fechaMatricula = LocalDate.of(fecha.getAnyo(), fecha.getMes(), fecha.getDia());
    
    return ChronoUnit.DAYS.between(fechaHoy, fechaMatricula );
  }
  
  
  public long diasTranscurridos() {
    
    LocalDate fechaHoy = LocalDate.of(this.anyo, this.mes, this.dia);
    
    LocalDate fechaInicio = LocalDate.of(1900, 1, 1);
    
    return ChronoUnit.DAYS.between(fechaInicio, fechaHoy);
  }
  
  
  public int getDia() {
    return dia;
  }
  
  
  public int getMes() {
    return mes;
  }

  public int getAnyo() {
    return anyo;
  }
  
  public boolean esBisiesto() {
    return (anyo % 4 == 0 && (anyo % 100 != 0 || anyo % 400 == 0));
  }
  
  public int compara(Fecha fecha) {
    if (this.anyo < fecha.getAnyo()) {
      return -1;
    }
    if (this.anyo > fecha.getAnyo()) {
      return 1;
    }
    
    if (this.mes < fecha.getMes()) {
      return -1;
    }
    
    if (this.mes > fecha.getMes()) {
      return 1;
    }
    
    if (this.dia < fecha.getDia()) {
      return -1;
    }
    if (this.dia > fecha.getDia()) {
      return 1;
    }
    
    return 0;
  }
  

  public String toString() {
    return "" + dia + " de " + saberDiaMesTexto(mes) + " de " + anyo;
  }
  
 
  private boolean esFechaValida(int dia, int mes, int anyo) {
    if (mes < 1 || mes > 12) {
      return false;
    }
    
    if (anyo < 1) {
      return false;
    }
    
    int diasMes = saberDiasMes( mes, anyo);
    
    return (dia >= 1 && dia <= diasMes);
    
  }
  
  private int saberDiasMes(int mes, int anyo) {
    switch (mes) {
    case 1:
      return 31;
    case 2:
      if (anyo % 4 == 0) {
        return 29;
      } else {
        return 28;
      }
    case 3:
      return 31;
    case 4:
      return 30;
    case 5:
      return 31;
    case 6: 
      return 30;
    case 7:
      return 31;
    case 8:
      return 31;
    case 9: 
      return 30;
    case 10:
      return 31;
    case 11: 
      return 30;
    case 12:
      return 31;
    }
    return 0 ;
  }
  
  private String saberDiaMesTexto(int mes) {
    switch (mes) {
    case 1:
      return "enero";
    case 2:
      return "febrero";
    case 3:
      return "marzo";
    case 4:
      return "abril";
    case 5:
      return "mayo";
    case 6: 
      return "junio";
    case 7:
      return "julio";
    case 8:
      return "agosto";
    case 9: 
      return "septiembre";
    case 10:
      return "octubre";
    case 11: 
      return "noviembre";
    case 12:
      return "diciembre";
    }
    return "" ;
  }
  
  
  
  
}
