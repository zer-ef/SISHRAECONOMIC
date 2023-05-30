package org.hra.services;

import org.hra.dominio.tipodocumentoBean;
import org.hra.repository.tipodocumentoRepository;
import org.hra.util.Generic;
import java.sql.SQLException;
import java.util.ArrayList;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author Quichua
 */
public class tipodocumentoService {

    @Autowired
    public boolean fnIstipodocumentoBean(tipodocumentoBean potipodocumentoBean) throws Exception {
        boolean status = Generic.getInstance(tipodocumentoRepository.class).fnIstipodocumentoBean(potipodocumentoBean);
        if (!status) {
            potipodocumentoBean.setMensaje("El IndexBean buscado no existe");
        }
        return status;
    }

    @Autowired
    public List fnGetListtipodocumentoBean(tipodocumentoBean potipodocumentoBean) throws Exception {
        List list = Generic.getInstance(tipodocumentoRepository.class).fnGetListtipodocumentoBean(potipodocumentoBean);
        return list;
    }

    @Autowired
    public List fnGridtipodocumentoBean(tipodocumentoBean potipodocumentoBean) throws Exception {
        List list = Generic.getInstance(tipodocumentoRepository.class).fnGridtipodocumentoBean(potipodocumentoBean);
        return list;
    }

    @Autowired
    public ArrayList<tipodocumentoBean> fnAutocompletetipodocumentoBean(tipodocumentoBean potipodocumentoBean) throws Exception {
        ArrayList<tipodocumentoBean> listatipodocumentoBean = null;
        try {
            listatipodocumentoBean = Generic.getInstance(tipodocumentoRepository.class).fnAutocompletetipodocumentoBean(potipodocumentoBean);
        } catch (IllegalAccessException | InstantiationException | SQLException ex) {
        } finally {
        }
        return listatipodocumentoBean;
    }

    @Autowired
    public tipodocumentoBean fnGettipodocumentoBean(tipodocumentoBean potipodocumentoBean) throws Exception {
        return Generic.getInstance(tipodocumentoRepository.class).fnGettipodocumentoBean(potipodocumentoBean);
    }

    @Autowired
    public boolean fnInsertartipodocumentoBean(tipodocumentoBean potipodocumentoBean) throws Exception {
        return Generic.getInstance(tipodocumentoRepository.class).fnInsertartipodocumentoBean(potipodocumentoBean);
    }

    @Autowired
    public boolean fnEliminartipodocumentoBean(tipodocumentoBean potipodocumentoBean) throws Exception {
        return Generic.getInstance(tipodocumentoRepository.class).fnEliminartipodocumentoBean(potipodocumentoBean);
    }

    @Autowired
    public boolean fnActualizartipodocumentoBean(tipodocumentoBean potipodocumentoBean) throws Exception {
        return Generic.getInstance(tipodocumentoRepository.class).fnActualizartipodocumentoBean(potipodocumentoBean);
    }
}
