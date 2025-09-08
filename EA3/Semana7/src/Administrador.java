public class Administrador extends Usuario {
    private String seccion; // Atributo específico de los administradores

    // Constructor que inicializa nombre (heredado) y sección (nuevo)
    public Administrador(String nombre, String seccion) {
        super(nombre);         // Llama al constructor de la clase Usuario
        this.seccion = seccion; // Inicializa el atributo específico
    }

    // Sobrescribe el metodo mostrarInformacion() para mostrar más detalles
    @Override
    public void mostrarInformacion() {
        System.out.println("Administrador: " + nombre + " (Sección: " + seccion + ")");
    }
}

