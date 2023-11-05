// http://peidevs.github.io

using System.IO;
using System;

class Cell
{
    private int foo;

    public int GetFoo()
    {
        return foo;
    }

    public void SetFoo(int value)
    {
        foo = value;
    }

    static void Main()
    {
        Cell cell = new Cell();
        cell.SetFoo(5150);
        Console.WriteLine("TRACER: " + cell.GetFoo());
    }
}
