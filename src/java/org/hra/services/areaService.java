package org.hra.services;

import org.hra.dominio.areaBean;
import org.hra.repository.areaRepository;
import org.hra.util.Generic;
import java.sql.SQLException;
import java.util.ArrayList;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author Quichua
 */
public class areaService {

    @Autowired
    public boolean fnIsareaBean(areaBean poareaBean) throws Exception {
        boolean status = Generic.getInstance(areaRepository.class).fnIsareaBean(poareaBean);
        if (!status) {
            poareaBean.setMensaje("El IndexBean buscado no existe");
        }
        return status;
    }

    @Autowired
    public List fnGetListareaBean(areaBean poareaBean) throws Exception {
        List list = Generic.getInstance(areaRepository.class).fnGetListareaBean(poareaBean);
        return list;
    }

    @Autowired
    public List fnGridareaBean(areaBean poareaBean) throws Exception {
        List list = Generic.getInstance(areaRepository.class).fnGridareaBean(poareaBean);
        return list;
    }

    @Autowired
    public ArrayList<areaBean> fnAutocompleteareaBean(areaBean poareaBean) throws Exception {
        ArrayList<areaBean> listaareaBean = null;
        try {
            listaareaBean = Generic.getInstance(areaRepository.class).fnAutocompleteareaBean(poareaBean);
        } catch (IllegalAccessException | InstantiationException | SQLException ex) {
        } finally {
        }
        return listaareaBean;
    }

    @Autowired
    public areaBean fnGetareaBean(areaBean poareaBean) throws Exception {
        return Generic.getInstance(areaRepository.class).fnGetareaBean(poareaBean);
    }

    @Autowired
    public boolean fnInsertarareaBean(areaBean poareaBean) throws Exception {
        return Generic.getInstance(areaRepository.class).fnInsertarareaBean(poareaBean);
    }

    @Autowired
    public boolean fnEliminarareaBean(areaBean poareaBean) throws Exception {
        return Generic.getInstance(areaRepository.class).fnEliminarareaBean(poareaBean);
    }

    @Autowired
    public boolean fnActualizarareaBean(areaBean poareaBean) throws Exception {
        return Generic.getInstance(areaRepository.class).fnActualizarareaBean(poareaBean);
    }
}
