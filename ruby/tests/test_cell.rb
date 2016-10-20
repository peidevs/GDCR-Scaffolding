
# http://peidevs.github.io

require "./lib/cell.rb"
require "test/unit"

class TestNAME < Test::Unit::TestCase

  def test_sample
    cell = Cell.new(5150)
    assert_equal(5150, cell.foo)
  end

end
