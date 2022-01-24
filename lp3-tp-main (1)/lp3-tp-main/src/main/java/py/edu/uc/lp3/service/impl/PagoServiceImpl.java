package py.edu.uc.lp3.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import py.edu.uc.lp3.content.Membresia;
import py.edu.uc.lp3.content.Pago;
import py.edu.uc.lp3.repository.MembresiaRepository;
import py.edu.uc.lp3.repository.PagoRepository;
import py.edu.uc.lp3.service.PagoService;
@Service

public class PagoServiceImpl implements PagoService{
	@Autowired
	private PagoRepository pagoRepository;
	@Autowired
	MembresiaRepository membresiaRepository;
	@Override
	public List<Pago> listAll() {
		List<Pago> pagos = new ArrayList<>();
		Iterator<Pago> pagosIterator = pagoRepository.findAll().iterator();
		while (pagosIterator.hasNext()) {
			pagos.add(pagosIterator.next());
		}
		return pagos;
	}
	@Override
	public void delete(long id) {
		pagoRepository.deleteById(id);
	}
	@Override
	public void savepago(Pago pago) {
		// TODO Auto-generated method stub
			pagoRepository.save(pago);
			
		
	}
	@Override
	public void saveMembresia(Pago pago) {
		 Date fecha = new Date();
		 Membresia 	miMembresia = new Membresia();
		 miMembresia.setUsuarioMembresia(pago.getUsuario());
		 miMembresia.setFechaInicio(fecha);
		 miMembresia.setFechaVencimiento(miMembresia.sumarDias(fecha,30));
		 membresiaRepository.save(miMembresia);
	}

}
