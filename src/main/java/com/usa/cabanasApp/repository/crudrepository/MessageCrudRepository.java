package com.usa.cabanasApp.repository.crudrepository;

import com.usa.cabanasApp.entities.Message;
import org.springframework.data.repository.CrudRepository;

public interface MessageCrudRepository extends CrudRepository<Message, Integer> {
}
