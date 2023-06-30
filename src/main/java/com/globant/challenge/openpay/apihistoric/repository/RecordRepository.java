package com.globant.challenge.openpay.apihistoric.repository;

import com.globant.challenge.openpay.apihistoric.model.RecordEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * Defines the methods to access by REST.
 * @author luis.delcampo
 */
@RepositoryRestResource(path="records")
public interface RecordRepository extends CrudRepository<RecordEntity, Long> {

}
