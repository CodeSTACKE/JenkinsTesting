import org.junit.Test;

import static org.junit.Assert.*;

public class SumTest {
    Sum sum;
    int total;
    @org.junit.Before
    public void setUp() throws Exception {
    sum =new Sum();

    }
    @Test
    public void  sumTest(){
    assertEquals(12,sum.addToNumbers(4,8));
    }
}