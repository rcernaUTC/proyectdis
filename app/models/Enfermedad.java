package models;
import javax.persistence.Entity;

import play.db.jpa.Blob;
import play.db.jpa.Model;

@Entity
public class Enfermedad extends Model {
    private int codigo_enf;
    private int codigo_obs;
    private int nombre_enf;

    public void mostrarDatos(){
    }

    public void enviarDatos(){
    }

}
