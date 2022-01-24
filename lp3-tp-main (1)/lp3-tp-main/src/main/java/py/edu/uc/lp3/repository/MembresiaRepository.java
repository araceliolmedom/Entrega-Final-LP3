package py.edu.uc.lp3.repository;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import py.edu.uc.lp3.content.Membresia;
import py.edu.uc.lp3.users.Usuario;

@Repository
public interface MembresiaRepository extends PagingAndSortingRepository<Membresia, Long> {


}
