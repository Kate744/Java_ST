package sfwtesting.autojava;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SquareTests {

    @Test
    public void testArea() {
        Square s = new Square(5);
        s.areal();
        Assert.assertEquals(s.areal(), 25,0);
    }

}
