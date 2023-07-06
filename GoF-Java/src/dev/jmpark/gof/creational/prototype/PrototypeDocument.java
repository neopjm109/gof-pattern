package dev.jmpark.gof.creational.prototype;

public class PrototypeDocument implements Cloneable {
    private String author;
    private String content;

    public PrototypeDocument(String author, String content) {
        this.author = author;
        this.content = content;
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

    public PrototypeDocument clone() {
        try {
            super.clone();
            return new PrototypeDocument(this.author, this.content);
        }
        catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public String toString() {
        return "PrototypeDocument{" +
                "author='" + author + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}
