package es.mde.entidades;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import es.mde.Tickets.comun.Sala;
import es.mde.Tickets.comun.Sesion;



@Entity
public class SesionConId extends Sesion {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(unique = true)
	private long id;
	
	@OneToMany(cascade = CascadeType.ALL, targetEntity = ReservaConId.class, mappedBy = "sesion")
	private List<ReservaConId> reservas;
	
	@Override
	@ManyToOne(fetch = FetchType.LAZY, targetEntity = SalaConId.class)
	@JoinColumn(name = "sala")
	public Sala getSala() {
		return super.getSala();
	}
	
	public SesionConId() {
		super();
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public List<ReservaConId> getReservas() {
		return reservas;
	}
	
	

	public void addReserva(ReservaConId reserva) {
		this.reservas.add(reserva);
		reserva.setSesion(this);
	}
	
}
