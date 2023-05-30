package org.hra.repository;

import org.hra.dominio.areaBean;
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
public class areaRepository {

    @Autowired
    public boolean fnIsareaBean(areaBean poareaBean) throws Exception {
        areaBean oareaBean = null;
        Connection cn = null;
        ResultSet rs = null;
        CallableStatement cs = null;
        try {
            cn = DBConnection.getInstance().openConnection();
            cn.setAutoCommit(false);
            cs = cn.prepareCall("{CALL bdhrsis.usp_area_lst(?, ?, ?, ?, ?, ?, ? )}");
            cs.setInt(1, poareaBean.getIOps());
            cs.registerOutParameter(2, java.sql.Types.BOOLEAN);
            cs.setInt(3, poareaBean.getIdArea());
            cs.setString(4, poareaBean.getDenominacion());
            cs.setDate(5, poareaBean.getFechRegistra());
            cs.setDate(6, poareaBean.getFechModifica());
            cs.setBoolean(7, poareaBean.getEstado());
            rs = cs.executeQuery();
            while (rs.next()) {
                oareaBean = new areaBean();
                oareaBean.setEstado(rs.getBoolean("IdArea"));
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
        return oareaBean != null;
    }

    @Autowired
    public List fnGetListareaBean(areaBean poareaBean) throws Exception {
        List list = new LinkedList();
        Connection cn = null;
        ResultSet rs = null;
        CallableStatement cs = null;
        try {
            cn = DBConnection.getInstance().openConnection();
            cn.setAutoCommit(false);
            cs = cn.prepareCall("{CALL bdhrsis.usp_area_lst(?, ?, ?, ?, ?, ?, ? )}");
            cs.setInt(1, poareaBean.getIOps());
            cs.registerOutParameter(2, java.sql.Types.BOOLEAN);
            cs.setInt(3, poareaBean.getIdArea());
            cs.setString(4, poareaBean.getDenominacion());
            cs.setDate(5, poareaBean.getFechRegistra());
            cs.setDate(6, poareaBean.getFechModifica());
            cs.setBoolean(7, poareaBean.getEstado());
            rs = cs.executeQuery();
            while (rs.next()) {
                Object[] obj = {rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5)};
                //Object[] obj = {rs.getInt(1), rs.getString(2), rs.getDate(3), rs.getDate(4), rs.getBoolean(5)}; 
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
    public List fnGridareaBean(areaBean poareaBean) throws Exception {
        List lista = new LinkedList();
        Connection cn = null;
        ResultSet rs = null;
        CallableStatement cs = null;
        try {
            cn = DBConnection.getInstance().openConnection();
            cn.setAutoCommit(false);
            cs = cn.prepareCall("{CALL bdhrsis.usp_area_lst(?, ?, ?, ?, ?, ?, ? )}");
            cs.setInt(1, poareaBean.getIOps());
            cs.registerOutParameter(2, java.sql.Types.BOOLEAN);
            cs.setInt(3, poareaBean.getIdArea());
            cs.setString(4, poareaBean.getDenominacion());
            cs.setDate(5, poareaBean.getFechRegistra());
            cs.setDate(6, poareaBean.getFechModifica());
            cs.setBoolean(7, poareaBean.getEstado());
            rs = cs.executeQuery();
            while (rs.next()) {
                Object[] obj = {rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5)};
                //Object[] obj = {rs.getInt(1), rs.getString(2), rs.getDate(3), rs.getDate(4), rs.getBoolean(5)}; 
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
    public ArrayList<areaBean> fnAutocompleteareaBean(areaBean poareaBean) throws Exception {
        ArrayList<areaBean> listaareaBean = new ArrayList<areaBean>();
        Connection cn = null;
        ResultSet rs = null;
        CallableStatement cs = null;
        try {
            cn = DBConnection.getInstance().openConnection();
            cn.setAutoCommit(false);
            cs = cn.prepareCall("{CALL bdhrsis.usp_area_lst(?, ?, ?, ?, ?, ?, ? )}");
            cs.setInt(1, poareaBean.getIOps());
            cs.registerOutParameter(2, java.sql.Types.BOOLEAN);
            cs.setInt(3, poareaBean.getIdArea());
            cs.setString(4, poareaBean.getDenominacion());
            cs.setDate(5, poareaBean.getFechRegistra());
            cs.setDate(6, poareaBean.getFechModifica());
            cs.setBoolean(7, poareaBean.getEstado());
            rs = cs.executeQuery();
            while (rs.next()) {
                areaBean oareaBean = new areaBean();
                oareaBean.setIdArea(rs.getInt("IdArea"));
                oareaBean.setDenominacion(rs.getString("Denominacion"));
                oareaBean.setFechRegistra(rs.getDate("FechRegistra"));
                oareaBean.setFechModifica(rs.getDate("FechModifica"));
                oareaBean.setEstado(rs.getBoolean("Estado"));
                listaareaBean.add(oareaBean);
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
        return listaareaBean;
    }

    @Autowired
    public areaBean fnGetareaBean(areaBean poareaBean) throws Exception {
        areaBean oareaBean = null;
        Connection cn = null;
        ResultSet rs = null;
        CallableStatement cs = null;
        try {
            cn = DBConnection.getInstance().openConnection();
            cn.setAutoCommit(false);
            cs = cn.prepareCall("{CALL bdhrsis.usp_area_lst(?, ?, ?, ?, ?, ?, ? )}");
            cs.setInt(1, poareaBean.getIOps());
            cs.registerOutParameter(2, java.sql.Types.BOOLEAN);
            cs.setInt(3, poareaBean.getIdArea());
            cs.setString(4, poareaBean.getDenominacion());
            cs.setDate(5, poareaBean.getFechRegistra());
            cs.setDate(6, poareaBean.getFechModifica());
            cs.setBoolean(7, poareaBean.getEstado());
            rs = cs.executeQuery();
            while (rs.next()) {
                oareaBean = new areaBean();
                oareaBean.setIdArea(rs.getInt("IdArea"));
                oareaBean.setDenominacion(rs.getString("Denominacion"));
                oareaBean.setFechRegistra(rs.getDate("FechRegistra"));
                oareaBean.setFechModifica(rs.getDate("FechModifica"));
                oareaBean.setEstado(rs.getBoolean("Estado"));
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
        return oareaBean;
    }

    @Autowired
    public boolean fnInsertarareaBean(areaBean poareaBean) throws Exception {
        boolean resultado = false;
        Connection cn = null;
        CallableStatement cs = null;
        try {
            cn = DBConnection.getInstance().openConnection();
            cn.setAutoCommit(false);
            cs = cn.prepareCall("{CALL bdhrsis.usp_area_ins(?, ?, ?, ?, ?, ?, ? )}");
            cs.setInt(1, poareaBean.getIOps());
            cs.registerOutParameter(2, java.sql.Types.BOOLEAN);
            cs.setInt(3, poareaBean.getIdArea());
            cs.setString(4, poareaBean.getDenominacion());
            cs.setDate(5, poareaBean.getFechRegistra());
            cs.setDate(6, poareaBean.getFechModifica());
            cs.setBoolean(7, true);
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
    public boolean fnEliminarareaBean(areaBean poareaBean) throws Exception {
        boolean resultado = false;
        Connection cn = null;
        CallableStatement cs = null;
        try {
            cn = DBConnection.getInstance().openConnection();
            cn.setAutoCommit(false);
            cs = cn.prepareCall("{CALL bdhrsis.usp_area_upd(?, ?, ?, ?, ?, ?, ? )}");
            cs.setInt(1, poareaBean.getIOps());
            cs.registerOutParameter(2, java.sql.Types.BOOLEAN);
            cs.setInt(3, poareaBean.getIdArea());
            cs.setString(4, poareaBean.getDenominacion());
            cs.setDate(5, poareaBean.getFechRegistra());
            cs.setDate(6, poareaBean.getFechModifica());
            cs.setBoolean(7, false);
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
    public boolean fnActualizarareaBean(areaBean poareaBean) throws Exception {
        boolean resultado = false;
        Connection cn = null;
        CallableStatement cs = null;
        try {
            cn = DBConnection.getInstance().openConnection();
            cn.setAutoCommit(false);
            cs = cn.prepareCall("{CALL bdhrsis.usp_area_upd(?, ?, ?, ?, ?, ?, ? )}");
            cs.setInt(1, poareaBean.getIOps());
            cs.registerOutParameter(2, java.sql.Types.BOOLEAN);
            cs.setInt(3, poareaBean.getIdArea());
            cs.setString(4, poareaBean.getDenominacion());
            cs.setDate(5, poareaBean.getFechRegistra());
            cs.setDate(6, poareaBean.getFechModifica());
            cs.setBoolean(7, true);
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
