package org.hra.dominio;

import java.sql.Date;

import java.sql.Time;

/**
 *
 * @author Quichua
 */
public class personaladministrativoBean extends BaseBean {

    private int IdPersonal;
    private int IdPersona;
    private int IdInstitucion;
    private String CarreraProfesional;
    private Date FechRegistra;
    private Date FechModifica;
    private boolean Estado;

    public int getIdPersonal() {
        return IdPersonal;
    }

    public void setIdPersonal(int IdPersonal) {
        this.IdPersonal = IdPersonal;
    }

    public int getIdPersona() {
        return IdPersona;
    }

    public void setIdPersona(int IdPersona) {
        this.IdPersona = IdPersona;
    }

    public int getIdInstitucion() {
        return IdInstitucion;
    }

    public void setIdInstitucion(int IdInstitucion) {
        this.IdInstitucion = IdInstitucion;
    }

    public String getCarreraProfesional() {
        return CarreraProfesional;
    }

    public void setCarreraProfesional(String CarreraProfesional) {
        this.CarreraProfesional = CarreraProfesional;
    }

    public Date getFechRegistra() {
        return FechRegistra;
    }

    public void setFechRegistra(Date FechRegistra) {
        this.FechRegistra = FechRegistra;
    }

    public Date getFechModifica() {
        return FechModifica;
    }

    public void setFechModifica(Date FechModifica) {
        this.FechModifica = FechModifica;
    }

    public Boolean getEstado() {
        return Estado;
    }

    public void setEstado(Boolean Estado) {
        this.Estado = Estado;
    }
}
