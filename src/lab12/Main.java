package lab12;


public class Main {
    public static void main(String[] args) {
        // Create a Container for Integer objects
        Container<Integer> intContainer = new Container<>();

        // Add Integer objects to the container
        intContainer.add(1);
        intContainer.add(2);
        intContainer.add(3);

        // Retrieve and print an Integer object from the container
        System.out.println(intContainer.get(0)); 

        // Create a Container for String objects
        Container<String> strContainer = new Container<>();

        // Add String objects to the container
        strContainer.add("Hello");
        strContainer.add("World");

        // Retrieve and print a String object from the container
        System.out.println(strContainer.get(1)); 

        // Create a Container for Person objects
        Container<Person> personContainer = new Container<>();

        // Add Person objects to the container
        personContainer.add(new Person("saquib", 23));
        personContainer.add(new Person("sam", 30));

        // Retrieve and print a Person object from the container
        System.out.println(personContainer.get(0).getName()); 
    }
}