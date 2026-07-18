package model.Personas;

/**
 * Clase que representa un "Empleado Operativo", para cumplir tareas en el exterior. Hereda atributos de la superclase "Persona"
 */
public class EmpleadoOperativo extends Persona
{
    private double sueldoOperativo;     // Atributo sueldo para un empleado operativo.
    private String puestoOperativo;     // Atributo puesto para un empleado operativo.

    // Se implementa un constructor con parámetros. Hereda parámetros de la superclase "Persona":
    public EmpleadoOperativo(String nombre, Rut rut, Direccion direccion, Email email, double sueldoOperativo, String puestoOperativo)
    {
        super(nombre, rut, direccion, email);
        this.sueldoOperativo = sueldoOperativo;
        this.puestoOperativo = puestoOperativo;
    }

    // Constructor sin parámetros por defecto. Hereda parámetros de la superclase "Persona":
    public EmpleadoOperativo()
    {
        super();
        this.sueldoOperativo = 0;
        this.puestoOperativo = "Sin puesto operativo asignado";
    }

    // Se implementa los métodos "Getters":

    /**
     * Método que devuelve el sueldo del empleado operativo.
     * @return "sueldo" del empleado operativo.
     */
    public double getSueldoOperativo() {return sueldoOperativo;}

    /**
     * Método para obtener el puesto del empleado operativo.
     * @return puesto del empleado operativo
     */
    public String getPuestoOperativo() {return puestoOperativo;}

    // Se implementan los métodos "Setters":

    /**
     * Método que modifica el sueldo del empleado operativo.
     * @param sueldoOperativo nuevo sueldo que se quiere asignar al empleado operativo.
     */
    public void setSueldoOperativo(double sueldoOperativo) {this.sueldoOperativo = sueldoOperativo;}

    /**
     * Método que devuelve el puesto del empleado operativo:
     * @param puestoOperativo nuevo puesto que se quiere asignar al empleado operativo.
     */
    public void setPuestoOperativo(String puestoOperativo) {this.puestoOperativo = puestoOperativo;}

    /**
     * Método que devuelve el identificador de esta instancia de la clase. Es sobreescrito de la superclase "Persona".
     * @return prefijo "EOP" perteneciente a empleado operativo.
     */
    @Override
    protected String getPrefijo() {return "EOP";}

    // Se implementa un método "toString" que muestra información del objeto. Hereda parte de su composición de la superclase "Persona".
    /**
     * Método que devuelve una cadena de texto con la información del objeto.
     * @return "ID", "nombre", "rut", "dirección", "Email", "sueldo operativo" y "puesto operativo".
     */
    @Override
    public String toString()
    {
        return super.toString()+ "Sueldo operativo: " + getSueldoOperativo() +"\n" + "Puesto operativo: " + getPuestoOperativo() + "\n";
    }
}
