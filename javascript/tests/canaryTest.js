
// http://peidevs.github.io 

describe("Canary Test", function() {
    var cell
 
    beforeEach( function() {
        cell = new Cell({foo: 5150})
    })
 
    it("can be alive", function() {
        expect(cell.foo).toEqual(5150)
    })
});
