package py.edu.uc.lp3.content;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Pago{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public long IdPago;
	public String usuario;
	public long monto;
	public String tipoPago;
	private String tipoRemuneracion;
	public String organizacionPagar;

	
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public long getIdPago(){
		return IdPago;
	}
	public void setIdPago(long IdPago){
		this.IdPago = IdPago;
	}
	public long getMonto(){
		return monto;
	}
	public void setMonto(long monto) {
		this.monto = monto;
	}
	public String getTipoPago(){
		return tipoPago;
	}
	public void setTipoPago(String tipoPago) {
		this.tipoPago = tipoPago;
	}
	public String getTipoRemuneracion() {
		return tipoRemuneracion;
	}
	public void setTipoRemuneracion(String tipoRemuneracion) {
		this.tipoRemuneracion = tipoRemuneracion;
	}
	public String getOrganizacionPagar() {
		return organizacionPagar;
	}
	public void setOrganizacionPagar(String organizacionPagar) {
		this.organizacionPagar = organizacionPagar;
	}

	
}