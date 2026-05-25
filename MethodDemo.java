class Calculator {

    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }
}

class Vehicle {

    void startEngine() {
        System.out.println("Vehicle engine starts");
    }
}

class Car extends Vehicle {

    void startEngine() {
        System.out.println("Car engine starts with key");
    }
}

public class MethodDemo {

    public static void main(String[] args) {

        Calculator c = new Calculator();

        System.out.println("Addition of 2 numbers: " + c.add(10, 20));

        System.out.println("Addition of 3 numbers: " + c.add(10, 20, 30));

        Vehicle v = new Vehicle();
        Car car = new Car();

        v.startEngine();
        car.startEngine();
    }
}
