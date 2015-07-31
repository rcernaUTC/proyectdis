package controllers;

import models.Doctor;
import models.Registro;
import models.Historial;
import models.Paciente;
import play.mvc.Controller;

import java.util.*;

public class Busquedas extends Controller  {
	
	public static void busquedapac(String Cedula){
		List<Paciente> pacientes= null;
		pacientes=Paciente.find("Cedula",Cedula).fetch();
	render(Cedula,pacientes);
	}
	
	public static void paciente(){
		
	render();
	}
	
	
}
