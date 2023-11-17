import java.time.LocalDate;
import java.util.*;
import static java.time.temporal.ChronoUnit.MINUTES;

public class ToDoList {
    private List<Item> items;

    public List<Item> getItems() {
        return items;
    }

    public void addItem(Item item,User user) {
        if(MINUTES.between(item.getCreationDate().atStartOfDay(), LocalDate.now().atStartOfDay()) > 30
        && user.isUserValid()) {
            this.items.add(item);
            if(items.size() == 8) {
                EmailSenderService.sendMail(user.email);
            }
        }
        else {
            System.out.println("Impossible d'ajouter un Item");
        }

    }
}
