package models;

import java.util.HashMap;
import java.util.Map;

import models.Registro;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.MapKey;
import javax.persistence.OneToMany;

import play.db.jpa.Model;

@Entity
public class Doctor  extends Model{
	private long coded;
	private String cedula_doc;
    private String nombre_doc;
    private String direccion_doc;
    private String email_doc;
    private String contrasenia_doc;

    public void gestionarDatos(){
    }
    
    @OneToMany(cascade = CascadeType.ALL)
	@MapKey(name = "code")
	public Map<Long, Registro> Regist;
	//la llave para ese mapa es el name=code
	//le esta dando a long como map al atributo del product

	public Doctor() {
		this.Regist = new HashMap<Long, Registro>();
		//constructor, THIS dirige a la misma clase donde sta amacenao en un vector 
	}

	public Registro findRegistro(long code) {
		return null;
	}

	public void add(long code, String Nombre,String Apellido,String Direccion,String Email,String Clave) {
		Registro registros = new Registro ( code, Nombre, Apellido, Direccion, Email, Clave);
//a mi cklase product le pone el code, descripcion
		this.Regist.put(code,registros);		
	} 
}
