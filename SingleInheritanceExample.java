// Parent class
class Animal {
    void bite(){
        System.out.println("Animal bite");
    }
}

// Child class
class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks");
    }
}

// Main class
public class SingleInheritanceExample {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.bite();  //inrited method from Animal
        myDog.bark();  // Dog's own method
    }
}
