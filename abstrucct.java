abstract class Vehicle {  
    abstract void start();  // Abstract method (no body)

    void stop() {  // Concrete method
        System.out.println("Vehicle stopped.");
    }
}

class Car extends Vehicle {  
            @Override
    void start() {  
        System.out.println("Car starts with a key.");
    }
}

public class abstrucct {  
    public static void main(String args[]) {  
        Vehicle myCar = new Car();
        myCar.start();  // Calls overridden method in Car class
        myCar.stop();   // Calls concrete method from Vehicle class
    }  
}
