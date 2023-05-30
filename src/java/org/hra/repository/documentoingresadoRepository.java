package org.hra.repository;

import org.hra.dominio.documentoingresadoBean;
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
public class documentoingresadoRepository {

    @Autowired
    public boolean fnIsdocumentoingresadoBean(documentoingresadoBean podocumentoingresadoBean) throws Exception {
        documentoingresadoBean odocumentoingresadoBean = null;
        Connection cn = null;
        ResultSet rs = null;
        CallableStatement cs = null;
        try {
            cn = DBConnection.getInstance().openConnection();
            cn.setAutoCommit(false);
            cs = cn.prepareCall("{CALL bdhrsis.usp_documentoingresado_lst(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ? )}");
            cs.setInt(1, podocumentoingresadoBean.getIOps());
            cs.registerOutParameter(2, java.sql.Types.BOOLEAN);
            cs.setInt(3, podocumentoingresadoBean.getIdDocIngresado());
            cs.setString(4, podocumentoingresadoBean.getNumeroRegistro());
            cs.setInt(5, podocumentoingresadoBean.getIdTipoDocumento());
            cs.setInt(6, podocumentoingresadoBean.getIdOregin());
            cs.setString(7, podocumentoingresadoBean.getAsunto());
            cs.setInt(8, podocumentoingresadoBean.getIdRemitente());
            cs.setString(9, podocumentoingresadoBean.getDestino());
            cs.setDate(10, podocumentoingresadoBean.getFechaDespacho());
            cs.setString(11, podocumentoingresadoBean.getObservacion());
            cs.setDate(12, podocumentoingresadoBean.getFechRegistra());
            cs.setDate(13, podocumentoingresadoBean.getFechModifica());
            cs.setBoolean(14, podocumentoingresadoBean.getEstado());
            rs = cs.executeQuery();
            while (rs.next()) {
                odocumentoingresadoBean = new documentoingresadoBean();
                odocumentoingresadoBean.setEstado(rs.getBoolean("IdDocIngresado"));
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
        return odocumentoingresadoBean != null;
    }

    @Autowired
    public List fnGetListdocumentoingresadoBean(documentoingresadoBean podocumentoingresadoBean) throws Exception {
        List list = new LinkedList();
        Connection cn = null;
        ResultSet rs = null;
        CallableStatement cs = null;
        try {
            cn = DBConnection.getInstance().openConnection();
            cn.setAutoCommit(false);
            cs = cn.prepareCall("{CALL bdhrsis.usp_documentoingresado_lst(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ? )}");
            cs.setInt(1, podocumentoingresadoBean.getIOps());
            cs.registerOutParameter(2, java.sql.Types.BOOLEAN);
            cs.setInt(3, podocumentoingresadoBean.getIdDocIngresado());
            cs.setString(4, podocumentoingresadoBean.getNumeroRegistro());
            cs.setInt(5, podocumentoingresadoBean.getIdTipoDocumento());
            cs.setInt(6, podocumentoingresadoBean.getIdOregin());
            cs.setString(7, podocumentoingresadoBean.getAsunto());
            cs.setInt(8, podocumentoingresadoBean.getIdRemitente());
            cs.setString(9, podocumentoingresadoBean.getDestino());
            cs.setDate(10, podocumentoingresadoBean.getFechaDespacho());
            cs.setString(11, podocumentoingresadoBean.getObservacion());
            cs.setDate(12, podocumentoingresadoBean.getFechRegistra());
            cs.setDate(13, podocumentoingresadoBean.getFechModifica());
            cs.setBoolean(14, podocumentoingresadoBean.getEstado());
            rs = cs.executeQuery();
            while (rs.next()) {
                Object[] obj = {rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9), rs.getString(10), rs.getString(11), rs.getString(12)};
                //Object[] obj = {rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getInt(4), rs.getString(5), rs.getInt(6), rs.getString(7), rs.getDate(8), rs.getString(9), rs.getDate(10), rs.getDate(11), rs.getBoolean(12)}; 
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
    public List fnGriddocumentoingresadoBean(documentoingresadoBean podocumentoingresadoBean) throws Exception {
        List lista = new LinkedList();
        Connection cn = null;
        ResultSet rs = null;
        CallableStatement cs = null;
        try {
            cn = DBConnection.getInstance().openConnection();
            cn.setAutoCommit(false);
            cs = cn.prepareCall("{CALL bdhrsis.usp_documentoingresado_lst(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ? )}");
            cs.setInt(1, podocumentoingresadoBean.getIOps());
            cs.registerOutParameter(2, java.sql.Types.BOOLEAN);
            cs.setInt(3, podocumentoingresadoBean.getIdDocIngresado());
            cs.setString(4, podocumentoingresadoBean.getNumeroRegistro());
            cs.setInt(5, podocumentoingresadoBean.getIdTipoDocumento());
            cs.setInt(6, podocumentoingresadoBean.getIdOregin());
            cs.setString(7, podocumentoingresadoBean.getAsunto());
            cs.setInt(8, podocumentoingresadoBean.getIdRemitente());
            cs.setString(9, podocumentoingresadoBean.getDestino());
            cs.setDate(10, podocumentoingresadoBean.getFechaDespacho());
            cs.setString(11, podocumentoingresadoBean.getObservacion());
            cs.setDate(12, podocumentoingresadoBean.getFechRegistra());
            cs.setDate(13, podocumentoingresadoBean.getFechModifica());
            cs.setBoolean(14, podocumentoingresadoBean.getEstado());
            rs = cs.executeQuery();
            while (rs.next()) {
                Object[] obj = {rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9), rs.getString(10), rs.getString(11), rs.getString(12)};
                //Object[] obj = {rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getInt(4), rs.getString(5), rs.getInt(6), rs.getString(7), rs.getDate(8), rs.getString(9), rs.getDate(10), rs.getDate(11), rs.getBoolean(12)}; 
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
    public ArrayList<documentoingresadoBean> fnAutocompletedocumentoingresadoBean(documentoingresadoBean podocumentoingresadoBean) throws Exception {
        ArrayList<documentoingresadoBean> listadocumentoingresadoBean = new ArrayList<documentoingresadoBean>();
        Connection cn = null;
        ResultSet rs = null;
        CallableStatement cs = null;
        try {
            cn = DBConnection.getInstance().openConnection();
            cn.setAutoCommit(false);
            cs = cn.prepareCall("{CALL bdhrsis.usp_documentoingresado_lst(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ? )}");
            cs.setInt(1, podocumentoingresadoBean.getIOps());
            cs.registerOutParameter(2, java.sql.Types.BOOLEAN);
            cs.setInt(3, podocumentoingresadoBean.getIdDocIngresado());
            cs.setString(4, podocumentoingresadoBean.getNumeroRegistro());
            cs.setInt(5, podocumentoingresadoBean.getIdTipoDocumento());
            cs.setInt(6, podocumentoingresadoBean.getIdOregin());
            cs.setString(7, podocumentoingresadoBean.getAsunto());
            cs.setInt(8, podocumentoingresadoBean.getIdRemitente());
            cs.setString(9, podocumentoingresadoBean.getDestino());
            cs.setDate(10, podocumentoingresadoBean.getFechaDespacho());
            cs.setString(11, podocumentoingresadoBean.getObservacion());
            cs.setDate(12, podocumentoingresadoBean.getFechRegistra());
            cs.setDate(13, podocumentoingresadoBean.getFechModifica());
            cs.setBoolean(14, podocumentoingresadoBean.getEstado());
            rs = cs.executeQuery();
            while (rs.next()) {
                documentoingresadoBean odocumentoingresadoBean = new documentoingresadoBean();
                odocumentoingresadoBean.setIdDocIngresado(rs.getInt("IdDocIngresado"));
                odocumentoingresadoBean.setNumeroRegistro(rs.getString("NumeroRegistro"));
                odocumentoingresadoBean.setIdTipoDocumento(rs.getInt("IdTipoDocumento"));
                odocumentoingresadoBean.setIdOregin(rs.getInt("IdOregin"));
                odocumentoingresadoBean.setAsunto(rs.getString("Asunto"));
                odocumentoingresadoBean.setIdRemitente(rs.getInt("IdRemitente"));
                odocumentoingresadoBean.setDestino(rs.getString("Destino"));
                odocumentoingresadoBean.setFechaDespacho(rs.getDate("FechaDespacho"));
                odocumentoingresadoBean.setObservacion(rs.getString("Observacion"));
                odocumentoingresadoBean.setFechRegistra(rs.getDate("FechRegistra"));
                odocumentoingresadoBean.setFechModifica(rs.getDate("FechModifica"));
                odocumentoingresadoBean.setEstado(rs.getBoolean("Estado"));
                listadocumentoingresadoBean.add(odocumentoingresadoBean);
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
        return listadocumentoingresadoBean;
    }

    @Autowired
    public documentoingresadoBean fnGetdocumentoingresadoBean(documentoingresadoBean podocumentoingresadoBean) throws Exception {
        documentoingresadoBean odocumentoingresadoBean = null;
        Connection cn = null;
        ResultSet rs = null;
        CallableStatement cs = null;
        try {
            cn = DBConnection.getInstance().openConnection();
            cn.setAutoCommit(false);
            cs = cn.prepareCall("{CALL bdhrsis.usp_documentoingresado_lst(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ? )}");
            cs.setInt(1, podocumentoingresadoBean.getIOps());
            cs.registerOutParameter(2, java.sql.Types.BOOLEAN);
            cs.setInt(3, podocumentoingresadoBean.getIdDocIngresado());
            cs.setString(4, podocumentoingresadoBean.getNumeroRegistro());
            cs.setInt(5, podocumentoingresadoBean.getIdTipoDocumento());
            cs.setInt(6, podocumentoingresadoBean.getIdOregin());
            cs.setString(7, podocumentoingresadoBean.getAsunto());
            cs.setInt(8, podocumentoingresadoBean.getIdRemitente());
            cs.setString(9, podocumentoingresadoBean.getDestino());
            cs.setDate(10, podocumentoingresadoBean.getFechaDespacho());
            cs.setString(11, podocumentoingresadoBean.getObservacion());
            cs.setDate(12, podocumentoingresadoBean.getFechRegistra());
            cs.setDate(13, podocumentoingresadoBean.getFechModifica());
            cs.setBoolean(14, podocumentoingresadoBean.getEstado());
            rs = cs.executeQuery();
            while (rs.next()) {
                odocumentoingresadoBean = new documentoingresadoBean();
                odocumentoingresadoBean.setIdDocIngresado(rs.getInt("IdDocIngresado"));
                odocumentoingresadoBean.setNumeroRegistro(rs.getString("NumeroRegistro"));
                odocumentoingresadoBean.setIdTipoDocumento(rs.getInt("IdTipoDocumento"));
                odocumentoingresadoBean.setIdOregin(rs.getInt("IdOregin"));
                odocumentoingresadoBean.setAsunto(rs.getString("Asunto"));
                odocumentoingresadoBean.setIdRemitente(rs.getInt("IdRemitente"));
                odocumentoingresadoBean.setDestino(rs.getString("Destino"));
                odocumentoingresadoBean.setFechaDespacho(rs.getDate("FechaDespacho"));
                odocumentoingresadoBean.setObservacion(rs.getString("Observacion"));
                odocumentoingresadoBean.setFechRegistra(rs.getDate("FechRegistra"));
                odocumentoingresadoBean.setFechModifica(rs.getDate("FechModifica"));
                odocumentoingresadoBean.setEstado(rs.getBoolean("Estado"));
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
        return odocumentoingresadoBean;
    }

    @Autowired
    public boolean fnInsertardocumentoingresadoBean(documentoingresadoBean podocumentoingresadoBean) throws Exception {
        boolean resultado = false;
        Connection cn = null;
        CallableStatement cs = null;
        try {
            cn = DBConnection.getInstance().openConnection();
            cn.setAutoCommit(false);
            cs = cn.prepareCall("{CALL bdhrsis.usp_documentoingresado_ins(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ? )}");
            cs.setInt(1, podocumentoingresadoBean.getIOps());
            cs.registerOutParameter(2, java.sql.Types.BOOLEAN);
            cs.setInt(3, podocumentoingresadoBean.getIdDocIngresado());
            cs.setString(4, podocumentoingresadoBean.getNumeroRegistro());
            cs.setInt(5, podocumentoingresadoBean.getIdTipoDocumento());
            cs.setInt(6, podocumentoingresadoBean.getIdOregin());
            cs.setString(7, podocumentoingresadoBean.getAsunto());
            cs.setInt(8, podocumentoingresadoBean.getIdRemitente());
            cs.setString(9, podocumentoingresadoBean.getDestino());
            cs.setDate(10, podocumentoingresadoBean.getFechaDespacho());
            cs.setString(11, podocumentoingresadoBean.getObservacion());
            cs.setDate(12, podocumentoingresadoBean.getFechRegistra());
            cs.setDate(13, podocumentoingresadoBean.getFechModifica());
            cs.setBoolean(14, true);
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
    public boolean fnEliminardocumentoingresadoBean(documentoingresadoBean podocumentoingresadoBean) throws Exception {
        boolean resultado = false;
        Connection cn = null;
        CallableStatement cs = null;
        try {
            cn = DBConnection.getInstance().openConnection();
            cn.setAutoCommit(false);
            cs = cn.prepareCall("{CALL bdhrsis.usp_documentoingresado_upd(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ? )}");
            cs.setInt(1, podocumentoingresadoBean.getIOps());
            cs.registerOutParameter(2, java.sql.Types.BOOLEAN);
            cs.setInt(3, podocumentoingresadoBean.getIdDocIngresado());
            cs.setString(4, podocumentoingresadoBean.getNumeroRegistro());
            cs.setInt(5, podocumentoingresadoBean.getIdTipoDocumento());
            cs.setInt(6, podocumentoingresadoBean.getIdOregin());
            cs.setString(7, podocumentoingresadoBean.getAsunto());
            cs.setInt(8, podocumentoingresadoBean.getIdRemitente());
            cs.setString(9, podocumentoingresadoBean.getDestino());
            cs.setDate(10, podocumentoingresadoBean.getFechaDespacho());
            cs.setString(11, podocumentoingresadoBean.getObservacion());
            cs.setDate(12, podocumentoingresadoBean.getFechRegistra());
            cs.setDate(13, podocumentoingresadoBean.getFechModifica());
            cs.setBoolean(14, false);
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
    public boolean fnActualizardocumentoingresadoBean(documentoingresadoBean podocumentoingresadoBean) throws Exception {
        boolean resultado = false;
        Connection cn = null;
        CallableStatement cs = null;
        try {
            cn = DBConnection.getInstance().openConnection();
            cn.setAutoCommit(false);
            cs = cn.prepareCall("{CALL bdhrsis.usp_documentoingresado_upd(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ? )}");
            cs.setInt(1, podocumentoingresadoBean.getIOps());
            cs.registerOutParameter(2, java.sql.Types.BOOLEAN);
            cs.setInt(3, podocumentoingresadoBean.getIdDocIngresado());
            cs.setString(4, podocumentoingresadoBean.getNumeroRegistro());
            cs.setInt(5, podocumentoingresadoBean.getIdTipoDocumento());
            cs.setInt(6, podocumentoingresadoBean.getIdOregin());
            cs.setString(7, podocumentoingresadoBean.getAsunto());
            cs.setInt(8, podocumentoingresadoBean.getIdRemitente());
            cs.setString(9, podocumentoingresadoBean.getDestino());
            cs.setDate(10, podocumentoingresadoBean.getFechaDespacho());
            cs.setString(11, podocumentoingresadoBean.getObservacion());
            cs.setDate(12, podocumentoingresadoBean.getFechRegistra());
            cs.setDate(13, podocumentoingresadoBean.getFechModifica());
            cs.setBoolean(14, true);
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
