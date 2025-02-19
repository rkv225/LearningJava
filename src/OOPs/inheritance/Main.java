package OOPs.inheritance;

public class Main {
    public static void main(String[] args) {
        Employee e1 = new Employee("Shreya", new ArmoredCar());
        Employee e2 = new Employee("Paul", new SpaceCar());
        Employee e3 = new Employee("Alex", new Car());

        var ac = new ArmoredCar();
        Car cc = new ArmoredCar();

        ac.printMessage();
        cc.printMessage();
    }
}
