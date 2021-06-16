package es.mde.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import es.mde.entidades.ReservaConId;
import es.mde.entidades.SalaConId;
import es.mde.entidades.SesionConId;

@RepositoryRestResource(path = "salas", itemResourceRel = "sala", collectionResourceRel = "salas")

public interface SalaDAO extends  JpaRepository<SalaConId,Long> {

}
