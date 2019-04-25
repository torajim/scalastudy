object TimeRefine2 {
class Time(private var _hour: Int, private var _minute: Int){
	if((hour < 0 || hour > 23) || (minute < 0 || minute > 59))
		throw new IllegalArgumentException("parameter is not type of Time")
	
	def hour = _hour
	def minute = _minute
	
	def hour_= (newValue:Int) = {
		_hour = newValue
	}
	
	def minute_= (newValue:Int) = {
		_minute = newValue
	}
	
	def <(other: Time) : Boolean = {
		if(hour * 60 + minute < other.hour * 60 + other.minute) true else false
	}
	
	def before(other: Time) : Boolean = {
		this < other
	}
	
	def -(other: Time) : Int = {
		(hour * 60 + minute) - (other.hour * 60 + other.minute)
	}
	
	override def toString = f"$hour hour, $minute minute"
}

object Time{
	def apply(hour : Int = 0, minute: Int = 0) = new Time(hour, minute)
}

val t1 = Time(0, 0)                               //> t1  : TimeRefine2.Time = 0 hour, 0 minute
val t2 = Time(2, 59)                              //> t2  : TimeRefine2.Time = 2 hour, 59 minute
t1 < t2                                           //> res0: Boolean = true

t2.hour = 10
t2                                                //> res1: TimeRefine2.Time = 10 hour, 59 minute

t2.hour_=(23)
t2                                                //> res2: TimeRefine2.Time = 23 hour, 59 minute

t1-t2                                             //> res3: Int = -1439
}