package Clase04;

public class PushNotificacion implements Notificacion {
    @Override
    public void enviarMensaje(String mensaje) {
        System.out.println("Enviando notificación push: " + mensaje);
    }
}
