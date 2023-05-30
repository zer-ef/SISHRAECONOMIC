package org.hra.controller;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonSyntaxException;
import org.hra.util.Generic;
import java.io.UnsupportedEncodingException;
import java.util.Map;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.hra.dominio.internoBean;
import org.hra.dominio.personaBean;
import org.hra.services.internoService;

/**
 *
 * @author Quichua
 */
@Controller
@RequestMapping("/internoController")
@SessionAttributes({"oSession"})
public class internoController {

    Gson gson = new GsonBuilder().setDateFormat("dd/MM/yyyy").serializeNulls().create();
    String json = "";
    internoBean ointernoBean;
    personaBean opersonaBean;

    @RequestMapping(value = "/fnIsinternoBean.htm", method = RequestMethod.POST)
    public @ResponseBody
    String fnIsinternoBean(@RequestBody Map<String, Object> param) throws UnsupportedEncodingException {
        try {
            ointernoBean = gson.fromJson(gson.toJson(param.get("poJsonItem")), internoBean.class);
            ointernoBean.setStatus(Generic.getInstance(internoService.class).fnIsinternoBean(ointernoBean));
        } catch (Exception e) {
            ointernoBean = new internoBean();
            ointernoBean.setStatus(false);
            ointernoBean.setMensaje("ERROR EN LA INVOCACIÓN AL SERVICIO:" + e);
        }
        json = gson.toJson(ointernoBean.getStatus());
        String oItem = new String(json.getBytes("UTF-8"), "ISO-8859-1");
        return oItem;
    }

    @RequestMapping(value = "/fnGetListinternoBean.htm", method = RequestMethod.POST)
    public @ResponseBody
    String fnGetListinternoBean(@RequestBody Map<String, Object> param) throws UnsupportedEncodingException {
        try {
            ointernoBean = gson.fromJson(gson.toJson(param.get("poJsonItem")), internoBean.class);
            json = gson.toJson(Generic.getInstance(internoService.class).fnGetListinternoBean(ointernoBean));
        } catch (Exception e) {
            String error = "ERROR EN LA INVOCACIÓN AL SERVICIO: " + e;
            json = gson.toJson(error);
        }
        String oItem = new String(json.getBytes("UTF-8"), "ISO-8859-1");
        return oItem;
    }

    @RequestMapping(value = "/fnGridinternoBean.htm", method = RequestMethod.POST)
    public @ResponseBody
    String fnGridinternoBean(@RequestBody Map<String, Object> param) throws UnsupportedEncodingException, Exception {
        try {
            ointernoBean = gson.fromJson(gson.toJson(param.get("poJsonItem")), internoBean.class);
            json = gson.toJson(Generic.getInstance(internoService.class).fnGridinternoBean(ointernoBean));
            String oItem = new String(json.getBytes("UTF-8"), "ISO-8859-1");
            return oItem;
        } catch (JsonSyntaxException e) {
            String error = "ERROR EN LA INVOCACIÓN AL SERVICIO: " + e;
            return gson.toJson(error);
        }
    }

    @RequestMapping(value = "/fnAutocompleteinternoBean.htm", method = RequestMethod.POST)
    public @ResponseBody
    String fnAutocompleteinternoBean(@RequestBody Map<String, Object> param) throws UnsupportedEncodingException, Exception {
        try {
            String pItem = gson.fromJson(gson.toJson(param.get("pnvDenominacion")), String.class);
            ointernoBean = new internoBean();
            ointernoBean.setAccion(pItem);
            json = gson.toJson(Generic.getInstance(internoService.class).fnAutocompleteinternoBean(ointernoBean));
            String oItem = new String(json.getBytes("UTF-8"), "ISO-8859-1");
            return oItem;
        } catch (JsonSyntaxException e) {
            String error = "ERROR EN LA INVOCACIÓN AL SERVICIO: " + e;
            return gson.toJson(error);
        }
    }

    @RequestMapping(value = "/fnGetinternoBean.htm", method = RequestMethod.POST)
    public @ResponseBody
    String fnGetinternoBean(@RequestBody Map<String, Object> param) throws UnsupportedEncodingException {
        try {
            ointernoBean = gson.fromJson(gson.toJson(param.get("poJsonItem")), internoBean.class);
            json = gson.toJson(Generic.getInstance(internoService.class).fnGetinternoBean(ointernoBean));
        } catch (Exception e) {
            String error = "ERROR EN LA INVOCACIÓN AL SERVICIO: " + e;
            json = gson.toJson(error);
        }
        String oItem = new String(json.getBytes("UTF-8"), "ISO-8859-1");
        return oItem;
    }

    @RequestMapping(value = "/fnInsertarinternoBean.htm", method = RequestMethod.POST, headers = "content-type=application/json")
    public @ResponseBody
    String fnInsertarinternoBean(@RequestBody Map<String, Object> param) throws UnsupportedEncodingException {
        try {
            opersonaBean = gson.fromJson(gson.toJson(param.get("poJsonItemPersona")), personaBean.class);
            ointernoBean = gson.fromJson(gson.toJson(param.get("poJsonItemInterna")), internoBean.class);
            json = gson.toJson(Generic.getInstance(internoService.class).fnInsertarinternoBean(opersonaBean, ointernoBean));
        } catch (Exception e) {
            String error = "ERROR EN LA INVOCACIÓN AL SERVICIO: " + e;
            json = gson.toJson(error);
        }
        String oItem = new String(json.getBytes("UTF-8"), "ISO-8859-1");
        return oItem;
    }

    @RequestMapping(value = "/fnEliminarinternoBean.htm", method = RequestMethod.POST, headers = "content-type=application/json")
    public @ResponseBody
    String fnEliminarinternoBean(@RequestBody Map<String, Object> param) throws UnsupportedEncodingException {
        try {
            ointernoBean = gson.fromJson(gson.toJson(param.get("poJsonItem")), internoBean.class);
            json = gson.toJson(Generic.getInstance(internoService.class).fnEliminarinternoBean(ointernoBean));
        } catch (Exception e) {
            String error = "ERROR EN LA INVOCACIÓN AL SERVICIO: " + e;
            json = gson.toJson(error);
        }
        String oItem = new String(json.getBytes("UTF-8"), "ISO-8859-1");
        return oItem;
    }

    @RequestMapping(value = "/fnActualizarinternoBean.htm", method = RequestMethod.POST, headers = "content-type=application/json")
    public @ResponseBody
    String fnActualizarinternoBean(@RequestBody Map<String, Object> param) throws UnsupportedEncodingException {
        try {
            opersonaBean = gson.fromJson(gson.toJson(param.get("poJsonItemPersona")), personaBean.class);
            ointernoBean = gson.fromJson(gson.toJson(param.get("poJsonItemInterna")), internoBean.class);
            json = gson.toJson(Generic.getInstance(internoService.class).fnActualizarinternoBean(opersonaBean, ointernoBean));
        } catch (Exception e) {
            String error = "ERROR EN LA INVOCACIÓN AL SERVICIO: " + e;
            json = gson.toJson(error);
        }
        String oItem = new String(json.getBytes("UTF-8"), "ISO-8859-1");
        return oItem;
    }

}
