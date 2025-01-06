/* 
Gestión de Notificaciones (Factory)
Objetivo
Crear un sistema de notificaciones que envíe mensajes a través de diferentes
 canales (correo, SMS, push).
Definición
1.  Crea implementaciones concretas:
•	CorreoNotificacion: Imprime "Enviando correo: [mensaje]".
•	SMSNotificacion: Imprime "Enviando SMS: [mensaje]".
•	PushNotificacion: Imprime "Enviando notificación push: [mensaje]".
Recuerden que el mensaje es una variable que llega como parámetro
2. Implementa una clase Factory NotificacionFactory que devuelva el
 canal adecuado según un parámetro.
*/

package Clase04;

public class app {
    public static void main(String[] args) {
        // Crear una notificación de tipo correo
        Notificacion notificacionCorreo = NotificacionFactory.crearNotificacion("correo");
        notificacionCorreo.enviarMensaje("Hola, este es un mensaje por correo.");

        // Crear una notificación de tipo SMS
        Notificacion notificacionSMS = NotificacionFactory.crearNotificacion("sms");
        notificacionSMS.enviarMensaje("Hola, este es un mensaje por SMS.");

        // Crear una notificación de tipo push
        Notificacion notificacionPush = NotificacionFactory.crearNotificacion("push");
        notificacionPush.enviarMensaje("Hola, este es un mensaje push.");
    }
}

