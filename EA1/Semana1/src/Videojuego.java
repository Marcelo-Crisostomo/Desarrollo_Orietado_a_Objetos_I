public class Videojuego {

    private String titulo;                        // Atributo privado

    public Videojuego(String titulo) {            // Constructor con parámetro
        this.titulo = titulo;                       // Asignar valor recibido al atributo
    }
    @Override
    public String toString() {                    // Metodo toString
        return "Videojuego: " + titulo;             // Retorna texto descriptivo
    }
}