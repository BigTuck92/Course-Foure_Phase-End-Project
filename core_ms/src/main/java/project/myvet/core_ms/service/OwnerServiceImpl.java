package project.myvet.core_ms.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import project.myvet.core_ms.dao.OwnerRepository;
import project.myvet.core_ms.model.Owner;

public class OwnerServiceImpl implements OwnerService {

	// Fields
	@Autowired
	private OwnerRepository ownerRepo;
	
	@Override
	public Owner saveOwner(Owner owner) {
		// TODO Auto-generated method stub
		return ownerRepo.save(owner);
	}

	@Override
	public Optional<Owner> getOwnerById(Integer id) {
		// TODO Auto-generated method stub
		return ownerRepo.findById(id);
	}

	@Override
	public List<Owner> getAllOwners() {
		// TODO Auto-generated method stub
		return new ArrayList<Owner>((Collection<? extends Owner>) ownerRepo.findAll());
	}

	@Override
	public void deleteOwner(Integer id) {
		// TODO Auto-generated method stub
		ownerRepo.deleteById(id);
	}

	
	
}
