package org.hra.controller;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonSyntaxException;
import org.hra.util.Generic;
import java.io.UnsupportedEncodingException;
import java.util.Map;
import javax.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.hra.dominio.usuarioBean;
import org.hra.services.usuarioService;

/**
 *
 * @author Quichua
 */
@Controller
@RequestMapping("/usuarioController")
@SessionAttributes({"oSession"})
public class usuarioController {

    Gson gson = new GsonBuilder().setDateFormat("dd/MM/yyyy").serializeNulls().create();
    String json = "";
    usuarioBean ousuarioBean;

    @RequestMapping(value = "/fnIsusuarioBean.htm", method = RequestMethod.POST)
    public @ResponseBody
    String fnIsusuarioBean(@RequestBody Map<String, Object> param, HttpSession oItemSession) throws UnsupportedEncodingException {
        try {
            if (oItemSession.getAttribute("jsonUsuario") == null || oItemSession.getAttribute("jsonUsuario").toString().isEmpty()) {
                json = gson.toJson(null);
            } else {
                json = gson.toJson(oItemSession.getAttribute("jsonUsuario"));
            }
        } catch (Exception e) {
            json = gson.toJson(null);
        }
        String oItem = new String(json.getBytes("UTF-8"), "ISO-8859-1");
        return oItem;
    }

    @RequestMapping(value = "/fnDelSessionUsuarioBean.htm", method = RequestMethod.POST)
    public @ResponseBody
    String fnDelSessionUsuarioBean(@RequestBody Map<String, Object> param, HttpSession oItemSession) throws UnsupportedEncodingException {
        try {
            oItemSession.setAttribute("jsonUsuario", null);
            json = gson.toJson(true);
        } catch (Exception e) {
            json = gson.toJson(false);
        }
        String oItem = new String(json.getBytes("UTF-8"), "ISO-8859-1");
        return oItem;
    }

    @RequestMapping(value = "/fnIsUsuarioAdminBean.htm", method = RequestMethod.POST)
    public @ResponseBody
    String fnIsUsuarioAdminBean(@RequestBody Map<String, Object> param, HttpSession oItemSession) throws UnsupportedEncodingException {
        try {
            if (oItemSession.getAttribute("Usuario") == null || oItemSession.getAttribute("Usuario").toString().isEmpty()) {
                json = gson.toJson(null);
            } else {
                json = gson.toJson(oItemSession.getAttribute("Usuario"));
            }
        } catch (Exception e) {
            json = gson.toJson(null);
        }
        String oItem = new String(json.getBytes("UTF-8"), "ISO-8859-1");
        return oItem;
    }

    @RequestMapping(value = "/fnGetListusuarioBean.htm", method = RequestMethod.POST)
    public @ResponseBody
    String fnGetListusuarioBean(@RequestBody Map<String, Object> param, HttpSession oItemSession) throws UnsupportedEncodingException {
        try {
            ousuarioBean = gson.fromJson(gson.toJson(param.get("poJsonItem")), usuarioBean.class);
            if (oItemSession.getAttribute("jsonUsuario") == null || oItemSession.getAttribute("jsonUsuario").toString().isEmpty()) {
                oItemSession.setAttribute("jsonUsuario", Generic.getInstance(usuarioService.class).fnGetListusuarioBean(ousuarioBean));
                json = gson.toJson(oItemSession.getAttribute("jsonUsuario"));
            } else {
                json = gson.toJson(oItemSession.getAttribute("jsonUsuario"));
            }
        } catch (Exception e) {
            String error = "ERROR EN LA INVOCACIÓN AL SERVICIO: " + e;
            json = gson.toJson(error);
        }
        String oItem = new String(json.getBytes("UTF-8"), "ISO-8859-1");
        return oItem;
    }

    @RequestMapping(value = "/fnGridusuarioBean.htm", method = RequestMethod.POST)
    public @ResponseBody
    String fnGridusuarioBean(@RequestBody Map<String, Object> param) throws UnsupportedEncodingException, Exception {
        try {
            ousuarioBean = gson.fromJson(gson.toJson(param.get("poJsonItem")), usuarioBean.class);
            json = gson.toJson(Generic.getInstance(usuarioService.class).fnGridusuarioBean(ousuarioBean));
            String oItem = new String(json.getBytes("UTF-8"), "ISO-8859-1");
            return oItem;
        } catch (JsonSyntaxException e) {
            String error = "ERROR EN LA INVOCACIÓN AL SERVICIO: " + e;
            return gson.toJson(error);
        }
    }

