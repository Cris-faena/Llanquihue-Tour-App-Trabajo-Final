package data;

import model.Servicios.*;
import model.Personas.*;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Clase que se utiliza para gestionar los distintos datos del sistema.
 */
public class GestorDatos
{
    /**
     * Método para leer archivos ".txt"
     * se debe ingresar un String con el nombre del archivo para leer.
     * @param archivoParaLeer archivo.txt que se requiere leer.
     * @return una lista de valores [valor1, valor2, valor3, valor4, valor5, valor6]
     */
    public static List<String> gestorDatos(String archivoParaLeer) {
        // Se crea una lista vacía llamada "Líneas"
        List<String> lineas = new ArrayList<>();

        // Se implementa un "Buffered reader" para leer el archivo TXT
        try (BufferedReader lector = new BufferedReader(new FileReader(archivoParaLeer))) {
            // Se crea una variable String vacía
            String linea;
            // se implementa un bucle WHILE que lee cada línea del archivo .txt y agrega contenido a la lista "Líneas" mientras no se encuentre vacío el archivo:
            while ((linea = lector.readLine()) != null) {
                if (!linea.trim().isEmpty()) {
                    lineas.add(linea);
                }
            }
            System.out.println("Archivo cargado exitosamente");
            return lineas; // devuelve una lista "Líneas" con los datos almacenados.
        }
        // En caso de que no se pueda leer el archivo lanza una excepción:
        catch (IOException e) {
            System.err.println("Error al leer el archivo." + e.getMessage());
            return null;
        }
    }

    /**
     * Método que lee una lista de "Strings" y convierte su contenido a una Lista de objetos "Excursiones"
     * @param listaDeStrings lista de Strings (List "String").
     * @return una lista de objetos "Excursiones"
     */
    public static List<ExcursionAlAireLibre> listaAExcursiones(List<String> listaDeStrings)
    {
        // Se declara una lista vacia de objetos "Excursion al Aire Libre":
        List<ExcursionAlAireLibre> excursiones = new ArrayList<>();

        // Se implementa un bucle FOREACH, para que cada línea de la "lista de strings" pasadas como argumento:
        for (String linea : listaDeStrings)
        {
            if (linea == null || linea.isBlank())
            {
                continue;
            }
            // Se almacena en un Array de tipo "String", llamado partes.
            String[] partes = linea.split(";");
            if (partes.length != 5)     // Validador de datos. Si la cantidad de elementos del array "Partes" es distinto de 4 elementos, lanza error.
            {
                System.err.println("Línea inválida." + linea);
                continue;
            }
            try
            {
                String nombre = partes[0];
                String descripcion = partes[1];
                double precio = Double.parseDouble(partes[2]);
                String dificultad = partes[3];
                int duracion = Integer.parseInt(partes[4]);
                // añade a la Lista "Excursiones", los elementos del Array "Partes".
                excursiones.add(new ExcursionAlAireLibre(nombre, descripcion, precio, dificultad, duracion));
            }
            catch (NumberFormatException e)
            {
                System.err.println("Error al convertir números en la línea." + linea);
            }
        }
        System.out.println("Agregado a la lista 'excursiones' exitosamente");
        return excursiones;
    }

    /**
     * Método que lee una lista de "Strings" y convierte su contenido a una Lista de objetos "gastronómicas"
     * @param listaDeStrings lista de Strings (List "String").
     * @return una lista de objetos "gastronómicas"
     */
    public static List<RutaGastronomica> listaAGastronomica(List<String> listaDeStrings)
    {
        // Se declara una lista vacia de objetos "gastronomicas":
        List<RutaGastronomica> gastronomicas = new ArrayList<>();

        // Se implementa un bucle FOREACH, para que cada línea de la "lista de strings" pasadas como argumento:
        for (String linea : listaDeStrings)
        {
            if (linea == null || linea.isBlank())
            {
                continue;
            }
            // Se almacena en un Array de tipo "String", llamado partes.
            String[] partes = linea.split(";");
            if (partes.length != 5)     // Validador de datos. Si la cantidad de elementos del array "Partes" es distinto de 4 elementos, lanza error.
            {
                System.err.println("Línea inválida." + linea);
                continue;
            }
            try
            {
                String nombre = partes[0];
                String descripcion = partes[1];
                double precio = Double.parseDouble(partes[2]);
                String nivel = partes[3];
                int paradas = Integer.parseInt(partes[4]);
                // añade a la Lista "gastronomicas", los elementos del Array "Partes".
                gastronomicas.add(new RutaGastronomica(nombre, descripcion, precio, nivel, paradas));
            }
            catch (NumberFormatException e)
            {
                System.err.println("Error al convertir números en la línea." + linea);
            }
        }
        System.out.println("Agregado a la lista 'gastronómica' exitosamente");
        return gastronomicas;
    }

