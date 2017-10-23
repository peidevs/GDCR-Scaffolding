
import org.specs2.mutable.Specification
import org.junit.runner.RunWith
import org.specs2.runner.JUnitRunner

@RunWith(classOf[JUnitRunner])
class CellSpec extends Specification {
    var cell = new Cell(5150)
    
    "cell" should {
        "be a canary" in {
            cell.foo must beEqualTo(5150)
        }
    }
}
