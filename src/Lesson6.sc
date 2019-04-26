object Lesson6 {
  import scala.math._
  val num = 3.14                                  //> num  : Double = 3.14
  val fun = ceil _                                //> fun  : Double => Double = Lesson6$$$Lambda$8/1802598046@2752f6e2

	fun(num)                                  //> res0: Double = 4.0
	Array(3.14, 1.42, 2.0).map(fun)           //> res1: Array[Double] = Array(4.0, 2.0, 2.0)
	
	val triple = (x : Double) => 3 * x        //> triple  : Double => Double = Lesson6$$$Lambda$13/1798286609@79698539
	Array(3.14, 1.42, 2.0).map(triple)        //> res2: Array[Double] = Array(9.42, 4.26, 6.0)
	
	def valueAtQuarter(f: (Double) => Double) = f(0.25)
                                                  //> valueAtQuarter: (f: Double => Double)Double
 	valueAtQuarter(ceil _)                    //> res3: Double = 1.0
	valueAtQuarter(sqrt _)                    //> res4: Double = 0.5

	def mulBy(factor: Double) = (x: Double) => factor * x
                                                  //> mulBy: (factor: Double)Double => Double
	val quintuple = mulBy(5)                  //> quintuple  : Double => Double = Lesson6$$$Lambda$16/234698513@3b81a1bc
	quintuple(10)                             //> res5: Double = 50.0

	(1 to 9).map(_ * 0.1)                     //> res6: scala.collection.immutable.IndexedSeq[Double] = Vector(0.1, 0.2, 0.300
                                                  //| 00000000000004, 0.4, 0.5, 0.6000000000000001, 0.7000000000000001, 0.8, 0.9)
                                                  //| 
  import scala.math._
	(1 to 9).map(cos(_))                      //> res7: scala.collection.immutable.IndexedSeq[Double] = Vector(0.5403023058681
                                                  //| 398, -0.4161468365471424, -0.9899924966004454, -0.6536436208636119, 0.283662
                                                  //| 18546322625, 0.9601702866503661, 0.7539022543433046, -0.14550003380861354, -
                                                  //| 0.9111302618846769)
  (1 to 9).filter(_%2==0 & false).map(cos(_))     //> res8: scala.collection.immutable.IndexedSeq[Double] = Vector()

	(1 to 9) filter(_%2==0) map(_*10)         //> res9: scala.collection.immutable.IndexedSeq[Int] = Vector(20, 40, 60, 80)
	
	for(i <- (1 to 9) if i%2==0)yield i       //> res10: scala.collection.immutable.IndexedSeq[Int] = Vector(2, 4, 6, 8)
	
	(1 to 9).reduce(_*_)                      //> res11: Int = 362880
	
	def mul(x: Int, y:Int) = x * y            //> mul: (x: Int, y: Int)Int
	def mulOneAtATime(x: Int)(y: Int) = x * y //> mulOneAtATime: (x: Int)(y: Int)Int
	
	mulOneAtATime(3)(4)                       //> res12: Int = 12

	def runInThread(block: Unit){
		new Thread{
			override def run() {block}
		}.start
	}                                         //> runInThread: (block: Unit)Unit
	
	runInThread{println("Hi"); Thread.sleep(5000); println("Please don't file asleep")}
                                                  //> Hi
                                                  //| Please don't file asleep
}