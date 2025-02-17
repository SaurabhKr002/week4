package reflection.intermediatelevel.annotations;

@Author(name = "Saurabh Kumar") // Applying the custom annotation to the class
public class Book {
    private String title;

    public Book(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}
