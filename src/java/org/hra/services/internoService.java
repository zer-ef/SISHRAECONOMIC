package org.hra.services;

import org.hra.dominio.internoBean;
import org.hra.repository.internoRepository;
import org.hra.util.Generic;
import java.sql.SQLException;
import java.util.ArrayList;

import java.util.List;
import org.hra.dominio.personaBean;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author Quichua
 */
public class internoService {

    @Autowired
    public boolean fnIsinternoBean(internoBean pointernoBean) throws Exception {
        boolean status = Generic.getInstance(internoRepository.class).fnIsinternoBean(pointernoBean);
        if (!status) {
            pointernoBean.setMensaje("El IndexBean buscado no existe");
        }
        return status;
    }

    @Autowired
    public List fnGetListinternoBean(internoBean pointernoBean) throws Exception {
        List list = Generic.getInstance(internoRepository.class).fnGetListinternoBean(pointernoBean);
        return list;
    }

    @Autowired
    public List fnGridinternoBean(internoBean pointernoBean) throws Exception {
        List list = Generic.getInstance(internoRepository.class).fnGridinternoBean(pointernoBean);
        return list;
    }

    @Autowired
    public ArrayList<internoBean> fnAutocompleteinternoBean(internoBean pointernoBean) throws Exception {
        ArrayList<internoBean> listainternoBean = null;
        try {
            listainternoBean = Generic.getInstance(internoRepository.class).fnAutocompleteinternoBean(pointernoBean);
        } catch (IllegalAccessException | InstantiationException | SQLException ex) {
        } finally {
        }
        return listainternoBean;
    }

    @Autowired
    public internoBean fnGetinternoBean(internoBean pointernoBean) throws Exception {
        return Generic.getInstance(internoRepository.class).fnGetinternoBean(pointernoBean);
    }

    @Autowired
    public boolean fnInsertarinternoBean(personaBean popersonaBean, internoBean pointernoBean) throws Exception {
        return Generic.getInstance(internoRepository.class).fnInsertarinternoBean(popersonaBean, pointernoBean);
    }

    @Autowired
    public boolean fnEliminarinternoBean(internoBean pointernoBean) throws Exception {
        return Generic.getInstance(internoRepository.class).fnEliminarinternoBean(pointernoBean);
    }

    @Autowired
    public boolean fnActualizarinternoBean(personaBean popersonaBean, internoBean pointernoBean) throws Exception {
        return Generic.getInstance(internoRepository.class).fnActualizarinternoBean(popersonaBean, pointernoBean);
    }
}
