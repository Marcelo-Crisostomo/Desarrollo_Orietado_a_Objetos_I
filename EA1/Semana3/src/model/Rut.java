package model;

/**
 * Representa un RUT chileno. Contiene validación simple.
 */
public class Rut {

    // Número del RUT en formato String
    private String numero;

    /**
     * Constructor que recibe el RUT y valida su formato.
     * @param numeroRUT el RUT ingresado por el usuario
     */
    public Rut(String numeroRUT) {
        // Validación simple: solo acepta dígitos y la letra final (puede ser k o K)
        if (!numeroRUT.matches("[0-9]+-[0-9kK]")) {
            throw new IllegalArgumentException("Formato de RUT no válido.");
        }
        this.numero = numeroRUT;
    }

    /**
     * Retorna el número de RUT
     */
    public String getNumero() {
        return numero;
    }

    @Override
    public String toString() {
        return "RUT: " + numero;
    }
}
