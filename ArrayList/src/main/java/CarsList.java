public interface CarsList extends CarsCollection{

    Cars get(int index);
    boolean add(Cars cars);
    boolean add(Cars car, int index);
    boolean remove(Cars cars);
    boolean  removeN(int index);
    int size();
    void clear();



}
