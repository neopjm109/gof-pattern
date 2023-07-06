package dev.jmpark.gof.creational.prototype;

public abstract class PrototypeBook {
    protected String author;
    protected String content;

    public abstract PrototypeBook copy();

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
}