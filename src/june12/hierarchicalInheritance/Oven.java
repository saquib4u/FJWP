package june12.hierarchicalInheritance;

public class Oven extends Appliance{
	private int maxTemperature;
    private int temperature;

    public Oven(String brand, int powerConsumption, int maxTemperature) {
        super(brand, powerConsumption);
        this.maxTemperature = maxTemperature;
        this.temperature = 0;
    }

    public void setTemperature(int temperature) {
        if (temperature <= maxTemperature) {
            this.temperature = temperature;
        } else {
            System.out.println("Temperature exceeds max limit!");
        }
    }

    public String displayTemperature() {
        return "Oven temperature: " + temperature + "°C";
    }

    public String displayOvenInfo() {
        return displayApplianceInfo() + ", Max Temperature: " + maxTemperature + "°C";
    }
    
    public static void main(String[] args) {
        
        Refrigerator fridge = new Refrigerator("Samsung", 150, 350);

        
        System.out.println(fridge.displayApplianceInfo());  
        System.out.println(fridge.turnOn());  
        System.out.println(fridge.displayRefrigeratorInfo());  
        fridge.setTemperature(5);  
        System.out.println(fridge.displayTemperature());  
        System.out.println(fridge.turnOff());  

        System.out.println();

        Oven oven = new Oven("LG", 2000, 250);

        System.out.println(oven.displayApplianceInfo()); 
        System.out.println(oven.turnOn());  
        System.out.println(oven.displayOvenInfo());  
        oven.setTemperature(180);  
        System.out.println(oven.displayTemperature());  
        oven.setTemperature(300);  
        System.out.println(oven.turnOff());  
    }
}
