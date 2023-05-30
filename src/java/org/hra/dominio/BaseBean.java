/*******************************************************************************
// Descripción       : Clase que contiene los atributos de GenericBean
// Creado por        : SISCAR
// Fecha de Creación : 05/01/2018 09:19:20
********************************************************************************/

package org.hra.dominio;

import java.io.Serializable;

/**
*
* @author SISCAR
 */
    public class BaseBean implements Serializable 
    {
        private String mensaje; 
        private boolean status; 
        private String accion; 
        private int iOps; 
        private boolean bEstaOperacion; 
        public String getMensaje (){
        return mensaje ;
         }
        public void setMensaje (String mensaje){
        this.mensaje=mensaje ;
         }
        public boolean getStatus (){
        return status ;
         }
        public void setStatus (boolean status){
        this.status=status ;
         }
        public String getAccion (){
        return accion ;
         }
        public void setAccion (String accion){
        this.accion=accion ;
         }
        public int getIOps (){
        return iOps ;
         }
        public void setIOps (int iOps){
        this.iOps=iOps ;
         }
        public boolean getBEstaOperacion (){
        return bEstaOperacion ;
         }
        public void setBEstaOperacion (boolean bEstaOperacion){
        this.bEstaOperacion=bEstaOperacion ;
         }
    }
