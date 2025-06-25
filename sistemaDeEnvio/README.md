
## Sistem de gestión de envios 

Este proyecto en java permite gestionar de envios de paquetes mediante una consola interactiva.

##Funcionalidades 

-Ver todos los envios registrados 
-Agregar nuevos envíos manualmente 
-Clonar el último envió registro ya existente 
-Importa envíos simulados desde una fuente externa (es solo funcionalidad ) 
-Se puede navegar mediante un menu por consola de java 



## Patrones de diseño utilizados 

**Singleton GestorEnvios asegurando una única instancia 
**Prototype** Envio Permite clonar envíos 
**Iterator** IteradorEnvios Recorre la lista de envíos sin exponer su estructura
**Adapter (simulado)** ImpordorDeEnvios simula una fuente externa de datos 

 
