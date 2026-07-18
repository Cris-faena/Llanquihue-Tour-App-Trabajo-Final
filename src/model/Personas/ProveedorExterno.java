package model.Personas;

/**
 * Clase que representa a un "proveedor de servicios externo" para "Llanquihue tours".
 */
public class ProveedorExterno extends Persona
{
    private String servicioPrestado;    // Atributo para asignar el servicio prestado por el proveedor.

    // Se implementa un constructor con parámetros. Hereda parámetros de la superclase "Persona".
    public ProveedorExterno(String nombre, Rut rut, Direccion direccion, Email email, String servicioPrestado)
    {
        super(nombre, rut, direccion, email);
        this.servicioPrestado = servicioPrestado;
    }
    // Se implementa un constructor por defecto. Hereda parámetros de la superclase "Persona".
    public ProveedorExterno()
    {
        super();
        this.servicioPrestado = "Sin un servicio asignado";
    }

    // Se implementan los métodos "Getters":

    /**
     * Método que devuelve el nombre del servicio prestado por el proveedor.
     * @return nombre del servicio prestado.
     */
    public String getServicioPrestado() {return servicioPrestado;}

    // Se implementan los métodos "Setters":

    /**
     * Método para modificar el nombre del servicio prestado por el proveedor.
     * @param servicioPrestado nuevo nombre del servicio prestado por el proveedor que se quiere asignar.
     */
    public void setServicioPrestado(String servicioPrestado) {this.servicioPrestado = servicioPrestado;}

    /**
     * Método que se utiliza para asignar un identificador a la instancia. Sobreescribe el método de la superclase "Persona".
     * @return prefijo "PROVEX" para proveedor externo.
     */
    @Override
    protected String getPrefijo() {return "PROVEX";}

    /**
     * Método que devuelve una cadena de texto con la información de la clase. Hereda el método de la superclase "Persona" y lo sobrescribe.
     * @return "ID", "nombre", "rut", "dirección", "Email", "sueldo" y "Servicio prestado".
     */
    @Override
    public String toString()
    {
        return super.toString() + "Servicio prestado por el proveedor: " + getServicioPrestado() + "\n";
    }
}
