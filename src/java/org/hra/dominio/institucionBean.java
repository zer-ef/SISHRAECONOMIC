package org.hra.dominio;

import java.sql.Date;

import java.sql.Time;

/**
 *
 * @author Quichua
 */
public class institucionBean extends BaseBean {

    private int IdInstitucion;
    private String NombreIstitucion;
    private String IdTipoInstitucion;
    private String Lugar;
    private Date FechRegistra;
    private Date FechModifica;
    private boolean Estado;

    public int getIdInstitucion() {
        return IdInstitucion;
    }

    public void setIdInstitucion(int IdInstitucion) {
        this.IdInstitucion = IdInstitucion;
    }

    public String getNombreIstitucion() {
        return NombreIstitucion;
    }

    public void setNombreIstitucion(String NombreIstitucion) {
        this.NombreIstitucion = NombreIstitucion;
    }

    public String getIdTipoInstitucion() {
        return IdTipoInstitucion;
    }

    public void setIdTipoInstitucion(String IdTipoInstitucion) {
        this.IdTipoInstitucion = IdTipoInstitucion;
    }

    public String getLugar() {
        return Lugar;
    }

    public void setLugar(String Lugar) {
        this.Lugar = Lugar;
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
