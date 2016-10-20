<?php
require 'Cell.php';

class CellTest extends PHPUnit_Framework_TestCase {
     public function testCanary() {
        $cell = new Cell;
        $result = $cell->foo(5150);
        $this->assertEquals(5150, $result);
     }
}

?>
