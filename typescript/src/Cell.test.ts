import Cell from "./Cell"

describe("Cell", () => {
  it("should exist", () => {
    let cell = new Cell("foo")

    expect(cell).not.toBeNull()
  })
})