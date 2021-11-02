import org.scalatest.funsuite.AnyFunSuite

class SquareList2Test extends AnyFunSuite {

  val s2 = new SquareList2
  val newlist: List[Int] = List(1, 5, 25)

  test("Square of empty list should be the list itself") {
    assert(s2.squareList(List()) == List())
  }

  test("Square of list should not return empty list") {
    assert(!(s2.squareList(newlist) == List()))
  }

  test("The squareList should return the square of all elements in the list") {
    assert(s2.squareList(newlist) == List(1, 25, 625))
  }

}