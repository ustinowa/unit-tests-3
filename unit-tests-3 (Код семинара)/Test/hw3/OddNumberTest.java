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



}
