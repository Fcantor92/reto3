package com.usa.cabanasApp.repository.crudrepository;


import com.usa.cabanasApp.entities.Client;
import org.springframework.data.repository.CrudRepository;

public interface ClientCrudRepository extends CrudRepository<Client, Integer> {
}
