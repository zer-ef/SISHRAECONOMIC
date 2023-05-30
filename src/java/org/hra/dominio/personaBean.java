package org.hra.dominio;

import java.sql.Date;

import java.sql.Time;

/**
 *
 * @author Quichua
 */
public class personaBean extends BaseBean {

    private int IdPersona;
    private String Nombre;
    private String ApePaterno;
    private String ApeMaterno;
    private String NumDocumento;
    private String TeleMovil;
    private String Email;
    private String Direccion;
    private Date FechRegistra;
    private Date FechModifica;
    private boolean Estado;

    public int getIdPersona() {
        return IdPersona;
    }

    public void setIdPersona(int IdPersona) {
        this.IdPersona = IdPersona;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApePaterno() {
        return ApePaterno;
    }

    public void setApePaterno(String ApePaterno) {
        this.ApePaterno = ApePaterno;
    }

    public String getApeMaterno() {
        return ApeMaterno;
    }

    public void setApeMaterno(String ApeMaterno) {
        this.ApeMaterno = ApeMaterno;
    }

    public String getNumDocumento() {
        return NumDocumento;
    }

    public void setNumDocumento(String NumDocumento) {
        this.NumDocumento = NumDocumento;
    }

    public String getTeleMovil() {
        return TeleMovil;
    }

    public void setTeleMovil(String TeleMovil) {
        this.TeleMovil = TeleMovil;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
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
