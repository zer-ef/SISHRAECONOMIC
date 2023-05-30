package org.hra.dominio;

import java.sql.Date;

import java.sql.Time;

/**
 *
 * @author Quichua
 */
public class ingresoeconomicoBean extends BaseBean {

    private int IdIngresoEco;
    private String NumBoleta;
    private Date FechaPago;
    private int IdParticipante;
    private int IdTipoInstitucion;
    private String ConceptoPago;
    private double Monto;
    private String Observacion;
    private Date FechRegistra;
    private Date FechModifica;
    private boolean Estado;

    public int getIdIngresoEco() {
        return IdIngresoEco;
    }

    public void setIdIngresoEco(int IdIngresoEco) {
        this.IdIngresoEco = IdIngresoEco;
    }

    public String getNumBoleta() {
        return NumBoleta;
    }

    public void setNumBoleta(String NumBoleta) {
        this.NumBoleta = NumBoleta;
    }

    public Date getFechaPago() {
        return FechaPago;
    }

    public void setFechaPago(Date FechaPago) {
        this.FechaPago = FechaPago;
    }

    public int getIdParticipante() {
        return IdParticipante;
    }

    public void setIdParticipante(int IdParticipante) {
        this.IdParticipante = IdParticipante;
    }

    public int getIdTipoInstitucion() {
        return IdTipoInstitucion;
    }

    public void setIdTipoInstitucion(int IdTipoInstitucion) {
        this.IdTipoInstitucion = IdTipoInstitucion;
    }

    public String getConceptoPago() {
        return ConceptoPago;
    }

    public void setConceptoPago(String ConceptoPago) {
        this.ConceptoPago = ConceptoPago;
    }

    public double getMonto() {
        return Monto;
    }

    public void setMonto(double Monto) {
        this.Monto = Monto;
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
