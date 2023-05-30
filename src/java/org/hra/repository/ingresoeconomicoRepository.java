package org.hra.repository;

import org.hra.dominio.ingresoeconomicoBean;
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
public class ingresoeconomicoRepository {

    @Autowired
    public boolean fnIsingresoeconomicoBean(ingresoeconomicoBean poingresoeconomicoBean) throws Exception {
        ingresoeconomicoBean oingresoeconomicoBean = null;
        Connection cn = null;
        ResultSet rs = null;
        CallableStatement cs = null;
        try {
            cn = DBConnection.getInstance().openConnection();
            cn.setAutoCommit(false);
            cs = cn.prepareCall("{CALL bdhrsis.usp_ingresoeconomico_lst(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ? )}");
            cs.setInt(1, poingresoeconomicoBean.getIOps());
            cs.registerOutParameter(2, java.sql.Types.BOOLEAN);
            cs.setInt(3, poingresoeconomicoBean.getIdIngresoEco());
            cs.setString(4, poingresoeconomicoBean.getNumBoleta());
            cs.setDate(5, poingresoeconomicoBean.getFechaPago());
            cs.setInt(6, poingresoeconomicoBean.getIdParticipante());
            cs.setInt(7, poingresoeconomicoBean.getIdTipoInstitucion());
            cs.setString(8, poingresoeconomicoBean.getConceptoPago());
            cs.setDouble(9, poingresoeconomicoBean.getMonto());
            cs.setString(10, poingresoeconomicoBean.getObservacion());
            cs.setDate(11, poingresoeconomicoBean.getFechRegistra());
            cs.setDate(12, poingresoeconomicoBean.getFechModifica());
            cs.setBoolean(13, poingresoeconomicoBean.getEstado());
            rs = cs.executeQuery();
            while (rs.next()) {
                oingresoeconomicoBean = new ingresoeconomicoBean();
                oingresoeconomicoBean.setEstado(rs.getBoolean("IdIngresoEco"));
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
        return oingresoeconomicoBean != null;
    }

    @Autowired
    public List fnGetListingresoeconomicoBean(ingresoeconomicoBean poingresoeconomicoBean) throws Exception {
        List list = new LinkedList();
        Connection cn = null;
        ResultSet rs = null;
        CallableStatement cs = null;
        try {
            cn = DBConnection.getInstance().openConnection();
            cn.setAutoCommit(false);
            cs = cn.prepareCall("{CALL bdhrsis.usp_ingresoeconomico_lst(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ? )}");
            cs.setInt(1, poingresoeconomicoBean.getIOps());
            cs.registerOutParameter(2, java.sql.Types.BOOLEAN);
            cs.setInt(3, poingresoeconomicoBean.getIdIngresoEco());
            cs.setString(4, poingresoeconomicoBean.getNumBoleta());
            cs.setDate(5, poingresoeconomicoBean.getFechaPago());
            cs.setInt(6, poingresoeconomicoBean.getIdParticipante());
            cs.setInt(7, poingresoeconomicoBean.getIdTipoInstitucion());
            cs.setString(8, poingresoeconomicoBean.getConceptoPago());
            cs.setDouble(9, poingresoeconomicoBean.getMonto());
            cs.setString(10, poingresoeconomicoBean.getObservacion());
            cs.setDate(11, poingresoeconomicoBean.getFechRegistra());
            cs.setDate(12, poingresoeconomicoBean.getFechModifica());
            cs.setBoolean(13, poingresoeconomicoBean.getEstado());
            rs = cs.executeQuery();
            while (rs.next()) {
                Object[] obj = {rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9), rs.getString(10), rs.getString(11)};
                //Object[] obj = {rs.getInt(1), rs.getString(2), rs.getDate(3), rs.getInt(4), rs.getInt(5), rs.getString(6), rs.getDouble(7), rs.getString(8), rs.getDate(9), rs.getDate(10), rs.getBoolean(11)}; 
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
    public List fnGridingresoeconomicoBean(ingresoeconomicoBean poingresoeconomicoBean) throws Exception {
        List lista = new LinkedList();
        Connection cn = null;
        ResultSet rs = null;
        CallableStatement cs = null;
        try {
            cn = DBConnection.getInstance().openConnection();
            cn.setAutoCommit(false);
            cs = cn.prepareCall("{CALL bdhrsis.usp_ingresoeconomico_lst(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ? )}");
            cs.setInt(1, poingresoeconomicoBean.getIOps());
            cs.registerOutParameter(2, java.sql.Types.BOOLEAN);
            cs.setInt(3, poingresoeconomicoBean.getIdIngresoEco());
            cs.setString(4, poingresoeconomicoBean.getNumBoleta());
            cs.setDate(5, poingresoeconomicoBean.getFechaPago());
            cs.setInt(6, poingresoeconomicoBean.getIdParticipante());
            cs.setInt(7, poingresoeconomicoBean.getIdTipoInstitucion());
            cs.setString(8, poingresoeconomicoBean.getConceptoPago());
            cs.setDouble(9, poingresoeconomicoBean.getMonto());
            cs.setString(10, poingresoeconomicoBean.getObservacion());
            cs.setDate(11, poingresoeconomicoBean.getFechRegistra());
            cs.setDate(12, poingresoeconomicoBean.getFechModifica());
            cs.setBoolean(13, poingresoeconomicoBean.getEstado());
            rs = cs.executeQuery();
            while (rs.next()) {
                Object[] obj = {rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9), rs.getString(10), rs.getString(11)};
                //Object[] obj = {rs.getInt(1), rs.getString(2), rs.getDate(3), rs.getInt(4), rs.getInt(5), rs.getString(6), rs.getDouble(7), rs.getString(8), rs.getDate(9), rs.getDate(10), rs.getBoolean(11)}; 
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
    public ArrayList<ingresoeconomicoBean> fnAutocompleteingresoeconomicoBean(ingresoeconomicoBean poingresoeconomicoBean) throws Exception {
        ArrayList<ingresoeconomicoBean> listaingresoeconomicoBean = new ArrayList<ingresoeconomicoBean>();
        Connection cn = null;
        ResultSet rs = null;
        CallableStatement cs = null;
        try {
            cn = DBConnection.getInstance().openConnection();
            cn.setAutoCommit(false);
            cs = cn.prepareCall("{CALL bdhrsis.usp_ingresoeconomico_lst(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ? )}");
            cs.setInt(1, poingresoeconomicoBean.getIOps());
            cs.registerOutParameter(2, java.sql.Types.BOOLEAN);
            cs.setInt(3, poingresoeconomicoBean.getIdIngresoEco());
            cs.setString(4, poingresoeconomicoBean.getNumBoleta());
            cs.setDate(5, poingresoeconomicoBean.getFechaPago());
            cs.setInt(6, poingresoeconomicoBean.getIdParticipante());
            cs.setInt(7, poingresoeconomicoBean.getIdTipoInstitucion());
            cs.setString(8, poingresoeconomicoBean.getConceptoPago());
            cs.setDouble(9, poingresoeconomicoBean.getMonto());
            cs.setString(10, poingresoeconomicoBean.getObservacion());
            cs.setDate(11, poingresoeconomicoBean.getFechRegistra());
            cs.setDate(12, poingresoeconomicoBean.getFechModifica());
            cs.setBoolean(13, poingresoeconomicoBean.getEstado());
            rs = cs.executeQuery();
            while (rs.next()) {
                ingresoeconomicoBean oingresoeconomicoBean = new ingresoeconomicoBean();
                oingresoeconomicoBean.setIdIngresoEco(rs.getInt("IdIngresoEco"));
                oingresoeconomicoBean.setNumBoleta(rs.getString("NumBoleta"));
                oingresoeconomicoBean.setFechaPago(rs.getDate("FechaPago"));
                oingresoeconomicoBean.setIdParticipante(rs.getInt("IdParticipante"));
                oingresoeconomicoBean.setIdTipoInstitucion(rs.getInt("IdTipoInstitucion"));
                oingresoeconomicoBean.setConceptoPago(rs.getString("ConceptoPago"));
                oingresoeconomicoBean.setMonto(rs.getDouble("Monto"));
                oingresoeconomicoBean.setObservacion(rs.getString("Observacion"));
                oingresoeconomicoBean.setFechRegistra(rs.getDate("FechRegistra"));
                oingresoeconomicoBean.setFechModifica(rs.getDate("FechModifica"));
                oingresoeconomicoBean.setEstado(rs.getBoolean("Estado"));
                listaingresoeconomicoBean.add(oingresoeconomicoBean);
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
        return listaingresoeconomicoBean;
    }

    @Autowired
    public ingresoeconomicoBean fnGetingresoeconomicoBean(ingresoeconomicoBean poingresoeconomicoBean) throws Exception {
        ingresoeconomicoBean oingresoeconomicoBean = null;
        Connection cn = null;
        ResultSet rs = null;
        CallableStatement cs = null;
        try {
            cn = DBConnection.getInstance().openConnection();
            cn.setAutoCommit(false);
            cs = cn.prepareCall("{CALL bdhrsis.usp_ingresoeconomico_lst(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ? )}");
            cs.setInt(1, poingresoeconomicoBean.getIOps());
            cs.registerOutParameter(2, java.sql.Types.BOOLEAN);
            cs.setInt(3, poingresoeconomicoBean.getIdIngresoEco());
            cs.setString(4, poingresoeconomicoBean.getNumBoleta());
            cs.setDate(5, poingresoeconomicoBean.getFechaPago());
            cs.setInt(6, poingresoeconomicoBean.getIdParticipante());
            cs.setInt(7, poingresoeconomicoBean.getIdTipoInstitucion());
            cs.setString(8, poingresoeconomicoBean.getConceptoPago());
            cs.setDouble(9, poingresoeconomicoBean.getMonto());
            cs.setString(10, poingresoeconomicoBean.getObservacion());
            cs.setDate(11, poingresoeconomicoBean.getFechRegistra());
            cs.setDate(12, poingresoeconomicoBean.getFechModifica());
            cs.setBoolean(13, poingresoeconomicoBean.getEstado());
            rs = cs.executeQuery();
            while (rs.next()) {
                oingresoeconomicoBean = new ingresoeconomicoBean();
                oingresoeconomicoBean.setIdIngresoEco(rs.getInt("IdIngresoEco"));
                oingresoeconomicoBean.setNumBoleta(rs.getString("NumBoleta"));
                oingresoeconomicoBean.setFechaPago(rs.getDate("FechaPago"));
                oingresoeconomicoBean.setIdParticipante(rs.getInt("IdParticipante"));
                oingresoeconomicoBean.setIdTipoInstitucion(rs.getInt("IdTipoInstitucion"));
                oingresoeconomicoBean.setConceptoPago(rs.getString("ConceptoPago"));
                oingresoeconomicoBean.setMonto(rs.getDouble("Monto"));
                oingresoeconomicoBean.setObservacion(rs.getString("Observacion"));
                oingresoeconomicoBean.setFechRegistra(rs.getDate("FechRegistra"));
                oingresoeconomicoBean.setFechModifica(rs.getDate("FechModifica"));
                oingresoeconomicoBean.setEstado(rs.getBoolean("Estado"));
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
        return oingresoeconomicoBean;
    }

    @Autowired
    public boolean fnInsertaringresoeconomicoBean(ingresoeconomicoBean poingresoeconomicoBean) throws Exception {
        boolean resultado = false;
        Connection cn = null;
        CallableStatement cs = null;
        try {
            cn = DBConnection.getInstance().openConnection();
            cn.setAutoCommit(false);
            cs = cn.prepareCall("{CALL bdhrsis.usp_ingresoeconomico_ins(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ? )}");
            cs.setInt(1, poingresoeconomicoBean.getIOps());
            cs.registerOutParameter(2, java.sql.Types.BOOLEAN);
            cs.setInt(3, poingresoeconomicoBean.getIdIngresoEco());
            cs.setString(4, poingresoeconomicoBean.getNumBoleta());
            cs.setDate(5, poingresoeconomicoBean.getFechaPago());
            cs.setInt(6, poingresoeconomicoBean.getIdParticipante());
            cs.setInt(7, poingresoeconomicoBean.getIdTipoInstitucion());
            cs.setString(8, poingresoeconomicoBean.getConceptoPago());
            cs.setDouble(9, poingresoeconomicoBean.getMonto());
            cs.setString(10, poingresoeconomicoBean.getObservacion());
            cs.setDate(11, poingresoeconomicoBean.getFechRegistra());
            cs.setDate(12, poingresoeconomicoBean.getFechModifica());
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
    public boolean fnEliminaringresoeconomicoBean(ingresoeconomicoBean poingresoeconomicoBean) throws Exception {
        boolean resultado = false;
        Connection cn = null;
        CallableStatement cs = null;
        try {
            cn = DBConnection.getInstance().openConnection();
            cn.setAutoCommit(false);
            cs = cn.prepareCall("{CALL bdhrsis.usp_ingresoeconomico_upd(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ? )}");
            cs.setInt(1, poingresoeconomicoBean.getIOps());
            cs.registerOutParameter(2, java.sql.Types.BOOLEAN);
            cs.setInt(3, poingresoeconomicoBean.getIdIngresoEco());
            cs.setString(4, poingresoeconomicoBean.getNumBoleta());
            cs.setDate(5, poingresoeconomicoBean.getFechaPago());
            cs.setInt(6, poingresoeconomicoBean.getIdParticipante());
            cs.setInt(7, poingresoeconomicoBean.getIdTipoInstitucion());
            cs.setString(8, poingresoeconomicoBean.getConceptoPago());
            cs.setDouble(9, poingresoeconomicoBean.getMonto());
            cs.setString(10, poingresoeconomicoBean.getObservacion());
            cs.setDate(11, poingresoeconomicoBean.getFechRegistra());
            cs.setDate(12, poingresoeconomicoBean.getFechModifica());
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
    public boolean fnActualizaringresoeconomicoBean(ingresoeconomicoBean poingresoeconomicoBean) throws Exception {
        boolean resultado = false;
        Connection cn = null;
        CallableStatement cs = null;
        try {
            cn = DBConnection.getInstance().openConnection();
            cn.setAutoCommit(false);
            cs = cn.prepareCall("{CALL bdhrsis.usp_ingresoeconomico_upd(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ? )}");
            cs.setInt(1, poingresoeconomicoBean.getIOps());
            cs.registerOutParameter(2, java.sql.Types.BOOLEAN);
            cs.setInt(3, poingresoeconomicoBean.getIdIngresoEco());
            cs.setString(4, poingresoeconomicoBean.getNumBoleta());
            cs.setDate(5, poingresoeconomicoBean.getFechaPago());
            cs.setInt(6, poingresoeconomicoBean.getIdParticipante());
            cs.setInt(7, poingresoeconomicoBean.getIdTipoInstitucion());
            cs.setString(8, poingresoeconomicoBean.getConceptoPago());
            cs.setDouble(9, poingresoeconomicoBean.getMonto());
            cs.setString(10, poingresoeconomicoBean.getObservacion());
            cs.setDate(11, poingresoeconomicoBean.getFechRegistra());
            cs.setDate(12, poingresoeconomicoBean.getFechModifica());
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
