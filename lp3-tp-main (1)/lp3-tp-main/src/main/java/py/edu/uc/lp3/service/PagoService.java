package py.edu.uc.lp3.service;

import java.util.List;

import org.springframework.stereotype.Service;

import py.edu.uc.lp3.content.Pago;
@Service
public interface PagoService {
	List<Pago> listAll();
	void delete(long id);
	void savepago(Pago pago);
	void saveMembresia(Pago pago);

}
