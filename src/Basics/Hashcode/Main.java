package Basics.Hashcode;

public class Main {
    public static void main(String[] args) {
        var alice = new User("Alice", "alice@abc.com");
        var bob = new User("Bob", "bob@abc.com");
        var alice2 = new User("Alice", "alice@abc.com");

        var b1 = alice.equals(alice);
        var b2 = alice.equals(bob);
        var b3 = alice.equals(alice2);
        alice2.setId(alice.getId());
        var b4 = alice.equals(alice2);
    }
}
