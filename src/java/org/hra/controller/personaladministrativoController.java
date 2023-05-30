package org.hra.controller;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonSyntaxException;
import org.hra.util.Generic;
import java.io.UnsupportedEncodingException;
import java.util.Map;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.hra.dominio.personaladministrativoBean;
import org.hra.services.personaladministrativoService;

/**
 *
 * @author Quichua
 */
@Controller
@RequestMapping("/personaladministrativoController")
@SessionAttributes({"oSession"})
public class personaladministrativoController {

    Gson gson = new GsonBuilder().setDateFormat("dd/MM/yyyy").serializeNulls().create();
    String json = "";
    personaladministrativoBean opersonaladministrativoBean;

    @RequestMapping(value = "/fnIspersonaladministrativoBean.htm", method = RequestMethod.POST)
    public @ResponseBody
    String fnIspersonaladministrativoBean(@RequestBody Map<String, Object> param) throws UnsupportedEncodingException {
        try {
            opersonaladministrativoBean = gson.fromJson(gson.toJson(param.get("poJsonItem")), personaladministrativoBean.class);
            opersonaladministrativoBean.setStatus(Generic.getInstance(personaladministrativoService.class).fnIspersonaladministrativoBean(opersonaladministrativoBean));
        } catch (Exception e) {
            opersonaladministrativoBean = new personaladministrativoBean();
            opersonaladministrativoBean.setStatus(false);
            opersonaladministrativoBean.setMensaje("ERROR EN LA INVOCACIÓN AL SERVICIO:" + e);
        }
        json = gson.toJson(opersonaladministrativoBean.getStatus());
        String oItem = new String(json.getBytes("UTF-8"), "ISO-8859-1");
        return oItem;
    }

    @RequestMapping(value = "/fnGetListpersonaladministrativoBean.htm", method = RequestMethod.POST)
    public @ResponseBody
    String fnGetListpersonaladministrativoBean(@RequestBody Map<String, Object> param) throws UnsupportedEncodingException {
        try {
            opersonaladministrativoBean = gson.fromJson(gson.toJson(param.get("poJsonItem")), personaladministrativoBean.class);
            json = gson.toJson(Generic.getInstance(personaladministrativoService.class).fnGetListpersonaladministrativoBean(opersonaladministrativoBean));
        } catch (Exception e) {
            String error = "ERROR EN LA INVOCACIÓN AL SERVICIO: " + e;
            json = gson.toJson(error);
        }
        String oItem = new String(json.getBytes("UTF-8"), "ISO-8859-1");
        return oItem;
    }

    @RequestMapping(value = "/fnGridpersonaladministrativoBean.htm", method = RequestMethod.POST)
    public @ResponseBody
    String fnGridpersonaladministrativoBean(@RequestBody Map<String, Object> param) throws UnsupportedEncodingException, Exception {
        try {
            opersonaladministrativoBean = gson.fromJson(gson.toJson(param.get("poJsonItem")), personaladministrativoBean.class);
            json = gson.toJson(Generic.getInstance(personaladministrativoService.class).fnGridpersonaladministrativoBean(opersonaladministrativoBean));
            String oItem = new String(json.getBytes("UTF-8"), "ISO-8859-1");
            return oItem;
        } catch (JsonSyntaxException e) {
            String error = "ERROR EN LA INVOCACIÓN AL SERVICIO: " + e;
            return gson.toJson(error);
        }
    }

    @RequestMapping(value = "/fnAutocompletepersonaladministrativoBean.htm", method = RequestMethod.POST)
    public @ResponseBody
    String fnAutocompletepersonaladministrativoBean(@RequestBody Map<String, Object> param) throws UnsupportedEncodingException, Exception {
        try {
            String pItem = gson.fromJson(gson.toJson(param.get("pnvDenominacion")), String.class);
            opersonaladministrativoBean = new personaladministrativoBean();
            opersonaladministrativoBean.setAccion(pItem);
            json = gson.toJson(Generic.getInstance(personaladministrativoService.class).fnAutocompletepersonaladministrativoBean(opersonaladministrativoBean));
            String oItem = new String(json.getBytes("UTF-8"), "ISO-8859-1");
            return oItem;
        } catch (JsonSyntaxException e) {
            String error = "ERROR EN LA INVOCACIÓN AL SERVICIO: " + e;
            return gson.toJson(error);
        }
    }

