package BasicSyntax;

import java.util.ArrayList;
import java.util.List;

public class ToDoList {
    private List<ToDoItem> toDoItems;
    private static Long currentId = 1L;

    public void addToDoItem(String task) {
        if(toDoItems == null) {
            toDoItems = new ArrayList<ToDoItem>();
        }
        ToDoItem item = new ToDoItem();
        item.setId(currentId);
        item.setDescription(task);
        toDoItems.add(item);
        currentId++;
    }

    public void printToDoItems() {
        // enhanced for loop
        for(ToDoItem item : toDoItems) {
            System.out.printf("%d : %s\n", item.getId(), item.getDescription());
        }
    }
}
