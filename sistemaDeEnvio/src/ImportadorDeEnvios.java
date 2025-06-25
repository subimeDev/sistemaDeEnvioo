import java.util.ArrayList;
import java.util.List;

// Clase ImportadorDeEnvios: simula la importación de datos desde una fuente externa (por ejemplo, un archivo CSV)
public class ImportadorDeEnvios {

    // Método que carga una lista de envíos predefinidos (simulando que provienen de una fuente externa)
    public List<Envio> cargarEnvios() {
        // Creamos una lista vacía de envíos
        List<Envio> envios = new ArrayList<>();

        // Agregamos envíos con datos fijos (en un sistema real, esto vendría de un archivo o API externa)
        envios.add(new Envio("Santiago", "Valparaíso", 5.0, "En tránsito"));
        envios.add(new Envio("Temuco", "Concepción", 2.3, "Entregado"));

        // Retornamos la lista simulada
        return envios;
    }
}
