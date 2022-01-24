package py.edu.uc.lp3.service;

import java.util.List;

import org.springframework.stereotype.Service;

import py.edu.uc.lp3.users.Organizacion;
@Service

public interface OrganizacionService {
	List<Organizacion> listAll();
	List<Organizacion> listByGenero(String tipoOrganizacion);

}
