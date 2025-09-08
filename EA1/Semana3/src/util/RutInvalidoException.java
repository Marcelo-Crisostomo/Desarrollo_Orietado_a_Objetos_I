package util;

/**
 * Excepción personalizada para RUT inválidos.
 */
public class RutInvalidoException extends Exception {

    public RutInvalidoException(String mensaje) {
        super(mensaje);
    }
}