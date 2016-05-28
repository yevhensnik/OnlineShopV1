package shop.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class CarSubCategory {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "name")
	private String name;
	
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn
	private CarCategory carCategory;

	public CarSubCategory() {
	
	}
	
	public CarSubCategory(String name) {
		this.name = name;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public CarCategory getCarCategory() {
		return carCategory;
	}

	public void setCarCategory(CarCategory carCategory) {
		this.carCategory = carCategory;
	}

	@Override
	public String toString() {
		return "CarSubCategory [id=" + id + ", name=" + name + ", carCategory=" + carCategory + "]";
	}

}
