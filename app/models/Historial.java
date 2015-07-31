package models;

import javax.persistence.Entity;

import play.db.jpa.Model;

@Entity 

public class Historial extends Model {
	 public String  Sintomas;
	 public String  Recomendaciones;
	 public String Medicamento;
	
	
	
	public Historial (String Sintomas,String  Recomendaciones,String  Medicamento){
	
	this.Sintomas=Sintomas;
	this.Recomendaciones=Recomendaciones;
	this.Medicamento=Medicamento;
	
	
	
	
		
	}

}
