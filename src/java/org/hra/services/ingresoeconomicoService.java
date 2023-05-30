package org.hra.services;

import org.hra.dominio.ingresoeconomicoBean;
import org.hra.repository.ingresoeconomicoRepository;
import org.hra.util.Generic;
import java.sql.SQLException;
import java.util.ArrayList;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author Quichua
 */
public class ingresoeconomicoService {

    @Autowired
    public boolean fnIsingresoeconomicoBean(ingresoeconomicoBean poingresoeconomicoBean) throws Exception {
        boolean status = Generic.getInstance(ingresoeconomicoRepository.class).fnIsingresoeconomicoBean(poingresoeconomicoBean);
        if (!status) {
            poingresoeconomicoBean.setMensaje("El IndexBean buscado no existe");
        }
        return status;
    }

    @Autowired
    public List fnGetListingresoeconomicoBean(ingresoeconomicoBean poingresoeconomicoBean) throws Exception {
        List list = Generic.getInstance(ingresoeconomicoRepository.class).fnGetListingresoeconomicoBean(poingresoeconomicoBean);
        return list;
    }

    @Autowired
    public List fnGridingresoeconomicoBean(ingresoeconomicoBean poingresoeconomicoBean) throws Exception {
        List list = Generic.getInstance(ingresoeconomicoRepository.class).fnGridingresoeconomicoBean(poingresoeconomicoBean);
        return list;
    }

    @Autowired
    public ArrayList<ingresoeconomicoBean> fnAutocompleteingresoeconomicoBean(ingresoeconomicoBean poingresoeconomicoBean) throws Exception {
        ArrayList<ingresoeconomicoBean> listaingresoeconomicoBean = null;
        try {
            listaingresoeconomicoBean = Generic.getInstance(ingresoeconomicoRepository.class).fnAutocompleteingresoeconomicoBean(poingresoeconomicoBean);
        } catch (IllegalAccessException | InstantiationException | SQLException ex) {
        } finally {
        }
        return listaingresoeconomicoBean;
    }

    @Autowired
    public ingresoeconomicoBean fnGetingresoeconomicoBean(ingresoeconomicoBean poingresoeconomicoBean) throws Exception {
        return Generic.getInstance(ingresoeconomicoRepository.class).fnGetingresoeconomicoBean(poingresoeconomicoBean);
    }

    @Autowired
    public boolean fnInsertaringresoeconomicoBean(ingresoeconomicoBean poingresoeconomicoBean) throws Exception {
        return Generic.getInstance(ingresoeconomicoRepository.class).fnInsertaringresoeconomicoBean(poingresoeconomicoBean);
    }

    @Autowired
    public boolean fnEliminaringresoeconomicoBean(ingresoeconomicoBean poingresoeconomicoBean) throws Exception {
        return Generic.getInstance(ingresoeconomicoRepository.class).fnEliminaringresoeconomicoBean(poingresoeconomicoBean);
    }

    @Autowired
    public boolean fnActualizaringresoeconomicoBean(ingresoeconomicoBean poingresoeconomicoBean) throws Exception {
        return Generic.getInstance(ingresoeconomicoRepository.class).fnActualizaringresoeconomicoBean(poingresoeconomicoBean);
    }
}
