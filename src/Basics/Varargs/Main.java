package Basics.Varargs;

public class Main {
    static <T> T[] toArray(T... arguments) {
        return arguments;
    }
    static <T> T[] returnAsIs(T a, T b) {
        return toArray(a, b);
    }
    public static void printArgs(int... values) {
        for(int v : values) {
            System.out.println(v);
        }
    }
    public static void main(String[] args) {
        // Each method can only have one varargs parameter
        // The varargs argument must be the last parameter
        printArgs(1, 2);
        printArgs(9, 8, 7, 6);

        // This throws an exception because the varargs are casted into Object[].
        // So Object[] here returned can't be casted to String[]
        // This is called heap pollution
        String[] arguments = returnAsIs("One", "Two");
    }
}
