package es.mde.rest;

import java.util.List;

import org.springframework.data.rest.webmvc.PersistentEntityResource;
import org.springframework.data.rest.webmvc.PersistentEntityResourceAssembler;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.hateoas.CollectionModel;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import es.mde.entidades.ReservaConId;
import es.mde.repositorios.ReservaDAO;

@RepositoryRestController
@RequestMapping(path = "/reservas")
public class ReservaController {
	ReservaDAO reservaDAO;

	public ReservaController() {
		super();
	}
	
	@PostMapping("/comprar")
	@ResponseBody
	public CollectionModel<PersistentEntityResource> comprarEntradas(@RequestBody List<ReservaConId> reservas,
			PersistentEntityResourceAssembler assembler) {
		List<ReservaConId> reservasGuardadasConIds = reservaDAO.crearReservaNinho(reservas);
		return assembler.toCollectionModel(reservasGuardadasConIds);
	}
		
}
