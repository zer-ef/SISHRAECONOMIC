package org.hra.services;

import org.hra.dominio.personaladministrativoBean;
import org.hra.repository.personaladministrativoRepository;
import org.hra.util.Generic;
import java.sql.SQLException;
import java.util.ArrayList;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author Quichua
 */
public class personaladministrativoService {

    @Autowired
    public boolean fnIspersonaladministrativoBean(personaladministrativoBean popersonaladministrativoBean) throws Exception {
        boolean status = Generic.getInstance(personaladministrativoRepository.class).fnIspersonaladministrativoBean(popersonaladministrativoBean);
        if (!status) {
            popersonaladministrativoBean.setMensaje("El IndexBean buscado no existe");
        }
        return status;
    }

    @Autowired
    public List fnGetListpersonaladministrativoBean(personaladministrativoBean popersonaladministrativoBean) throws Exception {
        List list = Generic.getInstance(personaladministrativoRepository.class).fnGetListpersonaladministrativoBean(popersonaladministrativoBean);
        return list;
    }

    @Autowired
    public List fnGridpersonaladministrativoBean(personaladministrativoBean popersonaladministrativoBean) throws Exception {
        List list = Generic.getInstance(personaladministrativoRepository.class).fnGridpersonaladministrativoBean(popersonaladministrativoBean);
        return list;
    }

    @Autowired
    public ArrayList<personaladministrativoBean> fnAutocompletepersonaladministrativoBean(personaladministrativoBean popersonaladministrativoBean) throws Exception {
        ArrayList<personaladministrativoBean> listapersonaladministrativoBean = null;
        try {
            listapersonaladministrativoBean = Generic.getInstance(personaladministrativoRepository.class).fnAutocompletepersonaladministrativoBean(popersonaladministrativoBean);
        } catch (IllegalAccessException | InstantiationException | SQLException ex) {
        } finally {
        }
        return listapersonaladministrativoBean;
    }

    @Autowired
    public personaladministrativoBean fnGetpersonaladministrativoBean(personaladministrativoBean popersonaladministrativoBean) throws Exception {
        return Generic.getInstance(personaladministrativoRepository.class).fnGetpersonaladministrativoBean(popersonaladministrativoBean);
    }

    @Autowired
    public boolean fnInsertarpersonaladministrativoBean(personaladministrativoBean popersonaladministrativoBean) throws Exception {
        return Generic.getInstance(personaladministrativoRepository.class).fnInsertarpersonaladministrativoBean(popersonaladministrativoBean);
    }

    @Autowired
    public boolean fnEliminarpersonaladministrativoBean(personaladministrativoBean popersonaladministrativoBean) throws Exception {
        return Generic.getInstance(personaladministrativoRepository.class).fnEliminarpersonaladministrativoBean(popersonaladministrativoBean);
    }

    @Autowired
    public boolean fnActualizarpersonaladministrativoBean(personaladministrativoBean popersonaladministrativoBean) throws Exception {
        return Generic.getInstance(personaladministrativoRepository.class).fnActualizarpersonaladministrativoBean(popersonaladministrativoBean);
    }
}
