package org.hra.services;

import org.hra.dominio.usuarioBean;
import org.hra.repository.usuarioRepository;
import org.hra.util.Generic;
import java.sql.SQLException;
import java.util.ArrayList;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author Quichua
 */
public class usuarioService {

    @Autowired
    public boolean fnIsusuarioBean(usuarioBean pousuarioBean) throws Exception {
        boolean status = Generic.getInstance(usuarioRepository.class).fnIsusuarioBean(pousuarioBean);
        if (!status) {
            pousuarioBean.setMensaje("El IndexBean buscado no existe");
        }
        return status;
    }

    @Autowired
    public List fnGetListusuarioBean(usuarioBean pousuarioBean) throws Exception {
        List list = Generic.getInstance(usuarioRepository.class).fnGetListusuarioBean(pousuarioBean);
        return list;
    }

    @Autowired
    public List fnGridusuarioBean(usuarioBean pousuarioBean) throws Exception {
        List list = Generic.getInstance(usuarioRepository.class).fnGridusuarioBean(pousuarioBean);
        return list;
    }

    @Autowired
    public ArrayList<usuarioBean> fnAutocompleteusuarioBean(usuarioBean pousuarioBean) throws Exception {
        ArrayList<usuarioBean> listausuarioBean = null;
        try {
            listausuarioBean = Generic.getInstance(usuarioRepository.class).fnAutocompleteusuarioBean(pousuarioBean);
        } catch (IllegalAccessException | InstantiationException | SQLException ex) {
        } finally {
        }
        return listausuarioBean;
    }

    @Autowired
    public usuarioBean fnGetusuarioBean(usuarioBean pousuarioBean) throws Exception {
        return Generic.getInstance(usuarioRepository.class).fnGetusuarioBean(pousuarioBean);
    }

    @Autowired
    public boolean fnInsertarusuarioBean(usuarioBean pousuarioBean) throws Exception {
        return Generic.getInstance(usuarioRepository.class).fnInsertarusuarioBean(pousuarioBean);
    }

    @Autowired
    public boolean fnEliminarusuarioBean(usuarioBean pousuarioBean) throws Exception {
        return Generic.getInstance(usuarioRepository.class).fnEliminarusuarioBean(pousuarioBean);
    }

    @Autowired
    public boolean fnActualizarusuarioBean(usuarioBean pousuarioBean) throws Exception {
        return Generic.getInstance(usuarioRepository.class).fnActualizarusuarioBean(pousuarioBean);
    }
}
