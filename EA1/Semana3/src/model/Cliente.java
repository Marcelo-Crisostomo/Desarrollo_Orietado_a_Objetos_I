package model;

/**
 * Representa un cliente con nombre, dirección y RUT.
 */
public class Cliente {
    public String nombre;
    public Direccion direccion;
    public Rut rut; // Relación de asignación: un cliente tiene un RUT
}