    @RequestMapping(value = "/fnAutocompleteusuarioBean.htm", method = RequestMethod.POST)
    public @ResponseBody
    String fnAutocompleteusuarioBean(@RequestBody Map<String, Object> param) throws UnsupportedEncodingException, Exception {
        try {
            String pItem = gson.fromJson(gson.toJson(param.get("pnvDenominacion")), String.class);
            ousuarioBean = new usuarioBean();
            ousuarioBean.setAccion(pItem);
            json = gson.toJson(Generic.getInstance(usuarioService.class).fnAutocompleteusuarioBean(ousuarioBean));
            String oItem = new String(json.getBytes("UTF-8"), "ISO-8859-1");
            return oItem;
        } catch (JsonSyntaxException e) {
            String error = "ERROR EN LA INVOCACIÓN AL SERVICIO: " + e;
            return gson.toJson(error);
        }
    }

    @RequestMapping(value = "/fnGetusuarioBean.htm", method = RequestMethod.POST)
    public @ResponseBody
    String fnGetusuarioBean(@RequestBody Map<String, Object> param, HttpSession oItemSession) throws UnsupportedEncodingException {
        try {
            ousuarioBean = gson.fromJson(gson.toJson(param.get("poJsonItem")), usuarioBean.class);
            ousuarioBean = Generic.getInstance(usuarioService.class).fnGetusuarioBean(ousuarioBean);
            oItemSession.setAttribute("Usuario", ousuarioBean);
            oItemSession.setAttribute("IdUsuario", ousuarioBean.getIdUsuario());
            json = gson.toJson(oItemSession.getAttribute("Usuario"));

        } catch (Exception e) {
            String error = "ERROR EN LA INVOCACIÓN AL SERVICIO: " + e;
            json = gson.toJson(error);
        }
        String oItem = new String(json.getBytes("UTF-8"), "ISO-8859-1");
        return oItem;
    }

    @RequestMapping(value = "/fnInsertarusuarioBean.htm", method = RequestMethod.POST, headers = "content-type=application/json")
    public @ResponseBody
    String fnInsertarusuarioBean(@RequestBody Map<String, Object> param) throws UnsupportedEncodingException {
        try {
            ousuarioBean = gson.fromJson(gson.toJson(param.get("poJsonItem")), usuarioBean.class);
            json = gson.toJson(Generic.getInstance(usuarioService.class).fnInsertarusuarioBean(ousuarioBean));
        } catch (Exception e) {
            String error = "ERROR EN LA INVOCACIÓN AL SERVICIO: " + e;
            json = gson.toJson(error);
        }
        String oItem = new String(json.getBytes("UTF-8"), "ISO-8859-1");
        return oItem;
    }

    @RequestMapping(value = "/fnEliminarusuarioBean.htm", method = RequestMethod.POST, headers = "content-type=application/json")
    public @ResponseBody
    String fnEliminarusuarioBean(@RequestBody Map<String, Object> param) throws UnsupportedEncodingException {
        try {
            ousuarioBean = gson.fromJson(gson.toJson(param.get("poJsonItem")), usuarioBean.class);
            json = gson.toJson(Generic.getInstance(usuarioService.class).fnEliminarusuarioBean(ousuarioBean));
        } catch (Exception e) {
            String error = "ERROR EN LA INVOCACIÓN AL SERVICIO: " + e;
            json = gson.toJson(error);
        }
        String oItem = new String(json.getBytes("UTF-8"), "ISO-8859-1");
        return oItem;
    }

    @RequestMapping(value = "/fnActualizarusuarioBean.htm", method = RequestMethod.POST, headers = "content-type=application/json")
    public @ResponseBody
    String fnActualizarusuarioBean(@RequestBody Map<String, Object> param) throws UnsupportedEncodingException {
        try {
            ousuarioBean = gson.fromJson(gson.toJson(param.get("poJsonItem")), usuarioBean.class);
            json = gson.toJson(Generic.getInstance(usuarioService.class).fnActualizarusuarioBean(ousuarioBean));
        } catch (Exception e) {
            String error = "ERROR EN LA INVOCACIÓN AL SERVICIO: " + e;
            json = gson.toJson(error);
        }
        String oItem = new String(json.getBytes("UTF-8"), "ISO-8859-1");
        return oItem;
    }
}
