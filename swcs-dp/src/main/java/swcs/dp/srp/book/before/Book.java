package swcs.dp.srp.book.before;

public final class Book {

    private final String title;
    private final String author;
    private final String content;

    public Book(String title, String author, String content) {
        this.title = title;
        this.author = author;
        this.content = content;
    }

    public String getTitle() {
        return this.title;
    }

    public String getAuthor() {
        return this.author;
    }

    public String getContent() {
        return this.content;
    }

    public void exportToPdf() {
        // logic
    }

    public void exportToEpub() {
        // logic
    }
}
