package project.myvet.core_ms.service;

import java.util.List;
import java.util.Optional;

import project.myvet.core_ms.model.Owner;

public interface OwnerService {

	Owner saveOwner(Owner owner);
	Optional<Owner> getOwnerById(Integer id);
	List<Owner> getAllOwners();
	void deleteOwner(Integer id);
	
}
