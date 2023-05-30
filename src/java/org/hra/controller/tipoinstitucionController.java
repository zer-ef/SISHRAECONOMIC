package org.hra.controller;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonSyntaxException;
import org.hra.util.Generic;
import java.io.UnsupportedEncodingException;
import java.util.Map;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.hra.dominio.tipoinstitucionBean;
import org.hra.services.tipoinstitucionService;

/**
 *
 * @author Quichua
 */
@Controller
@RequestMapping("/tipoinstitucionController")
@SessionAttributes({"oSession"})
public class tipoinstitucionController {

    Gson gson = new GsonBuilder().setDateFormat("dd/MM/yyyy").serializeNulls().create();
    String json = "";
    tipoinstitucionBean otipoinstitucionBean;

    @RequestMapping(value = "/fnIstipoinstitucionBean.htm", method = RequestMethod.POST)
    public @ResponseBody
    String fnIstipoinstitucionBean(@RequestBody Map<String, Object> param) throws UnsupportedEncodingException {
        try {
            otipoinstitucionBean = gson.fromJson(gson.toJson(param.get("poJsonItem")), tipoinstitucionBean.class);
            otipoinstitucionBean.setStatus(Generic.getInstance(tipoinstitucionService.class).fnIstipoinstitucionBean(otipoinstitucionBean));
        } catch (Exception e) {
            otipoinstitucionBean = new tipoinstitucionBean();
            otipoinstitucionBean.setStatus(false);
            otipoinstitucionBean.setMensaje("ERROR EN LA INVOCACIÓN AL SERVICIO:" + e);
        }
        json = gson.toJson(otipoinstitucionBean.getStatus());
        String oItem = new String(json.getBytes("UTF-8"), "ISO-8859-1");
        return oItem;
    }

    @RequestMapping(value = "/fnGetListtipoinstitucionBean.htm", method = RequestMethod.POST)
    public @ResponseBody
    String fnGetListtipoinstitucionBean(@RequestBody Map<String, Object> param) throws UnsupportedEncodingException {
        try {
            otipoinstitucionBean = gson.fromJson(gson.toJson(param.get("poJsonItem")), tipoinstitucionBean.class);
            json = gson.toJson(Generic.getInstance(tipoinstitucionService.class).fnGetListtipoinstitucionBean(otipoinstitucionBean));
        } catch (Exception e) {
            String error = "ERROR EN LA INVOCACIÓN AL SERVICIO: " + e;
            json = gson.toJson(error);
        }
        String oItem = new String(json.getBytes("UTF-8"), "ISO-8859-1");
        return oItem;
    }

    @RequestMapping(value = "/fnGridtipoinstitucionBean.htm", method = RequestMethod.POST)
    public @ResponseBody
    String fnGridtipoinstitucionBean(@RequestBody Map<String, Object> param) throws UnsupportedEncodingException, Exception {
        try {
            otipoinstitucionBean = gson.fromJson(gson.toJson(param.get("poJsonItem")), tipoinstitucionBean.class);
            json = gson.toJson(Generic.getInstance(tipoinstitucionService.class).fnGridtipoinstitucionBean(otipoinstitucionBean));
            String oItem = new String(json.getBytes("UTF-8"), "ISO-8859-1");
            return oItem;
        } catch (JsonSyntaxException e) {
            String error = "ERROR EN LA INVOCACIÓN AL SERVICIO: " + e;
            return gson.toJson(error);
        }
    }

