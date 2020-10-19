package ua.academy.lgs2;

public class Car {
	private int horsepower;
	private int yearOfProduction;

	public Car(int horsepower, int yearOfProduction) {
		this.horsepower = horsepower;
		this.yearOfProduction = yearOfProduction;
	}

	public int getHorsepower() {
		return horsepower;
	}

	public void setHorsepower(int horsepower) {
		this.horsepower = horsepower;
	}

	@Override
	public String toString() {
		return "Car with " + horsepower + " horsepower and produced in " + yearOfProduction;
	}

	public int getYearOfProduction() {
		return yearOfProduction;
	}

	public void setYearOfProduction(int yearOfProduction) {
		this.yearOfProduction = yearOfProduction;
	}
}
