object Lesson5 {
	trait Logged{
		println("test")
		def log(msg: String){}
	}
	
	trait ConsoleLogger extends Logged{
		override def log(msg: String){
			println(msg)
		}
	}
	
	class SavingsAccount extends Logged{
		private var _balance: Double = 0
		def withdraw(amount: Double){
			if(amount > _balance) log("Insufficient funds")
			else _balance -= amount
		}
	}
	
	trait TimestampLogger extends Logged{
		override def log(msg: String){
			super.log(new java.util.Date() + " " + msg)
		}
	}
	
	trait ShortLogger extends Logged{
		val maxLength = 15
		override def log(msg: String){
			super.log(
				if(msg.length <= maxLength)msg
				else msg.substring(0, maxLength - 3) + "...")
		}
	};import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(810); 
	
	val acct1 = new SavingsAccount with ConsoleLogger with TimestampLogger with ShortLogger {override val maxLength = 30};System.out.println("""acct1  : Lesson5.SavingsAccount with Lesson5.ConsoleLogger with Lesson5.TimestampLogger with Lesson5.ShortLogger = """ + $show(acct1 ));$skip(22); 
	acct1.withdraw(1000)
	
	import java.awt._;$skip(62); 
	val rec1 = new Rectangle(5, 10, 20, 30);System.out.println("""rec1  : java.awt.Rectangle = """ + $show(rec1 ));$skip(25); 
  rec1.translate(10, 20);$skip(7); val res$0 = 
  rec1
  
  import java.awt.geom.Ellipse2D.{Double => Ellipse};System.out.println("""res0: java.awt.Rectangle = """ + $show(res$0));$skip(118); 
 	
 	val ell1 = new Ellipse(5, 10, 20, 30) with RectangleLike
  trait RectangleLike{
  	def setFrame(x: Double, y: Double, w: Double, h: Double): Unit
  	def getX: Double
  	def getY: Double
  	def getWidth: Double
  	def getHeight: Double
  	def translate(dx: Double, dy: Double){
  		setFrame(getX + dx, getY + dy, getWidth, getHeight)
  	}
  };System.out.println("""ell1  : java.awt.geom.Ellipse2D.Double with Lesson5.RectangleLike = """ + $show(ell1 ));$skip(313); 
  
  ell1.translate(10, 20);$skip(7); val res$1 = 
  ell1;System.out.println("""res1: java.awt.geom.Ellipse2D.Double with Lesson5.RectangleLike = """ + $show(res$1))}
                                                  
                                                    
}
