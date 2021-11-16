import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarsListTest {

    private CarsList carsList;

    @BeforeEach
    void setUp() {
        carsList = new CarsLinkedList();
        for(int i=0; i<100; i++){
            carsList.add(new Cars("Brand"+i, i));
        }
            }
        @Test
        void whenadd100elementsthensizemostbe100()
        {
        assertEquals(100, carsList.size());
            }

        @Test
        void  whenelementremovedbyindexthensizedecreset(){
        assertTrue(carsList.removeN(5));
        assertEquals(99, carsList.size());
        }

        @Test
    void whenelementremovedthensizedecreset(){
        Cars cars= new Cars("Tayota", 12);
        carsList.add(cars);
        assertEquals(101, carsList.size());
        assertTrue(carsList.remove(cars));
        assertEquals(100, carsList.size());
        }

        @Test
    void whennonexistelemenremovedthenreturnedfalse(){
            Cars cars= new Cars("Tayota", 12);
            assertFalse(carsList.remove(cars));
            assertEquals(100, carsList.size());
        }

        @Test
    void whenclearthensizeequalszero(){
        carsList.clear();
        assertEquals(0, carsList.size());
        }

        @Test
    void whenindexoutofboundsthenexceptiontrows(){
            Assertions.assertThrows(IndexOutOfBoundsException.class, () -> {
                carsList.get(100);
            });
        }
        @Test
    void  whengetcarthenreturnrightvalue(){
        Cars cars = carsList.get(0);
        assertEquals("Brand0", cars.getBrand());
        }


    @Test
    public void insertIntoMiddle() {
        Cars car = new Cars("BMW", 50);
        carsList.add(car, 50);
        Cars carFromList = carsList.get(50);
        assertEquals("BMW", carFromList.getBrand());
    }

    @Test
    public void insertIntoFirstPosition() {
        Cars car = new Cars("BMW", 1);
        carsList.add(car, 0);
        Cars carFromList = carsList.get(0);
        assertEquals("BMW", carFromList.getBrand());
    }

    @Test
    public void insertIntoLastPosition() {
        Cars car = new Cars("BMW", 1);
        carsList.add(car, 100);
        Cars carFromList = carsList.get(100);
        assertEquals("BMW", carFromList.getBrand());
    }





}