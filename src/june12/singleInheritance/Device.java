package june12.singleInheritance;

public class Device {
	private String brand;
    private String model;
    private boolean powerStatus;

    public Device(String brand, String model) {
        this.brand = brand;
        this.model = model;
        this.powerStatus = false;
    }

    public String displayInfo() {
        return "Brand: " + brand + ", Model: " + model;
    }

    public String powerOn() {
        this.powerStatus = true;
        return "Device powered on.";
    }

    public String powerOff() {
        this.powerStatus = false;
        return "Device powered off.";
    }
}
