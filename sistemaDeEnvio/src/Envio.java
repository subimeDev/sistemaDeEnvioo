// Clase que representa un envío o paquete en el sistema
public class Envio implements Cloneable {

    // Atributos del envío: origen, destino, peso y estado
    private String origen;
    private String destino;
    private double peso;
    private String estado;

    // Constructor: permite crear un nuevo objeto Envio con todos sus datos
    public Envio(String origen, String destino, double peso, String estado) {
        this.origen = origen;
        this.destino = destino;
        this.peso = peso;
        this.estado = estado;
    }

    // Método clonar: aplica el patrón Prototype
    // Permite duplicar un envío existente, útil para cuando varios envíos son iguales o muy similares
    public Envio clonar() {
        try {
            // Usa el método clone() heredado de Object
            return (Envio) super.clone();
        } catch (CloneNotSupportedException e) {
            // En caso de error (poco probable aquí), devuelve null
            return null;
        }
    }

    // Método toString: se ejecuta cuando imprimimos un objeto Envio
    // Sirve para mostrar una descripción clara del envío en consola
    public String toString() {
        return "Envío desde " + origen + " a " + destino + " (" + peso + "kg) - Estado: " + estado;
    }
}
