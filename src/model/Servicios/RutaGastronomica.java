package model.Servicios;

/**
 * Clase que representa una Ruta Gastronómica por distintos restaurantes. Hereda atributos de la superclase "Servicio turístico".
 */
public class RutaGastronomica extends ServicioTuristico
{
    private String nivelGastronomico; // Atributo para asignar el nivel de los restaurantes. Puede ser premium, alto, medio o bajo.
    private int numeroParadas;      // Atributo que asigna el número de paradas consideradas para este tour.

    // Se implementa un constructor con parámetros. Hereda parámetros de la superclase "Servicio turístico".
    public  RutaGastronomica(String nombreServicio, String descripcionServicio, double precioServicio, String nivelGastronomico, int numeroParadas)
    {
        super(nombreServicio,descripcionServicio,precioServicio);
        this.nivelGastronomico = nivelGastronomico;
        this.numeroParadas = numeroParadas;
    }

    // Se implementa un constructor por defecto sin parámetros. Hereda parámetros de la superclase "Servicio turístico".
    public RutaGastronomica()
    {
        super();
        this.nivelGastronomico = "Sin nivel específico";
        this.numeroParadas = 0;
    }

    // Se implementan los métodos "Getters":

    /**
     * Método que devuelve el nivel gastronómico del servicio.
     * @return nivel gastronómico.
     */
    public String getNivelGastronomico() {return nivelGastronomico;}

    /**
     * Método que devuelve el numero de paradas del servicio.
     * @return número de paradas.
     */
    public int getNumeroParadas() {return numeroParadas;}

    // Se implementan los métodos "Setters":

    /**
     * Método que modifica el nivel gastronómico del servicio.
     * @param nivelGastronomico nuevo nivel gastronómico que se quiere asignar.
     */
    public void setNivelGastronomico(String nivelGastronomico) {this.nivelGastronomico = nivelGastronomico;}

    /**
     * Método que modifica el número de paradas del servicio.
     * @param numeroParadas nuevo nivel gastronómico que se quiere asignar.
     */
    public void setNumeroParadas(int numeroParadas) {this.numeroParadas = numeroParadas;}

    /**
     * Método que devuelve el prefijo específico de esta instancia.
     * @return prefijo de la instancia.
     */
    @Override
    protected String prefijoServicio() {return "RGAS";}

    /**
     * Método que muestra información del objeto en forma de cadena de texto.
     * Hereda parte de su contenido de la superclase
     * @return ID, nombre, descripción, precio, nivel gastronómico y paradas.
     */
    @Override
    public String toString()
    {
        return super.toString() + "Nivel gastronómico: " +getNivelGastronomico() +"\n"+"numero de paradas: " +getNumeroParadas() +"\n";
    }
}
