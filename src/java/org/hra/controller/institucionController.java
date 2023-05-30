package org.hra.controller;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonSyntaxException;
import org.hra.util.Generic;
import java.io.UnsupportedEncodingException;
import java.util.Map;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.hra.dominio.institucionBean;
import org.hra.services.institucionService;

/**
 *
 * @author Quichua
 */
@Controller
@RequestMapping("/institucionController")
@SessionAttributes({"oSession"})
public class institucionController {

    Gson gson = new GsonBuilder().setDateFormat("dd/MM/yyyy").serializeNulls().create();
    String json = "";
    institucionBean oinstitucionBean;

    @RequestMapping(value = "/fnIsinstitucionBean.htm", method = RequestMethod.POST)
    public @ResponseBody
    String fnIsinstitucionBean(@RequestBody Map<String, Object> param) throws UnsupportedEncodingException {
        try {
            oinstitucionBean = gson.fromJson(gson.toJson(param.get("poJsonItem")), institucionBean.class);
            oinstitucionBean.setStatus(Generic.getInstance(institucionService.class).fnIsinstitucionBean(oinstitucionBean));
        } catch (Exception e) {
            oinstitucionBean = new institucionBean();
            oinstitucionBean.setStatus(false);
            oinstitucionBean.setMensaje("ERROR EN LA INVOCACIÓN AL SERVICIO:" + e);
        }
        json = gson.toJson(oinstitucionBean.getStatus());
        String oItem = new String(json.getBytes("UTF-8"), "ISO-8859-1");
        return oItem;
    }

    @RequestMapping(value = "/fnGetListinstitucionBean.htm", method = RequestMethod.POST)
    public @ResponseBody
    String fnGetListinstitucionBean(@RequestBody Map<String, Object> param) throws UnsupportedEncodingException {
        try {
            oinstitucionBean = gson.fromJson(gson.toJson(param.get("poJsonItem")), institucionBean.class);
            json = gson.toJson(Generic.getInstance(institucionService.class).fnGetListinstitucionBean(oinstitucionBean));
        } catch (Exception e) {
            String error = "ERROR EN LA INVOCACIÓN AL SERVICIO: " + e;
            json = gson.toJson(error);
        }
        String oItem = new String(json.getBytes("UTF-8"), "ISO-8859-1");
        return oItem;
    }

    @RequestMapping(value = "/fnGridinstitucionBean.htm", method = RequestMethod.POST)
    public @ResponseBody
    String fnGridinstitucionBean(@RequestBody Map<String, Object> param) throws UnsupportedEncodingException, Exception {
        try {
            oinstitucionBean = gson.fromJson(gson.toJson(param.get("poJsonItem")), institucionBean.class);
            json = gson.toJson(Generic.getInstance(institucionService.class).fnGridinstitucionBean(oinstitucionBean));
            String oItem = new String(json.getBytes("UTF-8"), "ISO-8859-1");
            return oItem;
        } catch (JsonSyntaxException e) {
            String error = "ERROR EN LA INVOCACIÓN AL SERVICIO: " + e;
            return gson.toJson(error);
        }
    }

    @RequestMapping(value = "/fnAutocompleteinstitucionBean.htm", method = RequestMethod.POST)
    public @ResponseBody
    String fnAutocompleteinstitucionBean(@RequestBody Map<String, Object> param) throws UnsupportedEncodingException, Exception {
        try {
            String pItem = gson.fromJson(gson.toJson(param.get("pnvDenominacion")), String.class);
            oinstitucionBean = new institucionBean();
            oinstitucionBean.setAccion(pItem);
            json = gson.toJson(Generic.getInstance(institucionService.class).fnAutocompleteinstitucionBean(oinstitucionBean));
            String oItem = new String(json.getBytes("UTF-8"), "ISO-8859-1");
            return oItem;
        } catch (JsonSyntaxException e) {
            String error = "ERROR EN LA INVOCACIÓN AL SERVICIO: " + e;
            return gson.toJson(error);
        }
    }

    @RequestMapping(value = "/fnGetinstitucionBean.htm", method = RequestMethod.POST)
    public @ResponseBody
    String fnGetinstitucionBean(@RequestBody Map<String, Object> param) throws UnsupportedEncodingException {
        try {
            oinstitucionBean = gson.fromJson(gson.toJson(param.get("poJsonItem")), institucionBean.class);
            json = gson.toJson(Generic.getInstance(institucionService.class).fnGetinstitucionBean(oinstitucionBean));
        } catch (Exception e) {
            String error = "ERROR EN LA INVOCACIÓN AL SERVICIO: " + e;
            json = gson.toJson(error);
        }
        String oItem = new String(json.getBytes("UTF-8"), "ISO-8859-1");
        return oItem;
    }

    @RequestMapping(value = "/fnInsertarinstitucionBean.htm", method = RequestMethod.POST, headers = "content-type=application/json")
    public @ResponseBody
    String fnInsertarinstitucionBean(@RequestBody Map<String, Object> param) throws UnsupportedEncodingException {
        try {
            oinstitucionBean = gson.fromJson(gson.toJson(param.get("poJsonItem")), institucionBean.class);
            json = gson.toJson(Generic.getInstance(institucionService.class).fnInsertarinstitucionBean(oinstitucionBean));
        } catch (Exception e) {
            String error = "ERROR EN LA INVOCACIÓN AL SERVICIO: " + e;
            json = gson.toJson(error);
        }
        String oItem = new String(json.getBytes("UTF-8"), "ISO-8859-1");
        return oItem;
    }

    @RequestMapping(value = "/fnEliminarinstitucionBean.htm", method = RequestMethod.POST, headers = "content-type=application/json")
    public @ResponseBody
    String fnEliminarinstitucionBean(@RequestBody Map<String, Object> param) throws UnsupportedEncodingException {
        try {
            oinstitucionBean = gson.fromJson(gson.toJson(param.get("poJsonItem")), institucionBean.class);
            json = gson.toJson(Generic.getInstance(institucionService.class).fnEliminarinstitucionBean(oinstitucionBean));
        } catch (Exception e) {
            String error = "ERROR EN LA INVOCACIÓN AL SERVICIO: " + e;
            json = gson.toJson(error);
        }
        String oItem = new String(json.getBytes("UTF-8"), "ISO-8859-1");
        return oItem;
    }

    @RequestMapping(value = "/fnActualizarinstitucionBean.htm", method = RequestMethod.POST, headers = "content-type=application/json")
    public @ResponseBody
    String fnActualizarinstitucionBean(@RequestBody Map<String, Object> param) throws UnsupportedEncodingException {
        try {
            oinstitucionBean = gson.fromJson(gson.toJson(param.get("poJsonItem")), institucionBean.class);
            json = gson.toJson(Generic.getInstance(institucionService.class).fnActualizarinstitucionBean(oinstitucionBean));
        } catch (Exception e) {
            String error = "ERROR EN LA INVOCACIÓN AL SERVICIO: " + e;
            json = gson.toJson(error);
        }
        String oItem = new String(json.getBytes("UTF-8"), "ISO-8859-1");
        return oItem;
    }

}
