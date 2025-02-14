package OOPs.AccessModifiers;

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
