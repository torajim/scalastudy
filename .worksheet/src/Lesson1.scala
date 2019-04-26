object Lesson1 {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(60); 
  println("Welcome to the Scala worksheet");$skip(6); val res$0 = 
  1+1;System.out.println("""res0: Int(2) = """ + $show(res$0));$skip(21); 
  var answer = 8*5+1;System.out.println("""answer  : Int = """ + $show(answer ));$skip(14); 
  answer += 2;$skip(41); 
  System.out.println("answer:" + answer);$skip(37); 
  
  var greeting : String = "Test";System.out.println("""greeting  : String = """ + $show(greeting ));$skip(26); ;
  var greeting2 = "Hello";System.out.println("""greeting2  : String = """ + $show(greeting2 ));$skip(23); 
  
  println(greeting);$skip(21); 
  println(greeting2);$skip(12); val res$1 = 
  
  1.+(1);System.out.println("""res1: Int(2) = """ + $show(res$1));$skip(6); val res$2 = 
  1+1;System.out.println("""res2: Int(2) = """ + $show(res$2));$skip(11); val res$3 = 
  1.to(10);System.out.println("""res3: scala.collection.immutable.Range.Inclusive = """ + $show(res$3));$skip(31); 

	for(i <- 1 to 10) println(i);$skip(29); val res$4 = 

	"Hello".intersect("World");System.out.println("""res4: String = """ + $show(res$4));$skip(11); 
	
	var i=1;System.out.println("""i  : Int = """ + $show(i ));$skip(8); 
	i += 1;$skip(3); val res$5 = 
	i;System.out.println("""res5: Int = """ + $show(res$5));$skip(14); val res$6 = 
	
	"hello"(4);System.out.println("""res6: Char = """ + $show(res$6));$skip(18); val res$7 = 
	"hello".distinct;System.out.println("""res7: String = """ + $show(res$7));$skip(18); val res$8 = 
	"Hello".apply(4);System.out.println("""res8: Char = """ + $show(res$8));$skip(24); 

	val b: BigInt = 6 * 7;System.out.println("""b  : BigInt = """ + $show(b ));$skip(13); val res$9 = 
	b.pow(1000)

	// import has scope too
	import scala.math._;System.out.println("""res9: scala.math.BigInt = """ + $show(res$9));$skip(57); val res$10 = 
	sqrt(10);System.out.println("""res10: Double = """ + $show(res$10));$skip(24); val res$11 = 

	1.to(10).map(sqrt(_));System.out.println("""res11: scala.collection.immutable.IndexedSeq[Double] = """ + $show(res$11));$skip(60); val res$12 = 
                                                  
  6.*(7);System.out.println("""res12: Int(42) = """ + $show(res$12));$skip(17); val res$13 = 

	Short.MaxValue;System.out.println("""res13: Short(32767) = """ + $show(res$13));$skip(15); val res$14 = 
  Int.MaxValue;System.out.println("""res14: Int(2147483647) = """ + $show(res$14));$skip(16); val res$15 = 
  Long.MaxValue;System.out.println("""res15: Long(9223372036854775807L) = """ + $show(res$15));$skip(18); val res$16 = 
  Double.MaxValue;System.out.println("""res16: Double(1.7976931348623157E308) = """ + $show(res$16));$skip(28); val res$17 = 
  
  "Mississippi".distinct;System.out.println("""res17: String = """ + $show(res$17));$skip(31); val res$18 = 
  "Rhine".permutations.toArray;System.out.println("""res18: Array[String] = """ + $show(res$18));$skip(36); val res$19 = 
  "Rhine".permutations.toArray.size;System.out.println("""res19: Int = """ + $show(res$19));$skip(12); val res$20 = 
  "ABC".sum;System.out.println("""res20: Char = """ + $show(res$20));$skip(18); val res$21 = 
  "ABC".sum.toInt;System.out.println("""res21: Int = """ + $show(res$21));$skip(32); val res$22 = 
  
  "123".permutations.toArray;System.out.println("""res22: Array[String] = """ + $show(res$22));$skip(15); 
  
  var x = 1;System.out.println("""x  : Int = """ + $show(x ));$skip(34); 
  val z = if(x > 0) 1 else "adef";System.out.println("""z  : Any = """ + $show(z ));$skip(13); 
  val k = ();System.out.println("""k  : Unit = """ + $show(k ));$skip(67); 
  
  
  for(i <- 1 to 3; j <-1 to 3 if i!=j) print((10*i+j) + " ");$skip(57); 
  for(i <- for(i <- 1 to 10) yield i % 3){
  	println(i)
  };$skip(36); 
                  
  val x0 = 0;System.out.println("""x0  : Int = """ + $show(x0 ));$skip(13); 
  val y0 = 0;System.out.println("""y0  : Int = """ + $show(y0 ));$skip(8); 
  x = 5;$skip(13); 
  var y = 10;System.out.println("""y  : Int = """ + $show(y ));$skip(91); 
  
  val distance = {
  	val dx = x - x0
  	val dy = y - y0
  	sqrt(dx * dx + dy * dy)
  };System.out.println("""distance  : Double = """ + $show(distance ));$skip(12); 

	var p = 0;System.out.println("""p  : Int = """ + $show(p ));$skip(12); 
	var n = 20;System.out.println("""n  : Int = """ + $show(n ));$skip(39); 
	while(n > 0){
		p += 1
		n = n / 2
	};$skip(87); 
	
	def sum(args: Int*)={
		var result = 0
		for(arg <- args) result += arg
		result
	};System.out.println("""sum: (args: Int*)Int""");$skip(35); 
	
	val sumfromdef = sum(1 to 5:_*);System.out.println("""sumfromdef  : Int = """ + $show(sumfromdef ));$skip(137); 
	
	// Coursera - Scala (You should watch this lesson)
	
	
	def printDebug(args: Any*) = {
		for(arg <- args.toArray) print(arg + " ")
	};System.out.println("""printDebug: (args: Any*)Unit""");$skip(197); 
	
	
	// tail: Selects all elements except the first.
	def recursiveSum(args: Int*): Int = {
		printDebug(args)
		println()
		if(args.length == 0) 0
		else args.head + recursiveSum(args.tail:_*)
	};System.out.println("""recursiveSum: (args: Int*)Int""");$skip(31); val res$23 = 
	
	recursiveSum(1, 2, 3, 4, 5);System.out.println("""res23: Int = """ + $show(res$23))}

	
}
