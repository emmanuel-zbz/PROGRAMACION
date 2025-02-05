package prog.ud05.actividad511.coleccion;

import java.util.ArrayList;
import java.util.List;
import prog.ud05.actividad511.coleccion.diccionario.*;

public class Usuarios {
  
  private Diccionario<Usuario> diccionario;
  
  public Usuarios() {
    diccionario = new Diccionario<>();
  }
  
  public void addUsuario(Usuario usuario) {
    
    if (usuario == null) {
      throw new IllegalArgumentException();
    }
    
    String nombreUsuario = usuario.getNombreUsuario();
    
    if (diccionario.contieneNombre(nombreUsuario)) {
      throw new UsuariosException("USUARIO YA EN EL DICCIONARIO");
    }
    
    
    diccionario.add(nombreUsuario, usuario);
  }
  
  public Usuario getUsuarioPorNombreUsuario(String nombreUsuario) {
    
    return diccionario.getEntrada(nombreUsuario);
        
  }
    
}
