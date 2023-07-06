package dev.jmpark.gof.creational.singleton;

/**
 * 자바 어플리케이션이 실행되는 동안 단 하나의 객체만을 생성한다.
 * 그렇기 때문에 생성자는 private 으로 설정한다.
 * 사용할 경우, 동일한 내용을 공유한다.
 */
public class SingletonManager {
    private static SingletonManager instance = null;
    private int counter = 0;

    private SingletonManager() {

    }

    public static SingletonManager getInstance() {
        if (instance == null) {
            instance = new SingletonManager();
        }
        return instance;
    }

    public void add(int cnt) {
        counter += cnt;
    }

    public int show() {
        return counter;
    }
}
