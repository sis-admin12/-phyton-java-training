import java.util.Iterator;

public class CarsLinkedList<T> implements CarsList<T>, CarQueue<T> {

    private Node first;
    private Node last;
    private int size=0;


    @Override
    public T get(int index) {
        return getNode(index).value;
    }

    @Override
    public boolean add(T cars) {
        if (size == 0) {
            first = new Node(null, cars, null);
            last = first;
        } else {
            Node secondLast = last;
            last = new Node(secondLast, cars, null);
            secondLast.next = last;
        }
        size++;
        return true;
    }

    @Override
    public boolean add(T car, int index) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException();
        }
        if (index == size) {

            return add(car);
        }
        Node nodeNext = getNode(index);
        Node nodePrevious = nodeNext.previous;
        Node newNode = new Node(nodePrevious, car, nodeNext);
        nodeNext.previous = newNode;
        if (nodePrevious != null) {
            nodePrevious.next = newNode;
        } else {
            first = newNode;
        }
        size++;
        return true;
    }




    @Override
    public boolean remove(T cars) {
        int index = findElement(cars);
        if (index != -1) {
            return removeN(index);
        }
        return false;
    }

    @Override
    public boolean contains(T cars) {
        return findElement(cars) != -1;
    }

    @Override
    public boolean removeN(int index) {
        Node node = getNode(index);
        Node nodenext = node.next;
        Node nodeprevious = node.previous;
        if(nodenext != null){
            nodenext.previous = nodeprevious;
        }else {
            last = nodeprevious;
        }
        if(nodeprevious != null){
            nodeprevious.next = nodenext;
        }else{
            first = nodenext;
        }
        size--;
        return true;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void clear() {
        first = null;
        last = null;
        size = 0;
    }

    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            private Node node = first;
            @Override
            public boolean hasNext() {
                return node!= null;
            }

            @Override
            public T next() {
                T cars = node.value;
                node = node.next;
                return cars;
            }
        };
    }

    private int findElement(T cars) {
        Node node = first;
        for (int i = 0; i < size; i++) {
            if (node.value.equals(cars)) {
                return i;
            }
            node = node.next;
        }
        return -1;
    }

    private Node getNode(int index){
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        Node node = first;
        for (int i=0; i<index; i++){
            node= node.next;
        }
        return node;

    }
    private class Node{
        private Node previous;
        private T value;
        private Node next;

        public Node(Node previous, T value, Node next) {
            this.previous = previous;
            this.value = value;
            this.next = next;
        }
    }

    @Override
    public T peek() {
        return size > 0 ? get(0) : null;
    }

    @Override
    public T poll() {
        T car = get(0);
        removeN(0);
        return car;
    }
}
