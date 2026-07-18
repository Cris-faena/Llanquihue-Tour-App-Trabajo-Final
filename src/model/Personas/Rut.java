package model.Personas;

/**
 * Clase Rut que representa un identificador único de cada entidad.
 */
public class Rut
{
    private String numero;  // atributo que añade un número como RUT

    /**
     * Método que valida si el Rut ingresado cumple con el formato establecido.
     * @param numeroRut número de "Rut" que se quiere asignar a un objeto.
     */
    public Rut(String numeroRut)
    {
        if (!numeroRut.matches("[0-9]{7,9}+-[0-9kK]"))
        {
            throw new IllegalArgumentException("El RUT ingresado no es válido. Se debe ingresar sin puntos, con guión y número verificador");
        }
        this.numero = numeroRut;
    }
    // Se implementan los Métodos "Getters":

    /**
     * Método para obtener el valor asignado al "Rut" del objeto creado.
     * @return "Rut" del objeto creado
     */
    public String getNumero() {return numero;}

    /**
     * Método para modificar el "Rut" asignado al objeto creado.
     * @param numeroRut nuevo "Rut" que se quiere asignar al objeto.
     */
    public void setNumero(String numeroRut) {this.numero = numeroRut;}

    // Se implementaun Método "toString":

    /**
     * Método que devuelve la información del objeto en una cadena de texto
     * @return "Rut" del objeto creado.
     */
    @Override
    public String toString()
    {
        return getNumero();
    }
}
