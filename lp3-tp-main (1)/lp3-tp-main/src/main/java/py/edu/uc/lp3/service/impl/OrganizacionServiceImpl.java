package py.edu.uc.lp3.service.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import py.edu.uc.lp3.repository.OrganizacionRepository;
import py.edu.uc.lp3.service.OrganizacionService;
import py.edu.uc.lp3.users.Organizacion;
@Service

public class OrganizacionServiceImpl implements OrganizacionService {
	@Autowired
	private OrganizacionRepository organizacionRepository;
	@Override
	public List<Organizacion> listAll() {
		List<Organizacion> organizaciones = new ArrayList<>();
		Iterator<Organizacion> organizacionesIterator = organizacionRepository.findAll().iterator();
		while (organizacionesIterator.hasNext()) {
			organizaciones.add(organizacionesIterator.next());
		}
		return organizaciones;
	}
	@Override
	public List<Organizacion> listByGenero(String tipoOrganizacion) {
		List<Organizacion> organizaciones = new ArrayList<>();
		Iterator<Organizacion> organizacionesIterator = organizacionRepository.findAll().iterator();
		Organizacion organizacion = null;
		while (organizacionesIterator.hasNext()) {
			organizacion = organizacionesIterator.next();
			if (tipoOrganizacion.equals(organizacion.gettipoOrganizacion()) ){
				organizaciones.add(organizacion);
			}
		}
		return organizaciones;
	}
	
}
