package org.hra.repository;

import org.hra.dominio.usuarioBean;
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
public class usuarioRepository {

    @Autowired
    public boolean fnIsusuarioBean(usuarioBean pousuarioBean) throws Exception {
        usuarioBean ousuarioBean = null;
        Connection cn = null;
        ResultSet rs = null;
        CallableStatement cs = null;
        try {
            cn = DBConnection.getInstance().openConnection();
            cn.setAutoCommit(false);
            cs = cn.prepareCall("{CALL bdhrsis.usp_usuario_lst(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ? )}");
            cs.setInt(1, pousuarioBean.getIOps());
            cs.registerOutParameter(2, java.sql.Types.BOOLEAN);
            cs.setInt(3, pousuarioBean.getIdUsuario());
            cs.setInt(4, pousuarioBean.getIdPersonal());
            cs.setInt(5, pousuarioBean.getIdTipoUsuario());
            cs.setString(6, pousuarioBean.getNombUsuario());
            cs.setString(7, pousuarioBean.getContrasenia());
            cs.setString(8, pousuarioBean.getObservacion());
            cs.setDate(9, pousuarioBean.getFechRegistra());
            cs.setDate(10, pousuarioBean.getFechModifica());
            cs.setBoolean(11, pousuarioBean.getEstado());
            rs = cs.executeQuery();
            while (rs.next()) {
                ousuarioBean = new usuarioBean();
                ousuarioBean.setEstado(rs.getBoolean("IdUsuario"));
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
        return ousuarioBean != null;
    }

    @Autowired
    public List fnGetListusuarioBean(usuarioBean pousuarioBean) throws Exception {
        List list = new LinkedList();
        Connection cn = null;
        ResultSet rs = null;
        CallableStatement cs = null;
        try {
            cn = DBConnection.getInstance().openConnection();
            cn.setAutoCommit(false);
            cs = cn.prepareCall("{CALL bdhrsis.usp_usuario_lst(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ? )}");
            cs.setInt(1, pousuarioBean.getIOps());
            cs.registerOutParameter(2, java.sql.Types.BOOLEAN);
            cs.setInt(3, pousuarioBean.getIdUsuario());
            cs.setInt(4, pousuarioBean.getIdPersonal());
            cs.setInt(5, pousuarioBean.getIdTipoUsuario());
            cs.setString(6, pousuarioBean.getNombUsuario());
            cs.setString(7, pousuarioBean.getContrasenia());
            cs.setString(8, pousuarioBean.getObservacion());
            cs.setDate(9, pousuarioBean.getFechRegistra());
            cs.setDate(10, pousuarioBean.getFechModifica());
            cs.setBoolean(11, pousuarioBean.getEstado());
            rs = cs.executeQuery();
            while (rs.next()) {
                Object[] obj = {rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9)};
                //Object[] obj = {rs.getInt(1), rs.getInt(2), rs.getInt(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getDate(7), rs.getDate(8), rs.getBoolean(9)}; 
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
    public List fnGridusuarioBean(usuarioBean pousuarioBean) throws Exception {
        List lista = new LinkedList();
        Connection cn = null;
        ResultSet rs = null;
        CallableStatement cs = null;
        try {
            cn = DBConnection.getInstance().openConnection();
            cn.setAutoCommit(false);
            cs = cn.prepareCall("{CALL bdhrsis.usp_usuario_lst(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ? )}");
            cs.setInt(1, pousuarioBean.getIOps());
            cs.registerOutParameter(2, java.sql.Types.BOOLEAN);
            cs.setInt(3, pousuarioBean.getIdUsuario());
            cs.setInt(4, pousuarioBean.getIdPersonal());
            cs.setInt(5, pousuarioBean.getIdTipoUsuario());
            cs.setString(6, pousuarioBean.getNombUsuario());
            cs.setString(7, pousuarioBean.getContrasenia());
            cs.setString(8, pousuarioBean.getObservacion());
            cs.setDate(9, pousuarioBean.getFechRegistra());
            cs.setDate(10, pousuarioBean.getFechModifica());
            cs.setBoolean(11, pousuarioBean.getEstado());
            rs = cs.executeQuery();
            while (rs.next()) {
                Object[] obj = {rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9)};
                //Object[] obj = {rs.getInt(1), rs.getInt(2), rs.getInt(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getDate(7), rs.getDate(8), rs.getBoolean(9)}; 
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
    public ArrayList<usuarioBean> fnAutocompleteusuarioBean(usuarioBean pousuarioBean) throws Exception {
        ArrayList<usuarioBean> listausuarioBean = new ArrayList<usuarioBean>();
        Connection cn = null;
        ResultSet rs = null;
        CallableStatement cs = null;
        try {
            cn = DBConnection.getInstance().openConnection();
            cn.setAutoCommit(false);
            cs = cn.prepareCall("{CALL bdhrsis.usp_usuario_lst(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ? )}");
            cs.setInt(1, pousuarioBean.getIOps());
            cs.registerOutParameter(2, java.sql.Types.BOOLEAN);
            cs.setInt(3, pousuarioBean.getIdUsuario());
            cs.setInt(4, pousuarioBean.getIdPersonal());
            cs.setInt(5, pousuarioBean.getIdTipoUsuario());
            cs.setString(6, pousuarioBean.getNombUsuario());
            cs.setString(7, pousuarioBean.getContrasenia());
            cs.setString(8, pousuarioBean.getObservacion());
            cs.setDate(9, pousuarioBean.getFechRegistra());
            cs.setDate(10, pousuarioBean.getFechModifica());
            cs.setBoolean(11, pousuarioBean.getEstado());
            rs = cs.executeQuery();
            while (rs.next()) {
                usuarioBean ousuarioBean = new usuarioBean();
                ousuarioBean.setIdUsuario(rs.getInt("IdUsuario"));
                ousuarioBean.setIdPersonal(rs.getInt("IdPersonal"));
                ousuarioBean.setIdTipoUsuario(rs.getInt("IdTipoUsuario"));
                ousuarioBean.setNombUsuario(rs.getString("NombUsuario"));
                ousuarioBean.setContrasenia(rs.getString("Contrasenia"));
                ousuarioBean.setObservacion(rs.getString("Observacion"));
                ousuarioBean.setFechRegistra(rs.getDate("FechRegistra"));
                ousuarioBean.setFechModifica(rs.getDate("FechModifica"));
                ousuarioBean.setEstado(rs.getBoolean("Estado"));
                listausuarioBean.add(ousuarioBean);
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
        return listausuarioBean;
    }

    @Autowired
    public usuarioBean fnGetusuarioBean(usuarioBean pousuarioBean) throws Exception {
        usuarioBean ousuarioBean = null;
        Connection cn = null;
        ResultSet rs = null;
        CallableStatement cs = null;
        try {
            cn = DBConnection.getInstance().openConnection();
            cn.setAutoCommit(false);
            cs = cn.prepareCall("{CALL bdhrsis.usp_usuario_lst(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ? )}");
            cs.setInt(1, pousuarioBean.getIOps());
            cs.registerOutParameter(2, java.sql.Types.BOOLEAN);
            cs.setInt(3, pousuarioBean.getIdUsuario());
            cs.setInt(4, pousuarioBean.getIdPersonal());
            cs.setInt(5, pousuarioBean.getIdTipoUsuario());
            cs.setString(6, pousuarioBean.getNombUsuario());
            cs.setString(7, pousuarioBean.getContrasenia());
            cs.setString(8, pousuarioBean.getObservacion());
            cs.setDate(9, pousuarioBean.getFechRegistra());
            cs.setDate(10, pousuarioBean.getFechModifica());
            cs.setBoolean(11, pousuarioBean.getEstado());
            rs = cs.executeQuery();
            while (rs.next()) {
                ousuarioBean = new usuarioBean();
                ousuarioBean.setIdUsuario(rs.getInt("IdUsuario"));
                ousuarioBean.setIdPersonal(rs.getInt("IdPersonal"));
                ousuarioBean.setIdTipoUsuario(rs.getInt("IdTipoUsuario"));
                ousuarioBean.setNombUsuario(rs.getString("NombUsuario"));
                ousuarioBean.setContrasenia(rs.getString("Contrasenia"));
                ousuarioBean.setObservacion(rs.getString("Observacion"));
                ousuarioBean.setFechRegistra(rs.getDate("FechRegistra"));
                ousuarioBean.setFechModifica(rs.getDate("FechModifica"));
                ousuarioBean.setEstado(rs.getBoolean("Estado"));
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
        return ousuarioBean;
    }

    @Autowired
    public boolean fnInsertarusuarioBean(usuarioBean pousuarioBean) throws Exception {
        boolean resultado = false;
        Connection cn = null;
        CallableStatement cs = null;
        try {
            cn = DBConnection.getInstance().openConnection();
            cn.setAutoCommit(false);
            cs = cn.prepareCall("{CALL bdhrsis.usp_usuario_ins(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ? )}");
            cs.setInt(1, pousuarioBean.getIOps());
            cs.registerOutParameter(2, java.sql.Types.BOOLEAN);
            cs.setInt(3, pousuarioBean.getIdUsuario());
            cs.setInt(4, pousuarioBean.getIdPersonal());
            cs.setInt(5, pousuarioBean.getIdTipoUsuario());
            cs.setString(6, pousuarioBean.getNombUsuario());
            cs.setString(7, pousuarioBean.getContrasenia());
            cs.setString(8, pousuarioBean.getObservacion());
            cs.setDate(9, pousuarioBean.getFechRegistra());
            cs.setDate(10, pousuarioBean.getFechModifica());
            cs.setBoolean(11, true);
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
    public boolean fnEliminarusuarioBean(usuarioBean pousuarioBean) throws Exception {
        boolean resultado = false;
        Connection cn = null;
        CallableStatement cs = null;
        try {
            cn = DBConnection.getInstance().openConnection();
            cn.setAutoCommit(false);
            cs = cn.prepareCall("{CALL bdhrsis.usp_usuario_upd(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ? )}");
            cs.setInt(1, pousuarioBean.getIOps());
            cs.registerOutParameter(2, java.sql.Types.BOOLEAN);
            cs.setInt(3, pousuarioBean.getIdUsuario());
            cs.setInt(4, pousuarioBean.getIdPersonal());
            cs.setInt(5, pousuarioBean.getIdTipoUsuario());
            cs.setString(6, pousuarioBean.getNombUsuario());
            cs.setString(7, pousuarioBean.getContrasenia());
            cs.setString(8, pousuarioBean.getObservacion());
            cs.setDate(9, pousuarioBean.getFechRegistra());
            cs.setDate(10, pousuarioBean.getFechModifica());
            cs.setBoolean(11, false);
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
    public boolean fnActualizarusuarioBean(usuarioBean pousuarioBean) throws Exception {
        boolean resultado = false;
        Connection cn = null;
        CallableStatement cs = null;
        try {
            cn = DBConnection.getInstance().openConnection();
            cn.setAutoCommit(false);
            cs = cn.prepareCall("{CALL bdhrsis.usp_usuario_upd(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ? )}");
            cs.setInt(1, pousuarioBean.getIOps());
            cs.registerOutParameter(2, java.sql.Types.BOOLEAN);
            cs.setInt(3, pousuarioBean.getIdUsuario());
            cs.setInt(4, pousuarioBean.getIdPersonal());
            cs.setInt(5, pousuarioBean.getIdTipoUsuario());
            cs.setString(6, pousuarioBean.getNombUsuario());
            cs.setString(7, pousuarioBean.getContrasenia());
            cs.setString(8, pousuarioBean.getObservacion());
            cs.setDate(9, pousuarioBean.getFechRegistra());
            cs.setDate(10, pousuarioBean.getFechModifica());
            cs.setBoolean(11, true);
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
