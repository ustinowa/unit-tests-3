package hw3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import seminars.third.hw.MainHW;


public class OddNumberTest {
    public void MainHW() {
    }

    @Test
    void testNull(){
        MainHW evenodd = new MainHW();
        Assertions.assertTrue(evenodd.evenOddNumber(0));
    }

    @Test
    void testEvenNumber(){
        MainHW evenodd = new MainHW();
        Assertions.assertTrue(evenodd.evenOddNumber(4));
    }

    @Test
    void testNotEvenNumber(){
        MainHW evenodd = new MainHW();
        Assertions.assertFalse(evenodd.evenOddNumber(3));
    }

    //Тесты ко второму заданию
    @Test
    void testInRange(){
        MainHW numintervel = new MainHW();
        Assertions.assertTrue(numintervel.numberInInterval(25));
    }

    @Test
    void testInRangeMore(){
        MainHW numintervel = new MainHW();
        Assertions.assertTrue(numintervel.numberInInterval(100));
    }

    @Test
    void testOutOfRange(){
        MainHW numintervel = new MainHW();
        Assertions.assertFalse(numintervel.numberInInterval(24));
    }

    @Test
    void testOutOfRangeMore(){
        MainHW numintervel = new MainHW();
        Assertions.assertFalse(numintervel.numberInInterval(101));
    }
}
