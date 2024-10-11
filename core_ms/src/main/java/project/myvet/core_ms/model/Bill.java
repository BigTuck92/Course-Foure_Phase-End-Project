package project.myvet.core_ms.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Bill {

	// Fields
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	private Integer ownerId;
	private Double visitRate;
	private Integer numberPets;
	private Double totalBill;
	
	// Constructors
	public Bill() {
		super();
	}

	public Bill(Integer id, Integer ownerId, Double visitRate, Integer numberPets, Double totalBill) {
		super();
		this.id = id;
		this.ownerId = ownerId;
		this.visitRate = visitRate;
		this.numberPets = numberPets;
		this.totalBill = totalBill;
	}

	// Getters and Setters
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getOwnerId() {
		return ownerId;
	}

	public void setOwnerId(Integer ownerId) {
		this.ownerId = ownerId;
	}

	public Double getVisitRate() {
		return visitRate;
	}

	public void setVisitRate(Double visitRate) {
		this.visitRate = visitRate;
	}

	public Integer getNumberPets() {
		return numberPets;
	}

	public void setNumberPets(Integer numberPets) {
		this.numberPets = numberPets;
	}

	public Double getTotalBill() {
		return totalBill;
	}

	public void setTotalBill(Double totalBill) {
		this.totalBill = totalBill;
	}

	@Override
	public String toString() {
		return "Bill [id=" + id + ", ownerId=" + ownerId + ", visitRate=" + visitRate + ", numberPets=" + numberPets
				+ ", totalBill=" + totalBill + "]";
	}
	
	
}
