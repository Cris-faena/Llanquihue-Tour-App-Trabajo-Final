package ui;

import data.GestorDatos;
import model.Personas.*;
import model.Servicios.ExcursionAlAireLibre;
import model.Servicios.PaseoLacustre;
import model.Servicios.RutaGastronomica;
import model.Servicios.ServicioTuristico;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        // 1. Se utiliza el gestor de datos para leer los archivos.txt que contienen las distintas personas que trabajan en "Llanquihue Tours" y los almacena en una lista de Strings:
        List<String> listaEmpleadoAdministrativo = GestorDatos.gestorDatos("src/resources/empleadoA.txt");
        List<String> listaEmpleadoOperativos = GestorDatos.gestorDatos("src/resources/empleadoOP.txt");
        List<String> listaDeProveedores = GestorDatos.gestorDatos("src/resources/proveedores.txt");
        List<String> listaDeClientes = GestorDatos.gestorDatos("src/resources/clientes.txt");

        // 2. Se utiliza el gestor de datos para leer los archivos.txt que contienen los distintos servicios turísticos y los almacena en una lista de strings:
        List<String> listaExcursion = GestorDatos.gestorDatos("src/resources/excursiones.txt");
        List<String> listaLacustre = GestorDatos.gestorDatos("src/resources/lacustres.txt");
        List<String> listaGastronomica = GestorDatos.gestorDatos("src/resources/gastronomicas.txt");
        System.out.println();

        // 3. Se llama al método respectivo para crear una lista de objetos específica según requerimientos:
        List<EmpleadoAdministrativo> administrativos = GestorDatos.listaAdministrativa(listaEmpleadoAdministrativo);
        List<Cliente> clientes = GestorDatos.listaCliente(listaDeClientes);
        List<EmpleadoOperativo> operativos = GestorDatos.listaOperativa(listaEmpleadoOperativos);
        List<ProveedorExterno> proveedores = GestorDatos.listaDeProveedores(listaDeProveedores);
        List<ExcursionAlAireLibre> excursiones = GestorDatos.listaAExcursiones(listaExcursion);
        List<PaseoLacustre> paseosLacustres = GestorDatos.listaALacustre(listaLacustre);
        List<RutaGastronomica> rutasGastronomicas = GestorDatos.listaAGastronomica(listaGastronomica);
        System.out.println();

        // 4. Se implementa un menú de consola para mostrar las diferentes implementaciones:
        Menus m = new Menus();
        Scanner sc = new Scanner(System.in);
        boolean salir = false;
        do
        {
            System.out.println(m.mostrarMenuPrincipal());
            int opcion = sc.nextInt();
            switch (opcion)
            {
                case 1:
                {
                    // Se llama al Método que muestra los clientes de la agencia:
                    GestorDatos.mostrarListaDeClientes(clientes);
                    break;
                }
                case 2:
                {
                    // Se llama al Método que muestra los proveedores externos de la agencia:
                    GestorDatos.mostrarListaDeProveedores(proveedores);
                    break;
                }
                case 3:
                {
                    // Se llama al Método que muestra los empleados administrativos de la agencia:
                    GestorDatos.mostrarListaDeEmpleadosAdministrativos(administrativos);
                    break;
                }
                case 4:
                {
                    // Se llama al Método que muestra los empleados operativos de la agencia:
                    GestorDatos.mostrarListaDeEmpleadosOperativos(operativos);
                    break;
                }
                case 5:
                {
                    // Se implementan una lista de Servicios Turísticos para filtrar
                    List<ServicioTuristico> serviciosDisponibles = GestorDatos.serviciosDisponibles(excursiones,paseosLacustres,rutasGastronomicas);
                    // Se llama al método que mustra los servicios disponibles con su descripción:
                    GestorDatos.mostrarServiciosConDescripcion(serviciosDisponibles);
                    break;
                }
                case 6:
                {
                    // Se implementan una lista de Servicios Turísticos para filtrar
                    List<ServicioTuristico> serviciosDisponibles = GestorDatos.serviciosDisponibles(excursiones,paseosLacustres,rutasGastronomicas);
                    // Se llama al método que filtra los servicios por precio:
                    GestorDatos.mostrarServiciosPorPrecio(serviciosDisponibles);
                    break;
                }
                case 7:
                {
                    // Se crea una lista polimórfica de interface <FechaCreacion> para almacenar todas las "listas de objetos" que implementan esta interface:
                    List<FechaCreacion> listaInterface = GestorDatos.listaDeInterface(excursiones, paseosLacustres, rutasGastronomicas, administrativos,proveedores, operativos, clientes);
                    // Se llama al método "recorrer todos los elementos" para mostrar información de todos los objetos almacenados
                    GestorDatos.recorrerTodosLosElementos(listaInterface);
                    break;
                }
                case 8:
                {
                    salir = true;
                    break;
                }
            }
        }
        while(!salir);
    }
}