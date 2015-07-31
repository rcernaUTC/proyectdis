package controllers;

import java.util.List;

import models.Paciente;
import models.Usuario;
import play.mvc.Controller;

public class Pacientes extends Controller{

	public static void index(){
		List<Paciente> pacientes=Paciente.findAll();
		render(pacientes);
	}
	public static void Guardar(String Cedula,String UserName,String  Apellido,String  Direccion,int Telefono){
		Paciente persona = new Paciente(Cedula,UserName,Apellido,Direccion,Telefono);
		persona.save();
		Pacientes inicio=new Pacientes();
		inicio.index();
	}
	
	

	
	public static void Eliminar (Long id){
		Paciente persona= Paciente.findById(id);
		persona.delete();
		index();
	}
	
	public static void principal(){
		
		render();
	}
	public static void Nuevo (){
		
		render();
	}
	public static void Historial (){
		
		render();
	}

	
	
}
