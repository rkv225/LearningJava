package OOPs.inheritance;

public class Employee {
    private String name;
    private Car car;

    public Employee(String name, Car car) {
        this.name = name;
        this.car = car;
    }

    public void printDetails() {
        System.out.printf("%s has %s car%n", this.name, this.car.model);
    }
}
