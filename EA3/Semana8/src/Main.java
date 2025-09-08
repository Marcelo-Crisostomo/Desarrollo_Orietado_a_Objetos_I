import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Creamos una lista que puede contener cualquier objeto Registrable
        List<Registrable> lista = new ArrayList<>();

        // Agregamos distintos tipos de objetos
        lista.add(new Jugador("Lucas", 5));
        lista.add(new Administrador("Carla", "Ventas"));
        lista.add(new Jugador("Marta", 10));
        lista.add(new Administrador("Pablo", "Soporte"));

        // Recorremos la lista y registramos a todos
        for (Registrable r : lista) {
            r.registrar(); // Polimorfismo: cada objeto ejecuta su propia versión

            // Validamos el tipo real de objeto en tiempo de ejecución
            if (r instanceof Jugador) {
                System.out.println("→ Este es un jugador.");
            } else if (r instanceof Administrador) {
                System.out.println("→ Este es un administrador.");
            }

            System.out.println(); // Línea en blanco para separar registros
        }
    }
}
