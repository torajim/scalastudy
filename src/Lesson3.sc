object Lesson3 {
  val nums = new Array[Int](10)                   //> nums  : Array[Int] = Array(0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
  val a = Array("Hello", "World", "test")         //> a  : Array[String] = Array(Hello, World, test)
  a(1)                                            //> res0: String = World
  for(i <- 0 until a.length)println(a(i))         //> Hello
                                                  //| World
                                                  //| test
  import scala.collection.mutable.ArrayBuffer
  val b = new ArrayBuffer[Int]                    //> b  : scala.collection.mutable.ArrayBuffer[Int] = ArrayBuffer()
  
  b += 1                                          //> res1: Lesson3.b.type = ArrayBuffer(1)
  b += (1, 2, 3, 5)                               //> res2: Lesson3.b.type = ArrayBuffer(1, 1, 2, 3, 5)
  b ++= Array(8, 13, 21)                          //> res3: Lesson3.b.type = ArrayBuffer(1, 1, 2, 3, 5, 8, 13, 21)

	b.insert(2, 6)
	b                                         //> res4: scala.collection.mutable.ArrayBuffer[Int] = ArrayBuffer(1, 1, 6, 2, 3,
                                                  //|  5, 8, 13, 21)
	b.insert(2, 7, 8, 9)
	b                                         //> res5: scala.collection.mutable.ArrayBuffer[Int] = ArrayBuffer(1, 1, 7, 8, 9,
                                                  //|  6, 2, 3, 5, 8, 13, 21)
  b.remove(2)                                     //> res6: Int = 7
  b                                               //> res7: scala.collection.mutable.ArrayBuffer[Int] = ArrayBuffer(1, 1, 8, 9, 6,
                                                  //|  2, 3, 5, 8, 13, 21)
  b.trimEnd(b.length-10)
  b                                               //> res8: scala.collection.mutable.ArrayBuffer[Int] = ArrayBuffer(1, 1, 8, 9, 6,
                                                  //|  2, 3, 5, 8, 13)
  val arrayb = b.toArray                          //> arrayb  : Array[Int] = Array(1, 1, 8, 9, 6, 2, 3, 5, 8, 13)
	val abb = arrayb.toBuffer                 //> abb  : scala.collection.mutable.Buffer[Int] = ArrayBuffer(1, 1, 8, 9, 6, 2, 
                                                  //| 3, 5, 8, 13)
                                                  
  val scores = Map("alice" -> 10, "tom" ->10, "test"->10)
                                                  //> scores  : scala.collection.immutable.Map[String,Int] = Map(alice -> 10, tom 
                                                  //| -> 10, test -> 10)
	for((k, v) <- scores) yield (v, k)        //> res9: scala.collection.immutable.Map[Int,String] = Map(10 -> test)

	val question = ArrayBuffer(1, 2, 3, 4, 5, 6, 7, 8, 9, -1, -2, -3)
                                                  //> question  : scala.collection.mutable.ArrayBuffer[Int] = ArrayBuffer(1, 2, 3,
                                                  //|  4, 5, 6, 7, 8, 9, -1, -2, -3)
  def selectFirstNegNum(src : ArrayBuffer[Int]) = {
  	var result = ArrayBuffer[Int]()
  	for(a <- src if a < 0) {
  		if(result.length < 1) result += a
  	}
  	result
  }                                               //> selectFirstNegNum: (src: scala.collection.mutable.ArrayBuffer[Int])scala.col
                                                  //| lection.mutable.ArrayBuffer[Int]
  selectFirstNegNum(question)                     //> res10: scala.collection.mutable.ArrayBuffer[Int] = ArrayBuffer(-1)
  
  def selectFirstNegNum_next(src : ArrayBuffer[Int]) = {
  	import scala.util.control.Breaks._
  	var result = ArrayBuffer[Int]()
  	for(a <- src if a < 0) {
  		result += a
  		break
  	}
  	result
  }                                               //> selectFirstNegNum_next: (src: scala.collection.mutable.ArrayBuffer[Int])sca
                                                  //| la.collection.mutable.ArrayBuffer[Int]
  selectFirstNegNum(question)                     //> res11: scala.collection.mutable.ArrayBuffer[Int] = ArrayBuffer(-1)
  
  def selectFirstNegNum_index(src : ArrayBuffer[Int]) = {
  	var result = ArrayBuffer[Int]()
  	var negs = for(i <- 0 until src.length if src(i)<0) yield i
  	result += src(negs.head)
  	result
  }                                               //> selectFirstNegNum_index: (src: scala.collection.mutable.ArrayBuffer[Int])sc
                                                  //| ala.collection.mutable.ArrayBuffer[Int]
  selectFirstNegNum_index(question)               //> res12: scala.collection.mutable.ArrayBuffer[Int] = ArrayBuffer(-1)
                                                  
  import scala.io.Source
  val filename = "C:\\Users\\GKN\\alice.txt"      //> filename  : String = C:\Users\GKN\alice.txt
  val count = scala.collection.mutable.Map[String, Int]()
                                                  //> count  : scala.collection.mutable.Map[String,Int] = Map()
  for(line <- Source.fromFile(filename).getLines){
  	for(word <- line.split(" ") if word == "Alice" || word == "Rabbit"){
  		count(word) = count.getOrElse(word, 0)+1
  	}
  }
  println(count("Alice") + " " + count("Rabbit")) //> 223 29
  
  
  val words = Array("Mary", "had", "a", "little", "lamb", "its", "fleece", "was", "white", "as", "snow", "and", "everywhere", "that", "Mary", "went", "the", "lamb", "was", "sure", "to", "go")
                                                  //> words  : Array[String] = Array(Mary, had, a, little, lamb, its, fleece, was
                                                  //| , white, as, snow, and, everywhere, that, Mary, went, the, lamb, was, sure,
                                                  //|  to, go)
  val groupMap = words.groupBy(_.substring(0, 1)) //> groupMap  : scala.collection.immutable.Map[String,Array[String]] = Map(e ->
                                                  //|  Array(everywhere), s -> Array(snow, sure), t -> Array(that, the, to), f ->
                                                  //|  Array(fleece), a -> Array(a, as, and), M -> Array(Mary, Mary), i -> Array(
                                                  //| its), g -> Array(go), l -> Array(little, lamb, lamb), h -> Array(had), w ->
                                                  //|  Array(was, white, went, was))
  val sameLength = words.groupBy(_.length)        //> sameLength  : scala.collection.immutable.Map[Int,Array[String]] = Map(5 -> 
                                                  //| Array(white), 10 -> Array(everywhere), 1 -> Array(a), 6 -> Array(little, fl
                                                  //| eece), 2 -> Array(as, to, go), 3 -> Array(had, its, was, and, the, was), 4 
                                                  //| -> Array(Mary, lamb, snow, that, Mary, went, lamb, sure))
  "New York".partition(_.isUpper)                 //> res13: (String, String) = (NY,ew ork)

	val symbols = Array("<", "-", ">")        //> symbols  : Array[String] = Array(<, -, >)
	val counts = Array(2, 10, 2)              //> counts  : Array[Int] = Array(2, 10, 2)
	val pairs = symbols.zip(counts)           //> pairs  : Array[(String, Int)] = Array((<,2), (-,10), (>,2))
	
	for((k, v) <- pairs) print(k*v)           //> <<---------->>
	println()                                 //> 
	
	
	def selectFirstNegNum2(src : ArrayBuffer[Int]) = {
  	var (neg, pos) = src.partition(_ <= -1)
  	var result = pos
  	result += neg(0)
  }                                               //> selectFirstNegNum2: (src: scala.collection.mutable.ArrayBuffer[Int])scala.c
                                                  //| ollection.mutable.ArrayBuffer[Int]
  
  selectFirstNegNum2(question)                    //> res14: scala.collection.mutable.ArrayBuffer[Int] = ArrayBuffer(1, 2, 3, 4, 
                                                  //| 5, 6, 7, 8, 9, -1)
  
  def selectFirstNegNum3(src : ArrayBuffer[Int]) = {
  	var dim = src.groupBy(_ <= -1 )
  	var result = ArrayBuffer[Int]()
  	result += dim(true).head
  }                                               //> selectFirstNegNum3: (src: scala.collection.mutable.ArrayBuffer[Int])scala.c
                                                  //| ollection.mutable.ArrayBuffer[Int]
	selectFirstNegNum3(question)              //> res15: scala.collection.mutable.ArrayBuffer[Int] = ArrayBuffer(-1)
}