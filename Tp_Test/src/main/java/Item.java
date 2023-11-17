import java.time.LocalDate;
import java.util.List;

public class Item {
    private String name;
    private String content;
    private LocalDate creationDate;
    private List<String> namesItems;

    private Item(String name,String content) {


    }

    public boolean itemIsValid(String name, String content) {
        if(isNameValid(name) && isContentValid(content)) {
            creationDate = LocalDate.now();
            System.out.println("Item Valide");
            return true;
        }
        else {
            System.out.println("Item non valide");
            return false;
        }
    }

    private boolean isNameValid(String name) {
        for (String i:this.namesItems) {
            if(i.contains(name)) {
                return false;
            }
        }
        this.namesItems.add(name);
        return true;
    }

    private boolean isContentValid(String content) {
        if(content.length() > 1000) {
            System.out.println("content non valide");
            return true;
        }
        else {
            System.out.println("Content valide");
            return false;
        }
    }

    public String getContent() {
        return content;
    }
    public LocalDate getCreationDate() {
        return creationDate;
    }
    public String getName() {
        return name;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setName(String name) {
        this.name = name;
    }
}
