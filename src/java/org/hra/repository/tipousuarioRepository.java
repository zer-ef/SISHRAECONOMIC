package org.hra.repository;

import org.hra.dominio.tipousuarioBean;
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
public class tipousuarioRepository {

    @Autowired
    public boolean fnIstipousuarioBean(tipousuarioBean potipousuarioBean) throws Exception {
        tipousuarioBean otipousuarioBean = null;
        Connection cn = null;
        ResultSet rs = null;
        CallableStatement cs = null;
        try {
            cn = DBConnection.getInstance().openConnection();
            cn.setAutoCommit(false);
            cs = cn.prepareCall("{CALL bdhrsis.usp_tipousuario_lst(?, ?, ?, ?, ?, ?, ?, ?, ? )}");
            cs.setInt(1, potipousuarioBean.getIOps());
            cs.registerOutParameter(2, java.sql.Types.BOOLEAN);
            cs.setInt(3, potipousuarioBean.getIdTipoUsuario());
            cs.setString(4, potipousuarioBean.getAbreviatura());
            cs.setString(5, potipousuarioBean.getDenominacion());
            cs.setString(6, potipousuarioBean.getObservacion());
            cs.setDate(7, potipousuarioBean.getFechRegistra());
            cs.setDate(8, potipousuarioBean.getFechModifica());
            cs.setBoolean(9, potipousuarioBean.getEstado());
            rs = cs.executeQuery();
            while (rs.next()) {
                otipousuarioBean = new tipousuarioBean();
                otipousuarioBean.setEstado(rs.getBoolean("IdTipoUsuario"));
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
        return otipousuarioBean != null;
    }

    @Autowired
    public List fnGetListtipousuarioBean(tipousuarioBean potipousuarioBean) throws Exception {
        List list = new LinkedList();
        Connection cn = null;
        ResultSet rs = null;
        CallableStatement cs = null;
        try {
            cn = DBConnection.getInstance().openConnection();
            cn.setAutoCommit(false);
            cs = cn.prepareCall("{CALL bdhrsis.usp_tipousuario_lst(?, ?, ?, ?, ?, ?, ?, ?, ? )}");
            cs.setInt(1, potipousuarioBean.getIOps());
            cs.registerOutParameter(2, java.sql.Types.BOOLEAN);
            cs.setInt(3, potipousuarioBean.getIdTipoUsuario());
            cs.setString(4, potipousuarioBean.getAbreviatura());
            cs.setString(5, potipousuarioBean.getDenominacion());
            cs.setString(6, potipousuarioBean.getObservacion());
            cs.setDate(7, potipousuarioBean.getFechRegistra());
            cs.setDate(8, potipousuarioBean.getFechModifica());
            cs.setBoolean(9, potipousuarioBean.getEstado());
            rs = cs.executeQuery();
            while (rs.next()) {
                Object[] obj = {rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7)};
                //Object[] obj = {rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getDate(5), rs.getDate(6), rs.getBoolean(7)}; 
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
    public List fnGridtipousuarioBean(tipousuarioBean potipousuarioBean) throws Exception {
        List lista = new LinkedList();
        Connection cn = null;
        ResultSet rs = null;
        CallableStatement cs = null;
        try {
            cn = DBConnection.getInstance().openConnection();
            cn.setAutoCommit(false);
            cs = cn.prepareCall("{CALL bdhrsis.usp_tipousuario_lst(?, ?, ?, ?, ?, ?, ?, ?, ? )}");
            cs.setInt(1, potipousuarioBean.getIOps());
            cs.registerOutParameter(2, java.sql.Types.BOOLEAN);
            cs.setInt(3, potipousuarioBean.getIdTipoUsuario());
            cs.setString(4, potipousuarioBean.getAbreviatura());
            cs.setString(5, potipousuarioBean.getDenominacion());
            cs.setString(6, potipousuarioBean.getObservacion());
            cs.setDate(7, potipousuarioBean.getFechRegistra());
            cs.setDate(8, potipousuarioBean.getFechModifica());
            cs.setBoolean(9, potipousuarioBean.getEstado());
            rs = cs.executeQuery();
            while (rs.next()) {
                Object[] obj = {rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7)};
                //Object[] obj = {rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getDate(5), rs.getDate(6), rs.getBoolean(7)}; 
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
    public ArrayList<tipousuarioBean> fnAutocompletetipousuarioBean(tipousuarioBean potipousuarioBean) throws Exception {
        ArrayList<tipousuarioBean> listatipousuarioBean = new ArrayList<tipousuarioBean>();
        Connection cn = null;
        ResultSet rs = null;
        CallableStatement cs = null;
        try {
            cn = DBConnection.getInstance().openConnection();
            cn.setAutoCommit(false);
            cs = cn.prepareCall("{CALL bdhrsis.usp_tipousuario_lst(?, ?, ?, ?, ?, ?, ?, ?, ? )}");
            cs.setInt(1, potipousuarioBean.getIOps());
            cs.registerOutParameter(2, java.sql.Types.BOOLEAN);
            cs.setInt(3, potipousuarioBean.getIdTipoUsuario());
            cs.setString(4, potipousuarioBean.getAbreviatura());
            cs.setString(5, potipousuarioBean.getDenominacion());
            cs.setString(6, potipousuarioBean.getObservacion());
            cs.setDate(7, potipousuarioBean.getFechRegistra());
            cs.setDate(8, potipousuarioBean.getFechModifica());
            cs.setBoolean(9, potipousuarioBean.getEstado());
            rs = cs.executeQuery();
            while (rs.next()) {
                tipousuarioBean otipousuarioBean = new tipousuarioBean();
                otipousuarioBean.setIdTipoUsuario(rs.getInt("IdTipoUsuario"));
                otipousuarioBean.setAbreviatura(rs.getString("Abreviatura"));
                otipousuarioBean.setDenominacion(rs.getString("Denominacion"));
                otipousuarioBean.setObservacion(rs.getString("Observacion"));
                otipousuarioBean.setFechRegistra(rs.getDate("FechRegistra"));
                otipousuarioBean.setFechModifica(rs.getDate("FechModifica"));
                otipousuarioBean.setEstado(rs.getBoolean("Estado"));
                listatipousuarioBean.add(otipousuarioBean);
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
        return listatipousuarioBean;
    }

    @Autowired
    public tipousuarioBean fnGettipousuarioBean(tipousuarioBean potipousuarioBean) throws Exception {
        tipousuarioBean otipousuarioBean = null;
        Connection cn = null;
        ResultSet rs = null;
        CallableStatement cs = null;
        try {
            cn = DBConnection.getInstance().openConnection();
            cn.setAutoCommit(false);
            cs = cn.prepareCall("{CALL bdhrsis.usp_tipousuario_lst(?, ?, ?, ?, ?, ?, ?, ?, ? )}");
            cs.setInt(1, potipousuarioBean.getIOps());
            cs.registerOutParameter(2, java.sql.Types.BOOLEAN);
            cs.setInt(3, potipousuarioBean.getIdTipoUsuario());
            cs.setString(4, potipousuarioBean.getAbreviatura());
            cs.setString(5, potipousuarioBean.getDenominacion());
            cs.setString(6, potipousuarioBean.getObservacion());
            cs.setDate(7, potipousuarioBean.getFechRegistra());
            cs.setDate(8, potipousuarioBean.getFechModifica());
            cs.setBoolean(9, potipousuarioBean.getEstado());
            rs = cs.executeQuery();
            while (rs.next()) {
                otipousuarioBean = new tipousuarioBean();
                otipousuarioBean.setIdTipoUsuario(rs.getInt("IdTipoUsuario"));
                otipousuarioBean.setAbreviatura(rs.getString("Abreviatura"));
                otipousuarioBean.setDenominacion(rs.getString("Denominacion"));
                otipousuarioBean.setObservacion(rs.getString("Observacion"));
                otipousuarioBean.setFechRegistra(rs.getDate("FechRegistra"));
                otipousuarioBean.setFechModifica(rs.getDate("FechModifica"));
                otipousuarioBean.setEstado(rs.getBoolean("Estado"));
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
        return otipousuarioBean;
    }

    @Autowired
    public boolean fnInsertartipousuarioBean(tipousuarioBean potipousuarioBean) throws Exception {
        boolean resultado = false;
        Connection cn = null;
        CallableStatement cs = null;
        try {
            cn = DBConnection.getInstance().openConnection();
            cn.setAutoCommit(false);
            cs = cn.prepareCall("{CALL bdhrsis.usp_tipousuario_ins(?, ?, ?, ?, ?, ?, ?, ?, ? )}");
            cs.setInt(1, potipousuarioBean.getIOps());
            cs.registerOutParameter(2, java.sql.Types.BOOLEAN);
            cs.setInt(3, potipousuarioBean.getIdTipoUsuario());
            cs.setString(4, potipousuarioBean.getAbreviatura());
            cs.setString(5, potipousuarioBean.getDenominacion());
            cs.setString(6, potipousuarioBean.getObservacion());
            cs.setDate(7, potipousuarioBean.getFechRegistra());
            cs.setDate(8, potipousuarioBean.getFechModifica());
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
    public boolean fnEliminartipousuarioBean(tipousuarioBean potipousuarioBean) throws Exception {
        boolean resultado = false;
        Connection cn = null;
        CallableStatement cs = null;
        try {
            cn = DBConnection.getInstance().openConnection();
            cn.setAutoCommit(false);
            cs = cn.prepareCall("{CALL bdhrsis.usp_tipousuario_upd(?, ?, ?, ?, ?, ?, ?, ?, ? )}");
            cs.setInt(1, potipousuarioBean.getIOps());
            cs.registerOutParameter(2, java.sql.Types.BOOLEAN);
            cs.setInt(3, potipousuarioBean.getIdTipoUsuario());
            cs.setString(4, potipousuarioBean.getAbreviatura());
            cs.setString(5, potipousuarioBean.getDenominacion());
            cs.setString(6, potipousuarioBean.getObservacion());
            cs.setDate(7, potipousuarioBean.getFechRegistra());
            cs.setDate(8, potipousuarioBean.getFechModifica());
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
    public boolean fnActualizartipousuarioBean(tipousuarioBean potipousuarioBean) throws Exception {
        boolean resultado = false;
        Connection cn = null;
        CallableStatement cs = null;
        try {
            cn = DBConnection.getInstance().openConnection();
            cn.setAutoCommit(false);
            cs = cn.prepareCall("{CALL bdhrsis.usp_tipousuario_upd(?, ?, ?, ?, ?, ?, ?, ?, ? )}");
            cs.setInt(1, potipousuarioBean.getIOps());
            cs.registerOutParameter(2, java.sql.Types.BOOLEAN);
            cs.setInt(3, potipousuarioBean.getIdTipoUsuario());
            cs.setString(4, potipousuarioBean.getAbreviatura());
            cs.setString(5, potipousuarioBean.getDenominacion());
            cs.setString(6, potipousuarioBean.getObservacion());
            cs.setDate(7, potipousuarioBean.getFechRegistra());
            cs.setDate(8, potipousuarioBean.getFechModifica());
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
