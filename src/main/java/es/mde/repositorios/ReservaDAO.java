package es.mde.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import es.mde.entidades.ReservaConId;

@RepositoryRestResource(path = "reservas", itemResourceRel = "reserva", collectionResourceRel = "reservas")

public interface ReservaDAO extends  JpaRepository<ReservaConId,Long>,ReservaDAOCustom {

}
