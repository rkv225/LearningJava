package OOPs.inheritance;

public interface SpaceTraveller extends Flyable, Floatable {
    void remoteControl();

    @Override
    default void repair() {
        Flyable.super.repair();
        Floatable.super.repair();
    }
}
