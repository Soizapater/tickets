package es.mde.repositorios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import es.mde.entidades.ReservaAdulto;
import es.mde.entidades.ReservaConId;
import es.mde.entidades.ReservaNinho;

public class ReservaDAOImpl implements ReservaDAOCustom {
	@Autowired
	ReservaDAO reservaDAO;

	@Override
	public List<ReservaConId> crearReservaNinho(List<ReservaConId> reservas) {
//		reservas.stream().filter(reserva -> reserva.getEdad() <= 12 ).findAny();No se que cojones es un optional
		boolean menor = false;
		boolean adulto = false;
		ReservaNinho reservaNinho = null;
		for (ReservaConId reservaConId : reservas) {
			if(reservaConId.getEdad() <= 12 ) {
				menor = true;
				reservaNinho = (ReservaNinho) reservaConId;
				break;
			}
		}
		if (menor) {
			for (ReservaConId reservaConId : reservas) {
				if (reservaConId.getEdad() > 12) {
					ReservaAdulto reservaAdulto = (ReservaAdulto) reservaConId;
					reservaAdulto.addNinho(reservaNinho);
					adulto = true;
					break;
				}
			}
		}
		if (adulto || ! menor) {
			return reservaDAO.saveAll(reservas);
		}
		return null;
	}

}
