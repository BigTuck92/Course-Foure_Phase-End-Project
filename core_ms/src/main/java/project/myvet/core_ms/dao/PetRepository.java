package project.myvet.core_ms.dao;

import org.springframework.data.repository.CrudRepository;

import project.myvet.core_ms.model.Pet;

public interface PetRepository extends CrudRepository<Pet, Integer> {

}
