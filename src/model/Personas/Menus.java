package model.Personas;

/**
 * Clase que representa un menú de opciones
 */
public class Menus
{
    /**
     * Método para desplegar el menu de opciones principal
     * @return menu principal.
     */
    public String mostrarMenuPrincipal()
    {
        StringBuilder menu = new StringBuilder();
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
        return menu.toString();
    }
}
