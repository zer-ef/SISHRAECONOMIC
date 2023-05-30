package org.hra.repository;

import org.hra.dominio.practicanteBean;
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
public class practicanteRepository {

    @Autowired
    public boolean fnIspracticanteBean(practicanteBean popracticanteBean) throws Exception {
        practicanteBean opracticanteBean = null;
        Connection cn = null;
        ResultSet rs = null;
        CallableStatement cs = null;
        try {
            cn = DBConnection.getInstance().openConnection();
            cn.setAutoCommit(false);
            cs = cn.prepareCall("{CALL bdhrsis.usp_practicante_lst(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ? )}");
            cs.setInt(1, popracticanteBean.getIOps());
            cs.registerOutParameter(2, java.sql.Types.BOOLEAN);
            cs.setInt(3, popracticanteBean.getIdPracticante());
            cs.setInt(4, popracticanteBean.getIdPersona());
            cs.setInt(5, popracticanteBean.getIdInstitucion());
            cs.setString(6, popracticanteBean.getCarreraProfesional());
            cs.setDate(7, popracticanteBean.getFechaInicio());
            cs.setDate(8, popracticanteBean.getFechaTernino());
            cs.setString(9, popracticanteBean.getModulo());
            cs.setString(10, popracticanteBean.getHorarioPractica());
            cs.setDate(11, popracticanteBean.getFechRegistra());
            cs.setDate(12, popracticanteBean.getFechModifica());
            cs.setBoolean(13, popracticanteBean.getEstado());
            rs = cs.executeQuery();
            while (rs.next()) {
                opracticanteBean = new practicanteBean();
                opracticanteBean.setEstado(rs.getBoolean("IdPracticante"));
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
        return opracticanteBean != null;
    }

    @Autowired
    public List fnGetListpracticanteBean(practicanteBean popracticanteBean) throws Exception {
        List list = new LinkedList();
        Connection cn = null;
        ResultSet rs = null;
        CallableStatement cs = null;
        try {
            cn = DBConnection.getInstance().openConnection();
            cn.setAutoCommit(false);
            cs = cn.prepareCall("{CALL bdhrsis.usp_practicante_lst(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ? )}");
            cs.setInt(1, popracticanteBean.getIOps());
            cs.registerOutParameter(2, java.sql.Types.BOOLEAN);
            cs.setInt(3, popracticanteBean.getIdPracticante());
            cs.setInt(4, popracticanteBean.getIdPersona());
            cs.setInt(5, popracticanteBean.getIdInstitucion());
            cs.setString(6, popracticanteBean.getCarreraProfesional());
            cs.setDate(7, popracticanteBean.getFechaInicio());
            cs.setDate(8, popracticanteBean.getFechaTernino());
            cs.setString(9, popracticanteBean.getModulo());
            cs.setString(10, popracticanteBean.getHorarioPractica());
            cs.setDate(11, popracticanteBean.getFechRegistra());
            cs.setDate(12, popracticanteBean.getFechModifica());
            cs.setBoolean(13, popracticanteBean.getEstado());
            rs = cs.executeQuery();
            while (rs.next()) {
                Object[] obj = {rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9), rs.getString(10), rs.getString(11)};
                //Object[] obj = {rs.getInt(1), rs.getInt(2), rs.getInt(3), rs.getString(4), rs.getDate(5), rs.getDate(6), rs.getString(7), rs.getString(8), rs.getDate(9), rs.getDate(10), rs.getBoolean(11)}; 
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
    public List fnGridpracticanteBean(practicanteBean popracticanteBean) throws Exception {
        List lista = new LinkedList();
        Connection cn = null;
        ResultSet rs = null;
        CallableStatement cs = null;
        try {
            cn = DBConnection.getInstance().openConnection();
            cn.setAutoCommit(false);
            cs = cn.prepareCall("{CALL bdhrsis.usp_practicante_lst(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ? )}");
            cs.setInt(1, popracticanteBean.getIOps());
            cs.registerOutParameter(2, java.sql.Types.BOOLEAN);
            cs.setInt(3, popracticanteBean.getIdPracticante());
            cs.setInt(4, popracticanteBean.getIdPersona());
            cs.setString(5, popracticanteBean.getNombre());
            cs.setString(6, popracticanteBean.getApePaterno());
            cs.setString(7, popracticanteBean.getApeMaterno());
            cs.setString(8, popracticanteBean.getNumDocumento());
            cs.setString(9, popracticanteBean.getTeleMovil());
            cs.setString(10, popracticanteBean.getEmail());
            cs.setString(11, popracticanteBean.getDireccion());
//          cs.setInt(1, popracticanteBean.getIOps());
//          cs.registerOutParameter(2, java.sql.Types.BOOLEAN);
//          cs.setInt(3, popracticanteBean.getIdPracticante());
//          cs.setInt(4, popracticanteBean.getIdPersona());
            cs.setInt(12, popracticanteBean.getIdInstitucion());
            cs.setString(13, popracticanteBean.getCarreraProfesional());
            cs.setDate(14, popracticanteBean.getFechaInicio());
            cs.setDate(15, popracticanteBean.getFechaTernino());
            cs.setString(16, popracticanteBean.getModulo());
            cs.setString(17, popracticanteBean.getHorarioPractica());
            cs.setDate(18, popracticanteBean.getFechRegistra());
            cs.setDate(19, popracticanteBean.getFechModifica());
            cs.setBoolean(20, popracticanteBean.getEstado());
            rs = cs.executeQuery();
            while (rs.next()) {
                Object[] obj = {rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9), rs.getString(10), rs.getString(11)};
                //Object[] obj = {rs.getInt(1), rs.getInt(2), rs.getInt(3), rs.getString(4), rs.getDate(5), rs.getDate(6), rs.getString(7), rs.getString(8), rs.getDate(9), rs.getDate(10), rs.getBoolean(11)}; 
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
    public ArrayList<practicanteBean> fnAutocompletepracticanteBean(practicanteBean popracticanteBean) throws Exception {
        ArrayList<practicanteBean> listapracticanteBean = new ArrayList<practicanteBean>();
        Connection cn = null;
        ResultSet rs = null;
        CallableStatement cs = null;
        try {
            cn = DBConnection.getInstance().openConnection();
            cn.setAutoCommit(false);
            cs = cn.prepareCall("{CALL bdhrsis.usp_practicante_lst(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ? )}");
            cs.setInt(1, popracticanteBean.getIOps());
            cs.registerOutParameter(2, java.sql.Types.BOOLEAN);
            cs.setInt(3, popracticanteBean.getIdPracticante());
            cs.setInt(4, popracticanteBean.getIdPersona());
            cs.setInt(5, popracticanteBean.getIdInstitucion());
            cs.setString(6, popracticanteBean.getCarreraProfesional());
            cs.setDate(7, popracticanteBean.getFechaInicio());
            cs.setDate(8, popracticanteBean.getFechaTernino());
            cs.setString(9, popracticanteBean.getModulo());
            cs.setString(10, popracticanteBean.getHorarioPractica());
            cs.setDate(11, popracticanteBean.getFechRegistra());
            cs.setDate(12, popracticanteBean.getFechModifica());
            cs.setBoolean(13, popracticanteBean.getEstado());
            rs = cs.executeQuery();
            while (rs.next()) {
                practicanteBean opracticanteBean = new practicanteBean();
                opracticanteBean.setIdPracticante(rs.getInt("IdPracticante"));
                opracticanteBean.setIdPersona(rs.getInt("IdPersona"));
                opracticanteBean.setIdInstitucion(rs.getInt("IdInstitucion"));
                opracticanteBean.setCarreraProfesional(rs.getString("CarreraProfesional"));
                opracticanteBean.setFechaInicio(rs.getDate("FechaInicio"));
                opracticanteBean.setFechaTernino(rs.getDate("FechaTernino"));
                opracticanteBean.setModulo(rs.getString("Modulo"));
                opracticanteBean.setHorarioPractica(rs.getString("HorarioPractica"));
                opracticanteBean.setFechRegistra(rs.getDate("FechRegistra"));
                opracticanteBean.setFechModifica(rs.getDate("FechModifica"));
                opracticanteBean.setEstado(rs.getBoolean("Estado"));
                listapracticanteBean.add(opracticanteBean);
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
        return listapracticanteBean;
    }

    @Autowired
    public practicanteBean fnGetpracticanteBean(practicanteBean popracticanteBean) throws Exception {
        practicanteBean opracticanteBean = null;
        Connection cn = null;
        ResultSet rs = null;
        CallableStatement cs = null;
        try {
            cn = DBConnection.getInstance().openConnection();
            cn.setAutoCommit(false);
            cs = cn.prepareCall("{CALL bdhrsis.usp_practicante_lst(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ? )}");
            cs.setInt(1, popracticanteBean.getIOps());
            cs.registerOutParameter(2, java.sql.Types.BOOLEAN);
            cs.setInt(3, popracticanteBean.getIdPracticante());
            cs.setInt(4, popracticanteBean.getIdPersona());
            cs.setString(5, popracticanteBean.getNombre());
            cs.setString(6, popracticanteBean.getApePaterno());
            cs.setString(7, popracticanteBean.getApeMaterno());
            cs.setString(8, popracticanteBean.getNumDocumento());
            cs.setString(9, popracticanteBean.getTeleMovil());
            cs.setString(10, popracticanteBean.getEmail());
            cs.setString(11, popracticanteBean.getDireccion());
//          cs.setInt(1, popracticanteBean.getIOps());
//          cs.registerOutParameter(2, java.sql.Types.BOOLEAN);
//          cs.setInt(3, popracticanteBean.getIdPracticante());
//          cs.setInt(4, popracticanteBean.getIdPersona());
            cs.setInt(12, popracticanteBean.getIdInstitucion());
            cs.setString(13, popracticanteBean.getCarreraProfesional());
            cs.setDate(14, popracticanteBean.getFechaInicio());
            cs.setDate(15, popracticanteBean.getFechaTernino());
            cs.setString(16, popracticanteBean.getModulo());
            cs.setString(17, popracticanteBean.getHorarioPractica());
            cs.setDate(18, popracticanteBean.getFechRegistra());
            cs.setDate(19, popracticanteBean.getFechModifica());
            cs.setBoolean(20, popracticanteBean.getEstado());
            rs = cs.executeQuery();
            while (rs.next()) {
                opracticanteBean = new practicanteBean();
                opracticanteBean.setIdPracticante(rs.getInt("IdPracticante"));
                opracticanteBean.setIdPersona(rs.getInt("IdPersona"));
                opracticanteBean.setNombre(rs.getString("Nombre"));
                opracticanteBean.setApePaterno(rs.getString("ApePaterno"));
                opracticanteBean.setApeMaterno(rs.getString("ApeMaterno"));
                opracticanteBean.setNumDocumento(rs.getString("NumDocumento"));
                opracticanteBean.setTeleMovil(rs.getString("TeleMovil"));
                opracticanteBean.setEmail(rs.getString("Email"));
                opracticanteBean.setDireccion(rs.getString("Direccion"));
                opracticanteBean.setIdInstitucion(rs.getInt("IdInstitucion"));
                opracticanteBean.setCarreraProfesional(rs.getString("CarreraProfesional"));
                opracticanteBean.setFechaInicio(rs.getDate("FechaInicio"));
                opracticanteBean.setFechaTernino(rs.getDate("FechaTernino"));
                opracticanteBean.setModulo(rs.getString("Modulo"));
                opracticanteBean.setHorarioPractica(rs.getString("HorarioPractica"));
                opracticanteBean.setFechRegistra(rs.getDate("FechRegistra"));
                opracticanteBean.setFechModifica(rs.getDate("FechModifica"));
                opracticanteBean.setEstado(rs.getBoolean("Estado"));
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
        return opracticanteBean;
    }

    @Autowired
    public boolean fnInsertarpracticanteBean(personaBean popersonaBean, practicanteBean popracticanteBean) throws Exception {
        boolean resultado = false;
        Connection cn = null;
        CallableStatement cs = null;
        try {
            cn = DBConnection.getInstance().openConnection();
            cn.setAutoCommit(false);
            cs = cn.prepareCall("{CALL bdhrsis.usp_practicante_ins(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ? )}");
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

            cs.setInt(14, popracticanteBean.getIdPracticante());
            cs.setInt(15, popracticanteBean.getIdInstitucion());
            cs.setString(16, popracticanteBean.getCarreraProfesional());
            cs.setDate(17, popracticanteBean.getFechaInicio());
            cs.setDate(18, popracticanteBean.getFechaTernino());
            cs.setString(19, popracticanteBean.getModulo());
            cs.setString(20, popracticanteBean.getHorarioPractica());
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
    public boolean fnEliminarpracticanteBean(personaBean popersonaBean, practicanteBean popracticanteBean) throws Exception {
        boolean resultado = false;
        Connection cn = null;
        CallableStatement cs = null;
        try {
            cn = DBConnection.getInstance().openConnection();
            cn.setAutoCommit(false);
            cs = cn.prepareCall("{CALL bdhrsis.usp_practicante_upd(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ? )}");
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

            cs.setInt(14, popracticanteBean.getIdPracticante());
            cs.setInt(15, popracticanteBean.getIdInstitucion());
            cs.setString(16, popracticanteBean.getCarreraProfesional());
            cs.setDate(17, popracticanteBean.getFechaInicio());
            cs.setDate(18, popracticanteBean.getFechaTernino());
            cs.setString(19, popracticanteBean.getModulo());
            cs.setString(20, popracticanteBean.getHorarioPractica());

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
    public boolean fnActualizarpracticanteBean(personaBean popersonaBean, practicanteBean popracticanteBean) throws Exception {
        boolean resultado = false;
        Connection cn = null;
        CallableStatement cs = null;
        try {
            cn = DBConnection.getInstance().openConnection();
            cn.setAutoCommit(false);
            cs = cn.prepareCall("{CALL bdhrsis.usp_practicante_upd(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ? )}");
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

            cs.setInt(14, popracticanteBean.getIdPracticante());
            cs.setInt(15, popracticanteBean.getIdInstitucion());
            cs.setString(16, popracticanteBean.getCarreraProfesional());
            cs.setDate(17, popracticanteBean.getFechaInicio());
            cs.setDate(18, popracticanteBean.getFechaTernino());
            cs.setString(19, popracticanteBean.getModulo());
            cs.setString(20, popracticanteBean.getHorarioPractica());
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
