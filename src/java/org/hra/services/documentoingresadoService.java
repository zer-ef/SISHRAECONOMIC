package org.hra.services;

import org.hra.dominio.documentoingresadoBean;
import org.hra.repository.documentoingresadoRepository;
import org.hra.util.Generic;
import java.sql.SQLException;
import java.util.ArrayList;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author Quichua
 */
public class documentoingresadoService {

    @Autowired
    public boolean fnIsdocumentoingresadoBean(documentoingresadoBean podocumentoingresadoBean) throws Exception {
        boolean status = Generic.getInstance(documentoingresadoRepository.class).fnIsdocumentoingresadoBean(podocumentoingresadoBean);
        if (!status) {
            podocumentoingresadoBean.setMensaje("El IndexBean buscado no existe");
        }
        return status;
    }

    @Autowired
    public List fnGetListdocumentoingresadoBean(documentoingresadoBean podocumentoingresadoBean) throws Exception {
        List list = Generic.getInstance(documentoingresadoRepository.class).fnGetListdocumentoingresadoBean(podocumentoingresadoBean);
        return list;
    }

    @Autowired
    public List fnGriddocumentoingresadoBean(documentoingresadoBean podocumentoingresadoBean) throws Exception {
        List list = Generic.getInstance(documentoingresadoRepository.class).fnGriddocumentoingresadoBean(podocumentoingresadoBean);
        return list;
    }

    @Autowired
    public ArrayList<documentoingresadoBean> fnAutocompletedocumentoingresadoBean(documentoingresadoBean podocumentoingresadoBean) throws Exception {
        ArrayList<documentoingresadoBean> listadocumentoingresadoBean = null;
        try {
            listadocumentoingresadoBean = Generic.getInstance(documentoingresadoRepository.class).fnAutocompletedocumentoingresadoBean(podocumentoingresadoBean);
        } catch (IllegalAccessException | InstantiationException | SQLException ex) {
        } finally {
        }
        return listadocumentoingresadoBean;
    }

    @Autowired
    public documentoingresadoBean fnGetdocumentoingresadoBean(documentoingresadoBean podocumentoingresadoBean) throws Exception {
        return Generic.getInstance(documentoingresadoRepository.class).fnGetdocumentoingresadoBean(podocumentoingresadoBean);
    }

    @Autowired
    public boolean fnInsertardocumentoingresadoBean(documentoingresadoBean podocumentoingresadoBean) throws Exception {
        return Generic.getInstance(documentoingresadoRepository.class).fnInsertardocumentoingresadoBean(podocumentoingresadoBean);
    }

    @Autowired
    public boolean fnEliminardocumentoingresadoBean(documentoingresadoBean podocumentoingresadoBean) throws Exception {
        return Generic.getInstance(documentoingresadoRepository.class).fnEliminardocumentoingresadoBean(podocumentoingresadoBean);
    }

    @Autowired
    public boolean fnActualizardocumentoingresadoBean(documentoingresadoBean podocumentoingresadoBean) throws Exception {
        return Generic.getInstance(documentoingresadoRepository.class).fnActualizardocumentoingresadoBean(podocumentoingresadoBean);
    }
}
