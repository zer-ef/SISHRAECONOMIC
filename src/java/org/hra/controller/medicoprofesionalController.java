package org.hra.controller;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonSyntaxException;
import org.hra.util.Generic;
import java.io.UnsupportedEncodingException;
import java.util.Map;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.hra.dominio.medicoprofesionalBean;
import org.hra.dominio.personaBean;
import org.hra.services.medicoprofesionalService;

/**
 *
 * @author Quichua
 */
@Controller
@RequestMapping("/medicoprofesionalController")
@SessionAttributes({"oSession"})
public class medicoprofesionalController {

    Gson gson = new GsonBuilder().setDateFormat("dd/MM/yyyy").serializeNulls().create();
    String json = "";
    medicoprofesionalBean omedicoprofesionalBean;
    personaBean opersonaBean;

    @RequestMapping(value = "/fnIsmedicoprofesionalBean.htm", method = RequestMethod.POST)
    public @ResponseBody
    String fnIsmedicoprofesionalBean(@RequestBody Map<String, Object> param) throws UnsupportedEncodingException {
        try {
            omedicoprofesionalBean = gson.fromJson(gson.toJson(param.get("poJsonItem")), medicoprofesionalBean.class);
            omedicoprofesionalBean.setStatus(Generic.getInstance(medicoprofesionalService.class).fnIsmedicoprofesionalBean(omedicoprofesionalBean));
        } catch (Exception e) {
            omedicoprofesionalBean = new medicoprofesionalBean();
            omedicoprofesionalBean.setStatus(false);
            omedicoprofesionalBean.setMensaje("ERROR EN LA INVOCACIÓN AL SERVICIO:" + e);
        }
        json = gson.toJson(omedicoprofesionalBean.getStatus());
        String oItem = new String(json.getBytes("UTF-8"), "ISO-8859-1");
        return oItem;
    }

    @RequestMapping(value = "/fnGetListmedicoprofesionalBean.htm", method = RequestMethod.POST)
    public @ResponseBody
    String fnGetListmedicoprofesionalBean(@RequestBody Map<String, Object> param) throws UnsupportedEncodingException {
        try {
            omedicoprofesionalBean = gson.fromJson(gson.toJson(param.get("poJsonItem")), medicoprofesionalBean.class);
            json = gson.toJson(Generic.getInstance(medicoprofesionalService.class).fnGetListmedicoprofesionalBean(omedicoprofesionalBean));
        } catch (Exception e) {
            String error = "ERROR EN LA INVOCACIÓN AL SERVICIO: " + e;
            json = gson.toJson(error);
        }
        String oItem = new String(json.getBytes("UTF-8"), "ISO-8859-1");
        return oItem;
    }

    @RequestMapping(value = "/fnGridmedicoprofesionalBean.htm", method = RequestMethod.POST)
    public @ResponseBody
    String fnGridmedicoprofesionalBean(@RequestBody Map<String, Object> param) throws UnsupportedEncodingException, Exception {
        try {
            omedicoprofesionalBean = gson.fromJson(gson.toJson(param.get("poJsonItem")), medicoprofesionalBean.class);
            json = gson.toJson(Generic.getInstance(medicoprofesionalService.class).fnGridmedicoprofesionalBean(omedicoprofesionalBean));
            String oItem = new String(json.getBytes("UTF-8"), "ISO-8859-1");
            return oItem;
        } catch (JsonSyntaxException e) {
            String error = "ERROR EN LA INVOCACIÓN AL SERVICIO: " + e;
            return gson.toJson(error);
        }
    }

    @RequestMapping(value = "/fnAutocompletemedicoprofesionalBean.htm", method = RequestMethod.POST)
    public @ResponseBody
    String fnAutocompletemedicoprofesionalBean(@RequestBody Map<String, Object> param) throws UnsupportedEncodingException, Exception {
        try {
            String pItem = gson.fromJson(gson.toJson(param.get("pnvDenominacion")), String.class);
            omedicoprofesionalBean = new medicoprofesionalBean();
            omedicoprofesionalBean.setAccion(pItem);
            json = gson.toJson(Generic.getInstance(medicoprofesionalService.class).fnAutocompletemedicoprofesionalBean(omedicoprofesionalBean));
            String oItem = new String(json.getBytes("UTF-8"), "ISO-8859-1");
            return oItem;
        } catch (JsonSyntaxException e) {
            String error = "ERROR EN LA INVOCACIÓN AL SERVICIO: " + e;
            return gson.toJson(error);
        }
    }

