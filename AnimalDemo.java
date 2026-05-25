class Animal {

    String name;
    int age;

    Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void makeSound() {
        System.out.println("Animal makes sound");
    }
}

class Dog extends Animal {

    Dog(String name, int age) {
        super(name, age);
    }

    void makeSound() {
        System.out.println(name + " says Woof!");
    }

    void fetch() {
        System.out.println(name + " is fetching the ball.");
    }
}

class Cat extends Animal {

    Cat(String name, int age) {
        super(name, age);
    }

    void makeSound() {
        System.out.println(name + " says Meow!");
    }

    void climb() {
        System.out.println(name + " is climbing.");
    }
}

public class AnimalDemo {

    public static void main(String[] args) {

        Dog d1 = new Dog("Buddy", 3);
        Cat c1 = new Cat("Kitty", 2);

        Animal[] animals = {d1, c1};

        for (Animal a : animals) {
            a.makeSound();
        }

        d1.fetch();
        c1.climb();
    }
}
