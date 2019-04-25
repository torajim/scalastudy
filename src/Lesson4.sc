object Lesson4 {

class myPoint(val x: Double, val y: Double){
	println("Hello" + toString)
	def move(dx: Double, dy: Double) = new myPoint(x + dx, y + dy)
	def distanceFromOrigin = math.sqrt(x*x + y*y)
	def *(factor: Double) = new myPoint(x*factor, y*factor)
	override def toString = f"(${x}, ${y})"
}

val p = new myPoint(3, 4)                         //> Hello(3.0, 4.0)
                                                  //| p  : Lesson4.myPoint = (3.0, 4.0)
val p1 = p.move(10, 20)                           //> Hello(13.0, 24.0)
                                                  //| p1  : Lesson4.myPoint = (13.0, 24.0)

p.x                                               //> res0: Double = 3.0
p.y                                               //> res1: Double = 4.0

p1.x                                              //> res2: Double = 13.0
p1.y                                              //> res3: Double = 24.0

val p2 = p * 5                                    //> Hello(15.0, 20.0)
                                                  //| p2  : Lesson4.myPoint = (15.0, 20.0)
(1 to 10).map (3 * _).filter(_%5 ==2)             //> res4: scala.collection.immutable.IndexedSeq[Int] = Vector(12, 27)

object Accounts{
	private var lastNumber = 0
	def newUniqueNumber() = {
		lastNumber += 1
		lastNumber
	}
	override def toString = f"${lastNumber}"
}

Accounts                                          //> res5: Lesson4.Accounts.type = 0
Accounts.newUniqueNumber                          //> res6: Int = 1
Accounts.newUniqueNumber                          //> res7: Int = 2
Accounts.newUniqueNumber                          //> res8: Int = 3


object myPoint{
	def apply(x: Double = 0, y: Double = 0) = new myPoint(x, y)
}

class Pizza (var crustSize: Int, var crustType: String){
	def this(crustSize: Int){
		this(crustSize, Pizza.DEFAULT_CRUST_TYPE)
	}
	
	def this(crustType: String){
		this(Pizza.DEFAULT_CRUST_SIZE, crustType)
	}
	
	def this(){
		this(Pizza.DEFAULT_CRUST_SIZE, Pizza.DEFAULT_CRUST_TYPE)
	}
	
	override def toString = s"A $crustSize inch pizza with $crustType crust"
}

object Pizza{
	val DEFAULT_CRUST_SIZE = 12
	val DEFAULT_CRUST_TYPE = "THIN"
	def apply(crustSize : Int, crustType : String) = new Pizza(crustSize, crustType)
}

val pizza1 = Pizza(1, "test")                     //> pizza1  : Lesson4.Pizza = A 1 inch pizza with test crust


class Time(val hour: Int, val minute: Int){
	if((hour < 0 || hour > 23) || (minute < 0 || minute > 59))
		throw new IllegalArgumentException("parameter is not type of Time")
	
	def <(other: Time) : Boolean = {
		if(hour * 60 + minute < other.hour * 60 + other.minute) true else false
	}
	
	def before(other: Time) : Boolean = {
		this < other
	}
	
	override def toString = f"$hour hour, $minute minute"
}

object Time{
	def apply(hour : Int = 0, minute: Int = 0) = new Time(hour, minute)
}

val t1 = Time(4, 12)                              //> t1  : Lesson4.Time = 4 hour, 12 minute
val t2 = Time(3, 25)                              //> t2  : Lesson4.Time = 3 hour, 25 minute
//val t3 = Time(3, 88)
t1 before t2                                      //> res9: Boolean = false
t1 < t2                                           //> res10: Boolean = false
}