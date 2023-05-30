package org.hra.repository;

import org.hra.dominio.tipoinstitucionBean;
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
public class tipoinstitucionRepository {

    @Autowired
    public boolean fnIstipoinstitucionBean(tipoinstitucionBean potipoinstitucionBean) throws Exception {
        tipoinstitucionBean otipoinstitucionBean = null;
        Connection cn = null;
        ResultSet rs = null;
        CallableStatement cs = null;
        try {
            cn = DBConnection.getInstance().openConnection();
            cn.setAutoCommit(false);
            cs = cn.prepareCall("{CALL bdhrsis.usp_tipoinstitucion_lst(?, ?, ?, ?, ?, ?, ?, ?, ? )}");
            cs.setInt(1, potipoinstitucionBean.getIOps());
            cs.registerOutParameter(2, java.sql.Types.BOOLEAN);
            cs.setInt(3, potipoinstitucionBean.getIdTipoInstitucion());
            cs.setString(4, potipoinstitucionBean.getAbreviatura());
            cs.setString(5, potipoinstitucionBean.getDenominacion());
            cs.setString(6, potipoinstitucionBean.getObservacion());
            cs.setDate(7, potipoinstitucionBean.getFechRegistra());
            cs.setDate(8, potipoinstitucionBean.getFechModifica());
            cs.setBoolean(9, potipoinstitucionBean.getEstado());
            rs = cs.executeQuery();
            while (rs.next()) {
                otipoinstitucionBean = new tipoinstitucionBean();
                otipoinstitucionBean.setEstado(rs.getBoolean("IdTipoInstitucion"));
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
        return otipoinstitucionBean != null;
    }

    @Autowired
    public List fnGetListtipoinstitucionBean(tipoinstitucionBean potipoinstitucionBean) throws Exception {
        List list = new LinkedList();
        Connection cn = null;
        ResultSet rs = null;
        CallableStatement cs = null;
        try {
            cn = DBConnection.getInstance().openConnection();
            cn.setAutoCommit(false);
            cs = cn.prepareCall("{CALL bdhrsis.usp_tipoinstitucion_lst(?, ?, ?, ?, ?, ?, ?, ?, ? )}");
            cs.setInt(1, potipoinstitucionBean.getIOps());
            cs.registerOutParameter(2, java.sql.Types.BOOLEAN);
            cs.setInt(3, potipoinstitucionBean.getIdTipoInstitucion());
            cs.setString(4, potipoinstitucionBean.getAbreviatura());
            cs.setString(5, potipoinstitucionBean.getDenominacion());
            cs.setString(6, potipoinstitucionBean.getObservacion());
            cs.setDate(7, potipoinstitucionBean.getFechRegistra());
            cs.setDate(8, potipoinstitucionBean.getFechModifica());
            cs.setBoolean(9, potipoinstitucionBean.getEstado());
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
    public List fnGridtipoinstitucionBean(tipoinstitucionBean potipoinstitucionBean) throws Exception {
        List lista = new LinkedList();
        Connection cn = null;
        ResultSet rs = null;
        CallableStatement cs = null;
        try {
            cn = DBConnection.getInstance().openConnection();
            cn.setAutoCommit(false);
            cs = cn.prepareCall("{CALL bdhrsis.usp_tipoinstitucion_lst(?, ?, ?, ?, ?, ?, ?, ?, ? )}");
            cs.setInt(1, potipoinstitucionBean.getIOps());
            cs.registerOutParameter(2, java.sql.Types.BOOLEAN);
            cs.setInt(3, potipoinstitucionBean.getIdTipoInstitucion());
            cs.setString(4, potipoinstitucionBean.getAbreviatura());
            cs.setString(5, potipoinstitucionBean.getDenominacion());
            cs.setString(6, potipoinstitucionBean.getObservacion());
            cs.setDate(7, potipoinstitucionBean.getFechRegistra());
            cs.setDate(8, potipoinstitucionBean.getFechModifica());
            cs.setBoolean(9, potipoinstitucionBean.getEstado());
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
    public ArrayList<tipoinstitucionBean> fnAutocompletetipoinstitucionBean(tipoinstitucionBean potipoinstitucionBean) throws Exception {
        ArrayList<tipoinstitucionBean> listatipoinstitucionBean = new ArrayList<tipoinstitucionBean>();
        Connection cn = null;
        ResultSet rs = null;
        CallableStatement cs = null;
        try {
            cn = DBConnection.getInstance().openConnection();
            cn.setAutoCommit(false);
            cs = cn.prepareCall("{CALL bdhrsis.usp_tipoinstitucion_lst(?, ?, ?, ?, ?, ?, ?, ?, ? )}");
            cs.setInt(1, potipoinstitucionBean.getIOps());
            cs.registerOutParameter(2, java.sql.Types.BOOLEAN);
            cs.setInt(3, potipoinstitucionBean.getIdTipoInstitucion());
            cs.setString(4, potipoinstitucionBean.getAbreviatura());
            cs.setString(5, potipoinstitucionBean.getDenominacion());
            cs.setString(6, potipoinstitucionBean.getObservacion());
            cs.setDate(7, potipoinstitucionBean.getFechRegistra());
            cs.setDate(8, potipoinstitucionBean.getFechModifica());
            cs.setBoolean(9, potipoinstitucionBean.getEstado());
            rs = cs.executeQuery();
            while (rs.next()) {
                tipoinstitucionBean otipoinstitucionBean = new tipoinstitucionBean();
                otipoinstitucionBean.setIdTipoInstitucion(rs.getInt("IdTipoInstitucion"));
                otipoinstitucionBean.setAbreviatura(rs.getString("Abreviatura"));
                otipoinstitucionBean.setDenominacion(rs.getString("Denominacion"));
                otipoinstitucionBean.setObservacion(rs.getString("Observacion"));
                otipoinstitucionBean.setFechRegistra(rs.getDate("FechRegistra"));
                otipoinstitucionBean.setFechModifica(rs.getDate("FechModifica"));
                otipoinstitucionBean.setEstado(rs.getBoolean("Estado"));
                listatipoinstitucionBean.add(otipoinstitucionBean);
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
        return listatipoinstitucionBean;
    }

    @Autowired
    public tipoinstitucionBean fnGettipoinstitucionBean(tipoinstitucionBean potipoinstitucionBean) throws Exception {
        tipoinstitucionBean otipoinstitucionBean = null;
        Connection cn = null;
        ResultSet rs = null;
        CallableStatement cs = null;
        try {
            cn = DBConnection.getInstance().openConnection();
            cn.setAutoCommit(false);
            cs = cn.prepareCall("{CALL bdhrsis.usp_tipoinstitucion_lst(?, ?, ?, ?, ?, ?, ?, ?, ? )}");
            cs.setInt(1, potipoinstitucionBean.getIOps());
            cs.registerOutParameter(2, java.sql.Types.BOOLEAN);
            cs.setInt(3, potipoinstitucionBean.getIdTipoInstitucion());
            cs.setString(4, potipoinstitucionBean.getAbreviatura());
            cs.setString(5, potipoinstitucionBean.getDenominacion());
            cs.setString(6, potipoinstitucionBean.getObservacion());
            cs.setDate(7, potipoinstitucionBean.getFechRegistra());
            cs.setDate(8, potipoinstitucionBean.getFechModifica());
            cs.setBoolean(9, potipoinstitucionBean.getEstado());
            rs = cs.executeQuery();
            while (rs.next()) {
                otipoinstitucionBean = new tipoinstitucionBean();
                otipoinstitucionBean.setIdTipoInstitucion(rs.getInt("IdTipoInstitucion"));
                otipoinstitucionBean.setAbreviatura(rs.getString("Abreviatura"));
                otipoinstitucionBean.setDenominacion(rs.getString("Denominacion"));
                otipoinstitucionBean.setObservacion(rs.getString("Observacion"));
                otipoinstitucionBean.setFechRegistra(rs.getDate("FechRegistra"));
                otipoinstitucionBean.setFechModifica(rs.getDate("FechModifica"));
                otipoinstitucionBean.setEstado(rs.getBoolean("Estado"));
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
        return otipoinstitucionBean;
    }

    @Autowired
    public boolean fnInsertartipoinstitucionBean(tipoinstitucionBean potipoinstitucionBean) throws Exception {
        boolean resultado = false;
        Connection cn = null;
        CallableStatement cs = null;
        try {
            cn = DBConnection.getInstance().openConnection();
            cn.setAutoCommit(false);
            cs = cn.prepareCall("{CALL bdhrsis.usp_tipoinstitucion_ins(?, ?, ?, ?, ?, ?, ?, ?, ? )}");
            cs.setInt(1, potipoinstitucionBean.getIOps());
            cs.registerOutParameter(2, java.sql.Types.BOOLEAN);
            cs.setInt(3, potipoinstitucionBean.getIdTipoInstitucion());
            cs.setString(4, potipoinstitucionBean.getAbreviatura());
            cs.setString(5, potipoinstitucionBean.getDenominacion());
            cs.setString(6, potipoinstitucionBean.getObservacion());
            cs.setDate(7, potipoinstitucionBean.getFechRegistra());
            cs.setDate(8, potipoinstitucionBean.getFechModifica());
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
    public boolean fnEliminartipoinstitucionBean(tipoinstitucionBean potipoinstitucionBean) throws Exception {
        boolean resultado = false;
        Connection cn = null;
        CallableStatement cs = null;
        try {
            cn = DBConnection.getInstance().openConnection();
            cn.setAutoCommit(false);
            cs = cn.prepareCall("{CALL bdhrsis.usp_tipoinstitucion_upd(?, ?, ?, ?, ?, ?, ?, ?, ? )}");
            cs.setInt(1, potipoinstitucionBean.getIOps());
            cs.registerOutParameter(2, java.sql.Types.BOOLEAN);
            cs.setInt(3, potipoinstitucionBean.getIdTipoInstitucion());
            cs.setString(4, potipoinstitucionBean.getAbreviatura());
            cs.setString(5, potipoinstitucionBean.getDenominacion());
            cs.setString(6, potipoinstitucionBean.getObservacion());
            cs.setDate(7, potipoinstitucionBean.getFechRegistra());
            cs.setDate(8, potipoinstitucionBean.getFechModifica());
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
    public boolean fnActualizartipoinstitucionBean(tipoinstitucionBean potipoinstitucionBean) throws Exception {
        boolean resultado = false;
        Connection cn = null;
        CallableStatement cs = null;
        try {
            cn = DBConnection.getInstance().openConnection();
            cn.setAutoCommit(false);
            cs = cn.prepareCall("{CALL bdhrsis.usp_tipoinstitucion_upd(?, ?, ?, ?, ?, ?, ?, ?, ? )}");
            cs.setInt(1, potipoinstitucionBean.getIOps());
            cs.registerOutParameter(2, java.sql.Types.BOOLEAN);
            cs.setInt(3, potipoinstitucionBean.getIdTipoInstitucion());
            cs.setString(4, potipoinstitucionBean.getAbreviatura());
            cs.setString(5, potipoinstitucionBean.getDenominacion());
            cs.setString(6, potipoinstitucionBean.getObservacion());
            cs.setDate(7, potipoinstitucionBean.getFechRegistra());
            cs.setDate(8, potipoinstitucionBean.getFechModifica());
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
