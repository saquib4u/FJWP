package june12.hierarchicalInheritance;

public class Appliance {
	private String brand;
    private int powerConsumption;
    private boolean status;

    public Appliance(String brand, int powerConsumption) {
        this.brand = brand;
        this.powerConsumption = powerConsumption;
        this.status = false;
    }

    public String displayApplianceInfo() {
        return "Brand: " + brand + ", Power Consumption: " + powerConsumption + "W";
    }

    public String turnOn() {
        this.status = true;
        return "Appliance turned on.";
    }

    public String turnOff() {
        this.status = false;
        return "Appliance turned off.";
    }
}
