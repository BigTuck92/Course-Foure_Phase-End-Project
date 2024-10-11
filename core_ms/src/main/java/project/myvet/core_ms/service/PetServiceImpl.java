package project.myvet.core_ms.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Optional;

import project.myvet.core_ms.dao.PetRepository;
import project.myvet.core_ms.model.Pet;

public class PetServiceImpl implements PetService {

	// Fields
	private PetRepository petRepo;
	
	@Override
	public Pet savePet(Pet pet) {
		// TODO Auto-generated method stub
		return petRepo.save(pet);
	}

	@Override
	public Optional<Pet> getPetById(Integer id) {
		// TODO Auto-generated method stub
		return petRepo.findById(id);
	}

	@Override
	public List<Pet> getAllPets() {
		// TODO Auto-generated method stub
		return new ArrayList<Pet>((Collection<? extends Pet>) petRepo.findAll());
	}

	@Override
	public void deletePet(Integer id) {
		// TODO Auto-generated method stub
		petRepo.deleteById(id);
	}

}
