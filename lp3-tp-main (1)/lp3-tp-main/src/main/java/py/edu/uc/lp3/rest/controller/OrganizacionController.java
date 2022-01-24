package py.edu.uc.lp3.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import py.edu.uc.lp3.service.OrganizacionService;
import py.edu.uc.lp3.users.Organizacion;

@RestController
public class OrganizacionController {
	
	@Autowired
	private OrganizacionService organizacionService;
	/*Listar todos los Organizaciones*/
	@RequestMapping(value = "/api/lp3/admin/Organizacion", method = RequestMethod.GET)
    public List<Organizacion> list(){
        return organizacionService.listAll();
    }
	/*Listar por */
	@RequestMapping(value = "/api/lp3/admin/Organizacion/{tipoOrganizacion}", method = RequestMethod.GET)
    public List<Organizacion> listGenero(@PathVariable("tipoOrganizacion") String tipoOrganizacion) {
        return organizacionService.listByGenero(tipoOrganizacion);
    }
}
