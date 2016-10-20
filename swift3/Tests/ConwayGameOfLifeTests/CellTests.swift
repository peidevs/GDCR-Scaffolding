
// http://peidevs.github.io 

import XCTest
@testable import ConwayGameOfLife

extension CellTests {
    static var allTests = [
        ("testCanary", testCanary)
	]
}

class CellTests: XCTestCase {
    var cell : Cell!

    override func setUp() {
        super.setUp()
        cell = Cell(foo: 5150)
    }

    func testCanary() {
        XCTAssertEqual(cell.foo, 5150)
    }
}
