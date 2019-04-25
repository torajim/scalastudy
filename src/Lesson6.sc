object Lesson6 {
  import scala.math._
  val num = 3.14                                  //> num  : Double = 3.14
  val fun = ceil _                                //> fun  : Double => Double = Lesson6$$$Lambda$8/757108857@6bdf28bb

	fun(num)                                  //> res0: Double = 4.0
	Array(3.14, 1.42, 2.0).map(fun)           //> res1: Array[Double] = Array(4.0, 2.0, 2.0)
	
	val triple = (x : Double) => 3 * x        //> triple  : Double => Double = Lesson6$$$Lambda$13/1068934215@79b4d0f
	Array(3.14, 1.42, 2.0).map(triple)        //> res2: Array[Double] = Array(9.42, 4.26, 6.0)
	
	def valueAtQuarter(f: (Double) => Double) = f(0.25)
                                                  //> valueAtQuarter: (f: Double => Double)Double
 	valueAtQuarter(ceil _)                    //> res3: Double = 1.0
	valueAtQuarter(sqrt _)                    //> res4: Double = 0.5

	def mulBy(factor: Double) = (x: Double) => factor * x
                                                  //> mulBy: (factor: Double)Double => Double
	val quintuple = mulBy(5)                  //> quintuple  : Double => Double = Lesson6$$$Lambda$16/785992331@26ba2a48
	quintuple(10)                             //> res5: Double = 50.0

}