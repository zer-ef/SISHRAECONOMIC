package org.hra.repository;

import org.hra.dominio.tipodocumentoBean;
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
public class tipodocumentoRepository {

    @Autowired
    public boolean fnIstipodocumentoBean(tipodocumentoBean potipodocumentoBean) throws Exception {
        tipodocumentoBean otipodocumentoBean = null;
        Connection cn = null;
        ResultSet rs = null;
        CallableStatement cs = null;
        try {
            cn = DBConnection.getInstance().openConnection();
            cn.setAutoCommit(false);
            cs = cn.prepareCall("{CALL bdhrsis.usp_tipodocumento_lst(?, ?, ?, ?, ?, ?, ?, ? )}");
            cs.setInt(1, potipodocumentoBean.getIOps());
            cs.registerOutParameter(2, java.sql.Types.BOOLEAN);
            cs.setInt(3, potipodocumentoBean.getIdTipoDocumento());
            cs.setString(4, potipodocumentoBean.getDenominacion());
            cs.setString(5, potipodocumentoBean.getObservacion());
            cs.setDate(6, potipodocumentoBean.getFechRegistra());
            cs.setDate(7, potipodocumentoBean.getFechModifica());
            cs.setBoolean(8, potipodocumentoBean.getEstado());
            rs = cs.executeQuery();
            while (rs.next()) {
                otipodocumentoBean = new tipodocumentoBean();
                otipodocumentoBean.setEstado(rs.getBoolean("IdTipoDocumento"));
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
        return otipodocumentoBean != null;
    }

    @Autowired
    public List fnGetListtipodocumentoBean(tipodocumentoBean potipodocumentoBean) throws Exception {
        List list = new LinkedList();
        Connection cn = null;
        ResultSet rs = null;
        CallableStatement cs = null;
        try {
            cn = DBConnection.getInstance().openConnection();
            cn.setAutoCommit(false);
            cs = cn.prepareCall("{CALL bdhrsis.usp_tipodocumento_lst(?, ?, ?, ?, ?, ?, ?, ? )}");
            cs.setInt(1, potipodocumentoBean.getIOps());
            cs.registerOutParameter(2, java.sql.Types.BOOLEAN);
            cs.setInt(3, potipodocumentoBean.getIdTipoDocumento());
            cs.setString(4, potipodocumentoBean.getDenominacion());
            cs.setString(5, potipodocumentoBean.getObservacion());
            cs.setDate(6, potipodocumentoBean.getFechRegistra());
            cs.setDate(7, potipodocumentoBean.getFechModifica());
            cs.setBoolean(8, potipodocumentoBean.getEstado());
            rs = cs.executeQuery();
            while (rs.next()) {
                Object[] obj = {rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6)};
                //Object[] obj = {rs.getInt(1), rs.getString(2), rs.getString(3), rs.getDate(4), rs.getDate(5), rs.getBoolean(6)}; 
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
    public List fnGridtipodocumentoBean(tipodocumentoBean potipodocumentoBean) throws Exception {
        List lista = new LinkedList();
        Connection cn = null;
        ResultSet rs = null;
        CallableStatement cs = null;
        try {
            cn = DBConnection.getInstance().openConnection();
            cn.setAutoCommit(false);
            cs = cn.prepareCall("{CALL bdhrsis.usp_tipodocumento_lst(?, ?, ?, ?, ?, ?, ?, ? )}");
            cs.setInt(1, potipodocumentoBean.getIOps());
            cs.registerOutParameter(2, java.sql.Types.BOOLEAN);
            cs.setInt(3, potipodocumentoBean.getIdTipoDocumento());
            cs.setString(4, potipodocumentoBean.getDenominacion());
            cs.setString(5, potipodocumentoBean.getObservacion());
            cs.setDate(6, potipodocumentoBean.getFechRegistra());
            cs.setDate(7, potipodocumentoBean.getFechModifica());
            cs.setBoolean(8, potipodocumentoBean.getEstado());
            rs = cs.executeQuery();
            while (rs.next()) {
                Object[] obj = {rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6)};
                //Object[] obj = {rs.getInt(1), rs.getString(2), rs.getString(3), rs.getDate(4), rs.getDate(5), rs.getBoolean(6)}; 
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
    public ArrayList<tipodocumentoBean> fnAutocompletetipodocumentoBean(tipodocumentoBean potipodocumentoBean) throws Exception {
        ArrayList<tipodocumentoBean> listatipodocumentoBean = new ArrayList<tipodocumentoBean>();
        Connection cn = null;
        ResultSet rs = null;
        CallableStatement cs = null;
        try {
            cn = DBConnection.getInstance().openConnection();
            cn.setAutoCommit(false);
            cs = cn.prepareCall("{CALL bdhrsis.usp_tipodocumento_lst(?, ?, ?, ?, ?, ?, ?, ? )}");
            cs.setInt(1, potipodocumentoBean.getIOps());
            cs.registerOutParameter(2, java.sql.Types.BOOLEAN);
            cs.setInt(3, potipodocumentoBean.getIdTipoDocumento());
            cs.setString(4, potipodocumentoBean.getDenominacion());
            cs.setString(5, potipodocumentoBean.getObservacion());
            cs.setDate(6, potipodocumentoBean.getFechRegistra());
            cs.setDate(7, potipodocumentoBean.getFechModifica());
            cs.setBoolean(8, potipodocumentoBean.getEstado());
            rs = cs.executeQuery();
            while (rs.next()) {
                tipodocumentoBean otipodocumentoBean = new tipodocumentoBean();
                otipodocumentoBean.setIdTipoDocumento(rs.getInt("IdTipoDocumento"));
                otipodocumentoBean.setDenominacion(rs.getString("Denominacion"));
                otipodocumentoBean.setObservacion(rs.getString("Observacion"));
                otipodocumentoBean.setFechRegistra(rs.getDate("FechRegistra"));
                otipodocumentoBean.setFechModifica(rs.getDate("FechModifica"));
                otipodocumentoBean.setEstado(rs.getBoolean("Estado"));
                listatipodocumentoBean.add(otipodocumentoBean);
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
        return listatipodocumentoBean;
    }

    @Autowired
    public tipodocumentoBean fnGettipodocumentoBean(tipodocumentoBean potipodocumentoBean) throws Exception {
        tipodocumentoBean otipodocumentoBean = null;
        Connection cn = null;
        ResultSet rs = null;
        CallableStatement cs = null;
        try {
            cn = DBConnection.getInstance().openConnection();
            cn.setAutoCommit(false);
            cs = cn.prepareCall("{CALL bdhrsis.usp_tipodocumento_lst(?, ?, ?, ?, ?, ?, ?, ? )}");
            cs.setInt(1, potipodocumentoBean.getIOps());
            cs.registerOutParameter(2, java.sql.Types.BOOLEAN);
            cs.setInt(3, potipodocumentoBean.getIdTipoDocumento());
            cs.setString(4, potipodocumentoBean.getDenominacion());
            cs.setString(5, potipodocumentoBean.getObservacion());
            cs.setDate(6, potipodocumentoBean.getFechRegistra());
            cs.setDate(7, potipodocumentoBean.getFechModifica());
            cs.setBoolean(8, potipodocumentoBean.getEstado());
            rs = cs.executeQuery();
            while (rs.next()) {
                otipodocumentoBean = new tipodocumentoBean();
                otipodocumentoBean.setIdTipoDocumento(rs.getInt("IdTipoDocumento"));
                otipodocumentoBean.setDenominacion(rs.getString("Denominacion"));
                otipodocumentoBean.setObservacion(rs.getString("Observacion"));
                otipodocumentoBean.setFechRegistra(rs.getDate("FechRegistra"));
                otipodocumentoBean.setFechModifica(rs.getDate("FechModifica"));
                otipodocumentoBean.setEstado(rs.getBoolean("Estado"));
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
        return otipodocumentoBean;
    }

    @Autowired
    public boolean fnInsertartipodocumentoBean(tipodocumentoBean potipodocumentoBean) throws Exception {
        boolean resultado = false;
        Connection cn = null;
        CallableStatement cs = null;
        try {
            cn = DBConnection.getInstance().openConnection();
            cn.setAutoCommit(false);
            cs = cn.prepareCall("{CALL bdhrsis.usp_tipodocumento_ins(?, ?, ?, ?, ?, ?, ?, ? )}");
            cs.setInt(1, potipodocumentoBean.getIOps());
            cs.registerOutParameter(2, java.sql.Types.BOOLEAN);
            cs.setInt(3, potipodocumentoBean.getIdTipoDocumento());
            cs.setString(4, potipodocumentoBean.getDenominacion());
            cs.setString(5, potipodocumentoBean.getObservacion());
            cs.setDate(6, potipodocumentoBean.getFechRegistra());
            cs.setDate(7, potipodocumentoBean.getFechModifica());
            cs.setBoolean(8, true);
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
    public boolean fnEliminartipodocumentoBean(tipodocumentoBean potipodocumentoBean) throws Exception {
        boolean resultado = false;
        Connection cn = null;
        CallableStatement cs = null;
        try {
            cn = DBConnection.getInstance().openConnection();
            cn.setAutoCommit(false);
            cs = cn.prepareCall("{CALL bdhrsis.usp_tipodocumento_upd(?, ?, ?, ?, ?, ?, ?, ? )}");
            cs.setInt(1, potipodocumentoBean.getIOps());
            cs.registerOutParameter(2, java.sql.Types.BOOLEAN);
            cs.setInt(3, potipodocumentoBean.getIdTipoDocumento());
            cs.setString(4, potipodocumentoBean.getDenominacion());
            cs.setString(5, potipodocumentoBean.getObservacion());
            cs.setDate(6, potipodocumentoBean.getFechRegistra());
            cs.setDate(7, potipodocumentoBean.getFechModifica());
            cs.setBoolean(8, false);
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
    public boolean fnActualizartipodocumentoBean(tipodocumentoBean potipodocumentoBean) throws Exception {
        boolean resultado = false;
        Connection cn = null;
        CallableStatement cs = null;
        try {
            cn = DBConnection.getInstance().openConnection();
            cn.setAutoCommit(false);
            cs = cn.prepareCall("{CALL bdhrsis.usp_tipodocumento_upd(?, ?, ?, ?, ?, ?, ?, ? )}");
            cs.setInt(1, potipodocumentoBean.getIOps());
            cs.registerOutParameter(2, java.sql.Types.BOOLEAN);
            cs.setInt(3, potipodocumentoBean.getIdTipoDocumento());
            cs.setString(4, potipodocumentoBean.getDenominacion());
            cs.setString(5, potipodocumentoBean.getObservacion());
            cs.setDate(6, potipodocumentoBean.getFechRegistra());
            cs.setDate(7, potipodocumentoBean.getFechModifica());
            cs.setBoolean(8, true);
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
