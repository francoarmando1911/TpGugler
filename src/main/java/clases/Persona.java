package clases;

import java.util.Date;

public class Persona implements Mostrable {

    private String numeroDocumento;
    private String apellido;
    private String nombre;
    private Date fechNac;
    private String domicilio;
    private String telefono;
    private String email;

    public Persona(String numeroDocumento, String apellido, String nombre, Date fechNac, String domicilio, String telefono, String email) {
        this.numeroDocumento = numeroDocumento;
        this.apellido = apellido;
        this.nombre = nombre;
        this.fechNac = fechNac;
        this.domicilio = domicilio;
        this.telefono = telefono;
        this.email = email;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("DNI: " + numeroDocumento);
        System.out.println("Apellido: " + apellido);
        System.out.println("Nombre: " + nombre);
        System.out.println("Fecha de Nacimiento: " + fechNac);
        System.out.println("Domicilio: " + domicilio);
        System.out.println("Teléfono: " + telefono);
        System.out.println("Email: " + email);
    }




}
