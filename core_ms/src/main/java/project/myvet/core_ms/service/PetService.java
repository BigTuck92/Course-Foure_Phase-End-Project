package project.myvet.core_ms.service;

import java.util.List;
import java.util.Optional;

import project.myvet.core_ms.model.Pet;

public interface PetService {

	Pet savePet(Pet pet);
	Optional<Pet> getPetById(Integer id);
	List<Pet> getAllPets();
	void deletePet(Integer id);
	
}
