import java.util.Arrays;
import java.util.Iterator;

public class CarsArrayList<T> implements CarsList<T> {

    private Object[] array = new Object[10];
    private int size=0;


    @Override
    public T get(int index) {
        checkindex(index);
        return (T) array[index];
    }

    @Override
    public boolean add(T cars) {
        increaseArray();
        array[size] = cars;
        size++;
        return true;
    }

    @Override
    public boolean add(T cars, int index) {
        increaseArray();
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException();
        }
        System.arraycopy(array, index, array, index + 1, size - index);
        array[index] = cars;
        size++;
        return true;
    }

    @Override
    public boolean contains(T cars) {
        for (int i = 0; i < size; i++) {
            if (array[i].equals(cars)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean remove(T cars) {
        for(int i=0; i<size;i++){
            if(array[i].equals(cars)){
                return removeN(i);
}
        }
        return false;
    }

    @Override
    public boolean removeN(int index) {
        checkindex(index);
        if (size - 1 - index >= 0)
            System.arraycopy(array, index + 1, array, index, size - 1 - index);


        size--;
        return true;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void clear() {
         array = new Object[10];
         size=0;
    }

    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {

            int index =0;

            @Override
            public boolean hasNext() {
                return index<size;
            }

            @Override
            public T next() {
                return (T) array[index++];
            }
        };
    }

    private void checkindex(int index){
        if(index<0 || index>=size){
            throw new IndexOutOfBoundsException();
        }
    }

    private void increaseArray() {
        if (size >= array.length) {
            array = Arrays.copyOf(array, array.length * 2);
        }
    }


}
