package org.hra.dominio;

import java.sql.Date;

import java.sql.Time;

/**
 *
 * @author Quichua
 */
public class medicoprofesionalBean extends BaseBean {

    private int IdMedico;
    private int IdPersona;
    private int IdInstitucion;
    private String CarreraProfesional;
    private String ServicioProfesional;
    private String Especialidad;
    private Date FechaInicioLabor;
    private String Observacion;
    private Date FechRegistra;
    private Date FechModifica;
    private boolean Estado;

    /*persona*/
    private String Nombre;
    private String ApePaterno;
    private String ApeMaterno;
    private String NumDocumento;
    private String TeleMovil;
    private String Email;
    private String Direccion;

    public int getIdMedico() {
        return IdMedico;
    }

    public void setIdMedico(int IdMedico) {
        this.IdMedico = IdMedico;
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

    public String getServicioProfesional() {
        return ServicioProfesional;
    }

    public void setServicioProfesional(String ServicioProfesional) {
        this.ServicioProfesional = ServicioProfesional;
    }

    public String getEspecialidad() {
        return Especialidad;
    }

    public void setEspecialidad(String Especialidad) {
        this.Especialidad = Especialidad;
    }

    public Date getFechaInicioLabor() {
        return FechaInicioLabor;
    }

    public void setFechaInicioLabor(Date FechaInicioLabor) {
        this.FechaInicioLabor = FechaInicioLabor;
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
}
