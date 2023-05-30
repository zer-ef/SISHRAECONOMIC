package org.hra.repository;

import org.hra.dominio.personaladministrativoBean;
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
public class personaladministrativoRepository {

    @Autowired
    public boolean fnIspersonaladministrativoBean(personaladministrativoBean popersonaladministrativoBean) throws Exception {
        personaladministrativoBean opersonaladministrativoBean = null;
        Connection cn = null;
        ResultSet rs = null;
        CallableStatement cs = null;
        try {
            cn = DBConnection.getInstance().openConnection();
            cn.setAutoCommit(false);
            cs = cn.prepareCall("{CALL bdhrsis.usp_personaladministrativo_lst(?, ?, ?, ?, ?, ?, ?, ?, ? )}");
            cs.setInt(1, popersonaladministrativoBean.getIOps());
            cs.registerOutParameter(2, java.sql.Types.BOOLEAN);
            cs.setInt(3, popersonaladministrativoBean.getIdPersonal());
            cs.setInt(4, popersonaladministrativoBean.getIdPersona());
            cs.setInt(5, popersonaladministrativoBean.getIdInstitucion());
            cs.setString(6, popersonaladministrativoBean.getCarreraProfesional());
            cs.setDate(7, popersonaladministrativoBean.getFechRegistra());
            cs.setDate(8, popersonaladministrativoBean.getFechModifica());
            cs.setBoolean(9, popersonaladministrativoBean.getEstado());
            rs = cs.executeQuery();
            while (rs.next()) {
                opersonaladministrativoBean = new personaladministrativoBean();
                opersonaladministrativoBean.setEstado(rs.getBoolean("IdPersonal"));
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
        return opersonaladministrativoBean != null;
    }

    @Autowired
    public List fnGetListpersonaladministrativoBean(personaladministrativoBean popersonaladministrativoBean) throws Exception {
        List list = new LinkedList();
        Connection cn = null;
        ResultSet rs = null;
        CallableStatement cs = null;
        try {
            cn = DBConnection.getInstance().openConnection();
            cn.setAutoCommit(false);
            cs = cn.prepareCall("{CALL bdhrsis.usp_personaladministrativo_lst(?, ?, ?, ?, ?, ?, ?, ?, ? )}");
            cs.setInt(1, popersonaladministrativoBean.getIOps());
            cs.registerOutParameter(2, java.sql.Types.BOOLEAN);
            cs.setInt(3, popersonaladministrativoBean.getIdPersonal());
            cs.setInt(4, popersonaladministrativoBean.getIdPersona());
            cs.setInt(5, popersonaladministrativoBean.getIdInstitucion());
            cs.setString(6, popersonaladministrativoBean.getCarreraProfesional());
            cs.setDate(7, popersonaladministrativoBean.getFechRegistra());
            cs.setDate(8, popersonaladministrativoBean.getFechModifica());
            cs.setBoolean(9, popersonaladministrativoBean.getEstado());
            rs = cs.executeQuery();
            while (rs.next()) {
                Object[] obj = {rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7)};
                //Object[] obj = {rs.getInt(1), rs.getInt(2), rs.getInt(3), rs.getString(4), rs.getDate(5), rs.getDate(6), rs.getBoolean(7)}; 
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
    public List fnGridpersonaladministrativoBean(personaladministrativoBean popersonaladministrativoBean) throws Exception {
        List lista = new LinkedList();
        Connection cn = null;
        ResultSet rs = null;
        CallableStatement cs = null;
        try {
            cn = DBConnection.getInstance().openConnection();
            cn.setAutoCommit(false);
            cs = cn.prepareCall("{CALL bdhrsis.usp_personaladministrativo_lst(?, ?, ?, ?, ?, ?, ?, ?, ? )}");
            cs.setInt(1, popersonaladministrativoBean.getIOps());
            cs.registerOutParameter(2, java.sql.Types.BOOLEAN);
            cs.setInt(3, popersonaladministrativoBean.getIdPersonal());
            cs.setInt(4, popersonaladministrativoBean.getIdPersona());
            cs.setInt(5, popersonaladministrativoBean.getIdInstitucion());
            cs.setString(6, popersonaladministrativoBean.getCarreraProfesional());
            cs.setDate(7, popersonaladministrativoBean.getFechRegistra());
            cs.setDate(8, popersonaladministrativoBean.getFechModifica());
            cs.setBoolean(9, popersonaladministrativoBean.getEstado());
            rs = cs.executeQuery();
            while (rs.next()) {
                Object[] obj = {rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7)};
                //Object[] obj = {rs.getInt(1), rs.getInt(2), rs.getInt(3), rs.getString(4), rs.getDate(5), rs.getDate(6), rs.getBoolean(7)}; 
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
    public ArrayList<personaladministrativoBean> fnAutocompletepersonaladministrativoBean(personaladministrativoBean popersonaladministrativoBean) throws Exception {
        ArrayList<personaladministrativoBean> listapersonaladministrativoBean = new ArrayList<personaladministrativoBean>();
        Connection cn = null;
        ResultSet rs = null;
        CallableStatement cs = null;
        try {
            cn = DBConnection.getInstance().openConnection();
            cn.setAutoCommit(false);
            cs = cn.prepareCall("{CALL bdhrsis.usp_personaladministrativo_lst(?, ?, ?, ?, ?, ?, ?, ?, ? )}");
            cs.setInt(1, popersonaladministrativoBean.getIOps());
            cs.registerOutParameter(2, java.sql.Types.BOOLEAN);
            cs.setInt(3, popersonaladministrativoBean.getIdPersonal());
            cs.setInt(4, popersonaladministrativoBean.getIdPersona());
            cs.setInt(5, popersonaladministrativoBean.getIdInstitucion());
            cs.setString(6, popersonaladministrativoBean.getCarreraProfesional());
            cs.setDate(7, popersonaladministrativoBean.getFechRegistra());
            cs.setDate(8, popersonaladministrativoBean.getFechModifica());
            cs.setBoolean(9, popersonaladministrativoBean.getEstado());
            rs = cs.executeQuery();
            while (rs.next()) {
                personaladministrativoBean opersonaladministrativoBean = new personaladministrativoBean();
                opersonaladministrativoBean.setIdPersonal(rs.getInt("IdPersonal"));
                opersonaladministrativoBean.setIdPersona(rs.getInt("IdPersona"));
                opersonaladministrativoBean.setIdInstitucion(rs.getInt("IdInstitucion"));
                opersonaladministrativoBean.setCarreraProfesional(rs.getString("CarreraProfesional"));
                opersonaladministrativoBean.setFechRegistra(rs.getDate("FechRegistra"));
                opersonaladministrativoBean.setFechModifica(rs.getDate("FechModifica"));
                opersonaladministrativoBean.setEstado(rs.getBoolean("Estado"));
                listapersonaladministrativoBean.add(opersonaladministrativoBean);
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
        return listapersonaladministrativoBean;
    }

    @Autowired
    public personaladministrativoBean fnGetpersonaladministrativoBean(personaladministrativoBean popersonaladministrativoBean) throws Exception {
        personaladministrativoBean opersonaladministrativoBean = null;
        Connection cn = null;
        ResultSet rs = null;
        CallableStatement cs = null;
        try {
            cn = DBConnection.getInstance().openConnection();
            cn.setAutoCommit(false);
            cs = cn.prepareCall("{CALL bdhrsis.usp_personaladministrativo_lst(?, ?, ?, ?, ?, ?, ?, ?, ? )}");
            cs.setInt(1, popersonaladministrativoBean.getIOps());
            cs.registerOutParameter(2, java.sql.Types.BOOLEAN);
            cs.setInt(3, popersonaladministrativoBean.getIdPersonal());
            cs.setInt(4, popersonaladministrativoBean.getIdPersona());
            cs.setInt(5, popersonaladministrativoBean.getIdInstitucion());
            cs.setString(6, popersonaladministrativoBean.getCarreraProfesional());
            cs.setDate(7, popersonaladministrativoBean.getFechRegistra());
            cs.setDate(8, popersonaladministrativoBean.getFechModifica());
            cs.setBoolean(9, popersonaladministrativoBean.getEstado());
            rs = cs.executeQuery();
            while (rs.next()) {
                opersonaladministrativoBean = new personaladministrativoBean();
                opersonaladministrativoBean.setIdPersonal(rs.getInt("IdPersonal"));
                opersonaladministrativoBean.setIdPersona(rs.getInt("IdPersona"));
                opersonaladministrativoBean.setIdInstitucion(rs.getInt("IdInstitucion"));
                opersonaladministrativoBean.setCarreraProfesional(rs.getString("CarreraProfesional"));
                opersonaladministrativoBean.setFechRegistra(rs.getDate("FechRegistra"));
                opersonaladministrativoBean.setFechModifica(rs.getDate("FechModifica"));
                opersonaladministrativoBean.setEstado(rs.getBoolean("Estado"));
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
        return opersonaladministrativoBean;
    }

    @Autowired
    public boolean fnInsertarpersonaladministrativoBean(personaladministrativoBean popersonaladministrativoBean) throws Exception {
        boolean resultado = false;
        Connection cn = null;
        CallableStatement cs = null;
        try {
            cn = DBConnection.getInstance().openConnection();
            cn.setAutoCommit(false);
            cs = cn.prepareCall("{CALL bdhrsis.usp_personaladministrativo_ins(?, ?, ?, ?, ?, ?, ?, ?, ? )}");
            cs.setInt(1, popersonaladministrativoBean.getIOps());
            cs.registerOutParameter(2, java.sql.Types.BOOLEAN);
            cs.setInt(3, popersonaladministrativoBean.getIdPersonal());
            cs.setInt(4, popersonaladministrativoBean.getIdPersona());
            cs.setInt(5, popersonaladministrativoBean.getIdInstitucion());
            cs.setString(6, popersonaladministrativoBean.getCarreraProfesional());
            cs.setDate(7, popersonaladministrativoBean.getFechRegistra());
            cs.setDate(8, popersonaladministrativoBean.getFechModifica());
            cs.setBoolean(9, true);
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
    public boolean fnEliminarpersonaladministrativoBean(personaladministrativoBean popersonaladministrativoBean) throws Exception {
        boolean resultado = false;
        Connection cn = null;
        CallableStatement cs = null;
        try {
            cn = DBConnection.getInstance().openConnection();
            cn.setAutoCommit(false);
            cs = cn.prepareCall("{CALL bdhrsis.usp_personaladministrativo_upd(?, ?, ?, ?, ?, ?, ?, ?, ? )}");
            cs.setInt(1, popersonaladministrativoBean.getIOps());
            cs.registerOutParameter(2, java.sql.Types.BOOLEAN);
            cs.setInt(3, popersonaladministrativoBean.getIdPersonal());
            cs.setInt(4, popersonaladministrativoBean.getIdPersona());
            cs.setInt(5, popersonaladministrativoBean.getIdInstitucion());
            cs.setString(6, popersonaladministrativoBean.getCarreraProfesional());
            cs.setDate(7, popersonaladministrativoBean.getFechRegistra());
            cs.setDate(8, popersonaladministrativoBean.getFechModifica());
            cs.setBoolean(9, false);
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
    public boolean fnActualizarpersonaladministrativoBean(personaladministrativoBean popersonaladministrativoBean) throws Exception {
        boolean resultado = false;
        Connection cn = null;
        CallableStatement cs = null;
        try {
            cn = DBConnection.getInstance().openConnection();
            cn.setAutoCommit(false);
            cs = cn.prepareCall("{CALL bdhrsis.usp_personaladministrativo_upd(?, ?, ?, ?, ?, ?, ?, ?, ? )}");
            cs.setInt(1, popersonaladministrativoBean.getIOps());
            cs.registerOutParameter(2, java.sql.Types.BOOLEAN);
            cs.setInt(3, popersonaladministrativoBean.getIdPersonal());
            cs.setInt(4, popersonaladministrativoBean.getIdPersona());
            cs.setInt(5, popersonaladministrativoBean.getIdInstitucion());
            cs.setString(6, popersonaladministrativoBean.getCarreraProfesional());
            cs.setDate(7, popersonaladministrativoBean.getFechRegistra());
            cs.setDate(8, popersonaladministrativoBean.getFechModifica());
            cs.setBoolean(9, true);
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
