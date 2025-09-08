package model;

/**
 * Representa la dirección de un cliente.
 */
public class Direccion {
    public String calle;
    public String ciudad;
    public String region;

    @Override
    public String toString() {
        return calle + ", " + ciudad + ", " + region;
    }
}