package com.usa.cabanasApp.repository.crudrepository;

import com.usa.cabanasApp.entities.Reservation;
import org.springframework.data.repository.CrudRepository;

public interface ReservationCrudRepository extends CrudRepository<Reservation, Integer> {
}
