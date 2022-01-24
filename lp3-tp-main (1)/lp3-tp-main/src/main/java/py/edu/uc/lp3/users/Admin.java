package py.edu.uc.lp3.users;

import javax.persistence.Entity;

@Entity
public class Admin extends Usuario implements Administrable {
	String tipoPago;
	String tipoPromocion;
	public String getTipoPago() {
		return tipoPago;
	}
	public void setTipoPago(String tipoPago) {
		this.tipoPago = tipoPago;
	}
	public String getTipoPromocion() {
		return tipoPromocion;
	}
	public void setTipoPromocion(String tipoPromocion) {
		this.tipoPromocion = tipoPromocion;
	}
	public Admin()
	{
		
	}
	/*public Admin(String nombre , String contrasenha)
	{
		super(nombre,contrasenha);
	}
	public Admin(String nombre , String contrasenha,String email)
	{
		super(nombre,contrasenha,email);
	}*/
	@Override
	public Usuario addUsuario(Usuario new_user) {
		// TODO Auto-generated method stub
		return null;
	}
}