package org.hra.controller;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonSyntaxException;
import org.hra.util.Generic;
import java.io.UnsupportedEncodingException;
import java.util.Map;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.hra.dominio.tipousuarioBean;
import org.hra.services.tipousuarioService;

/**
 *
 * @author Quichua
 */
@Controller
@RequestMapping("/tipousuarioController")
@SessionAttributes({"oSession"})
public class tipousuarioController {

    Gson gson = new GsonBuilder().setDateFormat("dd/MM/yyyy").serializeNulls().create();
    String json = "";
    tipousuarioBean otipousuarioBean;

    @RequestMapping(value = "/fnIstipousuarioBean.htm", method = RequestMethod.POST)
    public @ResponseBody
    String fnIstipousuarioBean(@RequestBody Map<String, Object> param) throws UnsupportedEncodingException {
        try {
            otipousuarioBean = gson.fromJson(gson.toJson(param.get("poJsonItem")), tipousuarioBean.class);
            otipousuarioBean.setStatus(Generic.getInstance(tipousuarioService.class).fnIstipousuarioBean(otipousuarioBean));
        } catch (Exception e) {
            otipousuarioBean = new tipousuarioBean();
            otipousuarioBean.setStatus(false);
            otipousuarioBean.setMensaje("ERROR EN LA INVOCACIÓN AL SERVICIO:" + e);
        }
        json = gson.toJson(otipousuarioBean.getStatus());
        String oItem = new String(json.getBytes("UTF-8"), "ISO-8859-1");
        return oItem;
    }

    @RequestMapping(value = "/fnGetListtipousuarioBean.htm", method = RequestMethod.POST)
    public @ResponseBody
    String fnGetListtipousuarioBean(@RequestBody Map<String, Object> param) throws UnsupportedEncodingException {
        try {
            otipousuarioBean = gson.fromJson(gson.toJson(param.get("poJsonItem")), tipousuarioBean.class);
            json = gson.toJson(Generic.getInstance(tipousuarioService.class).fnGetListtipousuarioBean(otipousuarioBean));
        } catch (Exception e) {
            String error = "ERROR EN LA INVOCACIÓN AL SERVICIO: " + e;
            json = gson.toJson(error);
        }
        String oItem = new String(json.getBytes("UTF-8"), "ISO-8859-1");
        return oItem;
    }

    @RequestMapping(value = "/fnGridtipousuarioBean.htm", method = RequestMethod.POST)
    public @ResponseBody
    String fnGridtipousuarioBean(@RequestBody Map<String, Object> param) throws UnsupportedEncodingException, Exception {
        try {
            otipousuarioBean = gson.fromJson(gson.toJson(param.get("poJsonItem")), tipousuarioBean.class);
            json = gson.toJson(Generic.getInstance(tipousuarioService.class).fnGridtipousuarioBean(otipousuarioBean));
            String oItem = new String(json.getBytes("UTF-8"), "ISO-8859-1");
            return oItem;
        } catch (JsonSyntaxException e) {
            String error = "ERROR EN LA INVOCACIÓN AL SERVICIO: " + e;
            return gson.toJson(error);
        }
    }

    @RequestMapping(value = "/fnAutocompletetipousuarioBean.htm", method = RequestMethod.POST)
    public @ResponseBody
    String fnAutocompletetipousuarioBean(@RequestBody Map<String, Object> param) throws UnsupportedEncodingException, Exception {
        try {
            String pItem = gson.fromJson(gson.toJson(param.get("pnvDenominacion")), String.class);
            otipousuarioBean = new tipousuarioBean();
            otipousuarioBean.setAccion(pItem);
            json = gson.toJson(Generic.getInstance(tipousuarioService.class).fnAutocompletetipousuarioBean(otipousuarioBean));
            String oItem = new String(json.getBytes("UTF-8"), "ISO-8859-1");
            return oItem;
        } catch (JsonSyntaxException e) {
            String error = "ERROR EN LA INVOCACIÓN AL SERVICIO: " + e;
            return gson.toJson(error);
        }
    }

    @RequestMapping(value = "/fnGettipousuarioBean.htm", method = RequestMethod.POST)
    public @ResponseBody
    String fnGettipousuarioBean(@RequestBody Map<String, Object> param) throws UnsupportedEncodingException {
        try {
            otipousuarioBean = gson.fromJson(gson.toJson(param.get("poJsonItem")), tipousuarioBean.class);
            json = gson.toJson(Generic.getInstance(tipousuarioService.class).fnGettipousuarioBean(otipousuarioBean));
        } catch (Exception e) {
            String error = "ERROR EN LA INVOCACIÓN AL SERVICIO: " + e;
            json = gson.toJson(error);
        }
        String oItem = new String(json.getBytes("UTF-8"), "ISO-8859-1");
        return oItem;
    }

    @RequestMapping(value = "/fnInsertartipousuarioBean.htm", method = RequestMethod.POST, headers = "content-type=application/json")
    public @ResponseBody
    String fnInsertartipousuarioBean(@RequestBody Map<String, Object> param) throws UnsupportedEncodingException {
        try {
            otipousuarioBean = gson.fromJson(gson.toJson(param.get("poJsonItem")), tipousuarioBean.class);
            json = gson.toJson(Generic.getInstance(tipousuarioService.class).fnInsertartipousuarioBean(otipousuarioBean));
        } catch (Exception e) {
            String error = "ERROR EN LA INVOCACIÓN AL SERVICIO: " + e;
            json = gson.toJson(error);
        }
        String oItem = new String(json.getBytes("UTF-8"), "ISO-8859-1");
        return oItem;
    }

    @RequestMapping(value = "/fnEliminartipousuarioBean.htm", method = RequestMethod.POST, headers = "content-type=application/json")
    public @ResponseBody
    String fnEliminartipousuarioBean(@RequestBody Map<String, Object> param) throws UnsupportedEncodingException {
        try {
            otipousuarioBean = gson.fromJson(gson.toJson(param.get("poJsonItem")), tipousuarioBean.class);
            json = gson.toJson(Generic.getInstance(tipousuarioService.class).fnEliminartipousuarioBean(otipousuarioBean));
        } catch (Exception e) {
            String error = "ERROR EN LA INVOCACIÓN AL SERVICIO: " + e;
            json = gson.toJson(error);
        }
        String oItem = new String(json.getBytes("UTF-8"), "ISO-8859-1");
        return oItem;
    }

    @RequestMapping(value = "/fnActualizartipousuarioBean.htm", method = RequestMethod.POST, headers = "content-type=application/json")
    public @ResponseBody
    String fnActualizartipousuarioBean(@RequestBody Map<String, Object> param) throws UnsupportedEncodingException {
        try {
            otipousuarioBean = gson.fromJson(gson.toJson(param.get("poJsonItem")), tipousuarioBean.class);
            json = gson.toJson(Generic.getInstance(tipousuarioService.class).fnActualizartipousuarioBean(otipousuarioBean));
        } catch (Exception e) {
            String error = "ERROR EN LA INVOCACIÓN AL SERVICIO: " + e;
            json = gson.toJson(error);
        }
        String oItem = new String(json.getBytes("UTF-8"), "ISO-8859-1");
        return oItem;
    }

}