    @RequestMapping(value = "/fnGetpersonaladministrativoBean.htm", method = RequestMethod.POST)
    public @ResponseBody
    String fnGetpersonaladministrativoBean(@RequestBody Map<String, Object> param) throws UnsupportedEncodingException {
        try {
            opersonaladministrativoBean = gson.fromJson(gson.toJson(param.get("poJsonItem")), personaladministrativoBean.class);
            json = gson.toJson(Generic.getInstance(personaladministrativoService.class).fnGetpersonaladministrativoBean(opersonaladministrativoBean));
        } catch (Exception e) {
            String error = "ERROR EN LA INVOCACIÓN AL SERVICIO: " + e;
            json = gson.toJson(error);
        }
        String oItem = new String(json.getBytes("UTF-8"), "ISO-8859-1");
        return oItem;
    }

    @RequestMapping(value = "/fnInsertarpersonaladministrativoBean.htm", method = RequestMethod.POST, headers = "content-type=application/json")
    public @ResponseBody
    String fnInsertarpersonaladministrativoBean(@RequestBody Map<String, Object> param) throws UnsupportedEncodingException {
        try {
            opersonaladministrativoBean = gson.fromJson(gson.toJson(param.get("poJsonItem")), personaladministrativoBean.class);
            json = gson.toJson(Generic.getInstance(personaladministrativoService.class).fnInsertarpersonaladministrativoBean(opersonaladministrativoBean));
        } catch (Exception e) {
            String error = "ERROR EN LA INVOCACIÓN AL SERVICIO: " + e;
            json = gson.toJson(error);
        }
        String oItem = new String(json.getBytes("UTF-8"), "ISO-8859-1");
        return oItem;
    }

    @RequestMapping(value = "/fnEliminarpersonaladministrativoBean.htm", method = RequestMethod.POST, headers = "content-type=application/json")
    public @ResponseBody
    String fnEliminarpersonaladministrativoBean(@RequestBody Map<String, Object> param) throws UnsupportedEncodingException {
        try {
            opersonaladministrativoBean = gson.fromJson(gson.toJson(param.get("poJsonItem")), personaladministrativoBean.class);
            json = gson.toJson(Generic.getInstance(personaladministrativoService.class).fnEliminarpersonaladministrativoBean(opersonaladministrativoBean));
        } catch (Exception e) {
            String error = "ERROR EN LA INVOCACIÓN AL SERVICIO: " + e;
            json = gson.toJson(error);
        }
        String oItem = new String(json.getBytes("UTF-8"), "ISO-8859-1");
        return oItem;
    }

    @RequestMapping(value = "/fnActualizarpersonaladministrativoBean.htm", method = RequestMethod.POST, headers = "content-type=application/json")
    public @ResponseBody
    String fnActualizarpersonaladministrativoBean(@RequestBody Map<String, Object> param) throws UnsupportedEncodingException {
        try {
            opersonaladministrativoBean = gson.fromJson(gson.toJson(param.get("poJsonItem")), personaladministrativoBean.class);
            json = gson.toJson(Generic.getInstance(personaladministrativoService.class).fnActualizarpersonaladministrativoBean(opersonaladministrativoBean));
        } catch (Exception e) {
            String error = "ERROR EN LA INVOCACIÓN AL SERVICIO: " + e;
            json = gson.toJson(error);
        }
        String oItem = new String(json.getBytes("UTF-8"), "ISO-8859-1");
        return oItem;
    }

}
