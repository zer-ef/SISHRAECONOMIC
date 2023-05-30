package org.hra.repository;

import org.hra.dominio.personaBean;
import org.hra.properties.DBConnection;
import java.sql.Connection;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author Quichua
 */
public class personaRepository {

    @Autowired
    public boolean fnIspersonaBean(personaBean popersonaBean) throws Exception {
        personaBean opersonaBean = null;
        Connection cn = null;
        ResultSet rs = null;
        CallableStatement cs = null;
        try {
            cn = DBConnection.getInstance().openConnection();
            cn.setAutoCommit(false);
            cs = cn.prepareCall("{CALL bdhrsis.usp_persona_lst(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ? )}");
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
            cs.setBoolean(13, popersonaBean.getEstado());
            rs = cs.executeQuery();
            while (rs.next()) {
                opersonaBean = new personaBean();
                opersonaBean.setEstado(rs.getBoolean("IdPersona"));
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
        return opersonaBean != null;
    }

    @Autowired
    public List fnGetListpersonaBean(personaBean popersonaBean) throws Exception {
        List list = new LinkedList();
        Connection cn = null;
        ResultSet rs = null;
        CallableStatement cs = null;
        try {
            cn = DBConnection.getInstance().openConnection();
            cn.setAutoCommit(false);
            cs = cn.prepareCall("{CALL bdhrsis.usp_persona_lst(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ? )}");
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
            cs.setBoolean(13, popersonaBean.getEstado());
            rs = cs.executeQuery();
            while (rs.next()) {
                Object[] obj = {rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9), rs.getString(10), rs.getString(11)};
                //Object[] obj = {rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getDate(9), rs.getDate(10), rs.getBoolean(11)}; 
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
    public List fnGridpersonaBean(personaBean popersonaBean) throws Exception {
        List lista = new LinkedList();
        Connection cn = null;
        ResultSet rs = null;
        CallableStatement cs = null;
        try {
            cn = DBConnection.getInstance().openConnection();
            cn.setAutoCommit(false);
            cs = cn.prepareCall("{CALL bdhrsis.usp_persona_lst(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ? )}");
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
            cs.setBoolean(13, popersonaBean.getEstado());
            rs = cs.executeQuery();
            while (rs.next()) {
                Object[] obj = {rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9), rs.getString(10), rs.getString(11)};
                //Object[] obj = {rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getDate(9), rs.getDate(10), rs.getBoolean(11)}; 
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
    public ArrayList<personaBean> fnAutocompletepersonaBean(personaBean popersonaBean) throws Exception {
        ArrayList<personaBean> listapersonaBean = new ArrayList<personaBean>();
        Connection cn = null;
        ResultSet rs = null;
        CallableStatement cs = null;
        try {
            cn = DBConnection.getInstance().openConnection();
            cn.setAutoCommit(false);
            cs = cn.prepareCall("{CALL bdhrsis.usp_persona_lst(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ? )}");
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
            cs.setBoolean(13, popersonaBean.getEstado());
            rs = cs.executeQuery();
            while (rs.next()) {
                personaBean opersonaBean = new personaBean();
                opersonaBean.setIdPersona(rs.getInt("IdPersona"));
                opersonaBean.setNombre(rs.getString("Nombre"));
                opersonaBean.setApePaterno(rs.getString("ApePaterno"));
                opersonaBean.setApeMaterno(rs.getString("ApeMaterno"));
                opersonaBean.setNumDocumento(rs.getString("NumDocumento"));
                opersonaBean.setTeleMovil(rs.getString("TeleMovil"));
                opersonaBean.setEmail(rs.getString("Email"));
                opersonaBean.setDireccion(rs.getString("Direccion"));
                opersonaBean.setFechRegistra(rs.getDate("FechRegistra"));
                opersonaBean.setFechModifica(rs.getDate("FechModifica"));
                opersonaBean.setEstado(rs.getBoolean("Estado"));
                listapersonaBean.add(opersonaBean);
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
        return listapersonaBean;
    }

    @Autowired
    public personaBean fnGetpersonaBean(personaBean popersonaBean) throws Exception {
        personaBean opersonaBean = null;
        Connection cn = null;
        ResultSet rs = null;
        CallableStatement cs = null;
        try {
            cn = DBConnection.getInstance().openConnection();
            cn.setAutoCommit(false);
            cs = cn.prepareCall("{CALL bdhrsis.usp_persona_lst(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ? )}");
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
            cs.setBoolean(13, popersonaBean.getEstado());
            rs = cs.executeQuery();
            while (rs.next()) {
                opersonaBean = new personaBean();
                opersonaBean.setIdPersona(rs.getInt("IdPersona"));
                opersonaBean.setNombre(rs.getString("Nombre"));
                opersonaBean.setApePaterno(rs.getString("ApePaterno"));
                opersonaBean.setApeMaterno(rs.getString("ApeMaterno"));
                opersonaBean.setNumDocumento(rs.getString("NumDocumento"));
                opersonaBean.setTeleMovil(rs.getString("TeleMovil"));
                opersonaBean.setEmail(rs.getString("Email"));
                opersonaBean.setDireccion(rs.getString("Direccion"));
                opersonaBean.setFechRegistra(rs.getDate("FechRegistra"));
                opersonaBean.setFechModifica(rs.getDate("FechModifica"));
                opersonaBean.setEstado(rs.getBoolean("Estado"));
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
        return opersonaBean;
    }

    @Autowired
    public boolean fnInsertarpersonaBean(personaBean popersonaBean) throws Exception {
        boolean resultado = false;
        Connection cn = null;
        CallableStatement cs = null;
        try {
            cn = DBConnection.getInstance().openConnection();
            cn.setAutoCommit(false);
            cs = cn.prepareCall("{CALL bdhrsis.usp_persona_ins(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ? )}");
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
    public boolean fnEliminarpersonaBean(personaBean popersonaBean) throws Exception {
        boolean resultado = false;
        Connection cn = null;
        CallableStatement cs = null;
        try {
            cn = DBConnection.getInstance().openConnection();
            cn.setAutoCommit(false);
            cs = cn.prepareCall("{CALL bdhrsis.usp_persona_upd(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ? )}");
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
            cs.setBoolean(13, false);
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
    public boolean fnActualizarpersonaBean(personaBean popersonaBean) throws Exception {
        boolean resultado = false;
        Connection cn = null;
        CallableStatement cs = null;
        try {
            cn = DBConnection.getInstance().openConnection();
            cn.setAutoCommit(false);
            cs = cn.prepareCall("{CALL bdhrsis.usp_persona_upd(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ? )}");
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
