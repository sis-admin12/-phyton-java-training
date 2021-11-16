import java.util.Iterator;

public class CarsLinkedList implements CarsList{

    private Node first;
    private Node last;
    private int size=0;


    @Override
    public Cars get(int index) {
        return getNode(index).value;
    }

    @Override
    public boolean add(Cars cars) {
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
    public boolean add(Cars car, int index) {
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
    public boolean remove(Cars cars) {
        int index = findElement(cars);
        if (index != -1) {
            return removeN(index);
        }
        return false;
    }

    @Override
    public boolean contains(Cars cars) {
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
    public Iterator<Cars> iterator() {
        return new Iterator<Cars>() {
            private Node node = first;
            @Override
            public boolean hasNext() {
                return node!= null;
            }

            @Override
            public Cars next() {
                Cars cars = node.value;
                node = node.next;
                return cars;
            }
        };
    }

    private int findElement(Cars cars) {
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
    private static class Node{
        private Node previous;
        private Cars value;
        private Node next;

        public Node(Node previous, Cars value, Node next) {
            this.previous = previous;
            this.value = value;
            this.next = next;
        }
    }
}
