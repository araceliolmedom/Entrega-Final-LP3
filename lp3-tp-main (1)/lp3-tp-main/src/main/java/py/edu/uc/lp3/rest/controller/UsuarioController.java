package py.edu.uc.lp3.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import py.edu.uc.lp3.service.UsuarioService;
/*import py.edu.uc.lp3.users.Curador;
import py.edu.uc.lp3.users.Espectador;
import py.edu.uc.lp3.users.Premium;*/
import py.edu.uc.lp3.users.Usuario;
import py.edu.uc.lp3.users.Admin;
import py.edu.uc.lp3.users.AngelInvestor;
import py.edu.uc.lp3.users.Brainstormer;
import py.edu.uc.lp3.users.Implementador;
import py.edu.uc.lp3.users.Organizacion;
import py.edu.uc.lp3.users.Sponsor;

@RestController
public class UsuarioController {
	
	@Autowired
    private UsuarioService usuarioService;
	/*Listar todos los usuarios*/
	@RequestMapping(value = "/api/lp3/usuarios", method = RequestMethod.GET)
    public List<Usuario> list(){
        return usuarioService.listAll();
    }
	/*Agregar un usuario Admin*/
    @RequestMapping(value = "/api/lp3/admin", method = RequestMethod.POST)
    public void add(@RequestBody Admin user){
    	usuarioService.saveAdmin(user);
    }
    /*Listar usuarios por rol*/
    @RequestMapping(value = "/api/lp3/usuarios/{rol}", method = RequestMethod.GET)
    public List<Usuario> list_rol(@PathVariable("rol") String rol) {
        return usuarioService.listByRol(rol);
    }
    /*Agregar un usuario Sponsor*/
    @RequestMapping(value = "/api/lp3/admin/Sponsor", method = RequestMethod.POST)
    public void add(@RequestBody Sponsor user) {
    	usuarioService.saveSponsor(user);
    }
    /*Agregar un usuario Angel Investor*/
    @RequestMapping(value = "/api/lp3/admin/AngelInvestor", method = RequestMethod.POST)
    public void add(@RequestBody AngelInvestor user) {
    	usuarioService.saveAngelInvestor(user);
    }
    /*Agregar un usuario Implementador*/
    @RequestMapping(value = "/api/lp3/admin/Implementador", method = RequestMethod.POST)
    public void add(@RequestBody Implementador user) {
    	usuarioService.saveImplementador(user);
    }
    /*Agregar un usuario Brainstormer*/
    @RequestMapping(value = "/api/lp3/admin/Brainstormer", method = RequestMethod.POST)
    public void add(@RequestBody Brainstormer user) {
    	usuarioService.saveBrainstormer(user);
    }
    /*Agregar un usuario Organizacion*/
    @RequestMapping(value = "/api/lp3/admin/Organizacion", method = RequestMethod.POST)
    public void add(@RequestBody Organizacion user) {
    	System.out.print("asi funciona");
    	usuarioService.saveOrganizacion(user);
    }
    /*Eliminar usuarios por ID*/
    @RequestMapping(value = "/api/lp3/admin/eliminar/{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable("id") int id) {
    	usuarioService.delete(id);
    }
    /*Notificar a los usuarios que su membresia acaba de vencer*/
    @RequestMapping(value = "/api/lp3/admin/notificar", method = RequestMethod.GET)
    public void Notificar(){
    	usuarioService.listNotificar();
    }
    /*Actualizar usuarios*/
    @RequestMapping(value = "/api/lp3/admin/Actualizar-Administrador", method = RequestMethod.PUT)
    public void actualizarAdmin(@RequestBody Admin user) {
    	usuarioService.saveAdmin(user);
    }
    @RequestMapping(value = "/api/lp3/admin/Actualizar-Brainstormer", method = RequestMethod.PUT)
    public void actualizarBrainstormer(@RequestBody Brainstormer user) {
    	usuarioService.saveBrainstormer(user);
    }
    @RequestMapping(value = "/api/lp3/admin/Actualizar-Implementador", method = RequestMethod.PUT)
    public void actualizarImplementador(@RequestBody Implementador user) {
    	usuarioService.saveImplementador(user);
    }
    @RequestMapping(value = "/api/lp3/admin/Actualizar-Angel-Investor", method = RequestMethod.PUT)
    public void actualizarAngelInvestor(@RequestBody AngelInvestor user) {
    	usuarioService.saveAngelInvestor(user);
    }
    @RequestMapping(value = "/api/lp3/admin/Actualizar-Sponsor", method = RequestMethod.PUT)
    public void actualizarSponsor(@RequestBody Sponsor user) {
    	usuarioService.saveSponsor(user);
    }
    @RequestMapping(value = "/api/lp3/admin/Actualizar-Organizacion", method = RequestMethod.PUT)
    public void actualizarSponsor(@RequestBody Organizacion user) {
    	usuarioService.saveOrganizacion(user);
    }
}

