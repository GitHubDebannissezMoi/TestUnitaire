import java.time.LocalDate;

public class Item {
    private String name;
    private char[] content;
    private LocalDate creationDate;

    public Item(String name,char[] content) {
        this.name = name;
        this.content = content;
        this.creationDate = LocalDate.now();

    }

    public char[] getContent() {
        return content;
    }
    public LocalDate getCreationDate() {
        return creationDate;
    }
    public String getName() {
        return name;
    }

    public void setContent(char[] content) {
        this.content = content;
    }

    public void setName(String name) {
        this.name = name;
    }
}
