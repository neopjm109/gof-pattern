package dev.jmpark.gof.creational.prototype;

/**
 * 동일한 클래스를 복사할 때, 일반적인 = 으로 하게 되면 얕은 복사가 된다.
 * 얕은 복사는 같은 메모리 주소를 복사하는 것이기 때문에,
 * 다른 변수여도 동일한 변수라고 볼 수 있다.
 * 깊은 복사를 진행하여 이를 해결하고자 할 때, 일일히 모든 변수를 매번 지정하여 저장할 수 없기 때문에
 * 새로운 주소로 그대로 복사해주는 프로토타입 패턴이 필요하게 된다.
 */
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