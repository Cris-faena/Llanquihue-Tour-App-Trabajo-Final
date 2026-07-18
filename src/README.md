<img width="488" height="157" alt="image" src="https://github.com/user-attachments/assets/b4ce1d36-069e-48f3-b692-4f050f0653e4" />

# 🌄Proyecto Llanquihue Tour App Trabajo Final.

### 👤 Información del estudiante
```txt
Nombre del Alumno:   Cristián Fáundez
Carrera:             Analista Programador Computacional
Fecha de entrega:    19 de Julio del 2026
```
### 🎯Objetivo del proyecto
- Gestionar de manera eficiente la información de los clientes, proveedores, empleados y servicios turísticos ofrecidos por la agencia "Llanquihue Tours", implementando un sistema de jerarquía de Clases con herencia simple e interfaces, con la intención de continuar escalando el proyecto conforme a los nuevos requerimientos del cliente.

 ---

### 🧱Estructura del proyecto.
- A continuación se muestra una imagen general de la estructura del proyecto:
```txt
📁 LlanquihueTourTrabajoFinal/
├── src/
│   ├── data/
│   │   └── GestorDatos.java              # Gestión y carga de datos desde archivos
│   │
│   ├── model/
│   │   ├── Personas/                     # Clases relacionadas con personas y entidades humanas
│   │   │   ├── Cliente.java
│   │   │   ├── Direccion.java
│   │   │   ├── Email.java
│   │   │   ├── EmpleadoAdministrativo.java
│   │   │   ├── EmpleadoOperativo.java
│   │   │   ├── FechaDeCreacion.java
│   │   │   ├── Menus.java
│   │   │   ├── Persona.java
│   │   │   ├── ProveedorExterno.java
│   │   │   └── Rut.java
│   │   │
│   │   └── Servicios/                    # Clases relacionadas con servicios turísticos
│   │       ├── ExcursionAlAireLibre.java
│   │       ├── PaseoLacustre.java
│   │       ├── RutaGastronomica.java
│   │       └── ServicioTuristico.java
│   │
│   ├── resources/                        # Archivos de datos externos (TXT)
│   │   ├── clientes.txt
│   │   ├── empleadoA.txt
│   │   ├── empleadoOP.txt
│   │   ├── excursiones.txt
│   │   ├── gastronomicas.txt
│   │   ├── lacustres.txt
│   │   └── proveedores.txt
│   │
│   ├── ui/
│   │   └── Main.java                     # Punto de entrada de la aplicación
│   │
│   └── util/
│       └── ValidadorEmail.java           # Utilidad para validación de correos electrónicos
│
├── README.md                             # Documentación principal del proyecto
└── .gitignore                            # Archivos ignorados por Git
```

### ⚙️ Funcionamiento general

### 🧩 Interfaz de Consola.
Es la aplicación de consola de Llanquihue Tour. Permite que los usuarios seleccionen opciones múltiples relacionadas con personas y servicios turísticos ofrecidos por esta agencia. 

### 📌 Paquete `data`
Incluye la clase **GestorDatos**, responsable de crear automáticamente instancias de cualquiera de los servicios turísticos disponibles. También, posee métodos útiles para recorrer las listas creadas.

### 📌 Paquete `model`
Contiene las clases base del sistema. Se divide en dos Subcarpetas: Personas y Servicios.

**📂Personas**: Contiene información de diferentes tipos de personas que tienen relación con Llanquihue Tours.
- **Cliente**: representa a una persona que contrató un servicio turístico.
- **Dirección**: representa una dirección física de casa o trabajo. Es una Clase que se construye con los parámetros calle, ciudad y región.
- **Email**: representa una dirección de correo electrónico.
- **EmpleadoAdministrativo**: representa a un empleado administrativo que trabaja dentro de la agencia.
- **EmpleadoOperativo**: representa a un empleado operativo que trabaja afuera de las instalaciones de la agencia.
- **FechaCreación**: contiene una "INTERFACE" que implementa un método que estampa la fecha de creación de un objeto.
- **Menus**: representa un menú de opciones para que el usuario interactúe.
- **Persona**: superclase abstracta que sirve de plantilla para crear otras entidades.
- **ProveedorExterno**: representa un proveedor de servicios externo para la agencia.
- **Rut**: representa un "Rut" chileno, como identificador único de entidades.

