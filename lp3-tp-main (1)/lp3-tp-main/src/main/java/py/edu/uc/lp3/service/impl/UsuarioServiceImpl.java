

package py.edu.uc.lp3.service.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import py.edu.uc.lp3.content.Membresia;
import py.edu.uc.lp3.repository.MembresiaRepository;
import py.edu.uc.lp3.repository.UsuarioRepository;
import py.edu.uc.lp3.service.UsuarioService;
import py.edu.uc.lp3.users.Admin;
import py.edu.uc.lp3.users.AngelInvestor;
import py.edu.uc.lp3.users.Brainstormer;
import py.edu.uc.lp3.users.Implementador;
import py.edu.uc.lp3.users.Organizacion;
import py.edu.uc.lp3.users.Sponsor;

import py.edu.uc.lp3.users.Usuario;

/* Basado en el codigo de :
 * 
 * */

@Service
public class UsuarioServiceImpl implements UsuarioService {

	@Autowired
	private UsuarioRepository usuarioRepository;
	@Autowired
	private MembresiaRepository membresiaRepository;
	
	@Override
	public List<Usuario> listAll() {
		List<Usuario> usuarios = new ArrayList<>();
		Iterator<Usuario> usuariosIterator = usuarioRepository.findAll().iterator();
		while (usuariosIterator.hasNext()) {
			usuarios.add(usuariosIterator.next());
		}
		return usuarios;
	}
	@Override
	public List<Usuario> listByRol(String rol) {
		List<Usuario> usuarios = new ArrayList<>();
		Iterator<Usuario> usuariosIterator = usuarioRepository.findAll().iterator();
		Usuario user = null;
		while (usuariosIterator.hasNext()) {
			user = usuariosIterator.next();
			if (rol.equals("Organizacion")) {
				if(user instanceof Organizacion) {
					usuarios.add(user);
				}
			}
			else if(rol.equals("Admin")) {
				if(user instanceof Admin) {
					usuarios.add(user);
				}
			}
			else if(rol.equals("Implementador")) {
				if(user instanceof Implementador) {
					usuarios.add(user);
				}
			}
			else if(rol.equals("Sponsor")) {
				if(user instanceof Sponsor) {
					usuarios.add(user);
				}
			}
			else if(rol.equals("AngelInvestor")) {
				if(user instanceof AngelInvestor) {
					usuarios.add(user);
				}
			}
			else if(rol.equals("Brainsstormer")) {
				if(user instanceof Brainstormer) {
					usuarios.add(user);
				}
			}
		}
		return usuarios;
	}
	@Override
	public void delete(long id) {
		usuarioRepository.deleteById(id);
		
	}


	@Override
	public void saveList(List<Usuario> usuarios) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void saveAdmin(Admin user) {
		usuarioRepository.save(user);
	}
	
	@Override
	public void saveSponsor(Sponsor user) {
		usuarioRepository.save(user);
	}
	
	@Override
	public void saveAngelInvestor(AngelInvestor user) {
		usuarioRepository.save(user);
	}
	
	@Override
	public void saveImplementador(Implementador user) {
		usuarioRepository.save(user);
	}
	
	@Override
	public void saveBrainstormer(Brainstormer user) {
		usuarioRepository.save(user);
	}
	
	@Override
	public void saveOrganizacion(Organizacion user) {
		usuarioRepository.save(user);
	}
	@Override
	public void listNotificar() {
		Boolean existe = true;
		/*List<Membresia> membresias = new ArrayList<>();
		List<Usuario> usuarios = new ArrayList<>();*/
		Iterator<Membresia> membresiasIterator = membresiaRepository.findAll().iterator();
		while (membresiasIterator.hasNext()){
			Membresia aux = membresiasIterator.next();
			if(aux.yaVencio()) {
				existe = false;
				//System.out.println("Se envio una notificacion de vencimiento de membresia al usuario : " +aux.getUsuarioMembresia());
			}
			if (existe)
			{
				System.out.println("Aun no vecio ninguna membresia");
			}
		}
	}


}