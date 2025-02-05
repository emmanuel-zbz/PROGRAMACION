package prog.ud05.actividad511.proveedores;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import prog.ud05.actividad511.coleccion.Cliente;
import prog.ud05.actividad511.coleccion.ProveedorUsuarios;
import prog.ud05.actividad511.coleccion.ProveedorUsuariosException;
import prog.ud05.actividad511.coleccion.TarjetaClaves;
import prog.ud05.actividad511.coleccion.Usuario;
import prog.ud05.actividad511.coleccion.Usuarios;

public class ProveedorUsuariosArchivoJSON implements ProveedorUsuarios {

    private String archivo;

    /**
     * Constructor de la clase.
     *
     * @param archivo Ruta del archivo JSON que contiene los datos de los usuarios.
     */
    public ProveedorUsuariosArchivoJSON(String archivo) {
        this.archivo = archivo;
    }

    @Override
    public Usuarios obtieneUsuarios() throws ProveedorUsuariosException {
        try {
            // Leer el archivo JSON
            JsonElement raiz = JsonParser.parseReader(new FileReader(archivo));

            // Verificar que la raíz es un array
            if (!raiz.isJsonArray()) {
                throw new ProveedorUsuariosException("El archivo JSON no contiene un array en su raíz.");
            }

            JsonArray array = raiz.getAsJsonArray();
            Usuarios usuarios = new Usuarios();

            // Recorrer cada elemento del array
            for (JsonElement elementoUsuario : array) {
                if (!elementoUsuario.isJsonObject()) {
                    throw new ProveedorUsuariosException("Un elemento del array no es un objeto JSON.");
                }

                JsonObject objetoUsuario = elementoUsuario.getAsJsonObject();

                // Obtener los datos del usuario
                String nombreUsuario = objetoUsuario.get("nombreUsuario").getAsString();
                String nombreCompleto = objetoUsuario.get("nombreCompleto").getAsString();

                // Procesar la tarjeta de claves
                JsonArray tarjetaClavesJson = objetoUsuario.getAsJsonArray("tarjetaClaves");
                int filas = tarjetaClavesJson.size();
                int columnas = tarjetaClavesJson.get(0).getAsJsonArray().size();
                TarjetaClaves tarjeta = new TarjetaClaves(filas, columnas);

                for (int i = 0; i < filas; i++) {
                    JsonArray fila = tarjetaClavesJson.get(i).getAsJsonArray();
                    for (int j = 0; j < columnas; j++) {
                        tarjeta.setClave(i + 1, j + 1, fila.get(j).getAsInt());
                    }
                }

                // Procesar los clientes
                JsonArray clientesJson = objetoUsuario.getAsJsonArray("clientes");
                List<Cliente> clientes = new ArrayList<>();
                for (JsonElement elementoCliente : clientesJson) {
                    if (!elementoCliente.isJsonObject()) {
                        throw new ProveedorUsuariosException("Un elemento de clientes no es un objeto JSON.");
                    }

                    JsonObject objetoCliente = elementoCliente.getAsJsonObject();

                    // Crear un nuevo cliente
                    Cliente cliente = new Cliente(
                        objetoCliente.get("nombre").getAsString(),
                        objetoCliente.get("apellidos").getAsString(),
                        objetoCliente.get("dni").getAsString(),
                        objetoCliente.get("edad").getAsInt()
                    );

                    // Añadir el cliente a la lista
                    clientes.add(cliente);
                }

                // Crear el usuario
                Usuario usuario = new Usuario(nombreUsuario, nombreCompleto, tarjeta, clientes);

                // Añadir el usuario al contenedor
                usuarios.addUsuario(usuario);
            }

            return usuarios;

        } catch (FileNotFoundException e) {
            // Lanza una excepción con un mensaje y una causa
            throw new ProveedorUsuariosException("El archivo JSON no se encontró: " + archivo, e);
        } catch (Exception e) {
            // Lanza una excepción con un mensaje y una causa
            throw new ProveedorUsuariosException("Error procesando el archivo JSON: " + e.getMessage(), e);
        }
    }
    
}