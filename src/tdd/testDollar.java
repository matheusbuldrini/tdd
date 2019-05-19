package tdd;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class testDollar {
   @Test
   public void testMultiplication() {
       Dollar five = new Dollar(5);
       five.times(2);
       assertEquals(10, five.amount);
    }
}