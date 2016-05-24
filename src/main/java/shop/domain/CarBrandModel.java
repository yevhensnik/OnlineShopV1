package shop.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class CarBrandModel {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY) 
	private int id;
	@Column(name = "name")
	private String name;
	
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn
	private CarBrand carBrand;

	
	public CarBrandModel() {
	
	}
	
	public CarBrandModel(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public CarBrand getCarBrand() {
		return carBrand;
	}

	public void setCarBrand(CarBrand carBrand) {
		this.carBrand = carBrand;
	}

	@Override
	public String toString() {
		return "CarBrandModel [id=" + id + ", name=" + name + ", carBrand=" + carBrand + "]";
	}
	
	
	
	
}
