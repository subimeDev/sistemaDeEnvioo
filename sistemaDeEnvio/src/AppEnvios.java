import java.util.List;
import java.util.Scanner;

// Clase principal del programa. Aquí se encuentra el menú interactivo en consola.
public class AppEnvios {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Se obtiene la única instancia del gestor de envíos (Singleton)
        GestorEnvios gestor = GestorEnvios.obtenerInstancia();

        // Se instancia el importador de envíos (Adapter simulado)
        ImportadorDeEnvios importador = new ImportadorDeEnvios();

        // Variable para guardar el último envío ingresado (útil para clonar)
        Envio ultimoEnvio = null;

        int opcion; // Almacena la opción seleccionada por el usuario

        // Menú interactivo que se repite hasta que el usuario elija salir
        do {
            System.out.println("\nMENU DE ENVIOS");
            System.out.println("1. Ver todos los envios");
            System.out.println("2. Agregar nuevo envio");
            System.out.println("3. Clonar último envo");
            System.out.println("4. Importar envíos simulados");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");

            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpia el salto de línea pendiente

            switch (opcion) {

                // Opción 1: Muestra todos los envíos registrados usando un Iterador personalizado
                case 1:
                    System.out.println("Lista de envíos:");
                    List<Envio> lista = gestor.obtenerEnvios();

                    if (lista.isEmpty()) {
                        System.out.println("No hay envíos registrados.");
                    } else {
                        IteradorEnvios iterador = new IteradorEnvios(lista);
                        while (iterador.hasNext()) {
                            System.out.println(iterador.next());
                        }
                    }
                    break;

                // Opción 2: Agrega un nuevo envío manualmente
                case 2:
                    System.out.print("Origen: ");
                    String origen = scanner.nextLine();

                    System.out.print("Destino: ");
                    String destino = scanner.nextLine();

                    System.out.print("Peso (kg): ");
                    double peso = scanner.nextDouble();
                    scanner.nextLine(); // Limpia el buffer

                    System.out.print("Estado: ");
                    String estado = scanner.nextLine();

                    // Se crea y registra el nuevo envío
                    Envio nuevo = new Envio(origen, destino, peso, estado);
                    gestor.agregarEnvio(nuevo);
                    ultimoEnvio = nuevo; // Se guarda como el último
                    System.out.println("Envío agregado correctamente.");
                    break;

                // Opción 3: Clona el último envío registrado (Prototype)
                case 3:
                    if (ultimoEnvio != null) {
                        Envio clon = ultimoEnvio.clonar();
                        gestor.agregarEnvio(clon);
                        System.out.println("Envío clonado y agregado.");
                    } else {
                        System.out.println("No hay envío para clonar.");
                    }
                    break;

                // Opción 4: Importa una lista de envíos simulados (Adapter)
                case 4:
                    for (Envio envio : importador.cargarEnvios()) {
                        gestor.agregarEnvio(envio);
                    }
                    System.out.println("Envíos importados correctamente.");
                    break;

                // Opción 5: Finaliza el programa
                case 5:
                    System.out.println("Saliendo del sistema. ¡Gracias!");
                    break;

                // En caso de ingresar una opción no válida
                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
            }

        } while (opcion != 5); // El bucle se repite hasta que el usuario elige salir

        scanner.close(); // Se cierra el lector de entrada
    }
}
