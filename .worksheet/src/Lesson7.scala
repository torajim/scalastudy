object Lesson7 {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(65); 
  val zones = java.util.TimeZone.getAvailableIDs;System.out.println("""zones  : Array[String] = """ + $show(zones ));$skip(34); val res$0 = 
  
  zones.map(s => s.split("/"));System.out.println("""res0: Array[Array[String]] = """ + $show(res$0));$skip(108); val res$1 = 
  zones.map(s => s.split("/"))
  .filter(_.length >=2)
  .map(_(1))
  .grouped(10)
  .map(_.last)
  .toList;System.out.println("""res1: List[String] = """ + $show(res$1));$skip(64); 
  def power(numbers: Array[Int]) = {
  	import scala.math._
  };System.out.println("""power: (numbers: Array[Int])Unit""");$skip(24); 

	power(Array(1, 2, 3));$skip(98); 


	def concat(strings: Seq[String], seperator: String) = {
		strings.reduce(_ + seperator + _)
	};System.out.println("""concat: (strings: Seq[String], seperator: String)String""");$skip(60); val res$2 = 
	
	concat(Array("Mary", "had", "a", "little", "lamb"), " ");System.out.println("""res2: String = """ + $show(res$2));$skip(96); 
  def powc(x: Double)(y: Double) : Double = {
  	(1 to y.toInt).map(s => x).reduceLeft(_*_)
  };System.out.println("""powc: (x: Double)(y: Double)Double""");$skip(25); val res$3 = 
  
  powc(2)(powc(2)(5));System.out.println("""res3: Double = """ + $show(res$3));$skip(16); 
  
  val n = 10;System.out.println("""n  : Int = """ + $show(n ));$skip(12); 
  var i = 1;System.out.println("""i  : Int = """ + $show(i ));$skip(12); 
  var f = 1;System.out.println("""f  : Int = """ + $show(f ));$skip(116); 
    
  def While1(cond: () => Boolean, body: () => Unit){
 		if(cond()){
 			body()
 			While1(cond, body)
 		}
  };System.out.println("""While1: (cond: () => Boolean, body: () => Unit)Unit""");$skip(59); 
  
  While1(() => i<n, () => {f *= i; i += 1; println(f)})}
                                                  
  
                                                    
}
