public class Usuario {
    protected String nombre; // Atributo común a todos los usuarios

    // Constructor que inicializa el nombre
    public Usuario(String nombre) {
        this.nombre = nombre;
    }

    // Metodo que muestra información general del usuario
    public void mostrarInformacion() {
        System.out.println("Usuario: " + nombre);
    }
}

