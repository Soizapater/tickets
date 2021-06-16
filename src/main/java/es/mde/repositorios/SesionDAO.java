package es.mde.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import es.mde.entidades.ReservaConId;
import es.mde.entidades.SesionConId;

@RepositoryRestResource(path = "sesiones", itemResourceRel = "sesion", collectionResourceRel = "sesiones")

public interface SesionDAO extends  JpaRepository<SesionConId,Long> {

}
