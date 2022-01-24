package py.edu.uc.lp3.repository;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import py.edu.uc.lp3.users.Organizacion;

@Repository
public interface OrganizacionRepository extends PagingAndSortingRepository<Organizacion, Long> {
	List<Organizacion> findAll();
}
