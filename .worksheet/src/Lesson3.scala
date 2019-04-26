object Lesson3 {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(48); 
  val nums = new Array[Int](10);System.out.println("""nums  : Array[Int] = """ + $show(nums ));$skip(42); 
  val a = Array("Hello", "World", "test");System.out.println("""a  : Array[String] = """ + $show(a ));$skip(7); val res$0 = 
  a(1);System.out.println("""res0: String = """ + $show(res$0));$skip(42); 
  for(i <- 0 until a.length)println(a(i))
  import scala.collection.mutable.ArrayBuffer;$skip(77); 
  val b = new ArrayBuffer[Int];System.out.println("""b  : scala.collection.mutable.ArrayBuffer[Int] = """ + $show(b ));$skip(12); val res$1 = 
  
  b += 1;System.out.println("""res1: Lesson3.b.type = """ + $show(res$1));$skip(20); val res$2 = 
  b += (1, 2, 3, 5);System.out.println("""res2: Lesson3.b.type = """ + $show(res$2));$skip(25); val res$3 = 
  b ++= Array(8, 13, 21);System.out.println("""res3: Lesson3.b.type = """ + $show(res$3));$skip(17); 

	b.insert(2, 6);$skip(3); val res$4 = 
	b;System.out.println("""res4: scala.collection.mutable.ArrayBuffer[Int] = """ + $show(res$4));$skip(22); 
	b.insert(2, 7, 8, 9);$skip(3); val res$5 = 
	b;System.out.println("""res5: scala.collection.mutable.ArrayBuffer[Int] = """ + $show(res$5));$skip(14); val res$6 = 
  b.remove(2);System.out.println("""res6: Int = """ + $show(res$6));$skip(4); val res$7 = 
  b;System.out.println("""res7: scala.collection.mutable.ArrayBuffer[Int] = """ + $show(res$7));$skip(25); 
  b.trimEnd(b.length-10);$skip(4); val res$8 = 
  b;System.out.println("""res8: scala.collection.mutable.ArrayBuffer[Int] = """ + $show(res$8));$skip(25); 
  val arrayb = b.toArray;System.out.println("""arrayb  : Array[Int] = """ + $show(arrayb ));$skip(27); 
	val abb = arrayb.toBuffer;System.out.println("""abb  : scala.collection.mutable.Buffer[Int] = """ + $show(abb ));$skip(109); 
                                                  
  val scores = Map("alice" -> 10, "tom" ->10, "test"->10);System.out.println("""scores  : scala.collection.immutable.Map[String,Int] = """ + $show(scores ));$skip(36); val res$9 = 
	for((k, v) <- scores) yield (v, k);System.out.println("""res9: scala.collection.immutable.Map[Int,String] = """ + $show(res$9));$skip(68); 

	val question = ArrayBuffer(1, 2, 3, 4, 5, 6, 7, 8, 9, -1, -2, -3);System.out.println("""question  : scala.collection.mutable.ArrayBuffer[Int] = """ + $show(question ));$skip(172); 
  def selectFirstNegNum(src : ArrayBuffer[Int]) = {
  	var result = ArrayBuffer[Int]()
  	for(a <- src if a < 0) {
  		if(result.length < 1) result += a
  	}
  	result
  };System.out.println("""selectFirstNegNum: (src: scala.collection.mutable.ArrayBuffer[Int])scala.collection.mutable.ArrayBuffer[Int]""");$skip(30); val res$10 = 
  selectFirstNegNum(question);System.out.println("""res10: scala.collection.mutable.ArrayBuffer[Int] = """ + $show(res$10));$skip(206); 
  
  def selectFirstNegNum_next(src : ArrayBuffer[Int]) = {
  	import scala.util.control.Breaks._
  	var result = ArrayBuffer[Int]()
  	for(a <- src if a < 0) {
  		result += a
  		break
  	}
  	result
  };System.out.println("""selectFirstNegNum_next: (src: scala.collection.mutable.ArrayBuffer[Int])scala.collection.mutable.ArrayBuffer[Int]""");$skip(30); val res$11 = 
  selectFirstNegNum(question);System.out.println("""res11: scala.collection.mutable.ArrayBuffer[Int] = """ + $show(res$11));$skip(201); 
  
  def selectFirstNegNum_index(src : ArrayBuffer[Int]) = {
  	var result = ArrayBuffer[Int]()
  	var negs = for(i <- 0 until src.length if src(i)<0) yield i
  	result += src(negs.head)
  	result
  };System.out.println("""selectFirstNegNum_index: (src: scala.collection.mutable.ArrayBuffer[Int])scala.collection.mutable.ArrayBuffer[Int]""");$skip(36); val res$12 = 
  selectFirstNegNum_index(question)
                                                  
  import scala.io.Source;System.out.println("""res12: scala.collection.mutable.ArrayBuffer[Int] = """ + $show(res$12));$skip(121); 
  val filename = "C:\\Users\\GKN\\alice.txt";System.out.println("""filename  : String = """ + $show(filename ));$skip(58); 
  val count = scala.collection.mutable.Map[String, Int]();System.out.println("""count  : scala.collection.mutable.Map[String,Int] = """ + $show(count ));$skip(168); 
  for(line <- Source.fromFile(filename).getLines){
  	for(word <- line.split(" ") if word == "Alice" || word == "Rabbit"){
  		count(word) = count.getOrElse(word, 0)+1
  	}
  };$skip(59); 
  println(count("Alice") + " " + count("Rabbit"));$skip(198); 
  
  
  val words = Array("Mary", "had", "a", "little", "lamb", "its", "fleece", "was", "white", "as", "snow", "and", "everywhere", "that", "Mary", "went", "the", "lamb", "was", "sure", "to", "go");System.out.println("""words  : Array[String] = """ + $show(words ));$skip(50); 
  val groupMap = words.groupBy(_.substring(0, 1));System.out.println("""groupMap  : scala.collection.immutable.Map[String,Array[String]] = """ + $show(groupMap ));$skip(43); 
  val sameLength = words.groupBy(_.length);System.out.println("""sameLength  : scala.collection.immutable.Map[Int,Array[String]] = """ + $show(sameLength ));$skip(34); val res$13 = 
  "New York".partition(_.isUpper);System.out.println("""res13: (String, String) = """ + $show(res$13));$skip(37); 

	val symbols = Array("<", "-", ">");System.out.println("""symbols  : Array[String] = """ + $show(symbols ));$skip(30); 
	val counts = Array(2, 10, 2);System.out.println("""counts  : Array[Int] = """ + $show(counts ));$skip(33); 
	val pairs = symbols.zip(counts);System.out.println("""pairs  : Array[(String, Int)] = """ + $show(pairs ));$skip(35); 
	
	for((k, v) <- pairs) print(k*v);$skip(11); 
	println();$skip(143); 
	
	
	def selectFirstNegNum2(src : ArrayBuffer[Int]) = {
  	var (neg, pos) = src.partition(_ <= -1)
  	var result = pos
  	result += neg(0)
  };System.out.println("""selectFirstNegNum2: (src: scala.collection.mutable.ArrayBuffer[Int])scala.collection.mutable.ArrayBuffer[Int]""");$skip(34); val res$14 = 
  
  selectFirstNegNum2(question);System.out.println("""res14: scala.collection.mutable.ArrayBuffer[Int] = """ + $show(res$14));$skip(158); 
  
  def selectFirstNegNum3(src : ArrayBuffer[Int]) = {
  	var dim = src.groupBy(_ <= -1 )
  	var result = ArrayBuffer[Int]()
  	result += dim(true).head
  };System.out.println("""selectFirstNegNum3: (src: scala.collection.mutable.ArrayBuffer[Int])scala.collection.mutable.ArrayBuffer[Int]""");$skip(30); val res$15 = 
	selectFirstNegNum3(question);System.out.println("""res15: scala.collection.mutable.ArrayBuffer[Int] = """ + $show(res$15))}
}
