package py.edu.uc.lp3.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import py.edu.uc.lp3.content.Pago;
@Repository
public interface PagoRepository extends PagingAndSortingRepository<Pago, Long> {

}
