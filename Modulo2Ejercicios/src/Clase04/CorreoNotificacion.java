package Clase04;

public class CorreoNotificacion implements Notificacion {
    @Override
    public void enviarMensaje(String mensaje) {
        System.out.println("Enviando correo: " + mensaje);
    }
}
