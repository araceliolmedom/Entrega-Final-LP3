package py.edu.uc.lp3.content;

import java.util.Calendar;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity

public class Membresia{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long IdMembresia;
	public String UsuarioMembresia;
	Date fechaVencimiento;
	Date fechaInicio;
	
	public Membresia() {
		fechaVencimiento = new Date();
		fechaInicio = new Date();
	}
	public long getIdMembresia() {
		return IdMembresia;
	}
	public void setIdMembresia(long idMembresia) {
		IdMembresia = idMembresia;
	}

	public String getUsuarioMembresia() {
		return this.UsuarioMembresia;
	}
	public void setUsuarioMembresia(String UsuarioMembresia) {
		this.UsuarioMembresia = UsuarioMembresia;
	}
	public Date getFechaInicio() {
		return new Date();
	}
	public void setFechaInicio(Date fechaInicio) {
		
		new Date();
	}
	public Date getFechaVencimiento() {
		return fechaVencimiento;
	}
	public void setFechaVencimiento(Date fechaVencimiento) {
		this.fechaVencimiento = fechaVencimiento;
	}
	public Date sumarDias(Date fecha, int dias){
		
	      Calendar calendar = Calendar.getInstance();
	      calendar.setTime(fecha); // Configuramos la fecha que se recibe
	      calendar.add(Calendar.DAY_OF_YEAR, dias);  // numero de días a añadir, o restar en caso de días<0
	      return calendar.getTime(); // Devuelve el objeto Date con los nuevos días añadidos
	 }
	public Boolean yaVencio()
	{
		Date fechActual = new Date();
		/*Verificamos si la fecha actual es igual a la fecha de vencimiento*/
		if (fechActual == fechaVencimiento)
		{
			return true;
		}
		return false;
	}
	
}