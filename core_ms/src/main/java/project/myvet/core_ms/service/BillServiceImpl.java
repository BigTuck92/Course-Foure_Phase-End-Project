package project.myvet.core_ms.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import project.myvet.core_ms.dao.BillRepository;
import project.myvet.core_ms.model.Bill;

@Service
public class BillServiceImpl implements BillService {

	// Fields
	@Autowired
	private BillRepository billRepo;
	
	@Override
	public Bill saveBill(Bill bill) {
		// TODO Auto-generated method stub
		return billRepo.save(bill);
	}

	@Override
	public Optional<Bill> getBillById(Integer id) {
		// TODO Auto-generated method stub
		return billRepo.findById(id);
	}

	@Override
	public List<Bill> getAllBills() {
		// TODO Auto-generated method stub
		return new ArrayList<Bill>((Collection<? extends Bill>) billRepo.findAll());
	}

	@Override
	public void deleteBill(Integer id) {
		// TODO Auto-generated method stub
		billRepo.deleteById(id);
	}
	
}
