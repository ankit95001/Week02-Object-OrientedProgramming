/*
Sample Problem 1: Restaurant Management System with Hybrid Inheritance
Description: Model a restaurant system where Person is the superclass and Chef and Waiter are subclasses. Both Chef and Waiter should implement a Worker interface that requires a performDuties() method.
Tasks:
Define a superclass Person with attributes like name and id.
Create an interface Worker with a method performDuties().
Define subclasses Chef and Waiter that inherit from Person and implement the Worker interface, each providing a unique implementation of performDuties().
Goal: Practice hybrid inheritance by combining inheritance and interfaces, giving multiple behaviors to the same objects.
 */
package HybridInheritance;
class Person {
    String name;
    int id;

    public Person(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public void displayDetails() {
        System.out.println("Name: " + name + ", ID: " + id);
    }
}


// Interface Worker
interface Worker {
    void performDuties();
}


// Subclass Chef
class Chef extends Person implements Worker {
    public Chef(String name, int id) {
        super(name, id);
    }

    @Override
    public void performDuties() {
        System.out.println("Chef Duties: Preparing and cooking food.");
    }
}

// Subclass Waiter
class Waiter extends Person implements Worker {
    public Waiter(String name, int id) {
        super(name, id);
    }

    @Override
    public void performDuties() {
        System.out.println("Waiter Duties: Serving food and taking orders.");
    }
}

public class RestaurantManagement {
    public static void main(String[] args) {
        Chef chef = new Chef("Ankit", 101);
        Waiter waiter = new Waiter("Aakrati", 102);

        chef.displayDetails();
        chef.performDuties();

        waiter.displayDetails();
        waiter.performDuties();
    }
}
