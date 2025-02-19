package OOPs.inheritance;

public class ArmoredCar extends Car implements Floatable, Flyable {
    int bulletProofWindows;
    void remoteStartCar() {
        // this vehicle can be started using remote control
    }
    public String registerModel() {
        return model;
    }

    @Override
    public void floatOnWater() {
       System.out.println("I can float");
   }

    @Override
    public void fly() {
        System.out.println("I can fly");
    }

    @Override
    public void repair() {
        // need to override the default method else the program won't compile as we have same method signature on multiple interfaces
        System.out.println("Repairing armoredCar object");
    }

    public void printCarDetails()
    {
        // System.out.println(duration); // ambiguous reference to variable and program won't compile
        System.out.println(Floatable.duration);
        System.out.println(Flyable.duration);
    }

    public void printMessage() {
        System.out.println("Message from armored car");
    }
}
