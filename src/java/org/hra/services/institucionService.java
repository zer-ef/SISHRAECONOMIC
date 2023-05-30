package org.hra.services;

import org.hra.dominio.institucionBean;
import org.hra.repository.institucionRepository;
import org.hra.util.Generic;
import java.sql.SQLException;
import java.util.ArrayList;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author Quichua
 */
public class institucionService {

    @Autowired
    public boolean fnIsinstitucionBean(institucionBean poinstitucionBean) throws Exception {
        boolean status = Generic.getInstance(institucionRepository.class).fnIsinstitucionBean(poinstitucionBean);
        if (!status) {
            poinstitucionBean.setMensaje("El IndexBean buscado no existe");
        }
        return status;
    }

    @Autowired
    public List fnGetListinstitucionBean(institucionBean poinstitucionBean) throws Exception {
        List list = Generic.getInstance(institucionRepository.class).fnGetListinstitucionBean(poinstitucionBean);
        return list;
    }

    @Autowired
    public List fnGridinstitucionBean(institucionBean poinstitucionBean) throws Exception {
        List list = Generic.getInstance(institucionRepository.class).fnGridinstitucionBean(poinstitucionBean);
        return list;
    }

    @Autowired
    public ArrayList<institucionBean> fnAutocompleteinstitucionBean(institucionBean poinstitucionBean) throws Exception {
        ArrayList<institucionBean> listainstitucionBean = null;
        try {
            listainstitucionBean = Generic.getInstance(institucionRepository.class).fnAutocompleteinstitucionBean(poinstitucionBean);
        } catch (IllegalAccessException | InstantiationException | SQLException ex) {
        } finally {
        }
        return listainstitucionBean;
    }

    @Autowired
    public institucionBean fnGetinstitucionBean(institucionBean poinstitucionBean) throws Exception {
        return Generic.getInstance(institucionRepository.class).fnGetinstitucionBean(poinstitucionBean);
    }

    @Autowired
    public boolean fnInsertarinstitucionBean(institucionBean poinstitucionBean) throws Exception {
        return Generic.getInstance(institucionRepository.class).fnInsertarinstitucionBean(poinstitucionBean);
    }

    @Autowired
    public boolean fnEliminarinstitucionBean(institucionBean poinstitucionBean) throws Exception {
        return Generic.getInstance(institucionRepository.class).fnEliminarinstitucionBean(poinstitucionBean);
    }

    @Autowired
    public boolean fnActualizarinstitucionBean(institucionBean poinstitucionBean) throws Exception {
        return Generic.getInstance(institucionRepository.class).fnActualizarinstitucionBean(poinstitucionBean);
    }
}