    @RequestMapping(value = "/fnGetmedicoprofesionalBean.htm", method = RequestMethod.POST)
    public @ResponseBody
    String fnGetmedicoprofesionalBean(@RequestBody Map<String, Object> param) throws UnsupportedEncodingException {
        try {
            omedicoprofesionalBean = gson.fromJson(gson.toJson(param.get("poJsonItem")), medicoprofesionalBean.class);
            json = gson.toJson(Generic.getInstance(medicoprofesionalService.class).fnGetmedicoprofesionalBean(omedicoprofesionalBean));
        } catch (Exception e) {
            String error = "ERROR EN LA INVOCACIÓN AL SERVICIO: " + e;
            json = gson.toJson(error);
        }
        String oItem = new String(json.getBytes("UTF-8"), "ISO-8859-1");
        return oItem;
    }

    @RequestMapping(value = "/fnInsertarmedicoprofesionalBean.htm", method = RequestMethod.POST, headers = "content-type=application/json")
    public @ResponseBody
    String fnInsertarmedicoprofesionalBean(@RequestBody Map<String, Object> param) throws UnsupportedEncodingException {
        try {
            opersonaBean = gson.fromJson(gson.toJson(param.get("poJsonItemPersona")), personaBean.class);
            omedicoprofesionalBean = gson.fromJson(gson.toJson(param.get("poJsonItemMedico")), medicoprofesionalBean.class);
            json = gson.toJson(Generic.getInstance(medicoprofesionalService.class).fnInsertarmedicoprofesionalBean(opersonaBean, omedicoprofesionalBean));
        } catch (Exception e) {
            String error = "ERROR EN LA INVOCACIÓN AL SERVICIO: " + e;
            json = gson.toJson(error);
        }
        String oItem = new String(json.getBytes("UTF-8"), "ISO-8859-1");
        return oItem;
    }

    @RequestMapping(value = "/fnEliminarmedicoprofesionalBean.htm", method = RequestMethod.POST, headers = "content-type=application/json")
    public @ResponseBody
    String fnEliminarmedicoprofesionalBean(@RequestBody Map<String, Object> param) throws UnsupportedEncodingException {
        try {
            opersonaBean = gson.fromJson(gson.toJson(param.get("poJsonItemPersona")), personaBean.class);
            omedicoprofesionalBean = gson.fromJson(gson.toJson(param.get("poJsonItemMedico")), medicoprofesionalBean.class);
            json = gson.toJson(Generic.getInstance(medicoprofesionalService.class).fnEliminarmedicoprofesionalBean(opersonaBean, omedicoprofesionalBean));
        } catch (Exception e) {
            String error = "ERROR EN LA INVOCACIÓN AL SERVICIO: " + e;
            json = gson.toJson(error);
        }
        String oItem = new String(json.getBytes("UTF-8"), "ISO-8859-1");
        return oItem;
    }

    @RequestMapping(value = "/fnActualizarmedicoprofesionalBean.htm", method = RequestMethod.POST, headers = "content-type=application/json")
    public @ResponseBody
    String fnActualizarmedicoprofesionalBean(@RequestBody Map<String, Object> param) throws UnsupportedEncodingException {
        try {
            opersonaBean = gson.fromJson(gson.toJson(param.get("poJsonItemPersona")), personaBean.class);
            omedicoprofesionalBean = gson.fromJson(gson.toJson(param.get("poJsonItemMedico")), medicoprofesionalBean.class);
            json = gson.toJson(Generic.getInstance(medicoprofesionalService.class).fnActualizarmedicoprofesionalBean(opersonaBean, omedicoprofesionalBean));
        } catch (Exception e) {
            String error = "ERROR EN LA INVOCACIÓN AL SERVICIO: " + e;
            json = gson.toJson(error);
        }
        String oItem = new String(json.getBytes("UTF-8"), "ISO-8859-1");
        return oItem;
    }

}
