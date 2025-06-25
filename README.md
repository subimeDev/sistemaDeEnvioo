# 📦 Sistema de Gestión de Envíos

Este proyecto en Java permite gestionar el registro y seguimiento de envíos de paquetes a través de una consola interactiva. Es ideal para demostrar el uso práctico de varios patrones de diseño clásicos (GoF) en un sistema funcional.

---

## 🧩 Funcionalidades principales

- 📄 Ver todos los envíos registrados.
- ➕ Agregar nuevos envíos manualmente.
- 🧬 Clonar el último envío registrado (funcionalidad basada en Prototype).
- 🔄 Importar una lista simulada de envíos desde una fuente externa (Adapter).
- 📜 Navegación mediante un menú interactivo en consola.

---

## 🧠 Patrones de Diseño Utilizados

### 1. **Singleton** – `GestorEnvios`
- **Propósito:** Garantiza que solo exista una instancia del gestor de envíos en todo el sistema.
- **Justificación:** Permite acceso global controlado a la lista de envíos sin duplicación de estado.
- **Dónde se usa:** `GestorEnvios.obtenerInstancia()`

---

### 2. **Prototype** – `Envio.clonar()`
- **Propósito:** Permite crear una copia exacta de un objeto ya existente.
- **Justificación:** Útil para duplicar rápidamente un envío con los mismos datos.
- **Dónde se usa:** Al clonar el último envío ingresado.

---

### 3. **Iterator** – `IteradorEnvios`
- **Propósito:** Permite recorrer la colección de envíos sin exponer su estructura interna.
- **Justificación:** Aísla la lógica de recorrido y facilita futuros cambios en la colección.
- **Dónde se usa:** Al mostrar todos los envíos registrados por consola.

---

### 4. **Adapter (simulado)** – `ImportadorDeEnvios`
- **Propósito:** Simula la adaptación de una fuente de datos externa a objetos del sistema.
- **Justificación:** Aunque no conecta con un archivo real, ilustra cómo se integraría un importador real.
- **Dónde se usa:** Al importar envíos simulados mediante `cargarEnvios()`.

---

## ⚙️ Instrucciones de Compilación y Ejecución

1. Clona o descarga este repositorio.
2. Abre el proyecto en tu IDE Java Idealmente Netbeans 
3. Asegúrate de que esté configurado como proyecto Java estándar.
4. Ejecuta la clase principal `AppEnvios.java`.
5. Usa el menú en consola para interactuar con el sistema.

---



