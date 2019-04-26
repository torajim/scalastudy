object Lesson8 {
  val ch = '+'                                    //> ch  : Char = +
  
  val sign = ch match{
  	case '+' => 1
  	case '-' => -1
  	case _ => "nothing"
  }                                               //> sign  : Any = 1
  
  val pair = (3,1)                                //> pair  : (Int, Int) = (3,1)
  
  val st = pair match{
  	case (0, _) => "0, ...."
  	case (y, 0) => y + "..0"
  	case _ => "neither is 0"
  }                                               //> st  : String = neither is 0
  
  val arr = Array(0, 1, 2, 3, 4)                  //> arr  : Array[Int] = Array(0, 1, 2, 3, 4)
  
  val out = arr match{
  	case Array(0) => "0"
  	case Array(x, y) => x + " " + y
  	case Array(0, _*) => "0....."
  	case _=> "something else"
  }                                               //> out  : String = 0.....
  
  val Array(first, second, last@_*) = Array(1, 2, 3, 4)
                                                  //> first  : Int = 1
                                                  //| second  : Int = 2
                                                  //| last  : Seq[Int] = Vector(3, 4)
  
  def swap(src : Array[Int]) : Array[Int] = {
  	src match{
  		case Array(x, y, _*) => Array(y, x, src.length)
  		case _ => src
  	}
  }                                               //> swap: (src: Array[Int])Array[Int]
  
  swap(Array(1, 2, 3, 4, 5))                      //> res0: Array[Int] = Array(2, 1, 5)

	abstract class Item
	case class Article(description: String, price: Double) extends Item
	case class Bundle(description: String, discount: Double, items: Item*) extends Item

	val book = Article("Learn Scala", 39.95)  //> book  : Lesson8.Article = Article(Learn Scala,39.95)
	val jinro = Bundle("Jinro Soju", 9.95)    //> jinro  : Lesson8.Bundle = Bundle(Jinro Soju,9.95,WrappedArray())
	val gift = Bundle("gift", 10, book, jinro)//> gift  : Lesson8.Bundle = Bundle(gift,10.0,WrappedArray(Article(Learn Scala,3
                                                  //| 9.95), Bundle(Jinro Soju,9.95,WrappedArray())))

  def price(item : Item) : Double = {
  	item match{
  		case Article(x, y) => y
  		case Bundle(x, y) => y
  		case Bundle(x, y, others@_*) => others.map(price(_)*(1-y)).reduce(_+_)
  		case _ => 0.0
  	}
  }                                               //> price: (item: Lesson8.Item)Double
  price(book)                                     //> res1: Double = 39.95
  price(jinro)                                    //> res2: Double = 9.95

	val special = Bundle("Father's day special", 10.0, Article("Learn Scala", 39.95), Bundle("Soju Sampler", 5, Article("Jinro", 9.95), Article("Like First", 9.95)))
                                                  //> special  : Lesson8.Bundle = Bundle(Father's day special,10.0,WrappedArray(A
                                                  //| rticle(Learn Scala,39.95), Bundle(Soju Sampler,5.0,WrappedArray(Article(Jin
                                                  //| ro,9.95), Article(Like First,9.95)))))
  price(special)                                  //> res3: Double = 356.84999999999997
  
  val Bundle(_, _, Article(des, pr), _*) = special//> des  : String = Learn Scala
                                                  //| pr  : Double = 39.95
}