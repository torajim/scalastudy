object Lesson8 {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(31); 
  val ch = '+';System.out.println("""ch  : Char = """ + $show(ch ));$skip(88); 
  
  val sign = ch match{
  	case '+' => 1
  	case '-' => -1
  	case _ => "nothing"
  };System.out.println("""sign  : Any = """ + $show(sign ));$skip(22); 
  
  val pair = (3,1);System.out.println("""pair  : (Int, Int) = """ + $show(pair ));$skip(114); 
  
  val st = pair match{
  	case (0, _) => "0, ...."
  	case (y, 0) => y + "..0"
  	case _ => "neither is 0"
  };System.out.println("""st  : String = """ + $show(st ));$skip(36); 
  
  val arr = Array(0, 1, 2, 3, 4);System.out.println("""arr  : Array[Int] = """ + $show(arr ));$skip(151); 
  
  val out = arr match{
  	case Array(0) => "0"
  	case Array(x, y) => x + " " + y
  	case Array(0, _*) => "0....."
  	case _=> "something else"
  };System.out.println("""out  : String = """ + $show(out ));$skip(59); 
  
  val Array(first, second, last@_*) = Array(1, 2, 3, 4);System.out.println("""first  : Int = """ + $show(first ));System.out.println("""second  : Int = """ + $show(second ));System.out.println("""last  : Seq[Int] = """ + $show(last ));$skip(142); 
  
  def swap(src : Array[Int]) : Array[Int] = {
  	src match{
  		case Array(x, y, _*) => Array(y, x, src.length)
  		case _ => src
  	}
  };System.out.println("""swap: (src: Array[Int])Array[Int]""");$skip(32); val res$0 = 
  
  swap(Array(1, 2, 3, 4, 5))

	abstract class Item
	case class Article(description: String, price: Double) extends Item
	case class Bundle(description: String, discount: Double, items: Item*) extends Item;System.out.println("""res0: Array[Int] = """ + $show(res$0));$skip(219); 

	val book = Article("Learn Scala", 39.95);System.out.println("""book  : Lesson8.Article = """ + $show(book ));$skip(40); 
	val jinro = Bundle("Jinro Soju", 9.95);System.out.println("""jinro  : Lesson8.Bundle = """ + $show(jinro ));$skip(44); 
	val gift = Bundle("gift", 10, book, jinro);System.out.println("""gift  : Lesson8.Bundle = """ + $show(gift ));$skip(211); 

  def price(item : Item) : Double = {
  	item match{
  		case Article(x, y) => y
  		case Bundle(x, y) => y
  		case Bundle(x, y, others@_*) => others.map(price(_)*(1-y)).reduce(_+_)
  		case _ => 0.0
  	}
  };System.out.println("""price: (item: Lesson8.Item)Double""");$skip(14); val res$1 = 
  price(book);System.out.println("""res1: Double = """ + $show(res$1));$skip(15); val res$2 = 
  price(jinro);System.out.println("""res2: Double = """ + $show(res$2));$skip(164); 

	val special = Bundle("Father's day special", 10.0, Article("Learn Scala", 39.95), Bundle("Soju Sampler", 5, Article("Jinro", 9.95), Article("Like First", 9.95)));System.out.println("""special  : Lesson8.Bundle = """ + $show(special ));$skip(17); val res$3 = 
  price(special);System.out.println("""res3: Double = """ + $show(res$3));$skip(54); 
  
  val Bundle(_, _, Article(des, pr), _*) = special;System.out.println("""des  : String = """ + $show(des ));System.out.println("""pr  : Double = """ + $show(pr ))}
}
