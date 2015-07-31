package models;
import javax.persistence.Entity;

import play.db.jpa.Blob;
import play.db.jpa.Model;

@Entity
public class Observacion extends Model{
   
    public String cantidad_obs;
    public String descripcion_obs;
    public String fecha_obs;
    
    public String toString(){
    	return "CANTIDAD:("+cantidad_obs+")"+"DESCRIPCIÓN:("+descripcion_obs+")"+"FEHA DE LA OBSERVACIÓN:("+fecha_obs+")";
    }

    public void enviarDatos(){
    }

    public void mostarDatos(){
    }

}
