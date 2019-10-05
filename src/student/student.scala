
class student {
  var name = "myName"
  var age = 0
  var listGrades = List[Int]()
  def increaseAge : Unit = {age = age + 1}
  def addGrade (grade:Int) : Unit = {
    listGrades = grade :: listGrades
  }
  def meanGrade : Unit = {
    var sum = listGrades.sum
    println(sum/listGrades.length)
  }

}
