package dev.jmpark.gof.creational.builder;

public class Book {
    private String author;
    private String name;
    private String contents;

    private Book(Builder builder) {
        this.author = builder.author;
        this.name = builder.name;
        this.contents = builder.contents;
    }

    public static class Builder {
        private String author;
        private String name;
        private String contents;

        public Builder() {
        }

        public Builder author(String author) {
            this.author = author;
            return this;
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder contents(String contents) {
            this.contents = contents;
            return this;
        }

        public Book build() {
            return new Book(this);
        }
    }

    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", name='" + name + '\'' +
                ", contents='" + contents + '\'' +
                '}';
    }
}
