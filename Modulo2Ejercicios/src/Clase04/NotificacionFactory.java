package Clase04;

public class NotificacionFactory {
    public static Notificacion crearNotificacion(String tipo) {
        switch (tipo.toLowerCase()) {
            case "correo":
                return new CorreoNotificacion();
            case "sms":
                return new SMSNotificacion();
            case "push":
                return new PushNotificacion();
            default:
                throw new IllegalArgumentException("Tipo de notificación no soportado: " + tipo);
        }
    }
}
