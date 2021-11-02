class SquareList1 {

  def squareList(xs: List[Int]): List[Int] =
    xs match {
      case List() => xs
      case y :: ys => y*y :: squareList(ys)
  }

}