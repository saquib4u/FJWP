package june12.multilevelInheritance;

public class Person {
	private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String displayPersonalInfo() {
        return "Name: " + name + ", Age: " + age;
    }
}
