package JUnit;

import org.junit.*;

public class JUnitTest {

    @Test
    public void testMethod1() {
        System.out.println("Run method: 'testMethod 1'");
    }

    @Test
    @Ignore
    public void testMethod2() {
        System.out.println("Run method: 'testMethod 2'");
    }

    @Test
    public void testMethod3() {
        System.out.println("Run method: 'testMethod 3'");
//        throw new RuntimeException("Exception");
    }

}