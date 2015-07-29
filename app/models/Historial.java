package models;
import javax.persistence.Entity;

import play.db.jpa.Blob;
import play.db.jpa.Model;

@Entity
public class Historial extends Model{
    private long codigo;
    private String cedula_pac;
    private String nombres_pac ;
    private String apellidos_pac ;
    private String direccion2_pac;
    private  String telefono_pac;
    private  String mensaje_pac;

    public Historial (long codigo, String cedula2,String nombre2,String apellido2 ,String direccion2 ,String teléfono, String mensaje ){
		
    	this.codigo = codigo;
    	this.cedula_pac = cedula2;
    	this.nombres_pac = nombre2;
    	this.apellidos_pac = apellido2;
    	this.direccion2_pac=direccion2;
    	this.telefono_pac = teléfono;
    	this.mensaje_pac = mensaje;
    	
    	
	}


}
