package intermediatelevel.RetrieveAnnotationsRuntime;

// Apply the custom annotation to a class
@Author(name = "Author Name")
public class Book {
    private String title;

    public Book(String title) {
        this.title = title;
    }

    public void display() {
        System.out.println("Title: " + title);
    }
}
