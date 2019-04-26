object Lesson4 {

class myPoint(val x: Double, val y: Double){
	println("Hello" + toString)
	def move(dx: Double, dy: Double) = new myPoint(x + dx, y + dy)
	def distanceFromOrigin = math.sqrt(x*x + y*y)
	def *(factor: Double) = new myPoint(x*factor, y*factor)
	override def toString = f"(${x}, ${y})"
};import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(329); 

val p = new myPoint(3, 4);System.out.println("""p  : Lesson4.myPoint = """ + $show(p ));$skip(24); 
val p1 = p.move(10, 20);System.out.println("""p1  : Lesson4.myPoint = """ + $show(p1 ));$skip(5); val res$0 = 

p.x;System.out.println("""res0: Double = """ + $show(res$0));$skip(4); val res$1 = 
p.y;System.out.println("""res1: Double = """ + $show(res$1));$skip(6); val res$2 = 

p1.x;System.out.println("""res2: Double = """ + $show(res$2));$skip(5); val res$3 = 
p1.y;System.out.println("""res3: Double = """ + $show(res$3));$skip(16); 

val p2 = p * 5;System.out.println("""p2  : Lesson4.myPoint = """ + $show(p2 ));$skip(38); val res$4 = 
(1 to 10).map (3 * _).filter(_%5 ==2)

object Accounts{
	private var lastNumber = 0
	def newUniqueNumber() = {
		lastNumber += 1
		lastNumber
	}
	override def toString = f"${lastNumber}"
};System.out.println("""res4: scala.collection.immutable.IndexedSeq[Int] = """ + $show(res$4));$skip(161); val res$5 = 

Accounts;System.out.println("""res5: Lesson4.Accounts.type = """ + $show(res$5));$skip(25); val res$6 = 
Accounts.newUniqueNumber;System.out.println("""res6: Int = """ + $show(res$6));$skip(25); val res$7 = 
Accounts.newUniqueNumber;System.out.println("""res7: Int = """ + $show(res$7));$skip(25); val res$8 = 
Accounts.newUniqueNumber


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
};System.out.println("""res8: Int = """ + $show(res$8));$skip(639); 

val pizza1 = Pizza(1, "test")


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
};System.out.println("""pizza1  : Lesson4.Pizza = """ + $show(pizza1 ));$skip(514); 

val t1 = Time(4, 12);System.out.println("""t1  : Lesson4.Time = """ + $show(t1 ));$skip(21); 
val t2 = Time(3, 25);System.out.println("""t2  : Lesson4.Time = """ + $show(t2 ));$skip(36); val res$9 = 
//val t3 = Time(3, 88)
t1 before t2;System.out.println("""res9: Boolean = """ + $show(res$9));$skip(8); val res$10 = 
t1 < t2;System.out.println("""res10: Boolean = """ + $show(res$10))}
}
