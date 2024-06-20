package june12.hierarchicalInheritance;

public class Refrigerator extends Appliance{
	private int capacity;
    private int temperature;

    public Refrigerator(String brand, int powerConsumption, int capacity) {
        super(brand, powerConsumption);
        this.capacity = capacity;
        this.temperature = 4;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public String displayTemperature() {
        return "Refrigerator temperature: " + temperature + "°C";
    }

    public String displayRefrigeratorInfo() {
        return displayApplianceInfo() + ", Capacity: " + capacity + " liters";
    }
}
