public interface CarsCollection extends Iterable<Cars> {
    boolean add(Cars cars);

    boolean remove(Cars cars);

    int size();

    void clear();

    boolean contains(Cars cars);
}