    /**
     * Método que lee una lista de "Strings" y convierte su contenido a una Lista de objetos "lacustres"
     * @param listaDeStrings lista de Strings (List "String").
     * @return una lista de objetos "lacustres"
     */
    public static List<PaseoLacustre> listaALacustre(List<String> listaDeStrings)
    {
        // Se declara una lista vacia de objetos "Paseo Lacustre":
        List<PaseoLacustre> lacustres = new ArrayList<>();

        // Se implementa un bucle FOREACH, para que cada línea de la "lista de strings" pasadas como argumento:
        for (String linea : listaDeStrings)
        {
            if (linea == null || linea.isBlank())
            {
                continue;
            }
            // Se almacena en un Array de tipo "String", llamado partes.
            String[] partes = linea.split(";");
            if (partes.length != 5)     // Validador de datos. Si la cantidad de elementos del array "Partes" es distinto de 4 elementos, lanza error.
            {
                System.err.println("Línea inválida." + linea);
                continue;
            }
            try
            {
                String nombre = partes[0];
                String descripcion = partes[1];
                double precio = Double.parseDouble(partes[2]);
                String embarcacion = partes[3];
                String destino = partes[4];
                // añade a la Lista "lacustres", los elementos del Array "Partes".
                lacustres.add(new PaseoLacustre(nombre, descripcion, precio, embarcacion, destino));
            }
            catch (NumberFormatException e)
            {
                System.err.println("Error al convertir números en la línea." + linea);
            }
        }
        System.out.println("Agregado a la lista 'lacustres' exitosamente");
        return lacustres;
    }

    /**
     * Método que lee una lista de "Strings" y convierte su contenido a una Lista de objetos "Empleado Administrativo"
     * @param listaDeStrings lista de Strings (List "String").
     * @return una lista de objetos "Empleados Administrativos"
     */
    public static List<EmpleadoAdministrativo> listaAdministrativa(List<String> listaDeStrings)
    {
        // Se declara una lista vacia de objetos "Empleados Administrativos":
        List<EmpleadoAdministrativo> administrativos = new ArrayList<>();

        // Se implementa un bucle FOREACH, para que cada línea de la "lista de strings" pasadas como argumento:
        for (String linea : listaDeStrings)
        {
            if (linea == null || linea.isBlank())
            {
                continue;
            }
            // Se almacena en un Array de tipo "String", llamado partes.
            String[] partes = linea.split(";");
            if (partes.length != 8)     // Validador de datos. Si la cantidad de elementos del array "Partes" es distinto de 4 elementos, lanza error.
            {
                System.err.println("Línea inválida." + linea);
                continue;
            }
            try
            {
                String nombre = partes[0];
                // Se debe crear un objeto "Rut1" con el String "rut":
                String rut = partes[1];
                // Se debe crear un objeto "Dirección1" con los Strings(calle,ciudad y región)
                String calle = partes[2];
                String ciudad = partes[3];
                String region = partes[4];
                // Se debe crear un objeto "Email1" con el String "email":
                String email = partes[5];
                double sueldoA = Double.parseDouble(partes[6]);
                String puesto = partes[7];

                Rut rut1 = new Rut(rut); // Se crea el objeto "rut1"
                Direccion direccion1 = new Direccion(calle, ciudad, region); // Se crea el objeto "direccion1".
                Email email1 = new Email(email); // Se crea el objeto "email1"

                // Se añaden los elementos creados para crear una nueva lista de objetos "Empleados Administrativos":
                administrativos.add(new EmpleadoAdministrativo(nombre, rut1, direccion1, email1, sueldoA, puesto));
            }
            catch (NumberFormatException e)
            {
                System.err.println("Error al convertir números en la línea." + linea);
            }
        }
        System.out.println("Agregado a la lista 'Administrativos' exitosamente");
        return administrativos;
    }

