package OOPs.objects;

public class Main {
    public static void main(String[] args)
    {
        int id; // declaration of variable
        id = 1; // initialization of variable

        User u; // currently having null value
        u = new User(); // creating object of type User via calling constructor

        /*
        Order of initialization:
        static variables and static initializers in order
        instance variables and instance initializers in order
        constructors
         */
    }
}
