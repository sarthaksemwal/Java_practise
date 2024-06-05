// Superclass
class Animal {
    String name;
    int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void eat() {
        System.out.println(name + " is eating.");
    }

    public void sleep() {
        System.out.println(name + " is sleeping.");
    }
}

// Subclass
class Dog extends Animal {
    public Dog(String name, int age) {
        super(name, age);
    }

    public void bark() {
        System.out.println(name + " is barking.");
    }
}

public class Inhertance {
    public static void main(String[] args) {
        Dog myDog = new Dog("Fido", 3);
        myDog.eat();
        myDog.sleep();
        myDog.bark();
    }
}


