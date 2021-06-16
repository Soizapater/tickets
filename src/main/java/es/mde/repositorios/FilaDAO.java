package es.mde.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import es.mde.entidades.FilaConId;
import es.mde.entidades.ReservaConId;
import es.mde.entidades.SesionConId;

@RepositoryRestResource(path = "filas", itemResourceRel = "fila", collectionResourceRel = "filas")

public interface FilaDAO extends  JpaRepository<FilaConId,Long> {

}
