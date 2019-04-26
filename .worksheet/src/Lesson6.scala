object Lesson6 {
  import scala.math._;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(55); 
  val num = 3.14;System.out.println("""num  : Double = """ + $show(num ));$skip(19); 
  val fun = ceil _;System.out.println("""fun  : Double => Double = """ + $show(fun ));$skip(11); val res$0 = 

	fun(num);System.out.println("""res0: Double = """ + $show(res$0));$skip(33); val res$1 = 
	Array(3.14, 1.42, 2.0).map(fun);System.out.println("""res1: Array[Double] = """ + $show(res$1));$skip(38); 
	
	val triple = (x : Double) => 3 * x;System.out.println("""triple  : Double => Double = """ + $show(triple ));$skip(36); val res$2 = 
	Array(3.14, 1.42, 2.0).map(triple);System.out.println("""res2: Array[Double] = """ + $show(res$2));$skip(55); 
	
	def valueAtQuarter(f: (Double) => Double) = f(0.25);System.out.println("""valueAtQuarter: (f: Double => Double)Double""");$skip(25); val res$3 = 
 	valueAtQuarter(ceil _);System.out.println("""res3: Double = """ + $show(res$3));$skip(24); val res$4 = 
	valueAtQuarter(sqrt _);System.out.println("""res4: Double = """ + $show(res$4));$skip(56); 

	def mulBy(factor: Double) = (x: Double) => factor * x;System.out.println("""mulBy: (factor: Double)Double => Double""");$skip(26); 
	val quintuple = mulBy(5);System.out.println("""quintuple  : Double => Double = """ + $show(quintuple ));$skip(15); val res$5 = 
	quintuple(10);System.out.println("""res5: Double = """ + $show(res$5));$skip(24); val res$6 = 

	(1 to 9).map(_ * 0.1)
  import scala.math._;System.out.println("""res6: scala.collection.immutable.IndexedSeq[Double] = """ + $show(res$6));$skip(44); val res$7 = 
	(1 to 9).map(cos(_));System.out.println("""res7: scala.collection.immutable.IndexedSeq[Double] = """ + $show(res$7));$skip(46); val res$8 = 
  (1 to 9).filter(_%2==0 & false).map(cos(_));System.out.println("""res8: scala.collection.immutable.IndexedSeq[Double] = """ + $show(res$8));$skip(36); val res$9 = 

	(1 to 9) filter(_%2==0) map(_*10);System.out.println("""res9: scala.collection.immutable.IndexedSeq[Int] = """ + $show(res$9));$skip(39); val res$10 = 
	
	for(i <- (1 to 9) if i%2==0)yield i;System.out.println("""res10: scala.collection.immutable.IndexedSeq[Int] = """ + $show(res$10));$skip(24); val res$11 = 
	
	(1 to 9).reduce(_*_);System.out.println("""res11: Int = """ + $show(res$11));$skip(34); 
	
	def mul(x: Int, y:Int) = x * y;System.out.println("""mul: (x: Int, y: Int)Int""");$skip(43); 
	def mulOneAtATime(x: Int)(y: Int) = x * y;System.out.println("""mulOneAtATime: (x: Int)(y: Int)Int""");$skip(23); val res$12 = 
	
	mulOneAtATime(3)(4);System.out.println("""res12: Int = """ + $show(res$12));$skip(89); 

	def runInThread(block: Unit){
		new Thread{
			override def run() {block}
		}.start
	};System.out.println("""runInThread: (block: Unit)Unit""");$skip(87); 
	
	runInThread{println("Hi"); Thread.sleep(5000); println("Please don't file asleep")}}
}
