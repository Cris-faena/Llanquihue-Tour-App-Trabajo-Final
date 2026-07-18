package model.Personas;

/**
 * Clase que representa a un cliente genérico de "Llanquihue Tours". Hereda sus atributos y métodos de la superclase "Persona".
 */
public class Cliente extends Persona
{
    private String tourContratado;  // Atributo para ingresar el tour contratado:

    // Se implementa un constructor con parámetros. Hereda parámetros de la superclase "Persona".
    public Cliente(String nombre, Rut rut, Direccion direccion, Email email, String tourContratado)
    {
        super(nombre, rut, direccion,email);
        this.tourContratado = tourContratado;
    }

    // Se implementa un constructor sin parámetros por defecto. Hereda parámetros de la superclase "Persona".
    public Cliente()
    {
        super();
        this.tourContratado = "Sin un tour asignado";
    }

    // Se implementa un método Getter:

    /**
     * Método que devuelve el nombre del tour contratado.
     * @return nombre del "tour contratado" por el cliente.
     */
    public String getTourContratado() {return tourContratado;}

    // Se implementa un método Setter:

    /**
     * Método que permite modificar el nombre del tour contratado.
     * @param nuevoTourContratado nuevo nombre de tour que se quiere asignar al objeto.
     */
    public void setTourContratado(String nuevoTourContratado)
    {
        this.tourContratado = nuevoTourContratado;
    }

    /**
     * Método que devuelve el prefijo específico para esta instancia de la clase.
     * @return el prefijo "CLI" para "Clientes".
     */
    @Override
    protected String getPrefijo()
    {
        return "CLI";
    }

    // Se implementa un método "toString" que muestra información del objeto. Hereda parte de su composición de la superclase "Persona".
    /**
     * Método que devuelve una cadena de texto con la información de la clase.
     * @return "ID", "nombre", "rut", "dirección", "email" y "tour contratado".
     */
    @Override
    public String toString()
    {
        return super.toString()+"Tour Contratado: "+tourContratado + "\n";
    }
}
