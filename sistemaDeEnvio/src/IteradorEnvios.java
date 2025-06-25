import java.util.Iterator;
import java.util.List;

// Clase IteradorEnvios: implementa un iterador personalizado para recorrer una lista de envíos
public class IteradorEnvios implements Iterator<Envio> {

    // Lista de envíos a recorrer
    private List<Envio> envios;

    // Posición actual del iterador
    private int posicion = 0;

    // Constructor: recibe la lista de envíos que vamos a iterar
    public IteradorEnvios(List<Envio> envios) {
        this.envios = envios;
    }

    // Método hasNext: devuelve true si todavía quedan elementos por recorrer
    public boolean hasNext() {
        return posicion < envios.size();
    }

    // Método next: devuelve el siguiente envío y avanza la posición
    public Envio next() {
        return envios.get(posicion++);
    }
}
