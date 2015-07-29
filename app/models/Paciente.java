package models;
import java.util.HashMap;
import java.util.Map;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.MapKey;
import javax.persistence.OneToMany;

import play.db.jpa.Blob;
import play.db.jpa.Model;

@Entity
public class Paciente extends Model {
    private long codpac;
    private String cedula_pac;
    private String nombre_pac;
    private String apellido_pac;
    private String direccion_pac;
    private String telefono_pac;

    public void enviarDatos(){
    }
    @OneToMany(cascade = CascadeType.ALL)
   	@MapKey(name = "coddiag")
   	public Map<Long, Diagnostico > diag;
   	//la llave para ese mapa es el name=code
   	//le esta dando a long como map al atributo del product

   	public Paciente () {
   		this.diag = new HashMap<Long, Diagnostico >();
   		//constructor, THIS dirige a la misma clase donde sta amacenao en un vector 
   	}

   	public Diagnostico findDiagnostico(long code) {
   		return null;
   	}
	public  Paciente (long codpac,String cedula_pac, String nombre_pac,String apellido_pac ,String direccion_pac,String telefono_pac) {
		this.codpac= codpac;
		this.cedula_pac = cedula_pac;
		this.nombre_pac = nombre_pac;
		this.apellido_pac = apellido_pac;
		this.direccion_pac =direccion_pac;
		this.telefono_pac= telefono_pac;
		// TODO Auto-generated constructor stub
	}
	
}
