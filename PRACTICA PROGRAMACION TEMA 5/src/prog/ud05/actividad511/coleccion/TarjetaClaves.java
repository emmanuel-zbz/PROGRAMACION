package prog.ud05.actividad511.coleccion;

public class TarjetaClaves {
  
  private static final int VALOR_MINIMO = 000;
  
  private static final int VALOR_MAXIMO = 999;
  
  private static final int VALOR_MINIMO_FILAS = 1;
  
  private static final int VALOR_MINIMO_COLUMNAS = 1;
  
  private int filas;
  
  private int columnas;
  
  private int[][] tarjetaClaves;
  
  public TarjetaClaves(int filas, int columnas) {
    if (filas >= VALOR_MINIMO_FILAS && columnas >= VALOR_MINIMO_COLUMNAS) {
      this.filas = filas;
      this.columnas = columnas;
      tarjetaClaves = new int[filas][columnas];
      
      for (int i = 0; i < filas; i++) {
        for (int j = 0; j < columnas; j++) {
          tarjetaClaves[i][j] = VALOR_MINIMO;
        }
      }
    } else {
      throw new IllegalArgumentException();
    }
  }

  public int getFilas() {
    return filas;
  }

  public int getColumnas() {
    return columnas;
  }
  
  public void setClave(int fila, int columna, int clave) {
    if (datosCorrectos(fila, columna, clave)) {
      tarjetaClaves[fila - 1][columna - 1] = clave;
    } else {
      throw new IllegalArgumentException();
    }
  }
  
  public boolean validarClave(int fila, int columna, int clave) {
    if (datosCorrectos(fila, columna, clave)) {
      return tarjetaClaves[fila - 1][columna - 1] == clave;
    } else {
      throw new IllegalArgumentException();
    }
  }

  private boolean datosCorrectos(int fila, int columna, int clave) {
    if (!(fila >= VALOR_MINIMO_FILAS && fila <= filas)) {
      return false;
    }
    
    if (!(columna >= VALOR_MINIMO_COLUMNAS && columna <= columnas)) {
      return false;
    }
    
    if (!(clave >= VALOR_MINIMO && clave <= VALOR_MAXIMO)) {
      return false;
    }
    return true;
  }

}
