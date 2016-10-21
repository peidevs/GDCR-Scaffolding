
# http://peidevs.github.io

import unittest

from gol import *

class CellCase(unittest.TestCase):
    def test_canary(self):
        cell = Cell(5150)
        self.assertEqual(5150, cell.foo)

def main():
    unittest.main()

if __name__ == "__main__":
    main()

