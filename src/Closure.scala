package otherscope {
  class Foo {
    //a method that takes a function and a string, and passed the string into the function, and then executes the function
    def exec(f: (String) => Unit, name: String) = {
      f(name)
    }
  }  
}

object Closure extends App {
  var hello = "Hello"
  def sayHello(name: String) = {
    println(s"$hello, $name")
  }
  
  val foo = new otherscope.Foo
  foo.exec(sayHello, "Henry")
  
  hello = "안녕하세요"
  foo.exec(sayHello, "장우혁님")
}