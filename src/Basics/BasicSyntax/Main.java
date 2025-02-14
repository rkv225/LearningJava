package Basics.BasicSyntax;

public class Main {
    public static void main(String[] args) {
        // console write
        System.out.println("Hello and welcome!");

        // for loop
        for (int i = 1; i <= 5; i++) {
            System.out.println("i " + i);
        }

        ToDoList toDoList = new ToDoList();
        toDoList.addToDoItem("buy groceries");
        toDoList.addToDoItem("get clothes");
        toDoList.printToDoItems();
    }
}