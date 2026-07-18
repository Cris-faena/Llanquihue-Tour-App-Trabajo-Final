package model.Personas;

import util.ValidadorEmail;

/**
 * Clase Email que representa una dirección de correo electrónico.
 */
public class Email {
    private String emailDireccion;  // Atributo de la clase para asignar una dirección Email.

    // Constructor por defecto de la clase Email, con validador.
    public Email(String emailDireccion) {
        if (!ValidadorEmail.validar(emailDireccion)) {
            throw new IllegalArgumentException("El email no es válido: " + emailDireccion);
        }
        this.emailDireccion = emailDireccion.trim().toLowerCase();
    }

    // Se implementa un método "Getter":
    /**
     * Método que devuelve el "Email" del objeto creado.
     * @return "Email" del objeto creado.
     */
    public String getEmailDireccion() {return emailDireccion;}

    // Se implementa un método "Setter":
    /**
     * Método que modifica el "Email" asignado al objeto.
     *
     * @param nuevaEmailDireccion nueva dirección "Email" que se quiere asignar.
     */
    public void setEmailDireccion(String nuevaEmailDireccion)
    {
        // validador de Email de los datos ingresados antes de modificar:
        if (!ValidadorEmail.validar(nuevaEmailDireccion)) {
            throw new IllegalArgumentException("El Email no es válido: " + nuevaEmailDireccion);
        }
        this.emailDireccion = nuevaEmailDireccion.trim().toLowerCase();
    }
    // Se implementa un método toString para visualizar información del objeto:
    /**
     * Método para visualizar en una cadena de texto el "Email" asignado al objeto
     * @return "Email" en una cadena de texto.
     */
    @Override
    public String toString()
    {
        return getEmailDireccion();
    }
}