package models;
import javax.persistence.Entity;

import play.db.jpa.Blob;
import play.db.jpa.Model;

@Entity
public class Observacion extends Model{
    private int codigo_obs;
    private int codigo_hist;
    private int codigo_cuerpo;
    private String sintomas_obs;

    public void enviarDatos(){
    }

    public void mostarDatos(){
    }

}
