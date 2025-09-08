// La clase Jugador implementa la interfaz Registrable
public class Jugador implements Registrable {

    // Atributos privados de la clase
    private String nombre;
    private int nivel;

    // Constructor que inicializa nombre y nivel
    public Jugador(String nombre, int nivel) {
        this.nombre = nombre; // Asigna el valor del nombre al atributo
        this.nivel = nivel;   // Asigna el valor del nivel al atributo
    }

    // Implementación obligatoria del metodo registrar() de la interfaz Registrable
    @Override
    public void registrar() {
        // Muestra un mensaje personalizado para el jugador
        System.out.println("Registrando jugador: " + nombre + " (Nivel " + nivel + ")");
    }
}
