class  wordCountClass {
  var chaine = " "
  def counts = chaine.split(" ").groupBy(word => word).map( x => (x._1, x._2.size) )
}

object wordCount2 {
  def main(args: Array[String]): Unit = {

    var a = new wordCountClass;

    println("Please enter the sentence:")
    val data = scala.io.StdIn.readLine()
    a.chaine = data
    a.counts.foreach { println }
  }
}
