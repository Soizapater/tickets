package es.mde.entidades;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import es.mde.Tickets.comun.Fila;
import es.mde.Tickets.comun.Sala;



@Entity
public class SalaConId extends Sala {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(unique = true)
	private long id;
	
	@OneToMany(cascade = CascadeType.ALL, targetEntity = SesionConId.class, mappedBy = "sala")
	private List<SesionConId> sesiones;

	@Override
	@OneToMany(cascade = CascadeType.ALL, targetEntity = FilaConId.class, mappedBy = "sala")
	public List<Fila> getFilas() {
		return super.getFilas();
	}

	public SalaConId() {
		super();
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public List<SesionConId> getSesiones() {
		return sesiones;
	}

	public void addSesion(SesionConId sesion) {
		this.sesiones.add(sesion);
		sesion.setSala(this);
	}
}
