package es.mde.repositorios;

import java.util.List;

import es.mde.entidades.ReservaConId;

public interface ReservaDAOCustom {

	List<ReservaConId> crearReservaNinho(List<ReservaConId> reservas);
}
