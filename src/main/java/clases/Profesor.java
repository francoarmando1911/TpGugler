package clases;

import java.util.Date;

public class Profesor {

    private String cuil;
    private Date fechaIngreso;

    public Profesor(String cuil, Date fechaIngreso) {
        this.cuil = cuil;
        this.fechaIngreso = fechaIngreso;
    }

    public String getCuil() {
        return cuil;
    }

    public void setCuil(String cuil) {
        this.cuil = cuil;
    }

    public Date getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }
}
