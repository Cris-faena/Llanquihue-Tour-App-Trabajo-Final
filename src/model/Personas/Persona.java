package model.Personas;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Clase Abstracta "Persona" que representa una persona común en la vida real.
 */
public abstract class Persona implements FechaCreacion {
    private LocalDateTime fechaCreacion; //Se implementa como atributo la clase LocalDateTime
    private static int contador = 1;    // Se implementa como atributo el método contador, para generar un ID único por cada instancia creada.
    private final String idPersona;     // Se implementa un String "ID", como identificador único de cada instancia creada.

    private String nombre;              // Se implementa un atributo "nombre".
    private Rut rut;                    // Se implementa un atributo compuesto "rut".
    private Direccion direccion;        // Se implmenta un atributo compuesto "dirección".
    private Email email;                // Se implementa un atributo compuesto "email".

    // Se implementa una clase DateTimeFormatter, para darle un formato personalizado a la fecha:
    DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

    // Se implementa un constructor con parámetros:
    public Persona(String nombre, Rut rut, Direccion direccion, Email email) {
        this.idPersona = generarID();   // este parámetro del constructor llama a un método que le asigna un ID, dependiendo de quien la implemente.
        this.nombre = nombre;
        this.rut = rut;
        this.direccion = direccion;
        this.email = email;
        this.estamparFechaDeCreacion(); // Se llama al método de la interface, para estampar la fecha de cración de la instancia, cada vez que se crea una nueva.
    }

    // Se implementa un constructor sin parámetros por defecto:
    public Persona() {
        this.idPersona = generarID();
        this.nombre = "Sin nombre";
        this.rut = null;
        this.direccion = null;
        this.email = null;
        this.estamparFechaDeCreacion();
    }

    /**
     * Método que devuelve un ID.
     * Dependiendo de qué clase la implemente, el valor puede diferir.
     * @return "ID" único para cada instancia creada.
     */
    private String generarID() {
        return getPrefijo() + String.format("%03d", contador++); // llama al método prefijo, el cual varía según la instancia, más un número único
    }

    /**
     * Método que devuelve un prefijo de dos letras.
     * @return "Prefijo" de dos letras genérico para "Personas".
     */
    protected String getPrefijo() {
        return "PR";
    }

    // Se implementan los métodos "Getters":

    /**
     * Método que devuelve el ID del objeto creado.
     * @return "ID" del objeto creado.
     */
    public String getIdPersona() {
        return idPersona;
    }

    /**
     * Método que devuelve el nombre del objeto creado.
     * @return "nombre" del objeto creado.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Método que devuelve el rut del objeto creado.
     * @return "rut" del objeto creado.
     */
    public Rut getRut() {
        return rut;
    }

    /**
     * Método que devuelve la dirección del objeto creado.
     * Incluye: calle, comuna y región del objeto.*
     * @return "dirección" del objeto creado.
     */
    public Direccion getDireccion() {
        return direccion;
    }

    /**
     * Método que devuelve el email del objeto creado.
     * @return "email" del objeto creado.
     */
    public Email getEmail() {
        return email;
    }

    // Se implementan los métodos "Setters":

    /**
     * Método que modifica el nombre del objeto creado.
     * @param nombre "nombre" nuevo que se requiere asignar.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Método que modifica el rut del objeto creado.
     * @param rut cadena de texto que se requiere modificar.
     *            Debe cumplir con los requisitos del validador de la clase.
     */
    public void setRut(Rut rut) {this.rut = rut;}

    /**
     * Método que modifica la dirección del objeto creado.
     * @param direccion nueva "dirección" que quiere asignar al objeto.
     */
    public void setDireccion(Direccion direccion) {this.direccion = direccion;}

    /**
     * Método que modifica el email del objeto creado.
     * @param email nuevo "email" que se quiere asignar al objeto.
     */
    public void setEmail(Email email) {this.email = email;}

    /**
     * Método para estampar la fecha de creación del objeto. Implementa este método desde la interface.
     */
    @Override
    public void estamparFechaDeCreacion()
    {
        this.fechaCreacion = LocalDateTime.now();
    }

    /**
     * Método que devuelve la fecha de creación del objeto. Se implementa desde la interface.
     * @return fecha de creación del objeto.
     */
    @Override
    public String getFechaCreacion()
    {return fechaCreacion.format(formato);}

    /**
     * Método que devuelve una cadena de texto con información del objeto creado.
     * @return ID, nombre, rut, dirección y email.
     */
    @Override
    public String toString()
    {
        return String.format("ID persona: %s%nNombre: %s%nRUT: %s%nDirección: %s%nEMAIL: %s%n",
                idPersona, nombre, rut.toString(), direccion.toString(), email.toString());
    }

    /**
     * Método que devuelve una cadena de texto con información relacionada con la fecha de creación. Implementa esto desde la Interface <FechaCreacion>.
     * @return ID, nombre y fecha de creación.
     */
    @Override
    public String mostrarFechaDeCreacion()
    {
        return String.format("ID: %s%nNombre: %s%nFue creado con fecha: %s horas.%n", idPersona, nombre, getFechaCreacion());
    }
}
