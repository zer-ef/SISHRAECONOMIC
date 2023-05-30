package org.hra.services;

import org.hra.dominio.medicoprofesionalBean;
import org.hra.repository.medicoprofesionalRepository;
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
public class medicoprofesionalService {

    @Autowired
    public boolean fnIsmedicoprofesionalBean(medicoprofesionalBean pomedicoprofesionalBean) throws Exception {
        boolean status = Generic.getInstance(medicoprofesionalRepository.class).fnIsmedicoprofesionalBean(pomedicoprofesionalBean);
        if (!status) {
            pomedicoprofesionalBean.setMensaje("El IndexBean buscado no existe");
        }
        return status;
    }

    @Autowired
    public List fnGetListmedicoprofesionalBean(medicoprofesionalBean pomedicoprofesionalBean) throws Exception {
        List list = Generic.getInstance(medicoprofesionalRepository.class).fnGetListmedicoprofesionalBean(pomedicoprofesionalBean);
        return list;
    }

    @Autowired
    public List fnGridmedicoprofesionalBean(medicoprofesionalBean pomedicoprofesionalBean) throws Exception {
        List list = Generic.getInstance(medicoprofesionalRepository.class).fnGridmedicoprofesionalBean(pomedicoprofesionalBean);
        return list;
    }

    @Autowired
    public ArrayList<medicoprofesionalBean> fnAutocompletemedicoprofesionalBean(medicoprofesionalBean pomedicoprofesionalBean) throws Exception {
        ArrayList<medicoprofesionalBean> listamedicoprofesionalBean = null;
        try {
            listamedicoprofesionalBean = Generic.getInstance(medicoprofesionalRepository.class).fnAutocompletemedicoprofesionalBean(pomedicoprofesionalBean);
        } catch (IllegalAccessException | InstantiationException | SQLException ex) {
        } finally {
        }
        return listamedicoprofesionalBean;
    }

    @Autowired
    public medicoprofesionalBean fnGetmedicoprofesionalBean(medicoprofesionalBean pomedicoprofesionalBean) throws Exception {
        return Generic.getInstance(medicoprofesionalRepository.class).fnGetmedicoprofesionalBean(pomedicoprofesionalBean);
    }

    @Autowired
    public boolean fnInsertarmedicoprofesionalBean(personaBean popersonaBean, medicoprofesionalBean pomedicoprofesionalBean) throws Exception {
        return Generic.getInstance(medicoprofesionalRepository.class).fnInsertarmedicoprofesionalBean(popersonaBean, pomedicoprofesionalBean);
    }

    @Autowired
    public boolean fnEliminarmedicoprofesionalBean(personaBean popersonaBean, medicoprofesionalBean pomedicoprofesionalBean) throws Exception {
        return Generic.getInstance(medicoprofesionalRepository.class).fnEliminarmedicoprofesionalBean(popersonaBean, pomedicoprofesionalBean);
    }

    @Autowired
    public boolean fnActualizarmedicoprofesionalBean(personaBean popersonaBean, medicoprofesionalBean pomedicoprofesionalBean) throws Exception {
        return Generic.getInstance(medicoprofesionalRepository.class).fnActualizarmedicoprofesionalBean(popersonaBean, pomedicoprofesionalBean);
    }
}
