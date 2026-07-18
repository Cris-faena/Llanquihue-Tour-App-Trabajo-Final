package model.Personas;

/**
 * Clase que representa una dirección.
 */
public class Direccion
{
    private String calle;       // Atributo para asignar una "calle"
    private String ciudad;      // Atributo para asignar una "ciudad"
    private String region;      // Atributo para asignar una "región"

    // Se implementa un constructor con parámetros:
    public Direccion(String calle, String ciudad, String region)
    {
        this.calle = calle;
        this.ciudad = ciudad;
        this.region = region;
    }

    // Se implementa un constructor sin parámetros por defecto de la clase "Dirección".
    public Direccion()
    {
        this.calle = "sin calle asignada";
        this.ciudad = "sin ciudad asignada";
        this.region = "sin region asignada";
    }

    // Se implementan métodos "Getters":
    /**
     * Método para devolver el valor de la calle del objeto creado.
     * @return la "calle" asignada al objeto.
     */
    public String getCalle()
    {
        return calle;
    }
    /**
     * Método para devolver el valor de la "ciudad" del objeto creado.
     * @return la "ciudad" asignada al objeto.
     */
    public String  getCiudad()
    {
        return ciudad;
    }
    /**
     * Método para devolver el valor de la "región" del objeto creado.
     * @return la "región" asignada al objeto.
     */
    public String getRegion()
    {
        return region;
    }

    // Se implementan métodos "Setters":
    /**
     * Método para modificar la "calle" del objeto creado.
     * @param nuevaCalle nuevo valor que se desea asignar a la "calle".
     */
    public void setCalle(String nuevaCalle)
    {
        this.calle = nuevaCalle;
    }
    /**
     * Método para modificar la "ciudad" del objeto creado.
     * @param nuevaCiudad nuevo valor que se desea asignar a la "ciudad".
     */
    public void setCiudad(String nuevaCiudad)
    {
        this.ciudad = nuevaCiudad;
    }
    /**
     * Método para modificar la "región" del objeto creado.
     * @param nuevaRegion nuevo valor que se desea asignar a la "región".
     */
    public void setRegion(String nuevaRegion)
    {
        this.region = nuevaRegion;
    }

    // Se implementa un método "toString" para mostrar la informacion del objeto
    /**
     * Método para devolver información del objeto en forma de cadena de texto.
     * @return calle, ciudad y región del objeto en una cadena de texto
     */
    @Override
    public String toString()
    {
        return getCalle() + "," + getCiudad() + "," + getRegion();
    }
}

