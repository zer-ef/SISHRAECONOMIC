package org.hra.controller;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonSyntaxException;
import org.hra.util.Generic;
import java.io.UnsupportedEncodingException;
import java.util.Map;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.hra.dominio.personaBean;
import org.hra.services.personaService;

/**
 *
 * @author Quichua
 */
@Controller
@RequestMapping("/personaController")
@SessionAttributes({"oSession"})
public class personaController {

    Gson gson = new GsonBuilder().setDateFormat("dd/MM/yyyy").serializeNulls().create();
    String json = "";
    personaBean opersonaBean;

    @RequestMapping(value = "/fnIspersonaBean.htm", method = RequestMethod.POST)
    public @ResponseBody
    String fnIspersonaBean(@RequestBody Map<String, Object> param) throws UnsupportedEncodingException {
        try {
            opersonaBean = gson.fromJson(gson.toJson(param.get("poJsonItem")), personaBean.class);
            opersonaBean.setStatus(Generic.getInstance(personaService.class).fnIspersonaBean(opersonaBean));
        } catch (Exception e) {
            opersonaBean = new personaBean();
            opersonaBean.setStatus(false);
            opersonaBean.setMensaje("ERROR EN LA INVOCACIÓN AL SERVICIO:" + e);
        }
        json = gson.toJson(opersonaBean.getStatus());
        String oItem = new String(json.getBytes("UTF-8"), "ISO-8859-1");
        return oItem;
    }

    @RequestMapping(value = "/fnGetListpersonaBean.htm", method = RequestMethod.POST)
    public @ResponseBody
    String fnGetListpersonaBean(@RequestBody Map<String, Object> param) throws UnsupportedEncodingException {
        try {
            opersonaBean = gson.fromJson(gson.toJson(param.get("poJsonItem")), personaBean.class);
            json = gson.toJson(Generic.getInstance(personaService.class).fnGetListpersonaBean(opersonaBean));
        } catch (Exception e) {
            String error = "ERROR EN LA INVOCACIÓN AL SERVICIO: " + e;
            json = gson.toJson(error);
        }
        String oItem = new String(json.getBytes("UTF-8"), "ISO-8859-1");
        return oItem;
    }

    @RequestMapping(value = "/fnGridpersonaBean.htm", method = RequestMethod.POST)
    public @ResponseBody
    String fnGridpersonaBean(@RequestBody Map<String, Object> param) throws UnsupportedEncodingException, Exception {
        try {
            opersonaBean = gson.fromJson(gson.toJson(param.get("poJsonItem")), personaBean.class);
            json = gson.toJson(Generic.getInstance(personaService.class).fnGridpersonaBean(opersonaBean));
            String oItem = new String(json.getBytes("UTF-8"), "ISO-8859-1");
            return oItem;
        } catch (JsonSyntaxException e) {
            String error = "ERROR EN LA INVOCACIÓN AL SERVICIO: " + e;
            return gson.toJson(error);
        }
    }

    @RequestMapping(value = "/fnAutocompletepersonaBean.htm", method = RequestMethod.POST)
    public @ResponseBody
    String fnAutocompletepersonaBean(@RequestBody Map<String, Object> param) throws UnsupportedEncodingException, Exception {
        try {
            String pItem = gson.fromJson(gson.toJson(param.get("pnvDenominacion")), String.class);
            opersonaBean = new personaBean();
            opersonaBean.setAccion(pItem);
            json = gson.toJson(Generic.getInstance(personaService.class).fnAutocompletepersonaBean(opersonaBean));
            String oItem = new String(json.getBytes("UTF-8"), "ISO-8859-1");
            return oItem;
        } catch (JsonSyntaxException e) {
            String error = "ERROR EN LA INVOCACIÓN AL SERVICIO: " + e;
            return gson.toJson(error);
        }
    }

    @RequestMapping(value = "/fnGetpersonaBean.htm", method = RequestMethod.POST)
    public @ResponseBody
    String fnGetpersonaBean(@RequestBody Map<String, Object> param) throws UnsupportedEncodingException {
        try {
            opersonaBean = gson.fromJson(gson.toJson(param.get("poJsonItem")), personaBean.class);
            json = gson.toJson(Generic.getInstance(personaService.class).fnGetpersonaBean(opersonaBean));
        } catch (Exception e) {
            String error = "ERROR EN LA INVOCACIÓN AL SERVICIO: " + e;
            json = gson.toJson(error);
        }
        String oItem = new String(json.getBytes("UTF-8"), "ISO-8859-1");
        return oItem;
    }

    @RequestMapping(value = "/fnInsertarpersonaBean.htm", method = RequestMethod.POST, headers = "content-type=application/json")
    public @ResponseBody
    String fnInsertarpersonaBean(@RequestBody Map<String, Object> param) throws UnsupportedEncodingException {
        try {
            opersonaBean = gson.fromJson(gson.toJson(param.get("poJsonItem")), personaBean.class);
            json = gson.toJson(Generic.getInstance(personaService.class).fnInsertarpersonaBean(opersonaBean));
        } catch (Exception e) {
            String error = "ERROR EN LA INVOCACIÓN AL SERVICIO: " + e;
            json = gson.toJson(error);
        }
        String oItem = new String(json.getBytes("UTF-8"), "ISO-8859-1");
        return oItem;
    }

    @RequestMapping(value = "/fnEliminarpersonaBean.htm", method = RequestMethod.POST, headers = "content-type=application/json")
    public @ResponseBody
    String fnEliminarpersonaBean(@RequestBody Map<String, Object> param) throws UnsupportedEncodingException {
        try {
            opersonaBean = gson.fromJson(gson.toJson(param.get("poJsonItem")), personaBean.class);
            json = gson.toJson(Generic.getInstance(personaService.class).fnEliminarpersonaBean(opersonaBean));
        } catch (Exception e) {
            String error = "ERROR EN LA INVOCACIÓN AL SERVICIO: " + e;
            json = gson.toJson(error);
        }
        String oItem = new String(json.getBytes("UTF-8"), "ISO-8859-1");
        return oItem;
    }

    @RequestMapping(value = "/fnActualizarpersonaBean.htm", method = RequestMethod.POST, headers = "content-type=application/json")
    public @ResponseBody
    String fnActualizarpersonaBean(@RequestBody Map<String, Object> param) throws UnsupportedEncodingException {
        try {
            opersonaBean = gson.fromJson(gson.toJson(param.get("poJsonItem")), personaBean.class);
            json = gson.toJson(Generic.getInstance(personaService.class).fnActualizarpersonaBean(opersonaBean));
        } catch (Exception e) {
            String error = "ERROR EN LA INVOCACIÓN AL SERVICIO: " + e;
            json = gson.toJson(error);
        }
        String oItem = new String(json.getBytes("UTF-8"), "ISO-8859-1");
        return oItem;
    }

}
