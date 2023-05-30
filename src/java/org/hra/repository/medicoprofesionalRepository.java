package org.hra.repository;

import org.hra.dominio.medicoprofesionalBean;
import org.hra.properties.DBConnection;
import java.sql.Connection;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import org.hra.dominio.personaBean;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author Quichua
 */
public class medicoprofesionalRepository {

    @Autowired
    public boolean fnIsmedicoprofesionalBean(medicoprofesionalBean pomedicoprofesionalBean) throws Exception {
        medicoprofesionalBean omedicoprofesionalBean = null;
        Connection cn = null;
        ResultSet rs = null;
        CallableStatement cs = null;
        try {
            cn = DBConnection.getInstance().openConnection();
            cn.setAutoCommit(false);
            cs = cn.prepareCall("{CALL bdhrsis.usp_medicoprofesional_lst(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ? )}");
            cs.setInt(1, pomedicoprofesionalBean.getIOps());
            cs.registerOutParameter(2, java.sql.Types.BOOLEAN);
            cs.setInt(3, pomedicoprofesionalBean.getIdMedico());
            cs.setInt(4, pomedicoprofesionalBean.getIdPersona());
            cs.setInt(5, pomedicoprofesionalBean.getIdInstitucion());
            cs.setString(6, pomedicoprofesionalBean.getCarreraProfesional());
            cs.setString(7, pomedicoprofesionalBean.getServicioProfesional());
            cs.setString(8, pomedicoprofesionalBean.getEspecialidad());
            cs.setDate(9, pomedicoprofesionalBean.getFechaInicioLabor());
            cs.setString(10, pomedicoprofesionalBean.getObservacion());
            cs.setDate(11, pomedicoprofesionalBean.getFechRegistra());
            cs.setDate(12, pomedicoprofesionalBean.getFechModifica());
            cs.setBoolean(13, pomedicoprofesionalBean.getEstado());
            rs = cs.executeQuery();
            while (rs.next()) {
                omedicoprofesionalBean = new medicoprofesionalBean();
                omedicoprofesionalBean.setEstado(rs.getBoolean("IdMedico"));
            }
            cn.commit();
            cn.setAutoCommit(true);
        } catch (SQLException ex) {
            cn.rollback();
            ex.printStackTrace();
        } finally {
            rs.close();
            rs = null;
            cn.close();
            cn = null;
        }
        return omedicoprofesionalBean != null;
    }

