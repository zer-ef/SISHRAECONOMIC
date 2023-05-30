package org.hra.repository;

import org.hra.dominio.internoBean;
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
public class internoRepository {

    @Autowired
    public boolean fnIsinternoBean(internoBean pointernoBean) throws Exception {
        internoBean ointernoBean = null;
        Connection cn = null;
        ResultSet rs = null;
        CallableStatement cs = null;
        try {
            cn = DBConnection.getInstance().openConnection();
            cn.setAutoCommit(false);
            cs = cn.prepareCall("{CALL bdhrsis.usp_interno_lst(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ? )}");
            cs.setInt(1, pointernoBean.getIOps());
            cs.registerOutParameter(2, java.sql.Types.BOOLEAN);
            cs.setInt(3, pointernoBean.getIdInterno());
            cs.setInt(4, pointernoBean.getIdPersona());
            cs.setInt(5, pointernoBean.getIdInstitucion());
            cs.setString(6, pointernoBean.getCarreraProfesional());
            cs.setDate(7, pointernoBean.getFechaInicio());
            cs.setDate(8, pointernoBean.getFechaTernino());
            cs.setString(9, pointernoBean.getTipoPago());
            cs.setDate(10, pointernoBean.getFechRegistra());
            cs.setDate(11, pointernoBean.getFechModifica());
            cs.setBoolean(12, pointernoBean.getEstado());
            rs = cs.executeQuery();
            while (rs.next()) {
                ointernoBean = new internoBean();
                ointernoBean.setEstado(rs.getBoolean("IdInterno"));
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
        return ointernoBean != null;
    }

    @Autowired
    public List fnGetListinternoBean(internoBean pointernoBean) throws Exception {
        List list = new LinkedList();
        Connection cn = null;
        ResultSet rs = null;
        CallableStatement cs = null;
        try {
            cn = DBConnection.getInstance().openConnection();
            cn.setAutoCommit(false);
            cs = cn.prepareCall("{CALL bdhrsis.usp_interno_lst(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ? )}");
            cs.setInt(1, pointernoBean.getIOps());
            cs.registerOutParameter(2, java.sql.Types.BOOLEAN);
            cs.setInt(3, pointernoBean.getIdInterno());
            cs.setInt(4, pointernoBean.getIdPersona());
            cs.setInt(5, pointernoBean.getIdInstitucion());
            cs.setString(6, pointernoBean.getCarreraProfesional());
            cs.setDate(7, pointernoBean.getFechaInicio());
            cs.setDate(8, pointernoBean.getFechaTernino());
            cs.setString(9, pointernoBean.getTipoPago());
            cs.setDate(10, pointernoBean.getFechRegistra());
            cs.setDate(11, pointernoBean.getFechModifica());
            cs.setBoolean(12, pointernoBean.getEstado());
            rs = cs.executeQuery();
            while (rs.next()) {
                Object[] obj = {rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9), rs.getString(10)};
                //Object[] obj = {rs.getInt(1), rs.getInt(2), rs.getInt(3), rs.getString(4), rs.getDate(5), rs.getDate(6), rs.getString(7), rs.getDate(8), rs.getDate(9), rs.getBoolean(10)}; 
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
    public List fnGridinternoBean(internoBean pointernoBean) throws Exception {
        List lista = new LinkedList();
        Connection cn = null;
        ResultSet rs = null;
        CallableStatement cs = null;
        try {
            cn = DBConnection.getInstance().openConnection();
            cn.setAutoCommit(false);
            cs = cn.prepareCall("{CALL bdhrsis.usp_interno_lst(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ? )}");
            cs.setInt(1, pointernoBean.getIOps());
            cs.registerOutParameter(2, java.sql.Types.BOOLEAN);
            cs.setInt(3, pointernoBean.getIdInterno());
            cs.setInt(4, pointernoBean.getIdPersona());
            cs.setString(5, pointernoBean.getNombre());
            cs.setString(6, pointernoBean.getApePaterno());
            cs.setString(7, pointernoBean.getApeMaterno());
            cs.setString(8, pointernoBean.getNumDocumento());
            cs.setString(9, pointernoBean.getTeleMovil());
            cs.setString(10, pointernoBean.getEmail());
            cs.setString(11, pointernoBean.getDireccion());
            cs.setInt(12, pointernoBean.getIdInstitucion());
            cs.setString(13, pointernoBean.getCarreraProfesional());
            cs.setDate(14, pointernoBean.getFechaInicio());
            cs.setDate(15, pointernoBean.getFechaTernino());
            cs.setString(16, pointernoBean.getTipoPago());
            cs.setDate(17, pointernoBean.getFechRegistra());
            cs.setDate(18, pointernoBean.getFechModifica());
            cs.setBoolean(19, pointernoBean.getEstado());
            rs = cs.executeQuery();
            while (rs.next()) {
                Object[] obj = {rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9), rs.getString(10)};
                //Object[] obj = {rs.getInt(1), rs.getInt(2), rs.getInt(3), rs.getString(4), rs.getDate(5), rs.getDate(6), rs.getString(7), rs.getDate(8), rs.getDate(9), rs.getBoolean(10)}; 
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
    public ArrayList<internoBean> fnAutocompleteinternoBean(internoBean pointernoBean) throws Exception {
        ArrayList<internoBean> listainternoBean = new ArrayList<internoBean>();
        Connection cn = null;
        ResultSet rs = null;
        CallableStatement cs = null;
        try {
            cn = DBConnection.getInstance().openConnection();
            cn.setAutoCommit(false);
            cs = cn.prepareCall("{CALL bdhrsis.usp_interno_lst(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ? )}");
            cs.setInt(1, pointernoBean.getIOps());
            cs.registerOutParameter(2, java.sql.Types.BOOLEAN);
            cs.setInt(3, pointernoBean.getIdInterno());
            cs.setInt(4, pointernoBean.getIdPersona());
            cs.setInt(5, pointernoBean.getIdInstitucion());
            cs.setString(6, pointernoBean.getCarreraProfesional());
            cs.setDate(7, pointernoBean.getFechaInicio());
            cs.setDate(8, pointernoBean.getFechaTernino());
            cs.setString(9, pointernoBean.getTipoPago());
            cs.setDate(10, pointernoBean.getFechRegistra());
            cs.setDate(11, pointernoBean.getFechModifica());
            cs.setBoolean(12, pointernoBean.getEstado());
            rs = cs.executeQuery();
            while (rs.next()) {
                internoBean ointernoBean = new internoBean();
                ointernoBean.setIdInterno(rs.getInt("IdInterno"));
                ointernoBean.setIdPersona(rs.getInt("IdPersona"));
                ointernoBean.setIdInstitucion(rs.getInt("IdInstitucion"));
                ointernoBean.setCarreraProfesional(rs.getString("CarreraProfesional"));
                ointernoBean.setFechaInicio(rs.getDate("FechaInicio"));
                ointernoBean.setFechaTernino(rs.getDate("FechaTernino"));
                ointernoBean.setTipoPago(rs.getString("TipoPago"));
                ointernoBean.setFechRegistra(rs.getDate("FechRegistra"));
                ointernoBean.setFechModifica(rs.getDate("FechModifica"));
                ointernoBean.setEstado(rs.getBoolean("Estado"));
                listainternoBean.add(ointernoBean);
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
        return listainternoBean;
    }

    @Autowired
    public internoBean fnGetinternoBean(internoBean pointernoBean) throws Exception {
        internoBean ointernoBean = null;
        Connection cn = null;
        ResultSet rs = null;
        CallableStatement cs = null;
        try {
            cn = DBConnection.getInstance().openConnection();
            cn.setAutoCommit(false);
            cs = cn.prepareCall("{CALL bdhrsis.usp_interno_lst(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ? )}");
            cs.setInt(1, pointernoBean.getIOps());
            cs.registerOutParameter(2, java.sql.Types.BOOLEAN);
            cs.setInt(3, pointernoBean.getIdInterno());
            cs.setInt(4, pointernoBean.getIdPersona());
            cs.setString(5, pointernoBean.getNombre());
            cs.setString(6, pointernoBean.getApePaterno());
            cs.setString(7, pointernoBean.getApeMaterno());
            cs.setString(8, pointernoBean.getNumDocumento());
            cs.setString(9, pointernoBean.getTeleMovil());
            cs.setString(10, pointernoBean.getEmail());
            cs.setString(11, pointernoBean.getDireccion());
            cs.setInt(12, pointernoBean.getIdInstitucion());
            cs.setString(13, pointernoBean.getCarreraProfesional());
            cs.setDate(14, pointernoBean.getFechaInicio());
            cs.setDate(15, pointernoBean.getFechaTernino());
            cs.setString(16, pointernoBean.getTipoPago());
            cs.setDate(17, pointernoBean.getFechRegistra());
            cs.setDate(18, pointernoBean.getFechModifica());
            cs.setBoolean(19, pointernoBean.getEstado());
            rs = cs.executeQuery();
            while (rs.next()) {
                /*cargando al imput*/
                ointernoBean = new internoBean();
                ointernoBean.setIdInterno(rs.getInt("IdInterno"));
                ointernoBean.setIdPersona(rs.getInt("IdPersona"));
                ointernoBean.setNombre(rs.getString("Nombre"));
                ointernoBean.setApePaterno(rs.getString("ApePaterno"));
                ointernoBean.setApeMaterno(rs.getString("ApeMaterno"));
                ointernoBean.setNumDocumento(rs.getString("NumDocumento"));
                ointernoBean.setTeleMovil(rs.getString("TeleMovil"));
                ointernoBean.setEmail(rs.getString("Email"));
                ointernoBean.setDireccion(rs.getString("Direccion"));
                ointernoBean.setIdInstitucion(rs.getInt("IdInstitucion"));
                ointernoBean.setCarreraProfesional(rs.getString("CarreraProfesional"));
                ointernoBean.setFechaInicio(rs.getDate("FechaInicio"));
                ointernoBean.setFechaTernino(rs.getDate("FechaTernino"));
                ointernoBean.setTipoPago(rs.getString("TipoPago"));
                ointernoBean.setFechRegistra(rs.getDate("FechRegistra"));
                ointernoBean.setFechModifica(rs.getDate("FechModifica"));
                ointernoBean.setEstado(rs.getBoolean("Estado"));
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
        return ointernoBean;
    }

    @Autowired
    public boolean fnInsertarinternoBean(personaBean popersonaBean, internoBean pointernoBean) throws Exception {
        boolean resultado = false;
        Connection cn = null;
        CallableStatement cs = null;
        try {
            cn = DBConnection.getInstance().openConnection();
            cn.setAutoCommit(false);
            cs = cn.prepareCall("{CALL bdhrsis.usp_interno_ins(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ? )}");

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
            cs.setDate(11, popersonaBean.getFechRegistra());
            cs.setDate(12, popersonaBean.getFechModifica());
            cs.setBoolean(13, true);

            cs.setInt(14, pointernoBean.getIdInterno());
            cs.setInt(15, pointernoBean.getIdInstitucion());
            cs.setString(16, pointernoBean.getCarreraProfesional());
            cs.setDate(17, pointernoBean.getFechaInicio());
            cs.setDate(18, pointernoBean.getFechaTernino());
            cs.setString(19, pointernoBean.getTipoPago());
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
    public boolean fnEliminarinternoBean(internoBean pointernoBean) throws Exception {
        boolean resultado = false;
        Connection cn = null;
        CallableStatement cs = null;
        try {
            cn = DBConnection.getInstance().openConnection();
            cn.setAutoCommit(false);
            cs = cn.prepareCall("{CALL bdhrsis.usp_interno_upd(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ? )}");
            cs.setInt(1, pointernoBean.getIOps());
            cs.registerOutParameter(2, java.sql.Types.BOOLEAN);
            cs.setInt(3, pointernoBean.getIdInterno());
            cs.setInt(4, pointernoBean.getIdPersona());
            cs.setInt(5, pointernoBean.getIdInstitucion());
            cs.setString(6, pointernoBean.getCarreraProfesional());
            cs.setDate(7, pointernoBean.getFechaInicio());
            cs.setDate(8, pointernoBean.getFechaTernino());
            cs.setString(9, pointernoBean.getTipoPago());
            cs.setDate(10, pointernoBean.getFechRegistra());
            cs.setDate(11, pointernoBean.getFechModifica());
            cs.setBoolean(12, false);
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
    public boolean fnActualizarinternoBean(personaBean popersonaBean, internoBean pointernoBean) throws Exception {
        boolean resultado = false;
        Connection cn = null;
        CallableStatement cs = null;
        try {
            cn = DBConnection.getInstance().openConnection();
            cn.setAutoCommit(false);
            cs = cn.prepareCall("{CALL bdhrsis.usp_interno_upd(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ? )}");
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
            cs.setDate(11, popersonaBean.getFechRegistra());
            cs.setDate(12, popersonaBean.getFechModifica());
            cs.setBoolean(13, true);

            cs.setInt(14, pointernoBean.getIdInterno());
            cs.setInt(15, pointernoBean.getIdInstitucion());
            cs.setString(16, pointernoBean.getCarreraProfesional());
            cs.setDate(17, pointernoBean.getFechaInicio());
            cs.setDate(18, pointernoBean.getFechaTernino());
            cs.setString(19, pointernoBean.getTipoPago());
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
