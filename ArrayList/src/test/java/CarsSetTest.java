import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;



public class CarsSetTest {

    private CarsSet carsSet;

    @BeforeEach
    @DisplayName("Setare din start")
    public void setUp() throws Exception {
        carsSet = new CarsHashSet();
        for (int i = 0; i < 100; i++) {
            carsSet.add(new Cars("Brand" + i, i));
        }
    }

    @Test
    @DisplayName("Cind adaugam 3 obiecte cu acelasi nume in rezultat trebuie sa fie doar unul")
    public void whenAdd3SimilarObjectsThenSizeIncreaseBy1() {
        assertEquals(100, carsSet.size());
        assertTrue(carsSet.add(new Cars("BMW", 10)));
        assertFalse(carsSet.add(new Cars("BMW", 10)));
        assertFalse(carsSet.add(new Cars("BMW", 10)));
        assertEquals(101, carsSet.size());
    }

    @Test
    @DisplayName("Cind stergem size devine egal cu 0")
    public void whenSetClearedThenSize0() {
        carsSet.clear();
        assertEquals(0, carsSet.size());
    }

    @Test
    @DisplayName("Cind un element se sterge size descreste")
    public void whenElementRemovedThenSizeDecreased() {
        assertTrue(carsSet.remove(new Cars("Brand30", 30)));
        assertEquals(99, carsSet.size());
        assertFalse(carsSet.remove(new Cars("Brand30", 30)));
        assertEquals(99, carsSet.size());
    }



}