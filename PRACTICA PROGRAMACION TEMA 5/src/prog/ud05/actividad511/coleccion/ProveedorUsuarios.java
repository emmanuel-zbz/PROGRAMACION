package prog.ud05.actividad511.coleccion;

public interface ProveedorUsuarios {
  /**
   * Obtiene los usuarios desde la fuente de datos.
   *
   * @return Contenedor con los usuarios si todo fue correcto. Vacío o incompleto en caso de error.
   * @throws ProveedorUsuariosException Si hay algún error obteniendo la información.
   */
  Usuarios obtieneUsuarios() throws ProveedorUsuariosException;
}
