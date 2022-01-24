package py.edu.uc.lp3.users;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
/* Este trabajo se baso en uno ya hecho en anhos anteriores 
 * https://github.com/Tortol27/lp3-tp*/
@Entity
public class Usuario {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long ID;
	
	protected  String nombreUsuario;
	protected  String contrasenha;
	protected  String email;
	
//	public Usuario() {
//		
//	}
//		
//	public Usuario(String nombre_usuario, String contrasenha) {
//		
//		this.nombre_usuario = nombre_usuario;
//		this.contrasenha = contrasenha;
//	}
//	public Usuario(String nombre_usuario, String contrasenha, String email) {
//		super();
//		this.nombre_usuario = nombre_usuario;
//		this.contrasenha = contrasenha;
//		this.email = email;
//	}
	
	public String getNombreUsuario() {
		return nombreUsuario;
	}

	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}

	public String getContrasenha() {
		return contrasenha;
	}
	
	public void setContrasenha(String contrasenha) {
		this.contrasenha = contrasenha;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	public long getID() {
		return ID;
	}
	
	public void setID(long iD) {
		this.ID = iD;
	}

}