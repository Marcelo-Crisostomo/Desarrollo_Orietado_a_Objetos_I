package app;
import model.Cliente;
import model.Direccion;
/**
 * Clase principal que ejecuta el sistema de prueba para PuertoGames.
 */
public class Main {
    public static void main(String[] args) {

        // Crear una dirección con datos ficticios
        Direccion dir = new Direccion();
        dir.calle = "Av. Los Leones 234";
        dir.ciudad = "Puerto Montt";
        dir.region = "Los Lagos";

        // Crear un cliente e incorporar la dirección
        Cliente cliente = new Cliente();
        cliente.nombre = "Ignacio Reyes";
        cliente.direccion = dir;

        // Mostrar los datos del cliente en consola
        System.out.println("Nombre del cliente: " + cliente.nombre);
        System.out.println("Ciudad: " + cliente.direccion.ciudad);
        System.out.println("Región: " + cliente.direccion.region);
    }
}