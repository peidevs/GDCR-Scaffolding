
// http://peidevs.github.io

package org.peidevs

import org.specs2.mutable._

class CellSpec extends Specification {
    var cell = new Cell(5150)
    
    "cell" can {
        "be a canary" in {
            cell.foo mustEqual 5150
        }
    }
}

