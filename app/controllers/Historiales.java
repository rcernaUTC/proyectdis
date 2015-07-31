package controllers;

import java.util.List;

import models.Historial;
import models.Paciente;

public class Historiales {
	
	public static void index(){
		List<Historial> pacientes=Historial.findAll();
		index();
	}


	public static void Guardar(String Sintomas,String  Recomendaciones,String  Medicamento){
		Historial persona = new Historial(Sintomas,Recomendaciones,Medicamento);
		persona.save();
		Historiales inicio=new Historiales();
		inicio.index();
	}
	
	

	
	public static void Eliminar (Long id){
		Historial persona= Historial.findById(id);
		persona.delete();
		index();
	}
	
}
