package es.mde.entidades;

import java.util.Collection;
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

import es.mde.Tickets.comun.Butaca;
import es.mde.Tickets.comun.ReservaImpl;
import es.mde.Tickets.comun.Sesion;



@Entity
public class ReservaConId extends ReservaImpl{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(unique = true)
	private long id;
	private int edad;
	
	@ManyToOne(fetch = FetchType.LAZY)
	private SesionConId sesion;
	
	@Override
	@ManyToOne(fetch = FetchType.LAZY, targetEntity = ButacaConId.class)
	public Butaca getButaca() {
		return super.getButacas();
	}
	
	@Override
	@ManyToOne(fetch = FetchType.LAZY, targetEntity = SesionConId.class)
	@JoinColumn(name = "id_sesion")
	public Sesion getSesion() {
		return super.getSesion();
	}
	public ReservaConId() {
		super();
	}


	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	
}
