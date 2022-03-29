public class Box<T, V, K> {
    private T first;
    private V second;
    private K third;

    public T getFirst() {
        return first;
    }

    public void setFirst(T first) {
        this.first = first;
    }

    public V getSecond() {
        return second;
    }

    public void setSecond(V second) {
        this.second = second;
    }

    public K getThird() {
        return third;
    }

    public void setThird(K third) {
        this.third = third;
    }

    public Box(T first, V second, K third) {
        this.first = first;
        this.second = second;
        this.third = third;
    }
}