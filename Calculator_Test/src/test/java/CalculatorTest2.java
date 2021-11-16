import org.junit.jupiter.api.*;

import java.util.PriorityQueue;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest2 {

    private static Calculator calculator;

    @BeforeAll
     static void setup(){
         calculator = new Calculator();
    }

    @Test
    @Order(1)
      void whenaddfivetotenthenresultfifteen() {
        double expected = 15;
        double result = calculator.adunare(10,5);
        assertEquals(expected,result, 0.001);
    }

    @Test
    @Order(2)
    void whenaddfivetofivethenresultten() {
        double expected = 10;
        double result = calculator.adunare(5,5);
        assertEquals(expected,result, 0.001);
    }

    @Test
    @Order(3)
    void whenadd1to2Stringthenresult3() {
        double expected = 3;
        double result = calculator.adunare("1","2");
        assertEquals(expected,result);
    }

    @Test()
    @Order(4)
    void whenInputIncorrectValueThenThrowException(){
        Assertions.assertThrows(Exception.class, () -> {
            calculator.adunare("dsdsd", "4");
        });
    }

    @Test
    @Order(4)
    void whenmultiplietheetofivethenresultfifteen() {
        double expected = 15;
        double result = calculator.inmultire(3,5);
        assertEquals(expected,result);
    }

    @Test
    @Order(5)
    void whenmultiplie3to5Stringthenresult15() {
        double expected = 17.0625;
        double result = calculator.inmultire("3.25","5.25");
        assertEquals(expected,result);
    }

    @Test
    @Order(6)
    void when10divideto5thenresult2() {
        double expected = 2;
        double result = calculator.impartire(10, 5);
        assertEquals(expected, result);
    }

    @Test()
    @Order(7)
      void when10divideto0thenresultInfinity() {
        String s = "Infinity";
        double expected = Double.parseDouble(s);
        double result = calculator.impartire(10, 0);
        assertEquals(expected, result);
        System.out.println(expected);

//         assertThrows(ArithmeticException.class, () -> calculator.impartire(10, 0));

    }



    @Test
    @Order(8)
    void whenridici2laputerea5thenresult32() {
        double expected = 32;
        double result = calculator.reidicare_la_putere(2, 5);
        assertEquals(expected, result);
    }

    @Test
    @Order(9)
    void whenridici2laputerea0thenresult1() {
        double expected = 1;
        double result = calculator.reidicare_la_putere(2, 0);
        assertEquals(expected, result);
    }

    @AfterAll
    static void close(){
        calculator=null;
    }

}