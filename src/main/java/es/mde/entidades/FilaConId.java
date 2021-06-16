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

import es.mde.Tickets.comun.Butaca;
import es.mde.Tickets.comun.Fila;




@Entity
public class FilaConId extends Fila{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(unique = true)
	private long id;
	
	@ManyToOne(fetch = FetchType.LAZY)
	private SalaConId sala;
	
	@Override
	@OneToMany( targetEntity = ButacaConId.class)
	public List<Butaca> getButacas() {
		return super.getButacas();
	}
	
	public FilaConId() {
		super();
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	
	
	public SalaConId getSala() {
		return sala;
	}
	
	
	public void setSala(SalaConId sala) {
		this.sala = sala;
	}
	public void addButaca(ButacaConId butaca) {
		this.getButacas().add(butaca);
		butaca.setFila(this);
	}
}
