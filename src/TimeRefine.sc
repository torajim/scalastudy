object TimeRefine {

class Time(h: Int, m: Int){
	if((h < 0 || h > 23) || (m < 0 || m > 59))
		throw new IllegalArgumentException("parameter is not type of Time")
	
	private val minutesSinceMidnight = h * 60 + m
	
	def hour : Int = minutesSinceMidnight / 60
	def minute : Int = minutesSinceMidnight % 60

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

val t1 = Time(2, 3)                               //> t1  : TimeRefine.Time = 2 hour, 3 minute
val t2 = Time(3, 50)                              //> t2  : TimeRefine.Time = 3 hour, 50 minute
t1 < t2                                           //> res0: Boolean = true
}