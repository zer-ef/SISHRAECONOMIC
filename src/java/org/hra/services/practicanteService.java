package org.hra.services;

import org.hra.dominio.practicanteBean;
import org.hra.repository.practicanteRepository;
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
public class practicanteService {

    @Autowired
    public boolean fnIspracticanteBean(practicanteBean popracticanteBean) throws Exception {
        boolean status = Generic.getInstance(practicanteRepository.class).fnIspracticanteBean(popracticanteBean);
        if (!status) {
            popracticanteBean.setMensaje("El IndexBean buscado no existe");
        }
        return status;
    }

    @Autowired
    public List fnGetListpracticanteBean(practicanteBean popracticanteBean) throws Exception {
        List list = Generic.getInstance(practicanteRepository.class).fnGetListpracticanteBean(popracticanteBean);
        return list;
    }

    @Autowired
    public List fnGridpracticanteBean(practicanteBean popracticanteBean) throws Exception {
        List list = Generic.getInstance(practicanteRepository.class).fnGridpracticanteBean(popracticanteBean);
        return list;
    }

    @Autowired
    public ArrayList<practicanteBean> fnAutocompletepracticanteBean(practicanteBean popracticanteBean) throws Exception {
        ArrayList<practicanteBean> listapracticanteBean = null;
        try {
            listapracticanteBean = Generic.getInstance(practicanteRepository.class).fnAutocompletepracticanteBean(popracticanteBean);
        } catch (IllegalAccessException | InstantiationException | SQLException ex) {
        } finally {
        }
        return listapracticanteBean;
    }

    @Autowired
    public practicanteBean fnGetpracticanteBean(practicanteBean popracticanteBean) throws Exception {
        return Generic.getInstance(practicanteRepository.class).fnGetpracticanteBean(popracticanteBean);
    }

    @Autowired
    public boolean fnInsertarpracticanteBean(personaBean popersonaBean, practicanteBean popracticanteBean) throws Exception {
        return Generic.getInstance(practicanteRepository.class).fnInsertarpracticanteBean(popersonaBean, popracticanteBean);
    }

    @Autowired
    public boolean fnEliminarpracticanteBean(personaBean popersonaBean, practicanteBean popracticanteBean) throws Exception {
        return Generic.getInstance(practicanteRepository.class).fnEliminarpracticanteBean(popersonaBean, popracticanteBean);
    }

    @Autowired
    public boolean fnActualizarpracticanteBean(personaBean popersonaBean, practicanteBean popracticanteBean) throws Exception {
        return Generic.getInstance(practicanteRepository.class).fnActualizarpracticanteBean(popersonaBean, popracticanteBean);
    }
}