    /**
     * Método que lee una lista de "Strings" y convierte su contenido a una Lista de objetos "Empleado Operativo"
     * @param listaDeStrings lista de Strings (List "String").
     * @return una lista de objetos "Empleados Operativos"
     */
    public static List<EmpleadoOperativo> listaOperativa(List<String> listaDeStrings)
    {
        // Se declara una lista vacia de objetos "Empleados Operativos":
        List<EmpleadoOperativo> operativos = new ArrayList<>();

        // Se implementa un bucle FOREACH, para que cada línea de la "lista de strings" pasadas como argumento:
        for (String linea : listaDeStrings)
        {
            if (linea == null || linea.isBlank())
            {
                continue;
            }
            // Se almacena en un Array de tipo "String", llamado partes.
            String[] partes = linea.split(";");
            if (partes.length != 8)     // Validador de datos. Si la cantidad de elementos del array "Partes" es distinto de 4 elementos, lanza error.
            {
                System.err.println("Línea inválida." + linea);
                continue;
            }
            try
            {
                String nombre = partes[0];
                // Se debe crear un objeto "Rut1" con el String "rut":
                String rut = partes[1];
                // Se debe crear un objeto "Dirección1" con los Strings(calle,ciudad y región)
                String calle = partes[2];
                String ciudad = partes[3];
                String region = partes[4];
                // Se debe crear un objeto "Email1" con el String "email":
                String email = partes[5];
                double sueldo = Double.parseDouble(partes[6]);
                String puesto = partes[7];

                Rut rut1 = new Rut(rut); // Se crea el objeto "rut1"
                Direccion direccion1 = new Direccion(calle, ciudad, region); // Se crea el objeto "direccion1".
                Email email1 = new Email(email); // Se crea el objeto "email1"

                // Se añaden los elementos creados para crear una nueva lista de objetos "Empleados Operativos":
                operativos.add(new EmpleadoOperativo(nombre, rut1, direccion1, email1, sueldo, puesto));
            }
            catch (NumberFormatException e)
            {
                System.err.println("Error al convertir números en la línea." + linea);
            }
        }
        System.out.println("Agregado a la lista 'Operativos' exitosamente");
        return operativos;
    }
    /**
     * Método que lee una lista de "Strings" y convierte su contenido a una Lista de objetos "Proveedor Externo"
     * @param listaDeStrings lista de Strings (List "String").
     * @return una lista de objetos "Proveedor Externo"
     */
    public static List<ProveedorExterno> listaDeProveedores(List<String> listaDeStrings)
    {
        // Se declara una lista vacia de objetos "Proveedor Externo":
        List<ProveedorExterno> proveedores = new ArrayList<>();

        // Se implementa un bucle FOREACH, para que cada línea de la "lista de strings" pasadas como argumento:
        for (String linea : listaDeStrings)
        {
            if (linea == null || linea.isBlank())
            {
                continue;
            }
            // Se almacena en un Array de tipo "String", llamado partes.
            String[] partes = linea.split(";");
            if (partes.length != 7)     // Validador de datos. Si la cantidad de elementos del array "Partes" es distinto de 4 elementos, lanza error.
            {
                System.err.println("Línea inválida." + linea);
                continue;
            }
            try
            {
                String nombre = partes[0];
                // Se debe crear un objeto "Rut1" con el String "rut":
                String rut = partes[1];
                // Se debe crear un objeto "Dirección1" con los Strings(calle,ciudad y región)
                String calle = partes[2];
                String ciudad = partes[3];
                String region = partes[4];
                // Se debe crear un objeto "Email1" con el String "email":
                String email = partes[5];
                String servicio = partes[6];

                Rut rut1 = new Rut(rut); // Se crea el objeto "rut1"
                Direccion direccion1 = new Direccion(calle, ciudad, region); // Se crea el objeto "direccion1".
                Email email1 = new Email(email); // Se crea el objeto "email1"

                // Se añaden los elementos creados para crear una nueva lista de objetos "Proveedor Externo":
                proveedores.add(new ProveedorExterno(nombre, rut1, direccion1, email1, servicio));
            }
            catch (NumberFormatException e)
            {
                System.err.println("Error al convertir números en la línea." + linea);
            }
        }
        System.out.println("Agregado a la lista 'Proveedores' exitosamente");
        return proveedores;
    }

