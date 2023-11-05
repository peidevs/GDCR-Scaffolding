<?php

declare(strict_types=1);

use PHPUnit\Framework\TestCase;

class CellTest extends TestCase
{
    public function testCanary()
    {
        $cell = new Cell;
        $result = $cell->foo(5150);
        $this->assertEquals(5150, $result);
    }
}
