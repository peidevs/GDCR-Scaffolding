import org.scalatest.funsuite.AnyFunSuite
import org.junit.runner.RunWith
import org.scalatestplus.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class CellSuite extends AnyFunSuite {
    test("cell strategy") {
        val cell = new Cell(5150)
        assert(cell.foo == 5150)
    }
}
