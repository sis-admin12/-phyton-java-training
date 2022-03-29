public interface CarsSet<T> extends CarsCollection<T> {

    boolean add(T cars);
    boolean remove(T cars);
    int size();
    void clear();
}
