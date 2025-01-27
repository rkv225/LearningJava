package Class;

// Classes usually have public modifiers, but we tend to keep our fields private

public class Car {
    private String type;
    private String model;
    private String color;
    private int speed;

    public Car(String type, String model, String color) {
        this.type = type;
        this.model = model;
        this.color = color;
        this.speed = 0;
    }

    public String getType() {
        return type;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getSpeed() {
        return speed;
    }

    public void increaseSpeed() {
        speed++;
    }

    public void decreaseSpeed() {
        speed--;
    }
}
