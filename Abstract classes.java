// Abstract class
abstract class Sunstar {
    abstract void printInfo();
}

// Abstractions performed using extends
class Employee extends Sunstar {
    void printInfo() {
        String name = "avinash";
        int age = 21;
        float salary = 222.2F;
        System.out.println("name");
        System.out.println("age");
        system.out.println("salary");
    }
}

// Base class
class Base [
    public static void main(String[] args) {
        Sunstar s = new Employee();
        s.printInfo();
    }
]