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

@Entity
public class CarGearBox {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY) 
	private int id;
	@Column(name = "type")
	private String type;
	
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "carGearBox")
	private List<Car> cars;

	public CarGearBox() {
		
	}
	public CarGearBox(String type) {
		this.type = type;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public List<Car> getCars() {
		return cars;
	}
	public void setCars(List<Car> cars) {
		this.cars = cars;
	}
	@Override
	public String toString() {
		return "CarGearBox [id=" + id + ", type=" + type + ", cars=" + cars + "]";
	}

}