    @Autowired
    public List fnGetListmedicoprofesionalBean(medicoprofesionalBean pomedicoprofesionalBean) throws Exception {
        List list = new LinkedList();
        Connection cn = null;
        ResultSet rs = null;
        CallableStatement cs = null;
        try {
            cn = DBConnection.getInstance().openConnection();
            cn.setAutoCommit(false);
            cs = cn.prepareCall("{CALL bdhrsis.usp_medicoprofesional_lst(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ? )}");
            cs.setInt(1, pomedicoprofesionalBean.getIOps());
            cs.registerOutParameter(2, java.sql.Types.BOOLEAN);
            cs.setInt(3, pomedicoprofesionalBean.getIdMedico());
            cs.setInt(4, pomedicoprofesionalBean.getIdPersona());
            cs.setInt(5, pomedicoprofesionalBean.getIdInstitucion());
            cs.setString(6, pomedicoprofesionalBean.getCarreraProfesional());
            cs.setString(7, pomedicoprofesionalBean.getServicioProfesional());
            cs.setString(8, pomedicoprofesionalBean.getEspecialidad());
            cs.setDate(9, pomedicoprofesionalBean.getFechaInicioLabor());
            cs.setString(10, pomedicoprofesionalBean.getObservacion());
            cs.setDate(11, pomedicoprofesionalBean.getFechRegistra());
            cs.setDate(12, pomedicoprofesionalBean.getFechModifica());
            cs.setBoolean(13, pomedicoprofesionalBean.getEstado());
            rs = cs.executeQuery();
            while (rs.next()) {
                Object[] obj = {rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9), rs.getString(10), rs.getString(11)};
                //Object[] obj = {rs.getInt(1), rs.getInt(2), rs.getInt(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getDate(7), rs.getString(8), rs.getDate(9), rs.getDate(10), rs.getBoolean(11)}; 
                list.add(obj);
            }
            cn.commit();
            cn.setAutoCommit(true);
        } catch (SQLException ex) {
            cn.rollback();
            ex.printStackTrace();
        } finally {
            rs.close();
            rs = null;
            cn.close();
            cn = null;
        }
        return list;
    }

    @Autowired
    public List fnGridmedicoprofesionalBean(medicoprofesionalBean pomedicoprofesionalBean) throws Exception {
        List lista = new LinkedList();
        Connection cn = null;
        ResultSet rs = null;
        CallableStatement cs = null;
        try {
            cn = DBConnection.getInstance().openConnection();
            cn.setAutoCommit(false);
            cs = cn.prepareCall("{CALL bdhrsis.usp_medicoprofesional_lst(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ? )}");
            cs.setInt(1, pomedicoprofesionalBean.getIOps());
            cs.registerOutParameter(2, java.sql.Types.BOOLEAN);
            cs.setInt(3, pomedicoprofesionalBean.getIdPersona());
            cs.setString(4, pomedicoprofesionalBean.getNombre());
            cs.setString(5, pomedicoprofesionalBean.getApePaterno());
            cs.setString(6, pomedicoprofesionalBean.getApeMaterno());
            cs.setString(7, pomedicoprofesionalBean.getNumDocumento());
            cs.setString(8, pomedicoprofesionalBean.getTeleMovil());
            cs.setString(9, pomedicoprofesionalBean.getEmail());
            cs.setString(10, pomedicoprofesionalBean.getDireccion());

            cs.setInt(11, pomedicoprofesionalBean.getIdMedico());
            cs.setInt(12, pomedicoprofesionalBean.getIdInstitucion());
            cs.setString(13, pomedicoprofesionalBean.getCarreraProfesional());
            cs.setString(14, pomedicoprofesionalBean.getServicioProfesional());
            cs.setString(15, pomedicoprofesionalBean.getEspecialidad());
            cs.setDate(16, pomedicoprofesionalBean.getFechaInicioLabor());
            cs.setString(17, pomedicoprofesionalBean.getObservacion());
            cs.setDate(18, pomedicoprofesionalBean.getFechRegistra());
            cs.setDate(19, pomedicoprofesionalBean.getFechModifica());
            cs.setBoolean(20, pomedicoprofesionalBean.getEstado());
            rs = cs.executeQuery();
            while (rs.next()) {
                Object[] obj = {rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9), rs.getString(10), rs.getString(11)};
                //Object[] obj = {rs.getInt(1), rs.getInt(2), rs.getInt(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getDate(7), rs.getString(8), rs.getDate(9), rs.getDate(10), rs.getBoolean(11)}; 
                lista.add(obj);
            }
            cn.commit();
            cn.setAutoCommit(true);
        } catch (SQLException ex) {
            cn.rollback();
            ex.printStackTrace();
        } finally {
            rs.close();
            rs = null;
            cn.close();
            cn = null;
        }
        return lista;
    }

    @Autowired
    public ArrayList<medicoprofesionalBean> fnAutocompletemedicoprofesionalBean(medicoprofesionalBean pomedicoprofesionalBean) throws Exception {
        ArrayList<medicoprofesionalBean> listamedicoprofesionalBean = new ArrayList<medicoprofesionalBean>();
        Connection cn = null;
        ResultSet rs = null;
        CallableStatement cs = null;
        try {
            cn = DBConnection.getInstance().openConnection();
            cn.setAutoCommit(false);
            cs = cn.prepareCall("{CALL bdhrsis.usp_medicoprofesional_lst(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ? )}");
            cs.setInt(1, pomedicoprofesionalBean.getIOps());
            cs.registerOutParameter(2, java.sql.Types.BOOLEAN);
            cs.setInt(3, pomedicoprofesionalBean.getIdMedico());
            cs.setInt(4, pomedicoprofesionalBean.getIdPersona());
            cs.setInt(5, pomedicoprofesionalBean.getIdInstitucion());
            cs.setString(6, pomedicoprofesionalBean.getCarreraProfesional());
            cs.setString(7, pomedicoprofesionalBean.getServicioProfesional());
            cs.setString(8, pomedicoprofesionalBean.getEspecialidad());
            cs.setDate(9, pomedicoprofesionalBean.getFechaInicioLabor());
            cs.setString(10, pomedicoprofesionalBean.getObservacion());
            cs.setDate(11, pomedicoprofesionalBean.getFechRegistra());
            cs.setDate(12, pomedicoprofesionalBean.getFechModifica());
            cs.setBoolean(13, pomedicoprofesionalBean.getEstado());
            rs = cs.executeQuery();
            while (rs.next()) {
                medicoprofesionalBean omedicoprofesionalBean = new medicoprofesionalBean();
                omedicoprofesionalBean.setIdMedico(rs.getInt("IdMedico"));
                omedicoprofesionalBean.setIdPersona(rs.getInt("IdPersona"));
                omedicoprofesionalBean.setIdInstitucion(rs.getInt("IdInstitucion"));
                omedicoprofesionalBean.setCarreraProfesional(rs.getString("CarreraProfesional"));
                omedicoprofesionalBean.setServicioProfesional(rs.getString("ServicioProfesional"));
                omedicoprofesionalBean.setEspecialidad(rs.getString("Especialidad"));
                omedicoprofesionalBean.setFechaInicioLabor(rs.getDate("FechaInicioLabor"));
                omedicoprofesionalBean.setObservacion(rs.getString("Observacion"));
                omedicoprofesionalBean.setFechRegistra(rs.getDate("FechRegistra"));
                omedicoprofesionalBean.setFechModifica(rs.getDate("FechModifica"));
                omedicoprofesionalBean.setEstado(rs.getBoolean("Estado"));
                listamedicoprofesionalBean.add(omedicoprofesionalBean);
            }
            cn.commit();
            cn.setAutoCommit(true);
        } catch (SQLException ex) {
            cn.rollback();
            ex.printStackTrace();
        } finally {
            rs.close();
            rs = null;
            cn.close();
            cn = null;
        }
        return listamedicoprofesionalBean;
    }

    @Autowired
    public medicoprofesionalBean fnGetmedicoprofesionalBean(medicoprofesionalBean pomedicoprofesionalBean) throws Exception {
        medicoprofesionalBean omedicoprofesionalBean = null;
        Connection cn = null;
        ResultSet rs = null;
        CallableStatement cs = null;
        try {
            cn = DBConnection.getInstance().openConnection();
            cn.setAutoCommit(false);
            cs = cn.prepareCall("{CALL bdhrsis.usp_medicoprofesional_lst(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ? )}");
            cs.setInt(1, pomedicoprofesionalBean.getIOps());
            cs.registerOutParameter(2, java.sql.Types.BOOLEAN);
            cs.setInt(3, pomedicoprofesionalBean.getIdPersona());
            cs.setString(4, pomedicoprofesionalBean.getNombre());
            cs.setString(5, pomedicoprofesionalBean.getApePaterno());
            cs.setString(6, pomedicoprofesionalBean.getApeMaterno());
            cs.setString(7, pomedicoprofesionalBean.getNumDocumento());
            cs.setString(8, pomedicoprofesionalBean.getTeleMovil());
            cs.setString(9, pomedicoprofesionalBean.getEmail());
            cs.setString(10, pomedicoprofesionalBean.getDireccion());

            cs.setInt(11, pomedicoprofesionalBean.getIdMedico());
            cs.setInt(12, pomedicoprofesionalBean.getIdInstitucion());
            cs.setString(13, pomedicoprofesionalBean.getCarreraProfesional());
            cs.setString(14, pomedicoprofesionalBean.getServicioProfesional());
            cs.setString(15, pomedicoprofesionalBean.getEspecialidad());
            cs.setDate(16, pomedicoprofesionalBean.getFechaInicioLabor());
            cs.setString(17, pomedicoprofesionalBean.getObservacion());
            cs.setDate(18, pomedicoprofesionalBean.getFechRegistra());
            cs.setDate(19, pomedicoprofesionalBean.getFechModifica());
            cs.setBoolean(20, pomedicoprofesionalBean.getEstado());
            rs = cs.executeQuery();
            while (rs.next()) {
                omedicoprofesionalBean = new medicoprofesionalBean();
                omedicoprofesionalBean.setIdPersona(rs.getInt("IdPersona"));
                omedicoprofesionalBean.setNombre(rs.getString("Nombre"));
                omedicoprofesionalBean.setApePaterno(rs.getString("ApePaterno"));
                omedicoprofesionalBean.setApeMaterno(rs.getString("ApeMaterno"));
                omedicoprofesionalBean.setNumDocumento(rs.getString("NumDocumento"));
                omedicoprofesionalBean.setTeleMovil(rs.getString("TeleMovil"));
                omedicoprofesionalBean.setEmail(rs.getString("Email"));
                omedicoprofesionalBean.setDireccion(rs.getString("Direccion"));

                omedicoprofesionalBean.setIdMedico(rs.getInt("IdMedico"));
                omedicoprofesionalBean.setIdInstitucion(rs.getInt("IdInstitucion"));
                omedicoprofesionalBean.setCarreraProfesional(rs.getString("CarreraProfesional"));
                omedicoprofesionalBean.setServicioProfesional(rs.getString("ServicioProfesional"));
                omedicoprofesionalBean.setEspecialidad(rs.getString("Especialidad"));
                omedicoprofesionalBean.setFechaInicioLabor(rs.getDate("FechaInicioLabor"));
                omedicoprofesionalBean.setObservacion(rs.getString("Observacion"));
                omedicoprofesionalBean.setFechRegistra(rs.getDate("FechRegistra"));
                omedicoprofesionalBean.setFechModifica(rs.getDate("FechModifica"));
                omedicoprofesionalBean.setEstado(rs.getBoolean("Estado"));
            }
            cn.commit();
            cn.setAutoCommit(true);
        } catch (SQLException ex) {
            cn.rollback();
            ex.printStackTrace();
        } finally {
            rs.close();
            rs = null;
            cn.close();
            cn = null;
        }
        return omedicoprofesionalBean;
    }

    @Autowired
    public boolean fnInsertarmedicoprofesionalBean(personaBean popersonaBean, medicoprofesionalBean pomedicoprofesionalBean) throws Exception {
        boolean resultado = false;
        Connection cn = null;
        CallableStatement cs = null;
        try {
            cn = DBConnection.getInstance().openConnection();
            cn.setAutoCommit(false);
            cs = cn.prepareCall("{CALL bdhrsis.usp_medicoprofesional_ins(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ? )}");
            cs.setInt(1, popersonaBean.getIOps());
            cs.registerOutParameter(2, java.sql.Types.BOOLEAN);
            cs.setInt(3, popersonaBean.getIdPersona());
            cs.setString(4, popersonaBean.getNombre());
            cs.setString(5, popersonaBean.getApePaterno());
            cs.setString(6, popersonaBean.getApeMaterno());
            cs.setString(7, popersonaBean.getNumDocumento());
            cs.setString(8, popersonaBean.getTeleMovil());
            cs.setString(9, popersonaBean.getEmail());
            cs.setString(10, popersonaBean.getDireccion());

            cs.setInt(11, pomedicoprofesionalBean.getIdMedico());
            cs.setInt(12, pomedicoprofesionalBean.getIdInstitucion());
            cs.setString(13, pomedicoprofesionalBean.getCarreraProfesional());
            cs.setString(14, pomedicoprofesionalBean.getServicioProfesional());
            cs.setString(15, pomedicoprofesionalBean.getEspecialidad());
            cs.setDate(16, pomedicoprofesionalBean.getFechaInicioLabor());
            cs.setString(17, pomedicoprofesionalBean.getObservacion());
            cs.setDate(18, pomedicoprofesionalBean.getFechRegistra());
            cs.setDate(19, pomedicoprofesionalBean.getFechModifica());
            cs.setBoolean(20, true);
            cs.execute();
            resultado = cs.getBoolean(2);
            cs.close();
            cs = null;
            cn.commit();
            cn.setAutoCommit(true);
        } catch (SQLException ex) {
            cn.rollback();
            ex.printStackTrace();
            resultado = false;
        } finally {
            cn.close();
            cn = null;
        }
        return resultado;
    }

    @Autowired
    public boolean fnEliminarmedicoprofesionalBean(personaBean popersonaBean, medicoprofesionalBean pomedicoprofesionalBean) throws Exception {
        boolean resultado = false;
        Connection cn = null;
        CallableStatement cs = null;
        try {
            cn = DBConnection.getInstance().openConnection();
            cn.setAutoCommit(false);
            cs = cn.prepareCall("{CALL bdhrsis.usp_medicoprofesional_upd(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ? )}");
            cs.setInt(1, popersonaBean.getIOps());
            cs.registerOutParameter(2, java.sql.Types.BOOLEAN);
            cs.setInt(3, popersonaBean.getIdPersona());
            cs.setString(4, popersonaBean.getNombre());
            cs.setString(5, popersonaBean.getApePaterno());
            cs.setString(6, popersonaBean.getApeMaterno());
            cs.setString(7, popersonaBean.getNumDocumento());
            cs.setString(8, popersonaBean.getTeleMovil());
            cs.setString(9, popersonaBean.getEmail());
            cs.setString(10, popersonaBean.getDireccion());

            cs.setInt(11, pomedicoprofesionalBean.getIdMedico());
            cs.setInt(12, pomedicoprofesionalBean.getIdInstitucion());
            cs.setString(13, pomedicoprofesionalBean.getCarreraProfesional());
            cs.setString(14, pomedicoprofesionalBean.getServicioProfesional());
            cs.setString(15, pomedicoprofesionalBean.getEspecialidad());
            cs.setDate(16, pomedicoprofesionalBean.getFechaInicioLabor());
            cs.setString(17, pomedicoprofesionalBean.getObservacion());
            cs.setDate(18, pomedicoprofesionalBean.getFechRegistra());
            cs.setDate(19, pomedicoprofesionalBean.getFechModifica());
            cs.setBoolean(20, false);
            cs.execute();
            resultado = cs.getBoolean(2);
            cs.close();
            cs = null;
            cn.commit();
            cn.setAutoCommit(true);
        } catch (SQLException ex) {
            cn.rollback();
            ex.printStackTrace();
            resultado = false;
        } finally {
            cn.close();
            cn = null;
        }
        return resultado;
    }

    @Autowired
    public boolean fnActualizarmedicoprofesionalBean(personaBean popersonaBean, medicoprofesionalBean pomedicoprofesionalBean) throws Exception {
        boolean resultado = false;
        Connection cn = null;
        CallableStatement cs = null;
        try {
            cn = DBConnection.getInstance().openConnection();
            cn.setAutoCommit(false);
            cs = cn.prepareCall("{CALL bdhrsis.usp_medicoprofesional_upd(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ? )}");
            cs.setInt(1, popersonaBean.getIOps());
            cs.registerOutParameter(2, java.sql.Types.BOOLEAN);
            cs.setInt(3, popersonaBean.getIdPersona());
            cs.setString(4, popersonaBean.getNombre());
            cs.setString(5, popersonaBean.getApePaterno());
            cs.setString(6, popersonaBean.getApeMaterno());
            cs.setString(7, popersonaBean.getNumDocumento());
            cs.setString(8, popersonaBean.getTeleMovil());
            cs.setString(9, popersonaBean.getEmail());
            cs.setString(10, popersonaBean.getDireccion());

            cs.setInt(11, pomedicoprofesionalBean.getIdMedico());
            cs.setInt(12, pomedicoprofesionalBean.getIdInstitucion());
            cs.setString(13, pomedicoprofesionalBean.getCarreraProfesional());
            cs.setString(14, pomedicoprofesionalBean.getServicioProfesional());
            cs.setString(15, pomedicoprofesionalBean.getEspecialidad());
            cs.setDate(16, pomedicoprofesionalBean.getFechaInicioLabor());
            cs.setString(17, pomedicoprofesionalBean.getObservacion());
            cs.setDate(18, pomedicoprofesionalBean.getFechRegistra());
            cs.setDate(19, pomedicoprofesionalBean.getFechModifica());
            cs.setBoolean(20, true);
            cs.execute();
            resultado = cs.getBoolean(2);
            cs.close();
            cs = null;
            cn.commit();
            cn.setAutoCommit(true);
            resultado = true;
        } catch (SQLException ex) {
            cn.rollback();
            ex.printStackTrace();
            resultado = false;
        } finally {
            cn.close();
            cn = null;
        }
        return resultado;
    }
}
