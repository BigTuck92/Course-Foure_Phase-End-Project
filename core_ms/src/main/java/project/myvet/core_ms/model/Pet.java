package project.myvet.core_ms.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Pet {

	// Fields
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	private Integer ownerId;
	private String name;
	private String animalType;
	private String animalBreed;
	
	// Constructors
	public Pet() {
		super();
	}

	public Pet(Integer id, Integer ownerId, String name, String animalType, String animalBreed) {
		super();
		this.id = id;
		this.ownerId = ownerId;
		this.name = name;
		this.animalType = animalType;
		this.animalBreed = animalBreed;
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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAnimalType() {
		return animalType;
	}

	public void setAnimalType(String animalType) {
		this.animalType = animalType;
	}

	public String getAnimalBreed() {
		return animalBreed;
	}

	public void setAnimalBreed(String animalBreed) {
		this.animalBreed = animalBreed;
	}

	@Override
	public String toString() {
		return "Pet [id=" + id + ", ownerId=" + ownerId + ", name=" + name + ", animalType=" + animalType
				+ ", animalBreed=" + animalBreed + "]";
	}
	
	
	
}
