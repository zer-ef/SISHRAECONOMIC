package org.hra.controller;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonSyntaxException;
import org.hra.util.Generic;
import java.io.UnsupportedEncodingException;
import java.util.Map;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.hra.dominio.documentoingresadoBean;
import org.hra.services.documentoingresadoService;

@Controller
@RequestMapping("/documentoingresadoController")
@SessionAttributes({"oSession"})
public class documentoingresadoController {

    Gson gson = new GsonBuilder().setDateFormat("dd/MM/yyyy").serializeNulls().create();
    String json = "";
    documentoingresadoBean odocumentoingresadoBean;

    @RequestMapping(value = "/fnIsdocumentoingresadoBean.htm", method = RequestMethod.POST)
    public @ResponseBody
    String fnIsdocumentoingresadoBean(@RequestBody Map<String, Object> param) throws UnsupportedEncodingException {
        try {
            odocumentoingresadoBean = gson.fromJson(gson.toJson(param.get("poJsonItem")), documentoingresadoBean.class);
            odocumentoingresadoBean.setStatus(Generic.getInstance(documentoingresadoService.class).fnIsdocumentoingresadoBean(odocumentoingresadoBean));
        } catch (Exception e) {
            odocumentoingresadoBean = new documentoingresadoBean();
            odocumentoingresadoBean.setStatus(false);
            odocumentoingresadoBean.setMensaje("ERROR EN LA INVOCACIÓN AL SERVICIO:" + e);
        }
        json = gson.toJson(odocumentoingresadoBean.getStatus());
        String oItem = new String(json.getBytes("UTF-8"), "ISO-8859-1");
        return oItem;
    }

    @RequestMapping(value = "/fnGetListdocumentoingresadoBean.htm", method = RequestMethod.POST)
    public @ResponseBody
    String fnGetListdocumentoingresadoBean(@RequestBody Map<String, Object> param) throws UnsupportedEncodingException {
        try {
            odocumentoingresadoBean = gson.fromJson(gson.toJson(param.get("poJsonItem")), documentoingresadoBean.class);
            json = gson.toJson(Generic.getInstance(documentoingresadoService.class).fnGetListdocumentoingresadoBean(odocumentoingresadoBean));
        } catch (Exception e) {
            String error = "ERROR EN LA INVOCACIÓN AL SERVICIO: " + e;
            json = gson.toJson(error);
        }
        String oItem = new String(json.getBytes("UTF-8"), "ISO-8859-1");
        return oItem;
    }

    @RequestMapping(value = "/fnGriddocumentoingresadoBean.htm", method = RequestMethod.POST)
    public @ResponseBody
    String fnGriddocumentoingresadoBean(@RequestBody Map<String, Object> param) throws UnsupportedEncodingException, Exception {
        try {
            odocumentoingresadoBean = gson.fromJson(gson.toJson(param.get("poJsonItem")), documentoingresadoBean.class);
            json = gson.toJson(Generic.getInstance(documentoingresadoService.class).fnGriddocumentoingresadoBean(odocumentoingresadoBean));
            String oItem = new String(json.getBytes("UTF-8"), "ISO-8859-1");
            return oItem;
        } catch (JsonSyntaxException e) {
            String error = "ERROR EN LA INVOCACIÓN AL SERVICIO: " + e;
            return gson.toJson(error);
        }
    }

    @RequestMapping(value = "/fnAutocompletedocumentoingresadoBean.htm", method = RequestMethod.POST)
    public @ResponseBody
    String fnAutocompletedocumentoingresadoBean(@RequestBody Map<String, Object> param) throws UnsupportedEncodingException, Exception {
        try {
            String pItem = gson.fromJson(gson.toJson(param.get("pnvDenominacion")), String.class);
            odocumentoingresadoBean = new documentoingresadoBean();
            odocumentoingresadoBean.setAccion(pItem);
            json = gson.toJson(Generic.getInstance(documentoingresadoService.class).fnAutocompletedocumentoingresadoBean(odocumentoingresadoBean));
            String oItem = new String(json.getBytes("UTF-8"), "ISO-8859-1");
            return oItem;
        } catch (JsonSyntaxException e) {
            String error = "ERROR EN LA INVOCACIÓN AL SERVICIO: " + e;
            return gson.toJson(error);
        }
    }

    @RequestMapping(value = "/fnGetdocumentoingresadoBean.htm", method = RequestMethod.POST)
    public @ResponseBody
    String fnGetdocumentoingresadoBean(@RequestBody Map<String, Object> param) throws UnsupportedEncodingException {
        try {
            odocumentoingresadoBean = gson.fromJson(gson.toJson(param.get("poJsonItem")), documentoingresadoBean.class);
            json = gson.toJson(Generic.getInstance(documentoingresadoService.class).fnGetdocumentoingresadoBean(odocumentoingresadoBean));
        } catch (Exception e) {
            String error = "ERROR EN LA INVOCACIÓN AL SERVICIO: " + e;
            json = gson.toJson(error);
        }
        String oItem = new String(json.getBytes("UTF-8"), "ISO-8859-1");
        return oItem;
    }

    @RequestMapping(value = "/fnInsertardocumentoingresadoBean.htm", method = RequestMethod.POST, headers = "content-type=application/json")
    public @ResponseBody
    String fnInsertardocumentoingresadoBean(@RequestBody Map<String, Object> param) throws UnsupportedEncodingException {
        try {
            odocumentoingresadoBean = gson.fromJson(gson.toJson(param.get("poJsonItem")), documentoingresadoBean.class);
            json = gson.toJson(Generic.getInstance(documentoingresadoService.class).fnInsertardocumentoingresadoBean(odocumentoingresadoBean));
        } catch (Exception e) {
            String error = "ERROR EN LA INVOCACIÓN AL SERVICIO: " + e;
            json = gson.toJson(error);
        }
        String oItem = new String(json.getBytes("UTF-8"), "ISO-8859-1");
        return oItem;
    }

    @RequestMapping(value = "/fnEliminardocumentoingresadoBean.htm", method = RequestMethod.POST, headers = "content-type=application/json")
    public @ResponseBody
    String fnEliminardocumentoingresadoBean(@RequestBody Map<String, Object> param) throws UnsupportedEncodingException {
        try {
            odocumentoingresadoBean = gson.fromJson(gson.toJson(param.get("poJsonItem")), documentoingresadoBean.class);
            json = gson.toJson(Generic.getInstance(documentoingresadoService.class).fnEliminardocumentoingresadoBean(odocumentoingresadoBean));
        } catch (Exception e) {
            String error = "ERROR EN LA INVOCACIÓN AL SERVICIO: " + e;
            json = gson.toJson(error);
        }
        String oItem = new String(json.getBytes("UTF-8"), "ISO-8859-1");
        return oItem;
    }

    @RequestMapping(value = "/fnActualizardocumentoingresadoBean.htm", method = RequestMethod.POST, headers = "content-type=application/json")
    public @ResponseBody
    String fnActualizardocumentoingresadoBean(@RequestBody Map<String, Object> param) throws UnsupportedEncodingException {
        try {
            odocumentoingresadoBean = gson.fromJson(gson.toJson(param.get("poJsonItem")), documentoingresadoBean.class);
            json = gson.toJson(Generic.getInstance(documentoingresadoService.class).fnActualizardocumentoingresadoBean(odocumentoingresadoBean));
        } catch (Exception e) {
            String error = "ERROR EN LA INVOCACIÓN AL SERVICIO: " + e;
            json = gson.toJson(error);
        }
        String oItem = new String(json.getBytes("UTF-8"), "ISO-8859-1");
        return oItem;
    }

}
