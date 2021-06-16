package es.mde.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import es.mde.entidades.ButacaConId;
import es.mde.entidades.ReservaConId;
import es.mde.entidades.SesionConId;

@RepositoryRestResource(path = "butacas", itemResourceRel = "butaca", collectionResourceRel = "butacas")

public interface ButacaConIdDAO extends  JpaRepository<ButacaConId,Long> {

}
