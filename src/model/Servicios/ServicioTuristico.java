package model.Servicios;

import model.Personas.FechaCreacion;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Esta clase representa un servicio turístico genérico ofrecido por Llanquihue Tours. Implementa métodos desde la INTERFACE.
 */
public abstract class ServicioTuristico implements FechaCreacion
{
    private LocalDateTime fechaCreacion;    // Atributo que implementa una clase de fecha inmutable.
    private static int contador = 1;        // Se implementa como atributo el método contador, para generar un ID único por cada instancia creada.
    private final String idServicio;        // Se implementa un "ID" inmutable como identificador único de cada instancia creada.
    private String nombreServicio;          // Atributo para asignar un nombre al servicio.
    private String descripcionServicio;     // Atributo para describir el servicio.
    private double precioServicio;          // Atributo para asignar un precio al servicio.

    DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"); // Se implementa esta clase para dar un formato personalizado a la fecha.

    // Se implementa un constructor con parámetros:
    public ServicioTuristico(String nombreServicio, String descripcionServicio, double precioServicio)
    {
        this.nombreServicio = nombreServicio;
        this.descripcionServicio = descripcionServicio;
        this.precioServicio = precioServicio;
        this.idServicio = generarIdServicio();  // con cada instancia creada, se genera un ID único.
        this.estamparFechaDeCreacion();         // se estampa la fecha de creación del objeto con cada instancia creada.
    }

    // Se implementa un constructor sin parámetros por defecto:
    public ServicioTuristico()
    {
        this.nombreServicio = "Sin nombre asignado";
        this.descripcionServicio = "Sin una descripción";
        this.precioServicio = 0.0;
        this.idServicio = generarIdServicio();
        this.estamparFechaDeCreacion();
    }

    // Se implementan los métodos "Getters":

    /**
     * Método que devuelve el nombre del servicio de la instancia.
     * @return "nombre del servicio".
     */
    public String  getNombreServicio() {return nombreServicio;}
    /**
     * Método que devuelve una descripción del servicio de la instancia.
     * @return "descripción del servicio".
     */
    public String getDescripcionServicio() {return descripcionServicio;}
    /**
     * Método que devuelve el precio del servicio.
     * @return "precio del servicio".
     */
    public double getPrecioServicio() {return precioServicio;}
    /**
     * Método que devuelve el ID del servicio.
     * @return "ID del servicio".
     */
    public String getIdServicio() {return idServicio;}

    // Se implementan los métodos "Setters":

    /**
     * Método para modificar el nombre del servicio.
     * @param nombreServicio nuevo nombre que se quiere asignar a la instancia.
     */
    public void setNombreServicio(String nombreServicio) {this.nombreServicio = nombreServicio;}

    /**
     * Método para modificar la descripción del servicio
     * @param descripcionServicio nueva descripción que se quiere asignar a la instancia.
     */
    public void setDescripcionServicio(String descripcionServicio) {this.descripcionServicio = descripcionServicio;}

    /**
     * Método para modificar el precio del servicio.
     * @param precioServicio nuevo precio que se le quiere asignar al servicio.
     */
    public void setPrecioServicio(double precioServicio) {this.precioServicio = precioServicio;}

    /**
     * Método que devuelve una cadena de texto con el ID único del servicio.
     * @return "ID" del servicio
     */
    public String generarIdServicio()
    {
        return prefijoServicio() + String.format("%03d", contador++);
    }

    /**
     * Método para devolver un prefijo único para cada instancia
     * @return prefijo específico de la instancia
     */
    protected String prefijoServicio() {return "ST";}

    /**
     * Método para estampar la fecha de creación del objeto. Implementa este método desde la interface.
     */
    @Override
    public void estamparFechaDeCreacion() {this.fechaCreacion = LocalDateTime.now();}

    /**
     * Método que devuelve la fecha de creación del objeto. Se implementa desde la interface.
     * @return fecha de creación del objeto.
     */
    @Override
    public String getFechaCreacion() {return fechaCreacion.format(formato);}

    /**
     * Método que devuelve una cadena de texto con información del servicio
     * @return ID del servicio, nombre, descripción y precio del servicio.
     */
    @Override
    public String toString()
    {
        return String.format("ID servicio: %s%nNombre: %s%nDescripción: %s%nPrecio: %s%n",
                idServicio, nombreServicio, descripcionServicio, precioServicio);
    }

    /**
     * Método que devuelve una cadena de texto con información relacionada con la fecha de creación.
     * @return ID, nombre y fecha de creación.
     */
    @Override
    public String mostrarFechaDeCreacion()
    {
        return String.format("ID Servicio: %s%nNombre: %s%nFue creado con fecha: %s horas.%n",
                idServicio, nombreServicio, getFechaCreacion());
    }
}
