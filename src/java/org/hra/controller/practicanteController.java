package org.hra.controller;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonSyntaxException;
import org.hra.util.Generic;
import java.io.UnsupportedEncodingException;
import java.util.Map;
import org.hra.dominio.personaBean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.hra.dominio.practicanteBean;
import org.hra.services.practicanteService;

/**
 *
 * @author Quichua
 */
@Controller
@RequestMapping("/practicanteController")
@SessionAttributes({"oSession"})
public class practicanteController {

    Gson gson = new GsonBuilder().setDateFormat("dd/MM/yyyy").serializeNulls().create();
    String json = "";
    practicanteBean opracticanteBean;
    personaBean opersonaBean;

    @RequestMapping(value = "/fnIspracticanteBean.htm", method = RequestMethod.POST)
    public @ResponseBody
    String fnIspracticanteBean(@RequestBody Map<String, Object> param) throws UnsupportedEncodingException {
        try {
            opracticanteBean = gson.fromJson(gson.toJson(param.get("poJsonItem")), practicanteBean.class);
            opracticanteBean.setStatus(Generic.getInstance(practicanteService.class).fnIspracticanteBean(opracticanteBean));
        } catch (Exception e) {
            opracticanteBean = new practicanteBean();
            opracticanteBean.setStatus(false);
            opracticanteBean.setMensaje("ERROR EN LA INVOCACIÓN AL SERVICIO:" + e);
        }
        json = gson.toJson(opracticanteBean.getStatus());
        String oItem = new String(json.getBytes("UTF-8"), "ISO-8859-1");
        return oItem;
    }

    @RequestMapping(value = "/fnGetListpracticanteBean.htm", method = RequestMethod.POST)
    public @ResponseBody
    String fnGetListpracticanteBean(@RequestBody Map<String, Object> param) throws UnsupportedEncodingException {
        try {
            opracticanteBean = gson.fromJson(gson.toJson(param.get("poJsonItem")), practicanteBean.class);
            json = gson.toJson(Generic.getInstance(practicanteService.class).fnGetListpracticanteBean(opracticanteBean));
        } catch (Exception e) {
            String error = "ERROR EN LA INVOCACIÓN AL SERVICIO: " + e;
            json = gson.toJson(error);
        }
        String oItem = new String(json.getBytes("UTF-8"), "ISO-8859-1");
        return oItem;
    }

    @RequestMapping(value = "/fnGridpracticanteBean.htm", method = RequestMethod.POST)
    public @ResponseBody
    String fnGridpracticanteBean(@RequestBody Map<String, Object> param) throws UnsupportedEncodingException, Exception {
        try {
            opracticanteBean = gson.fromJson(gson.toJson(param.get("poJsonItem")), practicanteBean.class);
            json = gson.toJson(Generic.getInstance(practicanteService.class).fnGridpracticanteBean(opracticanteBean));
            String oItem = new String(json.getBytes("UTF-8"), "ISO-8859-1");
            return oItem;
        } catch (JsonSyntaxException e) {
            String error = "ERROR EN LA INVOCACIÓN AL SERVICIO: " + e;
            return gson.toJson(error);
        }
    }

    @RequestMapping(value = "/fnAutocompletepracticanteBean.htm", method = RequestMethod.POST)
    public @ResponseBody
    String fnAutocompletepracticanteBean(@RequestBody Map<String, Object> param) throws UnsupportedEncodingException, Exception {
        try {
            String pItem = gson.fromJson(gson.toJson(param.get("pnvDenominacion")), String.class);
            opracticanteBean = new practicanteBean();
            opracticanteBean.setAccion(pItem);
            json = gson.toJson(Generic.getInstance(practicanteService.class).fnAutocompletepracticanteBean(opracticanteBean));
            String oItem = new String(json.getBytes("UTF-8"), "ISO-8859-1");
            return oItem;
        } catch (JsonSyntaxException e) {
            String error = "ERROR EN LA INVOCACIÓN AL SERVICIO: " + e;
            return gson.toJson(error);
        }
    }

    @RequestMapping(value = "/fnGetpracticanteBean.htm", method = RequestMethod.POST)
    public @ResponseBody
    String fnGetpracticanteBean(@RequestBody Map<String, Object> param) throws UnsupportedEncodingException {
        try {
            opracticanteBean = gson.fromJson(gson.toJson(param.get("poJsonItem")), practicanteBean.class);
            json = gson.toJson(Generic.getInstance(practicanteService.class).fnGetpracticanteBean(opracticanteBean));
        } catch (Exception e) {
            String error = "ERROR EN LA INVOCACIÓN AL SERVICIO: " + e;
            json = gson.toJson(error);
        }
        String oItem = new String(json.getBytes("UTF-8"), "ISO-8859-1");
        return oItem;
    }

    @RequestMapping(value = "/fnInsertarpracticanteBean.htm", method = RequestMethod.POST, headers = "content-type=application/json")
    public @ResponseBody
    String fnInsertarpracticanteBean(@RequestBody Map<String, Object> param) throws UnsupportedEncodingException {
        try {
            opersonaBean = gson.fromJson(gson.toJson(param.get("poJsonItemPersona")), personaBean.class);
            opracticanteBean = gson.fromJson(gson.toJson(param.get("poJsonItemPreacticante")), practicanteBean.class);
            json = gson.toJson(Generic.getInstance(practicanteService.class).fnInsertarpracticanteBean(opersonaBean, opracticanteBean));
        } catch (Exception e) {
            String error = "ERROR EN LA INVOCACIÓN AL SERVICIO: " + e;
            json = gson.toJson(error);
        }
        String oItem = new String(json.getBytes("UTF-8"), "ISO-8859-1");
        return oItem;
    }

    @RequestMapping(value = "/fnEliminarpracticanteBean.htm", method = RequestMethod.POST, headers = "content-type=application/json")
    public @ResponseBody
    String fnEliminarpracticanteBean(@RequestBody Map<String, Object> param) throws UnsupportedEncodingException {
        try {
            opersonaBean = gson.fromJson(gson.toJson(param.get("poJsonItemPersona")), personaBean.class);
            opracticanteBean = gson.fromJson(gson.toJson(param.get("poJsonItemPreacticante")), practicanteBean.class);
            json = gson.toJson(Generic.getInstance(practicanteService.class).fnEliminarpracticanteBean(opersonaBean, opracticanteBean));
        } catch (Exception e) {
            String error = "ERROR EN LA INVOCACIÓN AL SERVICIO: " + e;
            json = gson.toJson(error);
        }
        String oItem = new String(json.getBytes("UTF-8"), "ISO-8859-1");
        return oItem;
    }

    @RequestMapping(value = "/fnActualizarpracticanteBean.htm", method = RequestMethod.POST, headers = "content-type=application/json")
    public @ResponseBody
    String fnActualizarpracticanteBean(@RequestBody Map<String, Object> param) throws UnsupportedEncodingException {
        try {
            opersonaBean = gson.fromJson(gson.toJson(param.get("poJsonItemPersona")), personaBean.class);
            opracticanteBean = gson.fromJson(gson.toJson(param.get("poJsonItemPreacticante")), practicanteBean.class);
            json = gson.toJson(Generic.getInstance(practicanteService.class).fnActualizarpracticanteBean(opersonaBean, opracticanteBean));
        } catch (Exception e) {
            String error = "ERROR EN LA INVOCACIÓN AL SERVICIO: " + e;
            json = gson.toJson(error);
        }
        String oItem = new String(json.getBytes("UTF-8"), "ISO-8859-1");
        return oItem;
    }

}
