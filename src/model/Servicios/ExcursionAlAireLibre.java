package model.Servicios;

import java.util.List;

/**
 * Clase que representa una excursión al aire libre, ofrecida por Llanquihue Tours:
 */
public class ExcursionAlAireLibre extends ServicioTuristico
{
    private String dificultad;      // Atributo que asigna la dificultad de la excursión.
    private int duracionHoras;      // Atributo que asigna la duración del recorrido en horas. Puede ser entre 1 y 24.

    // Se implementa un constructor con parámetros. Hereda de la superclase "Servicio Turístico".
    public ExcursionAlAireLibre(String nombreServicio, String descripcionServicio, double precioServicio, String dificultad, int duracionHoras)
    {
        super(nombreServicio, descripcionServicio, precioServicio); // Atributos de la superclase.
        this.dificultad = dificultad;
        this.duracionHoras = duracionHoras;
    }

    // Constructor sin parámetros por defecto:
    public ExcursionAlAireLibre()
    {
        super();
        this.dificultad = "Sin dificultad asignada";
        this.duracionHoras = 0;
    }

    // Se implementan los métodos "Getters":

    /**
     * Método que devuelve la dificultad de la excursión.
     * @return dificultad de la excursión.
     */
    public String getDificultad() {return dificultad;}

    /**
     * Método que devuelve la duración en horas de la excursión
     * @return duración en horas de la excursión.
     */
    public int getDuracionHoras() {return duracionHoras;}

    // Se implementan los métodos "Setters":

    /**
     * Método que modifica la dificultad de la excursión.
     * @param dificultad nueva dificultad que se quiere asignar.
     */
    public void setDificultad(String dificultad) {this.dificultad = dificultad;}

    /**
     * Método que modifica la duración de la excursión.
     * @param duracionHoras nueva duración que se quiere asignar.
     */
    public void setDuracionHoras(int duracionHoras) {this.duracionHoras = duracionHoras;}

    /**
     * Método que devuelve el prefijo específico de esta instancia.
     * @return prefijo de la instancia.
     */
    @Override
    protected String prefijoServicio() {return "EAIR";}

    /**
     * Método que muestra información del objeto en forma de cadena de texto.
     * Hereda parte de su contenido de la superclase
     * @return ID, nombre, descripción, precio, dificultad y duración
     */
    @Override
    public String toString()
    {
        return super.toString() + "Dificultad: " +getDificultad() +"\n"+"Duración: " +getDuracionHoras() + " " + "horas." +"\n";
    }
}
