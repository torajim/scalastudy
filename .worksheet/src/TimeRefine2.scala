object TimeRefine2 {
class Time(private var _hour: Int, private var _minute: Int){
	def hour = _hour
	def minute = _minute
	
	def hour_= (newValue:Int) = {
		_hour = newValue
	}
	
	def minute_= (newValue:Int) = {
		_minute = newValue
	}

	if((hour < 0 || hour > 23) || (minute < 0 || minute > 59))
		throw new IllegalArgumentException("parameter is not type of Time")
	
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
};import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(797); 

val t1 = Time(0, 0);System.out.println("""t1  : TimeRefine2.Time = """ + $show(t1 ));$skip(21); 
val t2 = Time(2, 59);System.out.println("""t2  : TimeRefine2.Time = """ + $show(t2 ));$skip(8); val res$0 = 
t1 < t2;System.out.println("""res0: Boolean = """ + $show(res$0));$skip(14); 

t2.hour = 10;$skip(3); val res$1 = 
t2;System.out.println("""res1: TimeRefine2.Time = """ + $show(res$1));$skip(15); 

t2.hour_=(23);$skip(3); val res$2 = 
t2;System.out.println("""res2: TimeRefine2.Time = """ + $show(res$2));$skip(7); val res$3 = 

t1-t2;System.out.println("""res3: Int = """ + $show(res$3))}
}
