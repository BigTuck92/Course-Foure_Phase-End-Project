package project.myvet.core_ms.dao;

import org.springframework.data.repository.CrudRepository;

import project.myvet.core_ms.model.Bill;

public interface BillRepository extends CrudRepository<Bill, Integer> {

}
