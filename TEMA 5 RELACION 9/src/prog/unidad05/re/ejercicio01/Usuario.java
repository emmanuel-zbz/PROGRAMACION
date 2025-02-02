package prog.unidad05.re.ejercicio01;

import java.util.regex.*;

public class Usuario {

    private String nombre;
    private String telefono;
    private String codigoPostal;
    private String usuario;
    private String password;

    public Usuario(String nombre, String telefono, String codigoPostal, String usuario, String password) {
        if (!verificaTodo(nombre, telefono, codigoPostal, usuario, password)) {
            throw new IllegalArgumentException("Datos no válidos");
        }
        this.nombre = nombre;
        this.telefono = telefono;
        this.codigoPostal = codigoPostal;
        this.usuario = usuario;
        this.password = password;
    }

    private boolean verificaTodo(String nombre, String telefono, String codigoPostal, String usuario, String password) {
        return verificaNombre(nombre) && verificaTelefono(telefono) && verificaCodigoPostal(codigoPostal)
                && verificaUsuario(usuario) && verificaPassword(password);
    }

    private boolean verificaNombre(String nombre) {
        if (nombre == null || nombre.trim().isEmpty()) {
            return false;
        }
        if (nombre.length() > 100) {
            return false;
        }
        String expresion = "^[A-ZÁÉÍÓÚÜÑ][a-záéíóúüñ]+(?:[ -][A-ZÁÉÍÓÚÜÑ][a-záéíóúüñ]+)*$";
        Pattern pattern = Pattern.compile(expresion);
        Matcher matcher = pattern.matcher(nombre);
        return matcher.matches();
    }

    private boolean verificaTelefono(String telefono) {
        if (telefono == null) {
            return false;
        }
        String expresion = "^[6-9]\\d{8}$";
        Pattern pattern = Pattern.compile(expresion);
        Matcher matcher = pattern.matcher(telefono);
        return matcher.matches();
    }

    private boolean verificaCodigoPostal(String codigoPostal) {
        if (codigoPostal == null) {
            return false;
        }
        String expresion = "^(0[1-9]|[1-4][0-9]|5[0-2])\\d{3}$";
        Pattern pattern = Pattern.compile(expresion);
        Matcher matcher = pattern.matcher(codigoPostal);
        return matcher.matches();
    }

    private boolean verificaUsuario(String usuario) {
        if (usuario == null) {
            return false;
        }
        String expresion = "^[a-zA-Z][a-zA-Z0-9_]{0,9}$";
        Pattern pattern = Pattern.compile(expresion);
        Matcher matcher = pattern.matcher(usuario);
        return matcher.matches();
    }

    private boolean verificaPassword(String password) {
        if (password == null) {
            return false;
        }
        if (password.length() < 8 || password.length() > 16) {
            return false;
        }
        String expresion = "^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)(?=.*[.;,:/*&%$()])[A-Za-z\\d.;,:/*&%$()]{8,16}$";
        Pattern pattern = Pattern.compile(expresion);
        Matcher matcher = pattern.matcher(password);
        return matcher.matches();
    }

    // Getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}