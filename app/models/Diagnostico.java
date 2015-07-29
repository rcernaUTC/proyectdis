package models;
import java.util.HashMap;
import java.util.Map;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.MapKey;
import javax.persistence.OneToMany;

import play.db.jpa.Blob;
import play.db.jpa.Model;

@Entity
public class Diagnostico extends Model {
    private long coddiag;
    private String partes_cuerpo;
    private int descripcionPartes_cuerpo;
    private String imagenesPartes_cuerpo;
    private String cedula_pac;
    private String cedula_doc;

    public void seleccionar_cuerpo(){
    }

    public void mostrarDescripcion_cuerpo(){
    }
   
    
}
