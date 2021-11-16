import java.util.Arrays;
import java.util.Iterator;

public class CarsArrayList implements CarsList{

    private Cars[] array = new Cars[10];
    private int size=0;


    @Override
    public Cars get(int index) {
        checkindex(index);
        return array[index];
    }

    @Override
    public boolean add(Cars cars) {
        increaseArray();
        array[size] = cars;
        size++;
        return true;
    }

    @Override
    public boolean add(Cars cars, int index) {
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
    public boolean contains(Cars cars) {
        for (int i = 0; i < size; i++) {
            if (array[i].equals(cars)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean remove(Cars cars) {
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
         array = new Cars[10];
         size=0;
    }

    @Override
    public Iterator<Cars> iterator() {
        return new Iterator<Cars>() {

            int index =0;

            @Override
            public boolean hasNext() {
                return index<size;
            }

            @Override
            public Cars next() {
                return array[index++];
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