    @RequestMapping(value = "/fnAutocompletetipoinstitucionBean.htm", method = RequestMethod.POST)
    public @ResponseBody
    String fnAutocompletetipoinstitucionBean(@RequestBody Map<String, Object> param) throws UnsupportedEncodingException, Exception {
        try {
            String pItem = gson.fromJson(gson.toJson(param.get("pnvDenominacion")), String.class);
            otipoinstitucionBean = new tipoinstitucionBean();
            otipoinstitucionBean.setAccion(pItem);
            json = gson.toJson(Generic.getInstance(tipoinstitucionService.class).fnAutocompletetipoinstitucionBean(otipoinstitucionBean));
            String oItem = new String(json.getBytes("UTF-8"), "ISO-8859-1");
            return oItem;
        } catch (JsonSyntaxException e) {
            String error = "ERROR EN LA INVOCACIÓN AL SERVICIO: " + e;
            return gson.toJson(error);
        }
    }

    @RequestMapping(value = "/fnGettipoinstitucionBean.htm", method = RequestMethod.POST)
    public @ResponseBody
    String fnGettipoinstitucionBean(@RequestBody Map<String, Object> param) throws UnsupportedEncodingException {
        try {
            otipoinstitucionBean = gson.fromJson(gson.toJson(param.get("poJsonItem")), tipoinstitucionBean.class);
            json = gson.toJson(Generic.getInstance(tipoinstitucionService.class).fnGettipoinstitucionBean(otipoinstitucionBean));
        } catch (Exception e) {
            String error = "ERROR EN LA INVOCACIÓN AL SERVICIO: " + e;
            json = gson.toJson(error);
        }
        String oItem = new String(json.getBytes("UTF-8"), "ISO-8859-1");
        return oItem;
    }

    @RequestMapping(value = "/fnInsertartipoinstitucionBean.htm", method = RequestMethod.POST, headers = "content-type=application/json")
    public @ResponseBody
    String fnInsertartipoinstitucionBean(@RequestBody Map<String, Object> param) throws UnsupportedEncodingException {
        try {
            otipoinstitucionBean = gson.fromJson(gson.toJson(param.get("poJsonItem")), tipoinstitucionBean.class);
            json = gson.toJson(Generic.getInstance(tipoinstitucionService.class).fnInsertartipoinstitucionBean(otipoinstitucionBean));
        } catch (Exception e) {
            String error = "ERROR EN LA INVOCACIÓN AL SERVICIO: " + e;
            json = gson.toJson(error);
        }
        String oItem = new String(json.getBytes("UTF-8"), "ISO-8859-1");
        return oItem;
    }

    @RequestMapping(value = "/fnEliminartipoinstitucionBean.htm", method = RequestMethod.POST, headers = "content-type=application/json")
    public @ResponseBody
    String fnEliminartipoinstitucionBean(@RequestBody Map<String, Object> param) throws UnsupportedEncodingException {
        try {
            otipoinstitucionBean = gson.fromJson(gson.toJson(param.get("poJsonItem")), tipoinstitucionBean.class);
            json = gson.toJson(Generic.getInstance(tipoinstitucionService.class).fnEliminartipoinstitucionBean(otipoinstitucionBean));
        } catch (Exception e) {
            String error = "ERROR EN LA INVOCACIÓN AL SERVICIO: " + e;
            json = gson.toJson(error);
        }
        String oItem = new String(json.getBytes("UTF-8"), "ISO-8859-1");
        return oItem;
    }

    @RequestMapping(value = "/fnActualizartipoinstitucionBean.htm", method = RequestMethod.POST, headers = "content-type=application/json")
    public @ResponseBody
    String fnActualizartipoinstitucionBean(@RequestBody Map<String, Object> param) throws UnsupportedEncodingException {
        try {
            otipoinstitucionBean = gson.fromJson(gson.toJson(param.get("poJsonItem")), tipoinstitucionBean.class);
            json = gson.toJson(Generic.getInstance(tipoinstitucionService.class).fnActualizartipoinstitucionBean(otipoinstitucionBean));
        } catch (Exception e) {
            String error = "ERROR EN LA INVOCACIÓN AL SERVICIO: " + e;
            json = gson.toJson(error);
        }
        String oItem = new String(json.getBytes("UTF-8"), "ISO-8859-1");
        return oItem;
    }

}
