import java.util.Iterator;

public class CarsHashSet<T> implements CarsSet<T> {

    private static final int INITIAL_CAPACITY = 16;
    private static final double LOAD_FACTOR = 0.75;
    private int size = 0;
    private Object[] array = new Object[INITIAL_CAPACITY];

    @Override
    public boolean add(T cars) {
        if (size >= (array.length * LOAD_FACTOR)) {
            increaseArray();
        }
        boolean added = add(cars, array);
        if (added) {
            size++;
        }
        return added;
    }

    private boolean add(T cars, Object[] dst) {
        int position = getElementPosition(cars, dst.length);
        if (dst[position] == null) {
            Entry entry = new Entry(cars, null);
            dst[position] = entry;
            return true;
        } else {
            Entry existedElement = (Entry) dst[position];
            while (true) {
                if (existedElement.value.equals(cars)) {
                    return false;
                } else if (existedElement.next == null) {
                    existedElement.next = new Entry(cars, null);
                    return true;
                } else {
                    existedElement = existedElement.next;
                }
            }
        }
    }

    @Override
    public boolean remove(T cars) {
        int position = getElementPosition(cars, array.length);
        if (array[position] == null) {
            return false;
        }
        Entry secondLast = (Entry) array[position];
        Entry last = secondLast.next;
        if (secondLast.value.equals(cars)) {
            array[position] = last;
            size--;
            return true;
        }
        while (last != null) {
            if (last.value.equals(cars)) {
                secondLast.next = last.next;
                size--;
                return true;
            } else {
                secondLast = last;
                last = last.next;
            }
        }
        return false;
    }


    @Override
    public boolean contains(T cars) {
        int position = getElementPosition(cars, array.length);
        Entry currentElement = (Entry) array[position];
        while (currentElement != null) {
            if (currentElement.value.equals(cars)) {
                return true;
            }
            currentElement = currentElement.next;
        }
        return false;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void clear() {
        array = new Object[INITIAL_CAPACITY];
        size = 0;
    }

    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {

            int index =0;
            int arrayIndex = 0;
            Entry entry;

            @Override
            public boolean hasNext() {
                return index<size;
            }

            @Override
            public T next() {
                while (array[arrayIndex] == null){
                    arrayIndex++;
                }if (entry == null){
                    entry = (Entry) array[arrayIndex];
                                }
                T result = entry.value;
                entry = entry.next;
                if (entry == null){
                    arrayIndex++;
                }
                index++;
                return result;
                            }
                        };
                    }

    private void increaseArray() {
        Object[] newArray = new Object[array.length * 2];
        for (Object entry :  array) {
            Entry existedElement = (Entry) entry;
            while (existedElement != null) {
                add(existedElement.value, newArray);
                existedElement = existedElement.next;
            }
        }
         array = newArray;
    }

    private int getElementPosition(T cars, int arrayLength) {
        return Math.abs(cars.hashCode() % arrayLength);
    }

    private class Entry {
        private T value;
        private Entry next;

        public Entry(T value, Entry next) {
            this.value = value;
            this.next = next;
        }
    }
}
