package project.myvet.core_ms.service;

import java.util.List;
import java.util.Optional;

import project.myvet.core_ms.model.Bill;

public interface BillService {

	Bill saveBill(Bill bill);
	Optional<Bill> getBillById(Integer id);
	List<Bill> getAllBills();
	void deleteBill(Integer id);
	
}
