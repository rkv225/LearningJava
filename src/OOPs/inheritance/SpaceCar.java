package OOPs.inheritance;

public class SpaceCar extends Car implements SpaceTraveller{

    public SpaceCar() {

    }
    @Override
    public void remoteControl() {
        System.out.println("Controlling space car");
    }

    @Override
    public void floatOnWater() {
        System.out.println("Space car Floating");
    }

    @Override
    public void fly() {
        System.out.println("Space car Flying");
    }
}