    /**
     * Método que lee una lista de "Strings" y convierte su contenido a una Lista de objetos "Cliente"
     * @param listaDeStrings lista de Strings (List "String").
     * @return una lista de objetos "Cliente"
     */
    public static List<Cliente> listaCliente(List<String> listaDeStrings)
    {
        // Se declara una lista vacia de objetos "Cliente":
        List<Cliente> clientes = new ArrayList<>();

        // Se implementa un bucle FOREACH, para que cada línea de la "lista de strings" pasadas como argumento:
        for (String linea : listaDeStrings)
        {
            if (linea == null || linea.isBlank())
            {
                continue;
            }
            // Se almacena en un Array de tipo "String", llamado partes.
            String[] partes = linea.split(";");
            if (partes.length != 7)     // Validador de datos. Si la cantidad de elementos del array "Partes" es distinto de 4 elementos, lanza error.
            {
                System.err.println("Línea inválida." + linea);
                continue;
            }
            try
            {
                String nombre = partes[0];
                // Se debe crear un objeto "Rut1" con el String "rut":
                String rut = partes[1];
                // Se debe crear un objeto "Dirección1" con los Strings(calle,ciudad y región)
                String calle = partes[2];
                String ciudad = partes[3];
                String region = partes[4];
                // Se debe crear un objeto "Email1" con el String "email":
                String email = partes[5];
                String servicioContratado = partes[6];

                Rut rut1 = new Rut(rut); // Se crea el objeto "rut1"
                Direccion direccion1 = new Direccion(calle, ciudad, region); // Se crea el objeto "direccion1".
                Email email1 = new Email(email); // Se crea el objeto "email1"

                // Se añaden los elementos creados para crear una nueva lista de objetos "Cliente":
                clientes.add(new Cliente(nombre, rut1, direccion1, email1, servicioContratado));
            }
            catch (NumberFormatException e)
            {
                System.err.println("Error al convertir números en la línea." + linea);
            }
        }
        System.out.println("Agregado a la lista 'Cliente' exitosamente");
        return clientes;
    }

    /**
     * Método que devuelve una lista de objetos<Servicio Turístico>, con todos los servicios ofrecidos por Llanquihue Tour.
     * El objetivo de esta lista es poder filtrar los servicios según necesidades de usuario
     * @param listaExcursion lista de objetos "Excursion al Aire libre".
     * @param listaPaseo lista de objetos "Paseo Lacustre".
     * @param listaGastronomica lista de objetos "Ruta Gastronómica".
     * @return lista de objetos "Servicios Disponibles".
     */
    public static List<ServicioTuristico> serviciosDisponibles(List<ExcursionAlAireLibre> listaExcursion, List<PaseoLacustre> listaPaseo, List<RutaGastronomica> listaGastronomica)
    {
        // Se añade una Lista de objetos "Servicio Turístico" vacía
        List<ServicioTuristico> serviciosDisponibles = new ArrayList<>();

        // Se aplica un bucle FOREACH en lambda, que agrega cada objeto de una lista específica, a la lista de objetos "Servicios Disponibles":
        listaExcursion.forEach(excursion -> serviciosDisponibles.add(excursion));
        listaPaseo.forEach(paseo -> serviciosDisponibles.add(paseo));
        listaGastronomica.forEach(gastronomica -> serviciosDisponibles.add(gastronomica));

        // Devuelve una lista de objetos "Servicios Disponibles" con la totalidad de servicios ofrecidos por Llanquihue Tour.
        System.out.println("Listas agregadas a la lista 'Servicios disponibles' exitosamente");
        return serviciosDisponibles;
    }

    /**
     * Método para filtrar los servicios turísticos por precio, de mayor a menor.
     * @param serviciosDisponibles lista de servicios que se quiere comparar.
     */
    public static void mostrarServiciosPorPrecio(List<ServicioTuristico> serviciosDisponibles)
    {
        System.out.println("======== LISTA DE PRECIOS ========");
        // Validador básico para la lista. Si es null o vacía, devuelve el mensaje respectivo.
        if (serviciosDisponibles == null || serviciosDisponibles.isEmpty())
        {
            System.out.println("No hay productos en la lista.");
            return;
        }

        // Ordena la lista comparando dos servicios, desde el más costoso al más caro.
        Collections.sort(serviciosDisponibles,
                (a, b) -> Double.compare(b.getPrecioServicio(), a.getPrecioServicio()));

        // Se implementa un contador para agregar un número de lista al resultado
        int contador = 1;

        // Por cada elemento "p" en la lista de servicios disponibles, imprime la línea correspondiente y agrega un número al contador:
        for (ServicioTuristico p : serviciosDisponibles)
        {
            System.out.println(contador + ". " + p.getNombreServicio() + " - $" + p.getPrecioServicio());
            contador++;
        }
        System.out.println("=============================================");
        System.out.println("________ sólo por Llanquihue Tours ________\n");
    }

