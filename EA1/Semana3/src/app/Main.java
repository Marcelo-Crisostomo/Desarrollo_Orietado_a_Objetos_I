package app;

import model.Cliente;      // Importa la clase Cliente desde el paquete model
import model.Direccion;    // Importa la clase Direccion desde el paquete model
import model.Rut;          // Importa la clase Rut desde el paquete model

/**
 * Simula la creación de un cliente validando su RUT.
 */
public class Main {
    public static void main(String[] args) {
        try {
            // Crear dirección
            Direccion dir = new Direccion();            // Se instancia una nueva dirección
            dir.calle = "Volcán Osorno 321";            // Se asigna la calle
            dir.ciudad = "Puerto Varas";                // Se asigna la ciudad
            dir.region = "Los Lagos";                   // Se asigna la región

            // Crear RUT válido
            Rut rut = new Rut("12345678-9");            // Se crea un objeto RUT con validación

            // Crear cliente e integrar datos
            Cliente cliente = new Cliente();            // Se instancia un nuevo cliente
            cliente.nombre = "Fernanda López";          // Se asigna el nombre del cliente
            cliente.direccion = dir;                    // Se asigna la dirección al cliente
            cliente.rut = rut;                          // Se asigna el RUT al cliente

            // Mostrar datos
            System.out.println("Cliente: " + cliente.nombre);            // Imprime el nombre
            System.out.println(cliente.rut);                             // Imprime el RUT (usa toString)
            System.out.println("Ciudad: " + cliente.direccion.ciudad);   // Imprime la ciudad

        } catch (IllegalArgumentException e) {                          // Captura error de formato RUT
            System.out.println("Error al crear el cliente: " + e.getMessage()); // Muestra mensaje de error
        }
    }
}
