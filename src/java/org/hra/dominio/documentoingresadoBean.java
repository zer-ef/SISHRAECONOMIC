package org.hra.dominio;

import java.sql.Date;

import java.sql.Time;

/**
 *
 * @author Quichua
 */
public class documentoingresadoBean extends BaseBean {

    private int IdDocIngresado;
    private String NumeroRegistro;
    private int IdTipoDocumento;
    private int IdOregin;
    private String Asunto;
    private int IdRemitente;
    private String Destino;
    private Date FechaDespacho;
    private String Observacion;
    private Date FechRegistra;
    private Date FechModifica;
    private boolean Estado;

    public int getIdDocIngresado() {
        return IdDocIngresado;
    }

    public void setIdDocIngresado(int IdDocIngresado) {
        this.IdDocIngresado = IdDocIngresado;
    }

    public String getNumeroRegistro() {
        return NumeroRegistro;
    }

    public void setNumeroRegistro(String NumeroRegistro) {
        this.NumeroRegistro = NumeroRegistro;
    }

    public int getIdTipoDocumento() {
        return IdTipoDocumento;
    }

    public void setIdTipoDocumento(int IdTipoDocumento) {
        this.IdTipoDocumento = IdTipoDocumento;
    }

    public int getIdOregin() {
        return IdOregin;
    }

    public void setIdOregin(int IdOregin) {
        this.IdOregin = IdOregin;
    }

    public String getAsunto() {
        return Asunto;
    }

    public void setAsunto(String Asunto) {
        this.Asunto = Asunto;
    }

    public int getIdRemitente() {
        return IdRemitente;
    }

    public void setIdRemitente(int IdRemitente) {
        this.IdRemitente = IdRemitente;
    }

    public String getDestino() {
        return Destino;
    }

    public void setDestino(String Destino) {
        this.Destino = Destino;
    }

    public Date getFechaDespacho() {
        return FechaDespacho;
    }

    public void setFechaDespacho(Date FechaDespacho) {
        this.FechaDespacho = FechaDespacho;
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