    /**
     * Método para mostrar los servicios turísticos con su respectiva descripción.
     * @param serviciosDisponibles lista de servicios que se quiere comparar.
     */
    public static void mostrarServiciosConDescripcion(List<ServicioTuristico> serviciosDisponibles)
    {
        System.out.println("======== LISTA DE SERVICIOS CON DESCRIPCIÓN ========\n");
        // Validador básico para la lista. Si es null o vacía, devuelve el mensaje respectivo.
        if (serviciosDisponibles == null || serviciosDisponibles.isEmpty())
        {
            System.out.println("No hay productos en la lista.");
            return;
        }

        // Se implementa un contador para agregar un número de lista al resultado
        int contador = 1;

        // Por cada elemento "p" en la lista de servicios disponibles, imprime la línea correspondiente y agrega un número al contador:
        for (ServicioTuristico p : serviciosDisponibles)
        {
            System.out.println(contador + ". " + p.getNombreServicio() + " - " + p.getDescripcionServicio());
            contador++;
        }
        System.out.println("=============================================");
        System.out.println("________ sólo por Llanquihue Tours ________\n");
    }

    /**
     * Método que crea una lista de los objetos que implementan un contrato con la interface.
     * @param listaExcursion lista de objetos "Excursión al aire libre".
     * @param listaPaseo lista de objetos "Paseo Lacustre".
     * @param listaGastronomica lista de objetos "Ruta Gastronómica".
     * @param listaAdministrativos lista de objetos "Empleado Administrativo".
     * @param listaProveedores lista de objetos "Proveedor Externo".
     * @param listaEmpleadoOperativos lista de objetos "Empleado Operativo".
     * @return lista de objetos "interface".
     */
    public static List<FechaCreacion> listaDeInterface(List<ExcursionAlAireLibre> listaExcursion,  List<PaseoLacustre> listaPaseo, List<RutaGastronomica> listaGastronomica,
                                                       List<EmpleadoAdministrativo> listaAdministrativos, List<ProveedorExterno> listaProveedores, List<EmpleadoOperativo> listaEmpleadoOperativos, List<Cliente>listaClientes)
    {
        // Se crea una lista de objetos "interface" vacía.
        List<FechaCreacion> listaInterface = new ArrayList<>();

        // Se agegan todas las listas de objetos de Llanquihue Tour:
        listaExcursion.forEach(excursion -> listaInterface.add(excursion));
        listaPaseo.forEach(paseo -> listaInterface.add(paseo));
        listaGastronomica.forEach(ruta -> listaInterface.add(ruta));
        listaProveedores.forEach(proveedor -> listaInterface.add(proveedor));
        listaEmpleadoOperativos.forEach(empleado -> listaInterface.add(empleado));
        listaAdministrativos.forEach(administrativo -> listaInterface.add(administrativo));
        listaClientes.forEach(cliente -> listaInterface.add(cliente));

        // Se imprime un mensaje que indica que las listas se cargaron:
        System.out.println("Se han agregado todas listas de objetos satisfactoriamente\n");
        return listaInterface;
    }

