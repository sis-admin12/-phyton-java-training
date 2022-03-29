public interface CarsList<T> extends CarsCollection<T> {

    T get(int index);
    boolean add(T cars);
    boolean add(T car, int index);
    boolean remove(T cars);
    boolean  removeN(int index);
    int size();
    void clear();



}
