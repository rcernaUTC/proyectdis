
package models;

import javax.persistence.Entity;

import play.db.jpa.Model;

@Entity 

public class Usuario extends Model {
	 public String  UserName;
	 public String  Apellido;
	 public String  Direccion;
	 public int     Telefono;
	 public String   Correo;
	 public String  Password;
	
	public Usuario (String UserName,String  Apellido,String  Direccion,int Telefono,String Correo,String  Password){
	
	this.UserName=UserName;
	this.Apellido=Apellido;
	this.Direccion=Direccion;
	this.Telefono=Telefono;
	this.Correo=Correo;
	this.Password=Password;
	
		
	}

}


