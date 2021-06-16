package es.mde.entidades;

import javax.persistence.CascadeType;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

public class ReservaNinho extends ReservaConId {
	@ManyToOne(fetch = FetchType.LAZY)

	private ReservaAdulto reservaAdulto;

	
	public ReservaNinho() {
		super();
	}


	public ReservaAdulto getReservaAdulto() {
		return reservaAdulto;
	}


	public void setReservaAdulto(ReservaAdulto reservaAdulto) {
		this.reservaAdulto = reservaAdulto;
	}


	
}
