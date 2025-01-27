package ConcreteClass;

public class FancyCar extends Vehicle implements Driveable {
    @Override
    public String honk() {
        return "beep";
    }
}
