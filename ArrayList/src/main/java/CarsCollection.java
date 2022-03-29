public interface CarsCollection<T> extends Iterable<T> {
    boolean add(T cars);

    boolean remove(T cars);

    int size();

    void clear();

    boolean contains(T cars);
}
