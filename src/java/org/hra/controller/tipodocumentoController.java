package org.hra.controller;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonSyntaxException;
import org.hra.util.Generic;
import java.io.UnsupportedEncodingException;
import java.util.Map;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.hra.dominio.tipodocumentoBean;
import org.hra.services.tipodocumentoService;

/**
 *
 * @author Quichua
 */
@Controller
@RequestMapping("/tipodocumentoController")
@SessionAttributes({"oSession"})
public class tipodocumentoController {

    Gson gson = new GsonBuilder().setDateFormat("dd/MM/yyyy").serializeNulls().create();
    String json = "";
    tipodocumentoBean otipodocumentoBean;

    @RequestMapping(value = "/fnIstipodocumentoBean.htm", method = RequestMethod.POST)
    public @ResponseBody
    String fnIstipodocumentoBean(@RequestBody Map<String, Object> param) throws UnsupportedEncodingException {
        try {
            otipodocumentoBean = gson.fromJson(gson.toJson(param.get("poJsonItem")), tipodocumentoBean.class);
            otipodocumentoBean.setStatus(Generic.getInstance(tipodocumentoService.class).fnIstipodocumentoBean(otipodocumentoBean));
        } catch (Exception e) {
            otipodocumentoBean = new tipodocumentoBean();
            otipodocumentoBean.setStatus(false);
            otipodocumentoBean.setMensaje("ERROR EN LA INVOCACIÓN AL SERVICIO:" + e);
        }
        json = gson.toJson(otipodocumentoBean.getStatus());
        String oItem = new String(json.getBytes("UTF-8"), "ISO-8859-1");
        return oItem;
    }

    @RequestMapping(value = "/fnGetListtipodocumentoBean.htm", method = RequestMethod.POST)
    public @ResponseBody
    String fnGetListtipodocumentoBean(@RequestBody Map<String, Object> param) throws UnsupportedEncodingException {
        try {
            otipodocumentoBean = gson.fromJson(gson.toJson(param.get("poJsonItem")), tipodocumentoBean.class);
            json = gson.toJson(Generic.getInstance(tipodocumentoService.class).fnGetListtipodocumentoBean(otipodocumentoBean));
        } catch (Exception e) {
            String error = "ERROR EN LA INVOCACIÓN AL SERVICIO: " + e;
            json = gson.toJson(error);
        }
        String oItem = new String(json.getBytes("UTF-8"), "ISO-8859-1");
        return oItem;
    }

    @RequestMapping(value = "/fnGridtipodocumentoBean.htm", method = RequestMethod.POST)
    public @ResponseBody
    String fnGridtipodocumentoBean(@RequestBody Map<String, Object> param) throws UnsupportedEncodingException, Exception {
        try {
            otipodocumentoBean = gson.fromJson(gson.toJson(param.get("poJsonItem")), tipodocumentoBean.class);
            json = gson.toJson(Generic.getInstance(tipodocumentoService.class).fnGridtipodocumentoBean(otipodocumentoBean));
            String oItem = new String(json.getBytes("UTF-8"), "ISO-8859-1");
            return oItem;
        } catch (JsonSyntaxException e) {
            String error = "ERROR EN LA INVOCACIÓN AL SERVICIO: " + e;
            return gson.toJson(error);
        }
    }

    @RequestMapping(value = "/fnAutocompletetipodocumentoBean.htm", method = RequestMethod.POST)
    public @ResponseBody
    String fnAutocompletetipodocumentoBean(@RequestBody Map<String, Object> param) throws UnsupportedEncodingException, Exception {
        try {
            String pItem = gson.fromJson(gson.toJson(param.get("pnvDenominacion")), String.class);
            otipodocumentoBean = new tipodocumentoBean();
            otipodocumentoBean.setAccion(pItem);
            json = gson.toJson(Generic.getInstance(tipodocumentoService.class).fnAutocompletetipodocumentoBean(otipodocumentoBean));
            String oItem = new String(json.getBytes("UTF-8"), "ISO-8859-1");
            return oItem;
        } catch (JsonSyntaxException e) {
            String error = "ERROR EN LA INVOCACIÓN AL SERVICIO: " + e;
            return gson.toJson(error);
        }
    }

    @RequestMapping(value = "/fnGettipodocumentoBean.htm", method = RequestMethod.POST)
    public @ResponseBody
    String fnGettipodocumentoBean(@RequestBody Map<String, Object> param) throws UnsupportedEncodingException {
        try {
            otipodocumentoBean = gson.fromJson(gson.toJson(param.get("poJsonItem")), tipodocumentoBean.class);
            json = gson.toJson(Generic.getInstance(tipodocumentoService.class).fnGettipodocumentoBean(otipodocumentoBean));
        } catch (Exception e) {
            String error = "ERROR EN LA INVOCACIÓN AL SERVICIO: " + e;
            json = gson.toJson(error);
        }
        String oItem = new String(json.getBytes("UTF-8"), "ISO-8859-1");
        return oItem;
    }

    @RequestMapping(value = "/fnInsertartipodocumentoBean.htm", method = RequestMethod.POST, headers = "content-type=application/json")
    public @ResponseBody
    String fnInsertartipodocumentoBean(@RequestBody Map<String, Object> param) throws UnsupportedEncodingException {
        try {
            otipodocumentoBean = gson.fromJson(gson.toJson(param.get("poJsonItem")), tipodocumentoBean.class);
            json = gson.toJson(Generic.getInstance(tipodocumentoService.class).fnInsertartipodocumentoBean(otipodocumentoBean));
        } catch (Exception e) {
            String error = "ERROR EN LA INVOCACIÓN AL SERVICIO: " + e;
            json = gson.toJson(error);
        }
        String oItem = new String(json.getBytes("UTF-8"), "ISO-8859-1");
        return oItem;
    }

    @RequestMapping(value = "/fnEliminartipodocumentoBean.htm", method = RequestMethod.POST, headers = "content-type=application/json")
    public @ResponseBody
    String fnEliminartipodocumentoBean(@RequestBody Map<String, Object> param) throws UnsupportedEncodingException {
        try {
            otipodocumentoBean = gson.fromJson(gson.toJson(param.get("poJsonItem")), tipodocumentoBean.class);
            json = gson.toJson(Generic.getInstance(tipodocumentoService.class).fnEliminartipodocumentoBean(otipodocumentoBean));
        } catch (Exception e) {
            String error = "ERROR EN LA INVOCACIÓN AL SERVICIO: " + e;
            json = gson.toJson(error);
        }
        String oItem = new String(json.getBytes("UTF-8"), "ISO-8859-1");
        return oItem;
    }

    @RequestMapping(value = "/fnActualizartipodocumentoBean.htm", method = RequestMethod.POST, headers = "content-type=application/json")
    public @ResponseBody
    String fnActualizartipodocumentoBean(@RequestBody Map<String, Object> param) throws UnsupportedEncodingException {
        try {
            otipodocumentoBean = gson.fromJson(gson.toJson(param.get("poJsonItem")), tipodocumentoBean.class);
            json = gson.toJson(Generic.getInstance(tipodocumentoService.class).fnActualizartipodocumentoBean(otipodocumentoBean));
        } catch (Exception e) {
            String error = "ERROR EN LA INVOCACIÓN AL SERVICIO: " + e;
            json = gson.toJson(error);
        }
        String oItem = new String(json.getBytes("UTF-8"), "ISO-8859-1");
        return oItem;
    }

}
