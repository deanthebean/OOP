package ch.hslu.oop.sw06;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class NumberHelperTest {
    @Test
    void testFirstParamMax(){
        assertEquals(NumberHelper.max(5, 3), 5);
    }

    @Test
    void testSecondParamMax(){
        assertEquals(NumberHelper.max(5, 8), 8);
    }


    @Test
    void testEqualParams(){
        assertEquals(NumberHelper.max(6, 6), 6);
    }
}
