import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarQueueTest {
 private CarQueue<Cars> queue;
    @BeforeEach
       public void setUp() throws Exception {
          queue = new CarsLinkedList<>();
          for (int i = 0; i < 10; i++) {
             queue.add(new Cars("Brand" + i, i));
    }}

    @Test
    void add() {
       assertEquals(10, queue.size());
    }

    @Test
    void peek() {
       Cars car = queue.peek();
       assertEquals("Brand0", car.getBrand());
       assertEquals(10, queue.size());
    }

    @Test
    void poll() {
       Cars car = queue.poll();
       assertEquals("Brand0", car.getBrand());
       assertEquals(9, queue.size());
    }
}