**📂Servicios**: Contiene información de los diferentes tipos de servicios ofrecidos por Llanquihue Tours.
- **ExcursiónAlAireLibre**: representa una excursión hacia lugares turísticos de la región.
- **PaseoLacustre**: representa un paseo en todo tipo de embarcaciones a través de lagos y ríos de la región.
- **RutaGastronómica**: representa una ruta gastronómica hacia reconocidas instalaciones culinarias, de distintos niveles de calidad.
- **ServicioTurístico**: superclase abstracta que sirve como plantilla para crear los otros servicios.

### 📌 Paquete `resources`
Contiene los siguientes archivos.txt que permiten crear objetos conforme al siguiente detalle:
- **clientes.txt**: archivo que permite construir clientes.
- **empleadoA.txt**: archivo que permite construir empleados administrativos.
- **empleadoO.txt**: archivo que permite construir empleados operativos.
- **excursiones.txt**: archivo que permite construir excursiones al aire libre.
- **gastronomicas.txt**: archivo que permite construir rutas gastronómicas.
- **lacustres.txt**: archivo que permite construir paseos lacustres.
- **proveedores**: archivo que permite construir proveedores externos.

### 📌 Paquete `ui`
Contiene la clase **Main**, encargada de ejecutar la aplicación, integrar los componentes y mostrar la información por consola.

### 📌 Paquete `util`
Incluye la clase **ValidadorEmail**, responsable de validar las direcciones de correo electrónico ingresadas.

---
### 🛠️ Ejemplo de uso de la aplicación.
```java
// Ejemplo:
public class Main 
{
    public static void main(String[] args) 
    {
        // 1. Lee los archivos.txt y conviértelos en Listas <Strings>, llamando al método "GestorDatos.gestorDatos":
       List<String> listaEmpleadoAdministrativo = GestorDatos.gestorDatos("resources/empleadoA.txt");
    }
}
```
### 🛠️ Ejemplo para crear listas de objetos a partir de las listas <Strings>:
```java
// Ejemplo:
public class Main 
{
    public static void main(String[] args) 
    {
       // 2. Convierte la Lista <String> en una lista de objetos específica, llamando al método especifico.
       List<EmpleadoAdministrativo> administrativos = GestorDatos.listaAdministrativa(listaEmpleadoAdministrativo);
       
    }
}
```

### 🛠️ Ejemplo para desplegar el "menú de consola":
```java
// Ejemplo:
public class Main 
{
    public static void main(String[] args) 
    {
       // 3. Crea una instancia de la CLase "Menú" y llama al método que despliega la aplicación de consola interactiva:
       Menus m = new Menus();
       Scanner sc = new Scanner(System.in);
       boolean salir = false;
       do
       {
          System.out.println(m.mostrarMenuPrincipal());
          int opcion = sc.nextInt();
    }
}
```

### 🛠️ Ejemplo del Menú interactivo de la consola:
```java
// Ejemplo:
public class Main 
{
    public static void main(String[] args) 
    {
       // 4. Ejemplo de menú interactivo:
       menu.append("======== Bienvenidos a Llanquihue Tour APP ========\n");
       menu.append("Por favor digite un número de las opciones para obtener información:\n");
       menu.append("1 - Ver 'Clientes' registrados.\n");
       menu.append("2 - Ver 'Proveedores' registrados.\n");
       menu.append("3 - Ver 'Empleados Administrativos' registrados.\n");
       menu.append("4 - Ver 'Empleados Operativos registrados.\n");
       menu.append("5 - Ver 'Servicios Turísticos' disponibles.\n");
       menu.append("6 - Filtrar 'Servicios Turísticos' por precio (mayor a menor).\n");
       menu.append("7 - Mostrar todos los objetos almacenados.\n");
       menu.append("8 - Cerrar la Aplicación\n");
       menu.append("=================================================\n");
       menu.append("Seleccione una opción ahora: ");
    }
}
```

### 💾Instrucciones para ejecutar el proyecto
1. Clona el repositorio desde GitHub:
   https://github.com/Cris-faena/LlanquihueTourAppHerenciaPoli.git
3. Abre el proyecto en "IntelliJ IDEA".
4. Ejecuta el archivo Main.Java. desde el paquete "ui".
5. Sigue las instrucciones en consola.