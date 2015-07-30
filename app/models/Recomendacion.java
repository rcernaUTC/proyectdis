package models;
import javax.persistence.Entity;

import play.db.jpa.Blob;
import play.db.jpa.Model;

@Entity
public class Recomendacion extends Model{
    
	public int codigo_rec;
	public String tipo_rec;
    public String descripcion_rec;
    public String fecha_rec;
    
    

    public void mostrarDatos(){
    }

    public void enviarDatos(){
    }
    public String toString()  {
        return "nombre: (" + codigo_rec + tipo_rec+descripcion_rec+fecha_rec+")";
}

}
