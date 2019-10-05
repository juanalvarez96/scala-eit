class student {
  var name = "Juan"
  var age = 22
  var listGrades=List[Int]()
  def increaseAge : Unit = {age = age + 1}

  def printStudent: Unit ={
    println("Age: " + age)
    println("Name: "+ name)
  }
  def addGrade(grade:Int): Unit = {
   listGrades = listGrades :+ grade

  }

  def meanGrade: Unit = {
    var k = 0
    var c = 0
    var m = 0
    for (i <- listGrades) yield {
      k = i+k
      c = c+1
    }
    m = k/c
    println(m)

  }
  def printList: Unit = {
    println(listGrades)
  }

}
