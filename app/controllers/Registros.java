package controllers;

import models.Doctor;
import models.Registro;
import models.Historial;
import models.Paciente;

import play.mvc.Controller;

import java.util.*;

public class Registros extends Controller {

	public static void registro() {
		
	}
//llamdo de la interfaz
	public static void main(long code, String inpNombre, String inpApellido,
			String inpDireccion, String inpEmail, String inpContraseña) {
		
		String nombre = inpNombre;
		String apellido = inpApellido;
		String direccion = inpDireccion;
		String email = inpEmail;
		String clave = inpContraseña;
		
		Doctor doctor = new Doctor();
		doctor.add(code, nombre, apellido, direccion, email, clave);
		doctor.save();
		
	
		// creava una intanci y acedia a la clase guardaba
		// Registro registros= new Registro(code, nombre, apellido, direccion,
		// email, clave);
		// registros.save();
		render(nombre, apellido, direccion, email, clave);

	}
	
	
	
	
	
	
	
	

	public static void secion(String inpUsuario){
		List<Doctor> doctores= null;
		doctores=Doctor.find("email_doc",inpUsuario).fetch();
	render(inpUsuario,doctores);

	}

	// acediendo al metod en el caso la interfaz
	public static void historial() {
		List<Paciente>his=null;
		his=Paciente.findAll();
		render(his);

	}
	public static void extraer() {

	
		List<Registro>registros=null;
		registros=Registro.findAll();

		List<Doctor>doctors=null;
		doctors=Doctor.findAll();	
		render(registros,doctors);

	}
	


	public static void main2(long code,String inpCedula, String inpNombres, String inpApellidos, String inpDireccion2, String inpTeléfono,String tfMensaje) {
		String cedula2 = inpCedula;
		String nombre2 = inpNombres;
		String apellido2 = inpApellidos;
		String direccion2 = inpDireccion2;
		String telefono = inpTeléfono;
		String mensaje = tfMensaje;

		
		 
		
		// Registro historiales= new Registro(1, cedula, nombres, apellidos,
		// direccion2,telefono, mensaje);
		// Registro.save();

		render(cedula2, nombre2, apellido2, direccion2, telefono, mensaje);

	}
	public static void paciente(long codp,String cedulap, String nombrep,String apellidop,String direccionp,String telefonop) {
		long codpac= codp;
		String cedula_pac= cedulap;
		String nombre_pac= nombrep;
		String apellido_pac  = apellidop;
		String direccion_pac= direccionp;
		String telefono_pac = telefonop;
		
		
	}
	public static void Editar (Long code){
		Registro persona= Registro.findById(code);
		render(persona);
	}
	public static void Actualizar(long code, String Nombre, String Apellido,
			String Direccion, String Email, String Clave){
	Registro persona= Registro.findById(code);
		persona.Nombre=Nombre;
		persona.Apellido=Apellido;
		persona.Direccion=Direccion;
		persona.Email=Email;
		persona.Clave=Clave;
		persona.save();
	}
	
}
