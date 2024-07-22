package july16;

import java.util.HashMap;
import java.util.Map;

class Country {
    private String name;
    private String capital;

    public Country(String name, String capital) {
        this.name = name;
        this.capital = capital;
    }

    public String getName() {
        return name;
    }

    public String getCapital() {
        return capital;
    }
}

public class CountryMap {
    private Map<String, String> countryMap;

    public CountryMap() {
        countryMap = new HashMap<>();
    }

    public void addCountry(Country country) {
        countryMap.put(country.getName(), country.getCapital());
    }

    public String getCapital(String countryName) {
        return countryMap.get(countryName);
    }

    public static void main(String[] args) {
        CountryMap countryMap = new CountryMap();

        Country india = new Country("India", "New Delhi");
        Country pakistan = new Country("Pakistan", "Islamabad");
        Country bangladesh = new Country("Bangladesh", "Dhaka");

        countryMap.addCountry(india);
        countryMap.addCountry(pakistan);
        countryMap.addCountry(bangladesh);

        System.out.println(countryMap.getCapital("India"));
        System.out.println(countryMap.getCapital("Pakistan"));
        System.out.println(countryMap.getCapital("Bangladesh"));
    }
}