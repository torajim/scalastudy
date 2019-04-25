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
	}
	
	val acct1 = new SavingsAccount with ConsoleLogger with TimestampLogger with ShortLogger {override val maxLength = 30}
                                                  //> test
                                                  //| acct1  : Lesson5.SavingsAccount with Lesson5.ConsoleLogger with Lesson5.Time
                                                  //| stampLogger with Lesson5.ShortLogger = Lesson5$$anon$2@d041cf
	acct1.withdraw(1000)                      //> Thu Apr 25 16:40:26 KST 2019 Insufficient funds
	
	import java.awt._
	val rec1 = new Rectangle(5, 10, 20, 30)   //> rec1  : java.awt.Rectangle = java.awt.Rectangle[x=5,y=10,width=20,height=30]
                                                  //| 
  rec1.translate(10, 20)
  rec1                                            //> res0: java.awt.Rectangle = java.awt.Rectangle[x=15,y=30,width=20,height=30]
                                                  //| 
  
  import java.awt.geom.Ellipse2D.{Double => Ellipse}
 	
 	val ell1 = new Ellipse(5, 10, 20, 30) with RectangleLike
                                                  //> ell1  : java.awt.geom.Ellipse2D.Double with Lesson5.RectangleLike = Lesson5
                                                  //| $$anon$1@19660000
  trait RectangleLike{
  	def setFrame(x: Double, y: Double, w: Double, h: Double): Unit
  	def getX: Double
  	def getY: Double
  	def getWidth: Double
  	def getHeight: Double
  	def translate(dx: Double, dy: Double){
  		setFrame(getX + dx, getY + dy, getWidth, getHeight)
  	}
  }
  
  ell1.translate(10, 20)
  ell1                                            //> res1: java.awt.geom.Ellipse2D.Double with Lesson5.RectangleLike = Lesson5$$
                                                  //| anon$1@1d420000
                                                  
                                                    
}