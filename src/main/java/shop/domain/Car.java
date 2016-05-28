package shop.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Car {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY) 
	private Long id;
	
	//private CarCategory carCategory;//�������� + �����������
	
	@Column(name = "car_Price")
	private int carPrice;//����
	
	@Column(name = "car_Year")
	private int carYear;//�� ������
	
	@Column(name = "horse_Power")
	private int horsePower;//���������
	
	@Column(name = "mileage")
	private int mileage;//�����
	
	@Column(name = "engine")
	private double engine;//��� �������
	
	@Column(name = "fuel_Consumption_City")
	private double fuelConsumptionCity;//������ ������ ����
	
	@Column(name = "fuel_Consumption_Highway")
	private double fuelConsumptionHighway;//������ ������ �����
	
	@Column(name = "fuel_Consumption_Avarage")
	private double fuelConsumptionAvarage;//������ ������ �������
	
	@Column(name = "credit")
	private boolean credit;//� ������
	
	@Column(name = "defective")
	private boolean defective;//�� �� ����
	
	//�����
	@ManyToOne
	@JoinColumn
	private CarCategory carCategory; // ������� ��������-����-����-���
	
	@ManyToOne
	@JoinColumn
	private CarBrand carBrand; // ����� ���� + �������
	
	@ManyToOne
	@JoinColumn
	private CarTypeOfDrive carTypeOfDrive;//����� (�����/���/������)
	
	@ManyToOne
	@JoinColumn
	private CarGearBox carGearBox;// ������� �������
	
	@ManyToOne
	@JoinColumn
	private CarFuel carFuel;//��� ������
	
	@ManyToOne
	@JoinColumn
	private CarColor carColor;//����
	
	@ManyToOne
	@JoinColumn
	private CarNumberOfSeats carNumberOfSeats;//�-��� ����
	
	@ManyToOne
	@JoinColumn
	private CarNumberOfDoor carNumberOfDoor;//�-��� �����

	public Car() {

	}
	
	public Car(int carPrice, int carYear, int horsePower, int mileage, double engine,
			double fuelConsumptionCity, double fuelConsumptionHighway, double fuelConsumptionAvarage,
			boolean isCredit, boolean defective) {
		this.carPrice = carPrice;
		this.carYear = carYear;
		this.horsePower = horsePower;
		this.mileage = mileage;
		this.engine = engine;
		this.fuelConsumptionCity = fuelConsumptionCity;
		this.fuelConsumptionHighway = fuelConsumptionHighway;
		this.fuelConsumptionAvarage = fuelConsumptionAvarage;
		this.credit = isCredit;
		this.defective = defective;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public int getCarPrice() {
		return carPrice;
	}
	public void setCarPrice(int carPrice) {
		this.carPrice = carPrice;
	}
	public int getCarYear() {
		return carYear;
	}
	public void setCarYear(int carYear) {
		this.carYear = carYear;
	}
	public int getHorsePower() {
		return horsePower;
	}
	public void setHorsePower(int horsePower) {
		this.horsePower = horsePower;
	}
	public int getMileage() {
		return mileage;
	}
	public void setMileage(int mileage) {
		this.mileage = mileage;
	}
	public double getEngine() {
		return engine;
	}
	public void setEngine(double engine) {
		this.engine = engine;
	}

	public double getFuelConsumptionCity() {
		return fuelConsumptionCity;
	}
	public void setFuelConsumptionCity(double fuelConsumptionCity) {
		this.fuelConsumptionCity = fuelConsumptionCity;
	}
	public double getFuelConsumptionHighway() {
		return fuelConsumptionHighway;
	}
	public void setFuelConsumptionHighway(double fuelConsumptionHighway) {
		this.fuelConsumptionHighway = fuelConsumptionHighway;
	}
	public double getFuelConsumptionAvarage() {
		return fuelConsumptionAvarage;
	}
	public void setFuelConsumptionAvarage(double fuelConsumptionAvarage) {
		this.fuelConsumptionAvarage = fuelConsumptionAvarage;
	}
	

	public boolean isCredit() {
		return credit;
	}
	public void setCredit(boolean credit) {
		this.credit = credit;
	}
	public boolean isDefective() {
		return defective;
	}
	public void setDefective(boolean defective) {
		this.defective = defective;
	}
	public CarBrand getCarBrand() {
		return carBrand;
	}
	public void setCarBrand(CarBrand carBrand) {
		this.carBrand = carBrand;
	}
	public CarTypeOfDrive getCarTypeOfDrive() {
		return carTypeOfDrive;
	}
	public void setCarTypeOfDrive(CarTypeOfDrive carTypeOfDrive) {
		this.carTypeOfDrive = carTypeOfDrive;
	}
	public CarGearBox getCarGearBox() {
		return carGearBox;
	}
	public void setCarGearBox(CarGearBox carGearBox) {
		this.carGearBox = carGearBox;
	}
	public CarFuel getCarFuel() {
		return carFuel;
	}
	public void setCarFuel(CarFuel carFuel) {
		this.carFuel = carFuel;
	}
	public CarColor getCarColor() {
		return carColor;
	}
	public void setCarColor(CarColor carColor) {
		this.carColor = carColor;
	}
	public CarNumberOfSeats getCarNumberOfSeats() {
		return carNumberOfSeats;
	}
	public void setCarNumberOfSeats(CarNumberOfSeats carNumberOfSeats) {
		this.carNumberOfSeats = carNumberOfSeats;
	}
	public CarNumberOfDoor getCarNumberOfDoor() {
		return carNumberOfDoor;
	}
	public void setCarNumberOfDoor(CarNumberOfDoor carNumberOfDoor) {
		this.carNumberOfDoor = carNumberOfDoor;
	}
	@Override
	public String toString() {
		return "Car [id=" + id 
				+ ", carPrice=" + carPrice 
				+ ", carYear=" + carYear 
				+ ", horsePower=" + horsePower
				+ ", mileage=" + mileage 
				+ ", engine=" + engine 
				+ ", fuelConsumptionCity=" + fuelConsumptionCity 
				+ ", fuelConsumptionHighway=" + fuelConsumptionHighway 
				+ ", fuelConsumptionAvarage=" + fuelConsumptionAvarage 
				+ ", isCredit=" + credit 
				+ ", defective=" + defective 
				+ ", carBrand=" + carBrand 
				+ ", carTypeOfDrive=" + carTypeOfDrive 
				+ ", carGearBox=" + carGearBox 
				+ ", carFuel=" + carFuel 
				+ ", carColor=" + carColor
				+ ", carNumberOfSeats=" + carNumberOfSeats 
				+ ", carNumberOfDoor=" + carNumberOfDoor + "]";
	}

	
}
