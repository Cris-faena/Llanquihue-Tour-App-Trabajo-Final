package model.Personas;

import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;
/**
 * Inteface que permite registrar la fecha de creación de los objetos:
 */
public interface FechaCreacion
{
    /**
     * Se implementa un método para estampar la fecha de creación de los objetos.
     */
    void estamparFechaDeCreacion();

    /**
     * Se implementa un método "Getter" para obtener la información de la fecha de creación del objeto.
     * @return fecha de creación.
     */
    public String getFechaCreacion();

    /**
     * Método que devuelve una cadena de texto con información de la fecha de creación
     * @return cadena de texto con la "fecha de creación".
     */
    public default String mostrarFechaDeCreacion()
    {
        return "Se debe implementar una cadena de texto acá";
    }
}
