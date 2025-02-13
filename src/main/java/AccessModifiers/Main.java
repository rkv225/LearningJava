package AccessModifiers;

// The default access modifier is also called package-private,
// which means that all members are visible within the same package,
// but aren’t accessible from other packages

public class Main {
    public static void main(String[] args) {
        SuperPublic.defaultMethod(); // Available in the same package
    }
}


