public class Person {
    private String name;
    private int age;

    public Person() {
        this.name = "Unknown";
        this.age = 0;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person(Person other) {
        this.name = other.name;
        this.age = other.age;
    }

    public static void main(String[] args) {
	
        Person person1 = new Person("Ankit", 21);
        Person person2 = new Person(person1); // Clone using copy constructor
        System.out.println(person1);
        System.out.println(person2);
    }
}
