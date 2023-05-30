package org.hra.controller;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonSyntaxException;
import org.hra.util.Generic;
import java.io.UnsupportedEncodingException;
import java.util.Map;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.hra.dominio.ingresoeconomicoBean;
import org.hra.services.ingresoeconomicoService;

/**
 *
 * @author Quichua
 */
@Controller
@RequestMapping("/ingresoeconomicoController")
@SessionAttributes({"oSession"})
public class ingresoeconomicoController {

    Gson gson = new GsonBuilder().setDateFormat("dd/MM/yyyy").serializeNulls().create();
    String json = "";
    ingresoeconomicoBean oingresoeconomicoBean;

    @RequestMapping(value = "/fnIsingresoeconomicoBean.htm", method = RequestMethod.POST)
    public @ResponseBody
    String fnIsingresoeconomicoBean(@RequestBody Map<String, Object> param) throws UnsupportedEncodingException {
        try {
            oingresoeconomicoBean = gson.fromJson(gson.toJson(param.get("poJsonItem")), ingresoeconomicoBean.class);
            oingresoeconomicoBean.setStatus(Generic.getInstance(ingresoeconomicoService.class).fnIsingresoeconomicoBean(oingresoeconomicoBean));
        } catch (Exception e) {
            oingresoeconomicoBean = new ingresoeconomicoBean();
            oingresoeconomicoBean.setStatus(false);
            oingresoeconomicoBean.setMensaje("ERROR EN LA INVOCACIÓN AL SERVICIO:" + e);
        }
        json = gson.toJson(oingresoeconomicoBean.getStatus());
        String oItem = new String(json.getBytes("UTF-8"), "ISO-8859-1");
        return oItem;
    }

    @RequestMapping(value = "/fnGetListingresoeconomicoBean.htm", method = RequestMethod.POST)
    public @ResponseBody
    String fnGetListingresoeconomicoBean(@RequestBody Map<String, Object> param) throws UnsupportedEncodingException {
        try {
            oingresoeconomicoBean = gson.fromJson(gson.toJson(param.get("poJsonItem")), ingresoeconomicoBean.class);
            json = gson.toJson(Generic.getInstance(ingresoeconomicoService.class).fnGetListingresoeconomicoBean(oingresoeconomicoBean));
        } catch (Exception e) {
            String error = "ERROR EN LA INVOCACIÓN AL SERVICIO: " + e;
            json = gson.toJson(error);
        }
        String oItem = new String(json.getBytes("UTF-8"), "ISO-8859-1");
        return oItem;
    }

    @RequestMapping(value = "/fnGridingresoeconomicoBean.htm", method = RequestMethod.POST)
    public @ResponseBody
    String fnGridingresoeconomicoBean(@RequestBody Map<String, Object> param) throws UnsupportedEncodingException, Exception {
        try {
            oingresoeconomicoBean = gson.fromJson(gson.toJson(param.get("poJsonItem")), ingresoeconomicoBean.class);
            json = gson.toJson(Generic.getInstance(ingresoeconomicoService.class).fnGridingresoeconomicoBean(oingresoeconomicoBean));
            String oItem = new String(json.getBytes("UTF-8"), "ISO-8859-1");
            return oItem;
        } catch (JsonSyntaxException e) {
            String error = "ERROR EN LA INVOCACIÓN AL SERVICIO: " + e;
            return gson.toJson(error);
        }
    }

    @RequestMapping(value = "/fnAutocompleteingresoeconomicoBean.htm", method = RequestMethod.POST)
    public @ResponseBody
    String fnAutocompleteingresoeconomicoBean(@RequestBody Map<String, Object> param) throws UnsupportedEncodingException, Exception {
        try {
            String pItem = gson.fromJson(gson.toJson(param.get("pnvDenominacion")), String.class);
            oingresoeconomicoBean = new ingresoeconomicoBean();
            oingresoeconomicoBean.setAccion(pItem);
            json = gson.toJson(Generic.getInstance(ingresoeconomicoService.class).fnAutocompleteingresoeconomicoBean(oingresoeconomicoBean));
            String oItem = new String(json.getBytes("UTF-8"), "ISO-8859-1");
            return oItem;
        } catch (JsonSyntaxException e) {
            String error = "ERROR EN LA INVOCACIÓN AL SERVICIO: " + e;
            return gson.toJson(error);
        }
    }

