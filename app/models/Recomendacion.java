package models;
import javax.persistence.Entity;

import play.db.jpa.Blob;
import play.db.jpa.Model;

@Entity
public class Recomendacion extends Model{
    private int codigo_rec;
    private int codigo_enf;
    private int codigo_obs;
    private int descripcion_rec;

    public void mostrarDatos(){
    }

    public void enviarDatos(){
    }

}
