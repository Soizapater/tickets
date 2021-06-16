package es.mde.entidades;

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

import es.mde.Tickets.comun.Butaca;
import es.mde.Tickets.comun.Fila;


@Entity
public class ButacaConId extends Butaca {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(unique = true, name = "ID_BUTACA")
	private long id;
	@ManyToOne(cascade = CascadeType.ALL, targetEntity = ReservaConId.class)
	@JoinColumn(name = "id_reserva")
	private ReservaConId reserva;


	public ButacaConId() {
		super();
	}

	@Override
	@ManyToOne(targetEntity = FilaConId.class)
	public Fila getFila() {
		return super.getFila();
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

}
