package prog.ud05.actividad511.coleccion;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Usuario {
  
  private String nombreUsuario;
  
  private String nombreCompleto;
  
  private TarjetaClaves tarjeta;
  
  private List<Cliente> clientes;

  public Usuario(String nombreUsuario, String nombreCompleto, TarjetaClaves tarjeta, List<Cliente> clientes) {
    if (validaTodo(nombreUsuario, nombreCompleto, tarjeta, clientes)) {
      this.nombreUsuario = nombreUsuario;
      this.nombreCompleto = nombreCompleto;
      this.tarjeta = tarjeta;
      this.clientes = clientes;
    } else {
      throw new IllegalArgumentException();
    }
    
  }
  
  public String getNombreUsuario() {
    return nombreUsuario;
  }
  
  public String getNombreCompleto() {
    return nombreCompleto;
  }

  public TarjetaClaves getTarjeta() {
    return tarjeta;
  }

  public List<Cliente> getClientes() {
    return clientes;
  }

  private boolean validaTodo(String nombreUsuario, String nombreCompleto, TarjetaClaves tarjeta, List<Cliente> clientes) {
    return verificaNombreUsuario(nombreUsuario) && verificaNombreCompleto(nombreCompleto) && verificaTarjeta(tarjeta) && verificaClientes(clientes);
  }

  private boolean verificaClientes(List<Cliente> clientes) {
    if (clientes == null) {
      throw new NullPointerException();
    }
    return true;
  }

  private boolean verificaTarjeta(TarjetaClaves tarjeta) {
    if (tarjeta == null) {
      throw new NullPointerException();
    }
    return true;
  }

  private boolean verificaNombreCompleto(String nombreCompleto) {
    if (nombreCompleto == null) {
      throw new NullPointerException();
    }
    
    if (nombreCompleto.isEmpty()) {
      throw new IllegalArgumentException();
    }
    return true;
  }

  private boolean verificaNombreUsuario(String nombreUsuario) {
    if (nombreUsuario == null) {
      throw new NullPointerException();
    }
    
    String expresion = "^[A-Za-z][A-Za-z0-9]{1,7}$";
    Pattern pattern = Pattern.compile(expresion);
    Matcher matcher = pattern.matcher(nombreUsuario);
    return matcher.matches();
  }
  
  
  
  
  
 
  

 

  
  

}
