package models;
import javax.persistence.Entity;

import play.db.jpa.Blob;
import play.db.jpa.Model;


@Entity
public class Enfermedad extends Model {
    public String nombre_enfermedad;
    public String tipo_enfermedad;
    public String tipoParasito_enfermedad;
    public String parteAf_enfermedad;
    public String fechaConsulta_enfermedad;
    public String toString(){
    	return "NOMBRE:("+nombre_enfermedad+")"+"TIPO:("+tipo_enfermedad+")"+"PARÀSITO:("+tipoParasito_enfermedad+")"+"PARTE AFECTADA:("+parteAf_enfermedad+")"+"FECHA DE CONSULTA:("+fechaConsulta_enfermedad+")";
    }
    

    public void mostrarDatos(){
    }

    public void enviarDatos(){
    }

}
