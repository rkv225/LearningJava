package Basics.ForEach;

import java.util.ArrayList;
import java.util.function.Consumer;

public class Main {
    public static void doOperation(String s) {
        System.out.println(s);
    }
    public static void usingConsumerImplementation(ArrayList<String> arr) {
        Consumer<String> printConsumer = new Consumer<String>() {
            @Override
            public void accept(String s) {
                doOperation(s);
            }
        };
        arr.forEach(printConsumer);
    }
    public static void usingLambdaExpression(ArrayList<String> arr) {
        arr.forEach(s -> doOperation(s));
    }
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<>();
        arr.add("A");
        arr.add("B");
        arr.add("C");
        arr.add("D");
        arr.add("E");

        usingConsumerImplementation(arr);
        usingLambdaExpression(arr);
    }
}
