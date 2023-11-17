import java.lang.reflect.Array;

public class ToDoList {
    private Item[] items = new Item[10];

    public Item[] getItems() {
        return items;
    }

    public void setItems(Item[] items) {
        this.items = items;
    }
}