    /**
     * Método que devuelve todos los elementos de la lista de objetos<Interface>.
     * Indica a qué categoría corresponden.
     * Devuelve el método "toString" de cada objeto de la lista.
     * @param listaInterface lista de objetos <interface>.
     */
    public static void recorrerTodosLosElementos(List<FechaCreacion> listaInterface)
    {
        // Se implementa un buble FOREACH, que imprime un mensaje específico, dependiendo de la instancia almacenada.
        for (FechaCreacion elemento : listaInterface)
        {
            // Si el elemento de la lista es un objeto de "Excursión al aire libre", imprime esto:
            if (elemento instanceof ExcursionAlAireLibre)
            {
                System.out.println("→ Este elemento es una Excursión");
                System.out.println(elemento.toString());
            }
            // Si el elemento de la lista es un objeto de "Paseo lacustre", imprime esto:
            else if (elemento instanceof PaseoLacustre)
            {
                System.out.println("→ Este elemento es una paseo");
                System.out.println(elemento.toString());
            }
            // Si el elemento de la lista es un objeto de "Ruta gastronómica", imprime esto:
            else if (elemento instanceof RutaGastronomica)
            {
                System.out.println("→ Este elemento es una ruta gastronómica");
                System.out.println(elemento.toString());
            }
            // Si el elemento de la lista es un objeto de "Proveedor externo", imprime esto:
            else if (elemento instanceof ProveedorExterno)
            {
                System.out.println("✓ Este elemento es una proveedor");
                System.out.println(elemento.toString());
            }
            // Si el elemento de la lista es un objeto de "Empleado administrativo", imprime esto:
            else if (elemento instanceof EmpleadoAdministrativo)
            {
                System.out.println("✓ Este elemento es una empleado administrativo");
                System.out.println(elemento.toString());
            }
            // Si el elemento de la lista es un objeto de "Empleado operativo", imprime esto:
            else if (elemento instanceof EmpleadoOperativo)
            {
                System.out.println("✓ Este elemento es una empleado operativo");
                System.out.println(elemento.toString());
            }
            else if (elemento instanceof Cliente)
            {
                System.out.println("✓ Este elemento es una cliente");
                System.out.println(elemento.toString());
            }
            // Si el elemento no pertenece a ninguna instancia, imprime esto:
            else
            {
                System.out.println("No se puedo determinar a que lista pertenece este objeto");
            }
        }
    }

    /**
     * Método que devuelve los "Empleados Administrativos" de Llanquihue Tours.
     * @param listaAdministrativos lista de objetos "Empleados Administrativos".
     */
    public static void mostrarListaDeEmpleadosAdministrativos(List<EmpleadoAdministrativo> listaAdministrativos)
    {
        System.out.println("======== LISTA DE EMPLEADOS ADMINISTRATIVOS ========");
        // Se implementa un contador para imprimir por cada elemento de la lista:
        int contador = 1;
        // Por cada elemento de la lista de empleados administrativos, imprime la línea:
        for (EmpleadoAdministrativo elemento : listaAdministrativos)
        {
            System.out.println(contador + " - " + elemento.mostrarFechaDeCreacion());
            contador++;
        }
        System.out.println("=============================================");
        System.out.println("________ Sólo por Llanquihue tours ________\n");
    }

    /**
     * Método que devuelve los "Empleados Operativos" de Llanquihue Tours.
     * @param listaOperativos lista de objetos "Empleados Administrativos".
     */
    public static void mostrarListaDeEmpleadosOperativos(List<EmpleadoOperativo> listaOperativos)
    {
        System.out.println("======== LISTA DE EMPLEADOS OPERATIVOS ========");
        // Se implementa un contador para imprimir por cada elemento de la lista:
        int contador = 1;
        // Por cada elemento de la lista de empleados administrativos, imprime la línea:
        for (EmpleadoOperativo elemento : listaOperativos)
        {
            System.out.println(contador + " - " + elemento.mostrarFechaDeCreacion());
            contador++;
        }
        System.out.println("=============================================");
        System.out.println("________ Sólo por Llanquihue tours ________\n");
    }

    /**
     * Método que devuelve los "Proveedores Externos" de Llanquihue Tours.
     * @param listaProveedores lista de objetos "Proveedor Externo".
     */
    public static void mostrarListaDeProveedores(List<ProveedorExterno> listaProveedores)
    {
        System.out.println("======== LISTA DE PROVEEDORES ========");
        // Se implementa un contador para imprimir por cada elemento de la lista:
        int contador = 1;
        // Por cada elemento de la lista de proveedores externos, imprime la línea:
        for (ProveedorExterno elemento : listaProveedores)
        {
            System.out.println(contador + " - " + elemento.mostrarFechaDeCreacion());
            contador++;
        }
        System.out.println("=============================================");
        System.out.println("________ Sólo por Llanquihue tours ________\n");
    }

    /**
     * Método que devuelve los "Clientes" de Llanquihue Tours.
     * @param listaClientes lista de objetos "Cliente".
     */
    public static void mostrarListaDeClientes(List<Cliente> listaClientes)
    {
        System.out.println("======== LISTA DE CLIENTES REGISTRADOS ========");
        // Se implementa un contador para imprimir por cada elemento de la lista:
        int contador = 1;
        // Por cada elemento de la lista de clientes, imprime la línea:
        for (Cliente elemento : listaClientes)
        {
            System.out.println(contador + " - " + elemento.mostrarFechaDeCreacion());
            contador++;
        }
        System.out.println("=============================================");
        System.out.println("________ Sólo por Llanquihue tours ________\n");
    }
}