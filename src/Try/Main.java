package Try;

abstract class AbstractClass {
    private int abstractValue;

    // Constructor in the abstract class
    public AbstractClass(int abstractValue) {
        this.abstractValue = abstractValue;
        System.out.println("AbstractClass constructor called with value: " + abstractValue);
    }

    // Other methods or members can be defined in the abstract class
}

class ExtendedClass extends AbstractClass {
    private int extendedValue;

    // Constructor in the extended class
    public ExtendedClass(int abstractValue, int extendedValue) {
        // Call the constructor of the abstract class using super with a specific value
        super(abstractValue);

        this.extendedValue = extendedValue;
        System.out.println("ExtendedClass constructor called with value: " + extendedValue);
    }

    // Other methods or members can be defined in the extended class
}

public class Main {
    public static void main(String[] args) {
        // Create an instance of the extended class
        ExtendedClass extendedInstance = new ExtendedClass(10, 20);
    }
}
