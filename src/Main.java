import java.util.ArrayList;
import java.util.List;

// 🔹 Interfaz común (contrato)
interface MedioComunicacion {
    void enviarMensaje(String destinatario, String mensaje);
}

// 🔸 Implementación: WhatsApp
class WhatsApp implements MedioComunicacion {
    @Override
    public void enviarMensaje(String destinatario, String mensaje) {
        System.out.println("📱 Enviando WhatsApp a " + destinatario + ": \"" + mensaje + "\"");
    }
}

// 🔸 Implementación: SMS
class SMS implements MedioComunicacion {
    @Override
    public void enviarMensaje(String destinatario, String mensaje) {
        System.out.println("📩 Enviando SMS a " + destinatario + ": \"" + mensaje + "\"");
    }
}

// 🔸 Implementación: Chat IA
class ChatIA implements MedioComunicacion {
    @Override
    public void enviarMensaje(String destinatario, String mensaje) {
        System.out.println("🤖 Chat IA responde a " + destinatario + ": \"" + generarRespuesta(mensaje) + "\"");
    }

    private String generarRespuesta(String mensaje) {
        // Simulación de una respuesta automática
        return "Recibí tu mensaje \"" + mensaje + "\" y estoy analizando tu intención...";
    }
}

// 🔸 Implementación: Email
class Email implements MedioComunicacion {
    @Override
    public void enviarMensaje(String destinatario, String mensaje) {
        System.out.println("📧 Enviando Email a " + destinatario + ": \"" + mensaje + "\"");
    }
}

// 🔸 Implementación adicional: Notificación Push
class NotificacionPush implements MedioComunicacion {
    @Override
    public void enviarMensaje(String destinatario, String mensaje) {
        System.out.println("🔔 Enviando notificación push a " + destinatario + ": \"" + mensaje + "\"");
    }
}

// 🔹 Clase principal que usa polimorfismo
public class Main {
    public static void main(String[] args) {
        List<MedioComunicacion> medios = new ArrayList<>();

        // Agregamos diferentes medios de comunicación
        medios.add(new WhatsApp());
        medios.add(new SMS());
        medios.add(new ChatIA());
        medios.add(new Email());
        medios.add(new NotificacionPush());

        // Simulamos enviar un mensaje por cada medio
        for (MedioComunicacion medio : medios) {
            medio.enviarMensaje("Emmanuel", "Hola, ¿cómo estás?");
        }
    }
}
