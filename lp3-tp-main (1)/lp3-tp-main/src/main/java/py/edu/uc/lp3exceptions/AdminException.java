package py.edu.uc.lp3exceptions;

public class AdminException extends Exception {
	
	String mensaje;
	
	
	public AdminException() {
		
	}
	
	public AdminException(String mensaje) {
		super(mensaje);
	}

	public String getMensaje() {
		return mensaje;
	}


	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}
	
}
