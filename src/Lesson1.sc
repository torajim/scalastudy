object Lesson1 {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  1+1                                             //> res0: Int(2) = 2
  var answer = 8*5+1                              //> answer  : Int = 41
  answer += 2
  System.out.println("answer:" + answer)          //> answer:43
  
  var greeting : String = "Test";                 //> greeting  : String = Test
  var greeting2 = "Hello"                         //> greeting2  : String = Hello
  
  println(greeting)                               //> Test
  println(greeting2)                              //> Hello
}