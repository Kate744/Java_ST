package sfwtesting.autojava;

import org.testng.Assert;

public class DistanceTests {

    public void testArea() {
        Point z = new Point(3, 5);
        Point n = new Point (8, 9);
        z.distance(n);
        Assert.assertEquals(z.distance(n), 6,4);
    }
}
