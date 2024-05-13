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

    public String getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setNumeroDocumento(String numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFechNac() {
        return fechNac;
    }

    public void setFechNac(Date fechNac) {
        this.fechNac = fechNac;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
