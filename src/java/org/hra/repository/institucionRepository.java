package org.hra.repository;

import org.hra.dominio.institucionBean;
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
public class institucionRepository {

    @Autowired
    public boolean fnIsinstitucionBean(institucionBean poinstitucionBean) throws Exception {
        institucionBean oinstitucionBean = null;
        Connection cn = null;
        ResultSet rs = null;
        CallableStatement cs = null;
        try {
            cn = DBConnection.getInstance().openConnection();
            cn.setAutoCommit(false);
            cs = cn.prepareCall("{CALL bdhrsis.usp_institucion_lst(?, ?, ?, ?, ?, ?, ?, ?, ? )}");
            cs.setInt(1, poinstitucionBean.getIOps());
            cs.registerOutParameter(2, java.sql.Types.BOOLEAN);
            cs.setInt(3, poinstitucionBean.getIdInstitucion());
            cs.setString(4, poinstitucionBean.getNombreIstitucion());
            cs.setString(5, poinstitucionBean.getIdTipoInstitucion());
            cs.setString(6, poinstitucionBean.getLugar());
            cs.setDate(7, poinstitucionBean.getFechRegistra());
            cs.setDate(8, poinstitucionBean.getFechModifica());
            cs.setBoolean(9, poinstitucionBean.getEstado());
            rs = cs.executeQuery();
            while (rs.next()) {
                oinstitucionBean = new institucionBean();
                oinstitucionBean.setEstado(rs.getBoolean("IdInstitucion"));
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
        return oinstitucionBean != null;
    }

    @Autowired
    public List fnGetListinstitucionBean(institucionBean poinstitucionBean) throws Exception {
        List list = new LinkedList();
        Connection cn = null;
        ResultSet rs = null;
        CallableStatement cs = null;
        try {
            cn = DBConnection.getInstance().openConnection();
            cn.setAutoCommit(false);
            cs = cn.prepareCall("{CALL bdhrsis.usp_institucion_lst(?, ?, ?, ?, ?, ?, ?, ?, ? )}");
            cs.setInt(1, poinstitucionBean.getIOps());
            cs.registerOutParameter(2, java.sql.Types.BOOLEAN);
            cs.setInt(3, poinstitucionBean.getIdInstitucion());
            cs.setString(4, poinstitucionBean.getNombreIstitucion());
            cs.setString(5, poinstitucionBean.getIdTipoInstitucion());
            cs.setString(6, poinstitucionBean.getLugar());
            cs.setDate(7, poinstitucionBean.getFechRegistra());
            cs.setDate(8, poinstitucionBean.getFechModifica());
            cs.setBoolean(9, poinstitucionBean.getEstado());
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
    public List fnGridinstitucionBean(institucionBean poinstitucionBean) throws Exception {
        List lista = new LinkedList();
        Connection cn = null;
        ResultSet rs = null;
        CallableStatement cs = null;
        try {
            cn = DBConnection.getInstance().openConnection();
            cn.setAutoCommit(false);
            cs = cn.prepareCall("{CALL bdhrsis.usp_institucion_lst(?, ?, ?, ?, ?, ?, ?, ?, ? )}");
            cs.setInt(1, poinstitucionBean.getIOps());
            cs.registerOutParameter(2, java.sql.Types.BOOLEAN);
            cs.setInt(3, poinstitucionBean.getIdInstitucion());
            cs.setString(4, poinstitucionBean.getNombreIstitucion());
            cs.setString(5, poinstitucionBean.getIdTipoInstitucion());
            cs.setString(6, poinstitucionBean.getLugar());
            cs.setDate(7, poinstitucionBean.getFechRegistra());
            cs.setDate(8, poinstitucionBean.getFechModifica());
            cs.setBoolean(9, poinstitucionBean.getEstado());
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
    public ArrayList<institucionBean> fnAutocompleteinstitucionBean(institucionBean poinstitucionBean) throws Exception {
        ArrayList<institucionBean> listainstitucionBean = new ArrayList<institucionBean>();
        Connection cn = null;
        ResultSet rs = null;
        CallableStatement cs = null;
        try {
            cn = DBConnection.getInstance().openConnection();
            cn.setAutoCommit(false);
            cs = cn.prepareCall("{CALL bdhrsis.usp_institucion_lst(?, ?, ?, ?, ?, ?, ?, ?, ? )}");
            cs.setInt(1, poinstitucionBean.getIOps());
            cs.registerOutParameter(2, java.sql.Types.BOOLEAN);
            cs.setInt(3, poinstitucionBean.getIdInstitucion());
            cs.setString(4, poinstitucionBean.getNombreIstitucion());
            cs.setString(5, poinstitucionBean.getIdTipoInstitucion());
            cs.setString(6, poinstitucionBean.getLugar());
            cs.setDate(7, poinstitucionBean.getFechRegistra());
            cs.setDate(8, poinstitucionBean.getFechModifica());
            cs.setBoolean(9, poinstitucionBean.getEstado());
            rs = cs.executeQuery();
            while (rs.next()) {
                institucionBean oinstitucionBean = new institucionBean();
                oinstitucionBean.setIdInstitucion(rs.getInt("IdInstitucion"));
                oinstitucionBean.setNombreIstitucion(rs.getString("NombreIstitucion"));
                oinstitucionBean.setIdTipoInstitucion(rs.getString("IdTipoInstitucion"));
                oinstitucionBean.setLugar(rs.getString("Lugar"));
                oinstitucionBean.setFechRegistra(rs.getDate("FechRegistra"));
                oinstitucionBean.setFechModifica(rs.getDate("FechModifica"));
                oinstitucionBean.setEstado(rs.getBoolean("Estado"));
                listainstitucionBean.add(oinstitucionBean);
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
        return listainstitucionBean;
    }

    @Autowired
    public institucionBean fnGetinstitucionBean(institucionBean poinstitucionBean) throws Exception {
        institucionBean oinstitucionBean = null;
        Connection cn = null;
        ResultSet rs = null;
        CallableStatement cs = null;
        try {
            cn = DBConnection.getInstance().openConnection();
            cn.setAutoCommit(false);
            cs = cn.prepareCall("{CALL bdhrsis.usp_institucion_lst(?, ?, ?, ?, ?, ?, ?, ?, ? )}");
            cs.setInt(1, poinstitucionBean.getIOps());
            cs.registerOutParameter(2, java.sql.Types.BOOLEAN);
            cs.setInt(3, poinstitucionBean.getIdInstitucion());
            cs.setString(4, poinstitucionBean.getNombreIstitucion());
            cs.setString(5, poinstitucionBean.getIdTipoInstitucion());
            cs.setString(6, poinstitucionBean.getLugar());
            cs.setDate(7, poinstitucionBean.getFechRegistra());
            cs.setDate(8, poinstitucionBean.getFechModifica());
            cs.setBoolean(9, poinstitucionBean.getEstado());
            rs = cs.executeQuery();
            while (rs.next()) {
                oinstitucionBean = new institucionBean();
                oinstitucionBean.setIdInstitucion(rs.getInt("IdInstitucion"));
                oinstitucionBean.setNombreIstitucion(rs.getString("NombreIstitucion"));
                oinstitucionBean.setIdTipoInstitucion(rs.getString("IdTipoInstitucion"));
                oinstitucionBean.setLugar(rs.getString("Lugar"));
                oinstitucionBean.setFechRegistra(rs.getDate("FechRegistra"));
                oinstitucionBean.setFechModifica(rs.getDate("FechModifica"));
                oinstitucionBean.setEstado(rs.getBoolean("Estado"));
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
        return oinstitucionBean;
    }

    @Autowired
    public boolean fnInsertarinstitucionBean(institucionBean poinstitucionBean) throws Exception {
        boolean resultado = false;
        Connection cn = null;
        CallableStatement cs = null;
        try {
            cn = DBConnection.getInstance().openConnection();
            cn.setAutoCommit(false);
            cs = cn.prepareCall("{CALL bdhrsis.usp_institucion_ins(?, ?, ?, ?, ?, ?, ?, ?, ? )}");
            cs.setInt(1, poinstitucionBean.getIOps());
            cs.registerOutParameter(2, java.sql.Types.BOOLEAN);
            cs.setInt(3, poinstitucionBean.getIdInstitucion());
            cs.setString(4, poinstitucionBean.getNombreIstitucion());
            cs.setString(5, poinstitucionBean.getIdTipoInstitucion());
            cs.setString(6, poinstitucionBean.getLugar());
            cs.setDate(7, poinstitucionBean.getFechRegistra());
            cs.setDate(8, poinstitucionBean.getFechModifica());
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
    public boolean fnEliminarinstitucionBean(institucionBean poinstitucionBean) throws Exception {
        boolean resultado = false;
        Connection cn = null;
        CallableStatement cs = null;
        try {
            cn = DBConnection.getInstance().openConnection();
            cn.setAutoCommit(false);
            cs = cn.prepareCall("{CALL bdhrsis.usp_institucion_upd(?, ?, ?, ?, ?, ?, ?, ?, ? )}");
            cs.setInt(1, poinstitucionBean.getIOps());
            cs.registerOutParameter(2, java.sql.Types.BOOLEAN);
            cs.setInt(3, poinstitucionBean.getIdInstitucion());
            cs.setString(4, poinstitucionBean.getNombreIstitucion());
            cs.setString(5, poinstitucionBean.getIdTipoInstitucion());
            cs.setString(6, poinstitucionBean.getLugar());
            cs.setDate(7, poinstitucionBean.getFechRegistra());
            cs.setDate(8, poinstitucionBean.getFechModifica());
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
    public boolean fnActualizarinstitucionBean(institucionBean poinstitucionBean) throws Exception {
        boolean resultado = false;
        Connection cn = null;
        CallableStatement cs = null;
        try {
            cn = DBConnection.getInstance().openConnection();
            cn.setAutoCommit(false);
            cs = cn.prepareCall("{CALL bdhrsis.usp_institucion_upd(?, ?, ?, ?, ?, ?, ?, ?, ? )}");
            cs.setInt(1, poinstitucionBean.getIOps());
            cs.registerOutParameter(2, java.sql.Types.BOOLEAN);
            cs.setInt(3, poinstitucionBean.getIdInstitucion());
            cs.setString(4, poinstitucionBean.getNombreIstitucion());
            cs.setString(5, poinstitucionBean.getIdTipoInstitucion());
            cs.setString(6, poinstitucionBean.getLugar());
            cs.setDate(7, poinstitucionBean.getFechRegistra());
            cs.setDate(8, poinstitucionBean.getFechModifica());
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
