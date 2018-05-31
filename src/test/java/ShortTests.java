import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by menyo01 on 01/01/2018.
 */
public class ShortTests {

    @Test
    public void shortTest() throws InterruptedException {
        for (int i=5; i>0; i--) {
            System.out.println(i);
            Thread.sleep(1000L);
        }
        assertEquals("test1", "test1");
    }
    
    @Test
    public void testShouldPass1() {
        assertEquals("test", "test");
    }
    
    @Test
    public void testShouldPass2() {
        assertEquals("test", "test");
    }
    
    @Test
    public void testShouldPass3() {
        assertEquals("test", "test");
    }
    
    @Test
    public void testShouldPass4() {
        assertEquals("test", "test");
    }
}
