
// http://peidevs.github.io

import org.junit.*
import static org.junit.Assert.*

class CellTestCase {
    @Test
    public void testCanary() {
        def cell = new Cell()

        // test
        cell.setFoo(5150)

        assertEquals(5150, cell.foo)
    }
}
