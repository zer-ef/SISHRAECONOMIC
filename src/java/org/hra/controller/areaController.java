package org.hra.controller;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonSyntaxException;
import org.hra.util.Generic;
import java.io.UnsupportedEncodingException;
import java.util.Map;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.hra.dominio.areaBean;
import org.hra.services.areaService;

/**
 *
 * @author Quichua
 */
@Controller
@RequestMapping("/areaController")
@SessionAttributes({"oSession"})
public class areaController {

    Gson gson = new GsonBuilder().setDateFormat("dd/MM/yyyy").serializeNulls().create();
    String json = "";
    areaBean oareaBean;

    @RequestMapping(value = "/fnIsareaBean.htm", method = RequestMethod.POST)
    public @ResponseBody
    String fnIsareaBean(@RequestBody Map<String, Object> param) throws UnsupportedEncodingException {
        try {
            oareaBean = gson.fromJson(gson.toJson(param.get("poJsonItem")), areaBean.class);
            oareaBean.setStatus(Generic.getInstance(areaService.class).fnIsareaBean(oareaBean));
        } catch (Exception e) {
            oareaBean = new areaBean();
            oareaBean.setStatus(false);
            oareaBean.setMensaje("ERROR EN LA INVOCACIÓN AL SERVICIO:" + e);
        }
        json = gson.toJson(oareaBean.getStatus());
        String oItem = new String(json.getBytes("UTF-8"), "ISO-8859-1");
        return oItem;
    }

    @RequestMapping(value = "/fnGetListareaBean.htm", method = RequestMethod.POST)
    public @ResponseBody
    String fnGetListareaBean(@RequestBody Map<String, Object> param) throws UnsupportedEncodingException {
        try {
            oareaBean = gson.fromJson(gson.toJson(param.get("poJsonItem")), areaBean.class);
            json = gson.toJson(Generic.getInstance(areaService.class).fnGetListareaBean(oareaBean));
        } catch (Exception e) {
            String error = "ERROR EN LA INVOCACIÓN AL SERVICIO: " + e;
            json = gson.toJson(error);
        }
        String oItem = new String(json.getBytes("UTF-8"), "ISO-8859-1");
        return oItem;
    }

    @RequestMapping(value = "/fnGridareaBean.htm", method = RequestMethod.POST)
    public @ResponseBody
    String fnGridareaBean(@RequestBody Map<String, Object> param) throws UnsupportedEncodingException, Exception {
        try {
            oareaBean = gson.fromJson(gson.toJson(param.get("poJsonItem")), areaBean.class);
            json = gson.toJson(Generic.getInstance(areaService.class).fnGridareaBean(oareaBean));
            String oItem = new String(json.getBytes("UTF-8"), "ISO-8859-1");
            return oItem;
        } catch (JsonSyntaxException e) {
            String error = "ERROR EN LA INVOCACIÓN AL SERVICIO: " + e;
            return gson.toJson(error);
        }
    }

    @RequestMapping(value = "/fnAutocompleteareaBean.htm", method = RequestMethod.POST)
    public @ResponseBody
    String fnAutocompleteareaBean(@RequestBody Map<String, Object> param) throws UnsupportedEncodingException, Exception {
        try {
            String pItem = gson.fromJson(gson.toJson(param.get("pnvDenominacion")), String.class);
            oareaBean = new areaBean();
            oareaBean.setAccion(pItem);
            json = gson.toJson(Generic.getInstance(areaService.class).fnAutocompleteareaBean(oareaBean));
            String oItem = new String(json.getBytes("UTF-8"), "ISO-8859-1");
            return oItem;
        } catch (JsonSyntaxException e) {
            String error = "ERROR EN LA INVOCACIÓN AL SERVICIO: " + e;
            return gson.toJson(error);
        }
    }

    @RequestMapping(value = "/fnGetareaBean.htm", method = RequestMethod.POST)
    public @ResponseBody
    String fnGetareaBean(@RequestBody Map<String, Object> param) throws UnsupportedEncodingException {
        try {
            oareaBean = gson.fromJson(gson.toJson(param.get("poJsonItem")), areaBean.class);
            json = gson.toJson(Generic.getInstance(areaService.class).fnGetareaBean(oareaBean));
        } catch (Exception e) {
            String error = "ERROR EN LA INVOCACIÓN AL SERVICIO: " + e;
            json = gson.toJson(error);
        }
        String oItem = new String(json.getBytes("UTF-8"), "ISO-8859-1");
        return oItem;
    }

    @RequestMapping(value = "/fnInsertarareaBean.htm", method = RequestMethod.POST, headers = "content-type=application/json")
    public @ResponseBody
    String fnInsertarareaBean(@RequestBody Map<String, Object> param) throws UnsupportedEncodingException {
        try {
            oareaBean = gson.fromJson(gson.toJson(param.get("poJsonItem")), areaBean.class);
            json = gson.toJson(Generic.getInstance(areaService.class).fnInsertarareaBean(oareaBean));
        } catch (Exception e) {
            String error = "ERROR EN LA INVOCACIÓN AL SERVICIO: " + e;
            json = gson.toJson(error);
        }
        String oItem = new String(json.getBytes("UTF-8"), "ISO-8859-1");
        return oItem;
    }

    @RequestMapping(value = "/fnEliminarareaBean.htm", method = RequestMethod.POST, headers = "content-type=application/json")
    public @ResponseBody
    String fnEliminarareaBean(@RequestBody Map<String, Object> param) throws UnsupportedEncodingException {
        try {
            oareaBean = gson.fromJson(gson.toJson(param.get("poJsonItem")), areaBean.class);
            json = gson.toJson(Generic.getInstance(areaService.class).fnEliminarareaBean(oareaBean));
        } catch (Exception e) {
            String error = "ERROR EN LA INVOCACIÓN AL SERVICIO: " + e;
            json = gson.toJson(error);
        }
        String oItem = new String(json.getBytes("UTF-8"), "ISO-8859-1");
        return oItem;
    }

    @RequestMapping(value = "/fnActualizarareaBean.htm", method = RequestMethod.POST, headers = "content-type=application/json")
    public @ResponseBody
    String fnActualizarareaBean(@RequestBody Map<String, Object> param) throws UnsupportedEncodingException {
        try {
            oareaBean = gson.fromJson(gson.toJson(param.get("poJsonItem")), areaBean.class);
            json = gson.toJson(Generic.getInstance(areaService.class).fnActualizarareaBean(oareaBean));
        } catch (Exception e) {
            String error = "ERROR EN LA INVOCACIÓN AL SERVICIO: " + e;
            json = gson.toJson(error);
        }
        String oItem = new String(json.getBytes("UTF-8"), "ISO-8859-1");
        return oItem;
    }

}
