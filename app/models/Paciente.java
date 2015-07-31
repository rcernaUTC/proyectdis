package models;

import javax.persistence.Entity;

import play.db.jpa.Model;

@Entity 

public class Paciente extends Model {
	 public String  UserName;
	 public String  Apellido;
	 public String  Direccion;
	 public int     Telefono;
	
	
	public Paciente (String UserName,String  Apellido,String  Direccion,int Telefono){
	
	this.UserName=UserName;
	this.Apellido=Apellido;
	this.Direccion=Direccion;
	this.Telefono=Telefono;
	
	
	
		
	}

}
