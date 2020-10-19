package ua.academy.lgs2;

public class SteeringWheel {
	private int wheelDiameter;
	private String steeringWheelMaterial;

	public SteeringWheel(int wheelDiameter, String steeringWheelMaterial) {
		this.wheelDiameter = wheelDiameter;
		this.steeringWheelMaterial = steeringWheelMaterial;
	}

	public int getWheelDiameter() {
		return wheelDiameter;
	}

	public void setWheelDiameter(int wheelDiameter) {
		this.wheelDiameter = wheelDiameter;
	}

	public String getSteeringWheelMaterial() {
		return steeringWheelMaterial;
	}

	public void setSteeringWheelMaterial(String steeringWheelMaterial) {
		this.steeringWheelMaterial = steeringWheelMaterial;
	}
}
