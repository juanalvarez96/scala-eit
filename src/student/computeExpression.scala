class computeExpression {
  abstract class Expression
  case object X extends Expression
  case class Const(value: Int) extends Expression
  case class Add(left: Expression, right: Expression) extends Expression
  case class Mult(left: Expression, right: Expression) extends Expression
  case class Neg(expr: Expression) extends Expression

  def eval(expression: Expression, xValue:Int):Int =
    expression match{
      case X => xValue
      case Const(value)=> value
      case Add(left, right)=> eval(left, xValue)+eval(right, xValue)
      case Mult(left, right)=> eval(left, xValue)*eval(right, xValue)
      case Neg(expr)=> -eval(expr, xValue)

  }
}

