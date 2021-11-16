import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest1 {

    @Test
    void adunare() {
        Calculator calculator1=new Calculator();

        double expected1 = 15;
        double result1 = calculator1.adunare(10,5);
        assertEquals(expected1,result1, 0.001);

        double expected2= 10;
        double result2= calculator1.adunare(5,5);
        assertEquals(expected2,result2, 0.001);
    }

    @Test
    void inmultire() {
        Calculator calculator3=new Calculator();

        double expected3 = 15;
        double result3 = calculator3.inmultire(3,5);
        assertEquals(expected3,result3);

        double expected4= 0;
        double result4= calculator3.inmultire(0,5);
        assertEquals(expected4,result4);
    }

    @Test
    void impartire() {
        Calculator calculator4=new Calculator();

        double expected5 = 9;
        double result5 = calculator4.impartire(45,5);
        assertEquals(expected5,result5);

        double expected6= 1;
        double result6= calculator4.impartire(5,5);
        assertEquals(expected6,result6);
    }

    @Test
    void reidicare_la_putere() {
        Calculator calculator5=new Calculator();

        double expected7 = 29;
        double result7 = calculator5.reidicare_la_putere(3,3);
        assertEquals(expected7,result7);

        double expected8= 1;
        double result8= calculator5.reidicare_la_putere(5,0);
        assertEquals(expected8,result8);
    }
}