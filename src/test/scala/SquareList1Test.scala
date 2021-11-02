import org.scalatest.funsuite.AnyFunSuite

class SquareList1Test extends AnyFunSuite {

  val s1 = new SquareList1
  val newlist: List[Int] = List(26,10,19,96)

  test("Square of empty list should be the list itself") {
    assert(s1.squareList(List()) == List())
  }

  test("Square of list should not return empty list") {
    assert(!(s1.squareList(newlist) == List()))
  }

  test("The squareList should return the square of all elements in the list") {
    assert(s1.squareList(newlist) == List(676, 100, 361, 9216))
  }

}