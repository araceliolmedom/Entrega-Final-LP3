package py.edu.uc.lp3.rest.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import py.edu.uc.lp3.content.Membresia;
import py.edu.uc.lp3.content.Pago;
import py.edu.uc.lp3.repository.MembresiaRepository;
import py.edu.uc.lp3.service.PagoService;
@RestController
public class PagoController {
	@Autowired
	/*Listar todos los pagos*/
	PagoService pagoService;
	@RequestMapping(value = "/api/lp3/pago", method = RequestMethod.GET)
    public List<Pago> list(){
		
        return pagoService.listAll();
    }
	/*Guardar un pago*/
	 @RequestMapping(value = "/api/lp3/pagos", method = RequestMethod.POST)
	    public void add(@RequestBody Pago pago){
		 
		 pagoService.savepago(pago);
		 /* Cada vez que se realiza un pago mapeamos los datos necesarios para crear la membresia*/
		 pagoService.saveMembresia(pago);
	    }
	 /*Eliminar un pago*/
	@RequestMapping(value = "/api/lp3/pagos/eliminar/{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable("id") int id) {
    	pagoService.delete(id);
    }
}
