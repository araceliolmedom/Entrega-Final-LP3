package py.edu.uc.lp3.users;

import javax.persistence.Entity;

@Entity
public class Organizacion extends Usuario {
	private String proyecto;
	private String tipoOrganizacion;
	private int cantMiembros;
	public Organizacion(){
		
	}
	
	public Organizacion(String proyecto, String tipoOrganizacion, int cantMiembros) {
		this.proyecto = proyecto;
		this.tipoOrganizacion = tipoOrganizacion;
		this.cantMiembros = cantMiembros;
	}
	public String getProyecto() {
		return proyecto;
	}
	public void setProyecto(String proyecto) {
		this.proyecto = proyecto;
	}
	public String gettipoOrganizacion() {
		return tipoOrganizacion;
	}
	public void settipoOrganizacion(String tipoProyecto) {
		this.tipoOrganizacion = tipoProyecto;
	}
	public int getCantMiembros() {
		return cantMiembros;
	}
	public void setCantMiembros(int cantMiembros) {
		this.cantMiembros = cantMiembros;
	}
	
	

}
