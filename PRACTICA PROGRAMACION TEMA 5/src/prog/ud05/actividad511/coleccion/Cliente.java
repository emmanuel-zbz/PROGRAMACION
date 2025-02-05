package prog.ud05.actividad511.coleccion;
import java.util.regex.Matcher;
import java.util.regex.Pattern;



public class Cliente implements Comparable<Cliente> {
  
  private String nombre;
  
  private String apellidos;
  
  private String dni;
  
  private int edad;

  public Cliente(String nombre, String apellidos, String dni, int edad) {
    if (nombre == null || apellidos == null || dni == null) {
      throw new NullPointerException();
    }
    if (compruebaTodo(nombre, apellidos, dni, edad)) {
      this.nombre = nombre;
      this.apellidos = apellidos;
      this.dni = dni;
      this.edad = edad;
    } else {
      throw new IllegalArgumentException();
    }
  }
  

  private boolean compruebaTodo(String nombre, String apellidos, String dni, int edad) {
   return compruebaNombre(nombre) && compruebaApellido(apellidos) && compruebaDni(dni) && compruebaEdad(edad);
  }


  


  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public String getApellidos() {
    return apellidos;
  }

  public void setApellidos(String apellidos) {
    this.apellidos = apellidos;
  }

  public String getDni() {
    return dni;
  }

  public void setDni(String dni) {
    this.dni = dni;
  }

  public int getEdad() {
    return edad;
  }

  public void setEdad(int edad) {
    this.edad = edad;
  }

  @Override
  public int compareTo(Cliente o) {
    // TODO Auto-generated method stub
    return 0;
  }
  
  
  private boolean compruebaEdad(int edad) {
    return edad >= 0;
  }


  private boolean compruebaDni(String dni) {
    
    
    if (dni.isEmpty()) {
      throw new IllegalArgumentException();
    }
    String expresion = "^\\d{8}[TRWAGMYFPDXBNJZSQVHLCKE]$";
    
    String letrasDni = "TRWAGMYFPDXBNJZSQVHLCKE";
    
    
    int numerosDni = Integer.parseInt(dni.substring(0, 8));
    
    char letraCorrespondida = letrasDni.charAt(numerosDni % 23) ;
    
    char letraDelDni = dni.charAt(8);
    
   
    Pattern pattern = Pattern.compile(expresion);
    Matcher matcher = pattern.matcher(dni);
    
    return matcher.matches() && (letraCorrespondida == letraDelDni);
  }


  private boolean compruebaApellido(String apellidos) {
    if (apellidos.isBlank()) {
      return false;
    }
    return true;
  }


  private boolean compruebaNombre(String nombre) {
    if (nombre.isBlank()) {
      return false;
    }
    return true;
  }
  
}