    @RequestMapping(value = "/fnGetingresoeconomicoBean.htm", method = RequestMethod.POST)
    public @ResponseBody
    String fnGetingresoeconomicoBean(@RequestBody Map<String, Object> param) throws UnsupportedEncodingException {
        try {
            oingresoeconomicoBean = gson.fromJson(gson.toJson(param.get("poJsonItem")), ingresoeconomicoBean.class);
            json = gson.toJson(Generic.getInstance(ingresoeconomicoService.class).fnGetingresoeconomicoBean(oingresoeconomicoBean));
        } catch (Exception e) {
            String error = "ERROR EN LA INVOCACIÓN AL SERVICIO: " + e;
            json = gson.toJson(error);
        }
        String oItem = new String(json.getBytes("UTF-8"), "ISO-8859-1");
        return oItem;
    }

    @RequestMapping(value = "/fnInsertaringresoeconomicoBean.htm", method = RequestMethod.POST, headers = "content-type=application/json")
    public @ResponseBody
    String fnInsertaringresoeconomicoBean(@RequestBody Map<String, Object> param) throws UnsupportedEncodingException {
        try {
            oingresoeconomicoBean = gson.fromJson(gson.toJson(param.get("poJsonItem")), ingresoeconomicoBean.class);
            json = gson.toJson(Generic.getInstance(ingresoeconomicoService.class).fnInsertaringresoeconomicoBean(oingresoeconomicoBean));
        } catch (Exception e) {
            String error = "ERROR EN LA INVOCACIÓN AL SERVICIO: " + e;
            json = gson.toJson(error);
        }
        String oItem = new String(json.getBytes("UTF-8"), "ISO-8859-1");
        return oItem;
    }

    @RequestMapping(value = "/fnEliminaringresoeconomicoBean.htm", method = RequestMethod.POST, headers = "content-type=application/json")
    public @ResponseBody
    String fnEliminaringresoeconomicoBean(@RequestBody Map<String, Object> param) throws UnsupportedEncodingException {
        try {
            oingresoeconomicoBean = gson.fromJson(gson.toJson(param.get("poJsonItem")), ingresoeconomicoBean.class);
            json = gson.toJson(Generic.getInstance(ingresoeconomicoService.class).fnEliminaringresoeconomicoBean(oingresoeconomicoBean));
        } catch (Exception e) {
            String error = "ERROR EN LA INVOCACIÓN AL SERVICIO: " + e;
            json = gson.toJson(error);
        }
        String oItem = new String(json.getBytes("UTF-8"), "ISO-8859-1");
        return oItem;
    }

    @RequestMapping(value = "/fnActualizaringresoeconomicoBean.htm", method = RequestMethod.POST, headers = "content-type=application/json")
    public @ResponseBody
    String fnActualizaringresoeconomicoBean(@RequestBody Map<String, Object> param) throws UnsupportedEncodingException {
        try {
            oingresoeconomicoBean = gson.fromJson(gson.toJson(param.get("poJsonItem")), ingresoeconomicoBean.class);
            json = gson.toJson(Generic.getInstance(ingresoeconomicoService.class).fnActualizaringresoeconomicoBean(oingresoeconomicoBean));
        } catch (Exception e) {
            String error = "ERROR EN LA INVOCACIÓN AL SERVICIO: " + e;
            json = gson.toJson(error);
        }
        String oItem = new String(json.getBytes("UTF-8"), "ISO-8859-1");
        return oItem;
    }

}
