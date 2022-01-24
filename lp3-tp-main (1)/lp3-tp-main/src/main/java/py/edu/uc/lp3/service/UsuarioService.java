package py.edu.uc.lp3.service;

import java.util.List;

import py.edu.uc.lp3.users.Admin;
import py.edu.uc.lp3.users.AngelInvestor;
import py.edu.uc.lp3.users.Brainstormer;
import py.edu.uc.lp3.users.Implementador;
import py.edu.uc.lp3.users.Organizacion;
import py.edu.uc.lp3.users.Sponsor;
import py.edu.uc.lp3.users.Usuario;
/*import py.edu.uc.lp3exceptions.AdminException;*/

import org.springframework.stereotype.Service;

@Service
public interface UsuarioService {
	List<Usuario> listAll();
	List<Usuario> listByRol(String rol);
	void saveAdmin(Admin user);
	void saveSponsor(Sponsor user);
	void saveAngelInvestor(AngelInvestor user);
	void saveImplementador(Implementador user);
	void saveBrainstormer(Brainstormer user);
	void saveOrganizacion(Organizacion user);
	
	
	
	void delete(long id);
	
	void saveList(List<Usuario> usuarios);
	/*void update();*/ //no funciona
	 public void listNotificar();
}

