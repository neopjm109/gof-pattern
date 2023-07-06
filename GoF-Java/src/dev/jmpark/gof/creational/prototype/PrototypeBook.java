package dev.jmpark.gof.creational.prototype;

public class PrototypeBook {
    private String author;
    private String content;

    public PrototypeBook(String author, String content) {
        this.author = author;
        this.content = content;
    }

    public PrototypeBook copy() {
        return new PrototypeBook(this.author, this.content);
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "PrototypeBook{" +
                "author='" + author + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}