package AccessModifiers;

// The default access modifier is also called package-private,
// which means that all members are visible within the same package,
// but aren’t accessible from other packages

public class SuperPublic {
    static void defaultMethod() { // if we make this as public, it will be accessible from anywhere
        System.out.println("SuperPublic.defaultMethod");
    }

    private static void privateMethod() {
        System.out.println("SuperPublic.privateMethod");
    }

    private void anotherPrivateMethod() {
        privateMethod(); // available in the same class only.
    }
}

public class Main {
    public static void main(String[] args) {
        SuperPublic.defaultMethod(); // Available in the same package
    }
}


