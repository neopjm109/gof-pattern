package dev.jmpark.gof.creational.prototype;

public class NovelBook extends PrototypeBook {
    private String image;

    public NovelBook(String author, String content) {
        this.author = author;
        this.content = content;
    }

    public NovelBook(String author, String content, String image) {
        this.author = author;
        this.content = content;
        this.image = image;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    @Override
    public PrototypeBook copy() {
        return new NovelBook(author, content, this.image);
    }

    @Override
    public String toString() {
        return "NovelBook{" +
                "author='" + author + '\'' +
                ", content='" + content + '\'' +
                ", image='" + image + '\'' +
                '}';
    }
}
