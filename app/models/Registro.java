package models;

import java.util.HashMap;
import java.util.Map;

import controllers.Application;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.MapKey;
import javax.persistence.OneToMany;

import play.db.jpa.Model;

@Entity
public class Registro extends Model{
	private long code;
    private String Nombre;
    private String Apellido;
    private String Direccion;
    private String Email;
    private String Clave;
	

	public Registro(long code, String Nombre,String Apellido,String Direccion,String Email,String Clave) {
		this.code = code;
		this.Nombre = Nombre;
		this.Apellido = Apellido;
		this.Direccion = Direccion;
		this.Email = Email;
		this.Clave = Clave;
		// TODO Auto-generated constructor stub
	}


	public Registro(long code2, String nombre2) {
		// TODO Auto-generated constructor stub
	}





	
	


	
}
