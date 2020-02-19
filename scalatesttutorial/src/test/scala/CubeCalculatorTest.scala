class CubeCalculatorTest extends org.scalatest.FunSuite {
  test("CubeCalculator.cube 3 should be 27") {
    assert(CubeCalculator.cube(3) === 27)
  }

  test("CubeCalculator.cube 0 should be 0") {
    assert(CubeCalculator.cube(0) === 0)
  }
}
