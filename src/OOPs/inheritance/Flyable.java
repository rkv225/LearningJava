package OOPs.inheritance;

public interface Flyable {
    int duration = 20;
    void fly();
    default void repair() {
        System.out.println("Repairing flyable object");
    }
}
