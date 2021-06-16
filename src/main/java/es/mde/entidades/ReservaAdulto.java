package es.mde.entidades;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

public class ReservaAdulto extends ReservaConId {
	@OneToMany(cascade = CascadeType.ALL, targetEntity = ReservaNinho.class, mappedBy = "reservaAdulto")

	private List<ReservaNinho> reservaNinhos;

	
	public ReservaAdulto() {
		super();
	}


	public List<ReservaNinho> getReservaNinhos() {
		return reservaNinhos;
	}


	public void setReservaNinhos(List<ReservaNinho> reservaNinhos) {
		this.reservaNinhos = reservaNinhos;
	}

	public void addNinho(ReservaNinho reservaNinho) {
		this.getReservaNinhos().add(reservaNinho);
		reservaNinho.setReservaAdulto(this);
	}
	
	
}
