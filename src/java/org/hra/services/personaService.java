package org.hra.services;

import org.hra.dominio.personaBean;
import org.hra.repository.personaRepository;
import org.hra.util.Generic;
import java.sql.SQLException;
import java.util.ArrayList;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author Quichua
 */
public class personaService {

    @Autowired
    public boolean fnIspersonaBean(personaBean popersonaBean) throws Exception {
        boolean status = Generic.getInstance(personaRepository.class).fnIspersonaBean(popersonaBean);
        if (!status) {
            popersonaBean.setMensaje("El IndexBean buscado no existe");
        }
        return status;
    }

    @Autowired
    public List fnGetListpersonaBean(personaBean popersonaBean) throws Exception {
        List list = Generic.getInstance(personaRepository.class).fnGetListpersonaBean(popersonaBean);
        return list;
    }

    @Autowired
    public List fnGridpersonaBean(personaBean popersonaBean) throws Exception {
        List list = Generic.getInstance(personaRepository.class).fnGridpersonaBean(popersonaBean);
        return list;
    }

    @Autowired
    public ArrayList<personaBean> fnAutocompletepersonaBean(personaBean popersonaBean) throws Exception {
        ArrayList<personaBean> listapersonaBean = null;
        try {
            listapersonaBean = Generic.getInstance(personaRepository.class).fnAutocompletepersonaBean(popersonaBean);
        } catch (IllegalAccessException | InstantiationException | SQLException ex) {
        } finally {
        }
        return listapersonaBean;
    }

    @Autowired
    public personaBean fnGetpersonaBean(personaBean popersonaBean) throws Exception {
        return Generic.getInstance(personaRepository.class).fnGetpersonaBean(popersonaBean);
    }

    @Autowired
    public boolean fnInsertarpersonaBean(personaBean popersonaBean) throws Exception {
        return Generic.getInstance(personaRepository.class).fnInsertarpersonaBean(popersonaBean);
    }

    @Autowired
    public boolean fnEliminarpersonaBean(personaBean popersonaBean) throws Exception {
        return Generic.getInstance(personaRepository.class).fnEliminarpersonaBean(popersonaBean);
    }

    @Autowired
    public boolean fnActualizarpersonaBean(personaBean popersonaBean) throws Exception {
        return Generic.getInstance(personaRepository.class).fnActualizarpersonaBean(popersonaBean);
    }
}
