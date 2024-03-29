# Prueba técnica-inventario
Esta es una aplicación web para la gestión de inventario para una tienda, que permita a los
usuarios gestionar productos, categorías y proveedores.

### Requisitos previos para el backend
- JDK (Java Development Kit) 8 o superior
- Maven
- Spring Boot
- MySQL

### Pasos para desplegar y ejecutar la aplicación

1. **Clonar el repositorio:**
   ```bash
   git clone https://github.com/MarcMartz/prueba-inventario.git

2. **Configurar la base de datos:**

- Crear una base de datos en MySQL con el nombre especificado en la configuración de la aplicación.
- Configurar el nombre de usuario y la contraseña de la base de datos en el archivo `application.properties`.

3. **Ejecutar la aplicación:**
- Puedes ejecutar la aplicación utilizando el plugin Maven con el siguiente comando:
     ```bash
     mvn spring-boot:run
     ```

4. **Acceder a la aplicación:**
- La aplicación estará disponible en http://localhost:8080

### Documentación del proyecto
La estructura del proyecto es la siguiente:

- **src/main/java:** Contiene los archivos fuente de la aplicación Java, como models, controllers, services, repositories.
- **src/main/resources:** Contiene archivos de recursos, como configuraciones de base de datos y archivos de propiedades.

### Futuras características

- Integración del frontend utilizando Angular para crear una interfaz de usuario más intuitiva y eficiente.