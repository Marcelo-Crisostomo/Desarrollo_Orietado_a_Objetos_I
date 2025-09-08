// La clase Administrador implementa la interfaz Registrable
public class Administrador implements Registrable {

    // Atributos privados: nombre del administrador y la sección que gestiona
    private String nombre;
    private String seccion;

    // Constructor que inicializa los atributos al momento de crear el objeto
    public Administrador(String nombre, String seccion) {
        this.nombre = nombre;     // Se asigna el nombre recibido al atributo interno
        this.seccion = seccion;   // Se asigna la sección recibida al atributo interno
    }

    // Implementación del metodo registrar() definido en la interfaz Registrable
    @Override
    public void registrar() {
        // Se muestra un mensaje personalizado al registrar un administrador
        System.out.println("Registrando administrador: " + nombre + " (Sección: " + seccion + ")");
    }
}
