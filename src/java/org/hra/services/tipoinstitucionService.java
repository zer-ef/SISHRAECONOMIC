package org.hra.services;

import org.hra.dominio.tipoinstitucionBean;
import org.hra.repository.tipoinstitucionRepository;
import org.hra.util.Generic;
import java.sql.SQLException;
import java.util.ArrayList;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author Quichua
 */
public class tipoinstitucionService {

    @Autowired
    public boolean fnIstipoinstitucionBean(tipoinstitucionBean potipoinstitucionBean) throws Exception {
        boolean status = Generic.getInstance(tipoinstitucionRepository.class).fnIstipoinstitucionBean(potipoinstitucionBean);
        if (!status) {
            potipoinstitucionBean.setMensaje("El IndexBean buscado no existe");
        }
        return status;
    }

    @Autowired
    public List fnGetListtipoinstitucionBean(tipoinstitucionBean potipoinstitucionBean) throws Exception {
        List list = Generic.getInstance(tipoinstitucionRepository.class).fnGetListtipoinstitucionBean(potipoinstitucionBean);
        return list;
    }

    @Autowired
    public List fnGridtipoinstitucionBean(tipoinstitucionBean potipoinstitucionBean) throws Exception {
        List list = Generic.getInstance(tipoinstitucionRepository.class).fnGridtipoinstitucionBean(potipoinstitucionBean);
        return list;
    }

    @Autowired
    public ArrayList<tipoinstitucionBean> fnAutocompletetipoinstitucionBean(tipoinstitucionBean potipoinstitucionBean) throws Exception {
        ArrayList<tipoinstitucionBean> listatipoinstitucionBean = null;
        try {
            listatipoinstitucionBean = Generic.getInstance(tipoinstitucionRepository.class).fnAutocompletetipoinstitucionBean(potipoinstitucionBean);
        } catch (IllegalAccessException | InstantiationException | SQLException ex) {
        } finally {
        }
        return listatipoinstitucionBean;
    }

    @Autowired
    public tipoinstitucionBean fnGettipoinstitucionBean(tipoinstitucionBean potipoinstitucionBean) throws Exception {
        return Generic.getInstance(tipoinstitucionRepository.class).fnGettipoinstitucionBean(potipoinstitucionBean);
    }

    @Autowired
    public boolean fnInsertartipoinstitucionBean(tipoinstitucionBean potipoinstitucionBean) throws Exception {
        return Generic.getInstance(tipoinstitucionRepository.class).fnInsertartipoinstitucionBean(potipoinstitucionBean);
    }

    @Autowired
    public boolean fnEliminartipoinstitucionBean(tipoinstitucionBean potipoinstitucionBean) throws Exception {
        return Generic.getInstance(tipoinstitucionRepository.class).fnEliminartipoinstitucionBean(potipoinstitucionBean);
    }

    @Autowired
    public boolean fnActualizartipoinstitucionBean(tipoinstitucionBean potipoinstitucionBean) throws Exception {
        return Generic.getInstance(tipoinstitucionRepository.class).fnActualizartipoinstitucionBean(potipoinstitucionBean);
    }
}
