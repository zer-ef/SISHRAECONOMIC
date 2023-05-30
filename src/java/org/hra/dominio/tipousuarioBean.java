package org.hra.dominio;

import java.sql.Date;

import java.sql.Time;

/**
 *
 * @author Quichua
 */
public class tipousuarioBean extends BaseBean {

    private int IdTipoUsuario;
    private String Abreviatura;
    private String Denominacion;
    private String Observacion;
    private Date FechRegistra;
    private Date FechModifica;
    private boolean Estado;

    public int getIdTipoUsuario() {
        return IdTipoUsuario;
    }

    public void setIdTipoUsuario(int IdTipoUsuario) {
        this.IdTipoUsuario = IdTipoUsuario;
    }

    public String getAbreviatura() {
        return Abreviatura;
    }

    public void setAbreviatura(String Abreviatura) {
        this.Abreviatura = Abreviatura;
    }

    public String getDenominacion() {
        return Denominacion;
    }

    public void setDenominacion(String Denominacion) {
        this.Denominacion = Denominacion;
    }

    public String getObservacion() {
        return Observacion;
    }

    public void setObservacion(String Observacion) {
        this.Observacion = Observacion;
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
