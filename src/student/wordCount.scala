
class wordCount {
  var text:String = " "
  def counts = {
    var res = text.split(" ").map(_.toLowerCase).groupBy(identity).mapValues(_.size)
    print(res.toString())

  }

}
object main{
  def main(args: Array[String]):Unit ={
    println("Insert text: ")
    var textUser = scala.io.StdIn.readLine()

    var wc:wordCount = new wordCount
    wc.text = textUser
    wc.counts
  }
}
