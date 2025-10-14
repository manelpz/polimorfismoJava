import java.util.ArrayList;
import java.util.List;

// interfaz común (contrato)
interface canalComunicacion {
    void enviarMensaje(String destinatario, String mensaje);
}

// implementación: WhatsApp
class WhatsApp implements canalComunicacion {
    @Override
    public void enviarMensaje(String destinatario, String mensaje) {
        System.out.println("enviando whatsApp a " + destinatario + ": \"" + mensaje + "\"");
    }
}

// TODO: implementación: SMS


// TODO: implementación: Chat IA


// TODO: implementación: Email


// TODO: implementación adicional: Notificación Push


// clase principal que usa polimorfismo
public class Main {
    public static void main(String[] args) {
        List<canalComunicacion> medios = new ArrayList<>();

        // agregamos diferentes medios de comunicación
        medios.add(new WhatsApp());
        //medios.add(new SMS());
        //medios.add(new ChatIA());
        //medios.add(new Email());
        //medios.add(new NotificacionPush());

        // simulamos enviar un mensaje por cada medio

        canalComunicacion WhatsAppObjeto = medios.get(0);
        WhatsAppObjeto.enviarMensaje("44 31 71 08 10", "Gracias por tu compra emma!");

        //TODO: simula el envio por email, pusj notificacion, y sms
    }
}

