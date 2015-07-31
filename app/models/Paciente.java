package models;

import javax.persistence.Entity;

import play.db.jpa.Model;

@Entity 

public class Paciente extends Model {
	public String  Cedula; 
	public String  UserName;
	 public String  Apellido;
	 public String  Direccion;
	 public int     Telefono;
	
	
	public Paciente (String Cedula,String UserName,String  Apellido,String  Direccion,int Telefono){
	this.Cedula=Cedula;
	this.UserName=UserName;
	this.Apellido=Apellido;
	this.Direccion=Direccion;
	this.Telefono=Telefono;
	
	
	
		
	}

}
