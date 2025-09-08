public class Notificacion {

    // Primer metodo enviar: recibe solo el mensaje
    public void enviar(String mensaje) {
        System.out.println("Mensaje: " + mensaje);
    }

    // Sobrecarga del metodo enviar: recibe mensaje y destinatario
    public void enviar(String mensaje, String destinatario) {
        System.out.println("Mensaje a " + destinatario + ": " + mensaje);
    }
}