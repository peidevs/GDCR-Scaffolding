
// http://peidevs.github.io

import kotlin.test.assertEquals
import org.junit.Test

class TestSource {
    @Test fun f() {
        val cell = Cell(5150)
        assertEquals(5150, cell.foo)
    }
}
