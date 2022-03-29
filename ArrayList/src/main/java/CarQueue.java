public interface CarQueue<T> extends CarsCollection<T> {

    boolean add(T cars);
    T peek();
    T poll();


}
