package model.Personas;

/**
 * Clase que representa un "Empleado Administrativo" de "Llanquihue Tours". Hereda sus atributos y métodos de la superclase "Persona".
 */
public class EmpleadoAdministrativo extends Persona
{
    private double sueldoAdministrativo;    // Atributo que representa el sueldo del trabajador.
    private String puestoAdministrativo;    // Atributo que representa el puesto de trabajo.

    // Se implementa un constructor con parámetros. Hereda parámetros de la superclase "Persona".
    public EmpleadoAdministrativo(String nombre, Rut rut, Direccion direccion, Email email, double sueldo, String puestoAdministrativo)
    {
        super(nombre, rut, direccion, email);
        this.sueldoAdministrativo = sueldoAdministrativo;
        this.puestoAdministrativo = puestoAdministrativo;
    }

    // Se implementa un constructor sin parámetros por defecto: Hereda parámetros de la superclase "Persona".
    public EmpleadoAdministrativo()
    {
        super();
        this.sueldoAdministrativo = 0;
        this.puestoAdministrativo = "Sin un puesto asignado";
    }

    // Se implementan los métodos "Getters":

    /**
     * Método que devuelve el sueldo del empleado administrativo:
     * @return sueldo del empleado administrativo.
     */
    public double getSueldoAdministrativo()
    {
        return sueldoAdministrativo;
    }

    /**
     * Método que devuelve el puesto del empleado administrativo:
     * @return nombre del puesto administrativo
     */
    public String getPuestoAdministrativo()
    {
        return puestoAdministrativo;
    }

    // Se implementan los métodos "Setters":

    /**
     * Método para modificar el sueldo del empleado administrativo.
     * @param sueldoAdministrativo nuevo sueldo que se quiere asignar al objeto
     */
    public void setSueldoAdministrativo(double sueldoAdministrativo)
    {
        this.sueldoAdministrativo = sueldoAdministrativo;
    }

    /**
     * Método para modificar el nombre del puesto administrativo.
     * @param puestoAdministrativo nuevo puesto que se quiere asignar al objeto.
     */
    public void setPuestoAdministrativo(String puestoAdministrativo) {this.puestoAdministrativo = puestoAdministrativo;}

    /**
     * Método que devuelve el identificador de esta instancia de la clase. Es sobreescrito desde la superclase "Persona".
     * @return prefijo "EA" perteneciente a empleado administrativo.
     */
    @Override
    protected String getPrefijo()
    {
        return "EA";
    }

    // Se implementa un método "toString" que muestra información del objeto. Hereda parte de su composición de la superclase "Persona".
    /**
     * Método que devuelve una cadena de texto con la información del objeto.
     * @return "ID", "nombre", "rut", "dirección", "Email", "sueldo administrativo" y "puesto administrativo".
     */
    @Override
    public String toString()
    {
        return super.toString()+ "Sueldo administrativo: " + getSueldoAdministrativo() +"\n" + "Puesto Administrativo: " + getPuestoAdministrativo() + "\n";
    }
}
