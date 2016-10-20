
// http://peidevs.github.io 

describe("Canary Test", () => {
    var cell
 
    beforeEach( () => {
        cell = new Cell({foo: 5150})
    })
 
    it("can be alive", () => {
        expect(cell.foo).toEqual(5150)
    })
});
