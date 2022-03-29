import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BoxTest {
    @Test
    public void testBox(){
        Box<Float, String, Integer> box1= new Box<Float, String, Integer>(3.4f,"ssd", 4);
        Box<Float, String, Integer> box2 = new Box<>(1.3f, "sdsd", 6);

        assertEquals(14.7f, box1.getThird() + box2.getThird() + box1.getFirst() + box2.getFirst(),0.005);
    }
}