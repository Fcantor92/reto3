package com.usa.cabanasApp.repository.crudrepository;

import com.usa.cabanasApp.entities.Category;
import org.springframework.data.repository.CrudRepository;

public interface CategoryCrudRepository extends CrudRepository<Category, Integer> {
}
