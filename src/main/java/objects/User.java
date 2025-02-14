package objects;

public class User {
    private final int x;
    private int y;
    private static int z;

    // static initialization block
    static {
        z = 4;
    }

    // instance initialization block
    {
        y = 2;
    }

    public User() {
        x = 1;
    }

    /*
    This is invalid because we can only initialize x
    in declaration statement or in constructor
    public void setX(){
        x = 2;
    }
     */
}
