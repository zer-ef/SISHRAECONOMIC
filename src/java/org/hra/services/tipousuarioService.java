package org.hra.services;

import org.hra.dominio.tipousuarioBean;
import org.hra.repository.tipousuarioRepository;
import org.hra.util.Generic;
import java.sql.SQLException;
import java.util.ArrayList;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author Quichua
 */
public class tipousuarioService {

    @Autowired
    public boolean fnIstipousuarioBean(tipousuarioBean potipousuarioBean) throws Exception {
        boolean status = Generic.getInstance(tipousuarioRepository.class).fnIstipousuarioBean(potipousuarioBean);
        if (!status) {
            potipousuarioBean.setMensaje("El IndexBean buscado no existe");
        }
        return status;
    }

    @Autowired
    public List fnGetListtipousuarioBean(tipousuarioBean potipousuarioBean) throws Exception {
        List list = Generic.getInstance(tipousuarioRepository.class).fnGetListtipousuarioBean(potipousuarioBean);
        return list;
    }

    @Autowired
    public List fnGridtipousuarioBean(tipousuarioBean potipousuarioBean) throws Exception {
        List list = Generic.getInstance(tipousuarioRepository.class).fnGridtipousuarioBean(potipousuarioBean);
        return list;
    }

    @Autowired
    public ArrayList<tipousuarioBean> fnAutocompletetipousuarioBean(tipousuarioBean potipousuarioBean) throws Exception {
        ArrayList<tipousuarioBean> listatipousuarioBean = null;
        try {
            listatipousuarioBean = Generic.getInstance(tipousuarioRepository.class).fnAutocompletetipousuarioBean(potipousuarioBean);
        } catch (IllegalAccessException | InstantiationException | SQLException ex) {
        } finally {
        }
        return listatipousuarioBean;
    }

    @Autowired
    public tipousuarioBean fnGettipousuarioBean(tipousuarioBean potipousuarioBean) throws Exception {
        return Generic.getInstance(tipousuarioRepository.class).fnGettipousuarioBean(potipousuarioBean);
    }

    @Autowired
    public boolean fnInsertartipousuarioBean(tipousuarioBean potipousuarioBean) throws Exception {
        return Generic.getInstance(tipousuarioRepository.class).fnInsertartipousuarioBean(potipousuarioBean);
    }

    @Autowired
    public boolean fnEliminartipousuarioBean(tipousuarioBean potipousuarioBean) throws Exception {
        return Generic.getInstance(tipousuarioRepository.class).fnEliminartipousuarioBean(potipousuarioBean);
    }

    @Autowired
    public boolean fnActualizartipousuarioBean(tipousuarioBean potipousuarioBean) throws Exception {
        return Generic.getInstance(tipousuarioRepository.class).fnActualizartipousuarioBean(potipousuarioBean);
    }
}
