package shop.domain;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class CarBrand {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY) 
	private int id;
	@Column(name = "name")
	private String name;
	
	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "carBrand")
	private CarBrandModel carBrandModel;
	
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "carBrand")
	private List<Car> cars;

	
	public CarBrand() {
		
	}
	
	public CarBrand(String name) {
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

	public CarBrandModel getCarBrandModel() {
		return carBrandModel;
	}

	public void setCarBrandModel(CarBrandModel carBrandModel) {
		this.carBrandModel = carBrandModel;
	}

	public List<Car> getCars() {
		return cars;
	}

	public void setCars(List<Car> cars) {
		this.cars = cars;
	}

	@Override
	public String toString() {
		return "CarBrand [id=" + id + ", name=" + name + ", carBrandModel=" + carBrandModel + ", cars=" + cars + "]";
	}
	
}
