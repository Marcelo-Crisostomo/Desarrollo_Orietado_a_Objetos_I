import java.util.ArrayList;

public class MainSemana7 {
    public static void main(String[] args) {
        // Creamos una colección de tipo Usuario
        ArrayList<Usuario> listaUsuarios = new ArrayList<>();

        // Agregamos distintos tipos de objetos
        listaUsuarios.add(new Usuario("Carlos"));
        listaUsuarios.add(new Administrador("Lucía", "Recursos Humanos"));
        listaUsuarios.add(new Usuario("Martín"));
        listaUsuarios.add(new Administrador("Fernanda", "TI"));

        // Recorremos la lista aplicando lógica diferenciada con instanceof
        for (Usuario u : listaUsuarios) {
            if (u instanceof Administrador) {
                // Downcasting seguro para acceder a métodos o atributos de Administrador
                Administrador admin = (Administrador) u;
                System.out.println("→ Es un administrador.");
                admin.mostrarInformacion(); // Se ejecuta la versión sobrescrita
            } else {
                System.out.println("→ Es un usuario común.");
                u.mostrarInformacion(); // Se ejecuta la versión de Usuario
            }
        }
    }
}
