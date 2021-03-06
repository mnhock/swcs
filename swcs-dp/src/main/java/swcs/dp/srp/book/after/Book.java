package swcs.dp.srp.book.after;

public final class Book {

    private final String title;
    private final String author;
    private final String content;

    public Book(String title, String author, String content) {
        this.title = title;
        this.author = author;
        this.content = content;
    }

    public String title() {
        return this.title;
    }

    public String author() {
        return this.author;
    }

    public String content() {
        return this.content;
    }
}
