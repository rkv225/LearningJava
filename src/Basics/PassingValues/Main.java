package Basics.PassingValues;

public class Main {
    public static void print(int x, int y) {
        System.out.println(x + " " + y);
    }
    public static void printFoo(Foo f) {
        System.out.println("Foo " + f.x);
    }
    public static void modify(int x1, int y1) {
        x1 = 5;
        y1 = 10;
        print(x1, y1);
    }
    public static void modifyFoo(Foo f) {
        f.x = 5;
        printFoo(f);
    }
    public static void main(String[] args) {
        int x1 = 1, y1 = 2;
        print(x1, y1); // 1 2
        modify(x1, y1); // 5 10
        print(x1, y1); // 1 2

        Foo f1 = new Foo(1);
        printFoo(f1); // 1
        modifyFoo(f1); // 5
        printFoo(f1); // 5
    }
}
