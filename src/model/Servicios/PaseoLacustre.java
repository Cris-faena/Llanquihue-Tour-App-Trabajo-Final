package model.Servicios;

/**
 * Clase que representa un paseo lacustre ofrecido por Llanquihue Tours. Hereda sus atributos de la superclase "Servicio Turístico".
 */
public class PaseoLacustre extends ServicioTuristico
{
    private String tipoEmbarcacion;     // Atributo para el tipo de embarcación a utilizar.
    private String lugarDestino;        // Atributo para el lugar de destino del paseo.

    // Se implementa un constructor con parámetros. Hereda constructores de la superclase "Servicio Turístico".
    public  PaseoLacustre(String nombreServicio, String descripcionServicio, double precioServicio, String tipoEmbarcacion, String lugarDestino)
    {
        super(nombreServicio,descripcionServicio,precioServicio);
        this.tipoEmbarcacion = tipoEmbarcacion;
        this.lugarDestino = lugarDestino;
    }

    // Se implementa un constructor sin parámetros por defecto:
    public PaseoLacustre()
    {
        super();
        this.tipoEmbarcacion = "Sin embarcación asignada";
        this.lugarDestino = "Sin lugar asignado";
    }

    // Se implementan los métodos "Getters":

    /**
     * Método que devuelve el tipo de embarcación a utilizar.
     * @return tipo de embarcación.
     */
    public String getTipoEmbarcacion() {return tipoEmbarcacion;}

    /**
     * Método que devuelve el lugar de destino del paseo.
     * @return lugar de destino.
     */
    public String getLugarDestino() {return lugarDestino;}

    // Se implementan los métodos "Setters"

    /**
     * Método que modifica el tipo de embarcación utilizada.
     * @param tipoEmbarcacion nueva embarcación que se quiere asignar al paseo.
     */
    public void setTipoEmbarcacion(String tipoEmbarcacion) {this.tipoEmbarcacion = tipoEmbarcacion;}

    /**
     * Método que modifica el lugar de destino asignado.
     * @param lugarDestino nuevo lugar que se quiere asignar.
     */
    public void setLugarDestino(String lugarDestino) {this.lugarDestino = lugarDestino;}

    /**
     * Método que devuelve el prefijo específico de esta instancia.
     * @return prefijo de esta instancia
     */
    @Override
    protected String prefijoServicio() {return "PLAC";}

    /**
     * Método que muestra información del objeto en forma de cadena de texto.
     * Hereda parte de su contenido de la superclase
     * @return ID, nombre, descripción, precio, tipo de embarcación y lugar de destino.
     */
    @Override
    public String toString()
    {
        return super.toString() + "Tipo de embarcación: " +getTipoEmbarcacion() + "\n" + "Lugar de destino: " +getLugarDestino() + "\n";
    }
}
