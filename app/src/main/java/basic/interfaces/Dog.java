package basic.interfaces;

public class Dog extends Animal {
    // age is private in Animal, so we can't access it here
    public Dog(String name, int age) {
        super(name, age);
    }
}
