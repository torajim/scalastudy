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
};import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(639); 

val t1 = Time(2, 3);System.out.println("""t1  : TimeRefine.Time = """ + $show(t1 ));$skip(21); 
val t2 = Time(3, 50);System.out.println("""t2  : TimeRefine.Time = """ + $show(t2 ));$skip(8); val res$0 = 
t1 < t2;System.out.println("""res0: Boolean = """ + $show(res$0))}
}
