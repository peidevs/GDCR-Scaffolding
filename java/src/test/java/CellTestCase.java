// http://peidevs.github.io

import org.junit.*;
import static org.junit.Assert.*;

public class CellTestCase {
    @Test
    public void testCanary() {
        Cell cell = new Cell();

        // test
        cell.setFoo(5150);

        assertEquals(5150, cell.getFoo());
    }
}
