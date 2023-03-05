package com.restapi_crud.training_api.repositories;
import com.restapi_crud.training_api.models.Contato;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "training_api", path = "training_api")
public interface RepoContato extends JpaRepository<Contato, Long> {
    
}
