import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarsCollectionTest {

    private CarsCollection carsCollection;


    @BeforeEach

    public void setUp() throws Exception {

        carsCollection = new CarsHashSet() {
        };

        for (int i = 0; i < 100; i++) {
            carsCollection.add(new Cars("AMG" + i, i));
        }
    }

    @Test
    @DisplayName("Avetizare daca elementul este prezent si daca nu este prezent")
    public void contains() {
        assertTrue(carsCollection.contains(new Cars("AMG20", 20)));
        assertFalse(carsCollection.contains(new Cars("Brand200", 20)));
    }

    @Test
    public void testForeach(){
        int index =0;
        for (Cars cars : carsCollection) {
            index++;
        }
        assertEquals(100, index);
    }

}