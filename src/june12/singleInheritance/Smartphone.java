package june12.singleInheritance;

public class Smartphone extends Device{
	private String operatingSystem;
    private int cameraResolution;

    public Smartphone(String brand, String model, String operatingSystem, int cameraResolution) {
        super(brand, model);
        this.operatingSystem = operatingSystem;
        this.cameraResolution = cameraResolution;
    }

    public String displaySmartphoneInfo() {
        return displayInfo() + ", OS: " + operatingSystem + ", Camera: " + cameraResolution + "MP";
    }

    public String takePhoto() {
        return "Photo taken with " + cameraResolution + "MP camera.";
    }
    
       public static void main(String[] args) {
            
            Smartphone mySmartphone = new Smartphone("Apple", "iPhone 13", "iOS", 12);
            System.out.println(mySmartphone.displayInfo());  
            System.out.println(mySmartphone.powerOn());  
            System.out.println(mySmartphone.displaySmartphoneInfo()); 
            System.out.println(mySmartphone.takePhoto());  
            System.out.println(mySmartphone.powerOff());  
       }
}
