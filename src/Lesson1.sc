object Lesson1 {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  1+1                                             //> res0: Int(2) = 2
  var answer = 8*5+1                              //> answer  : Int = 41
  answer += 2
  System.out.println("answer:" + answer)          //> answer:43
  
  var greeting : String = "Test";                 //> greeting  : String = Test
  var greeting2 = "Hello"                         //> greeting2  : String = Hello
  
  println(greeting)                               //> Test
  println(greeting2)                              //> Hello
  
  1.+(1)                                          //> res1: Int(2) = 2
  1+1                                             //> res2: Int(2) = 2
  1.to(10)                                        //> res3: scala.collection.immutable.Range.Inclusive = Range 1 to 10

	for(i <- 1 to 10) println(i)              //> 1
                                                  //| 2
                                                  //| 3
                                                  //| 4
                                                  //| 5
                                                  //| 6
                                                  //| 7
                                                  //| 8
                                                  //| 9
                                                  //| 10

	"Hello".intersect("World")                //> res4: String = lo
	
	var i=1                                   //> i  : Int = 1
	i += 1
	i                                         //> res5: Int = 2
	
	"hello"(4)                                //> res6: Char = o
	"hello".distinct                          //> res7: String = helo
	"Hello".apply(4)                          //> res8: Char = o

	val b: BigInt = 6 * 7                     //> b  : BigInt = 42
	b.pow(1000)                               //> res9: scala.math.BigInt = 17753762175756824895023459927060785266025241338933
                                                  //| 3830121866433218470832421443603270369699806687474089104928787716429205646797
                                                  //| 9682934737077049464296605508272514364193647791450330862622357351968709701692
                                                  //| 6893626339793976210524817665943409765000450688475580477423465801765534575905
                                                  //| 4920491964687859092794286951888196893257753512961312303142500199076828672388
                                                  //| 4039475329857509148162013746924850245250142292273919281341483030761218960837
                                                  //| 8514445805866392453838204891621655580313516255949859448656514553979179772189
                                                  //| 0644779927878664436883165382211500647791238674232812627101620876741669796650
                                                  //| 3703428016749799091197870288671741073316507101401112929443006664348800957958
                                                  //| 7709799057249526838180285935375753185150620988339294477339072043844392312410
                                                  //| 9419130052412940418052056836950663290529588691785317277527334817376409223416
                                                  //| 5375653338110417193480917514902717112293281089023929392425543606079300055100
                                                  //| 344172202132003242925720
                                                  //| Output exceeds cutoff limit.

	// import has scope too
	import scala.math._
	sqrt(10)                                  //> res10: Double = 3.1622776601683795

	1.to(10).map(sqrt(_))                     //> res11: scala.collection.immutable.IndexedSeq[Double] = Vector(1.0, 1.4142135
                                                  //| 623730951, 1.7320508075688772, 2.0, 2.23606797749979, 2.449489742783178, 2.6
                                                  //| 457513110645907, 2.8284271247461903, 3.0, 3.1622776601683795)
                                                  
  6.*(7)                                          //> res12: Int(42) = 42

	Short.MaxValue                            //> res13: Short(32767) = 32767
  Int.MaxValue                                    //> res14: Int(2147483647) = 2147483647
  Long.MaxValue                                   //> res15: Long(9223372036854775807L) = 9223372036854775807
  Double.MaxValue                                 //> res16: Double(1.7976931348623157E308) = 1.7976931348623157E308
  
  "Mississippi".distinct                          //> res17: String = Misp
  "Rhine".permutations.toArray                    //> res18: Array[String] = Array(Rhine, Rhien, Rhnie, Rhnei, Rhein, Rheni, Rihne
                                                  //| , Rihen, Rinhe, Rineh, Riehn, Rienh, Rnhie, Rnhei, Rnihe, Rnieh, Rnehi, Rnei
                                                  //| h, Rehin, Rehni, Reihn, Reinh, Renhi, Renih, hRine, hRien, hRnie, hRnei, hRe
                                                  //| in, hReni, hiRne, hiRen, hinRe, hineR, hieRn, hienR, hnRie, hnRei, hniRe, hn
                                                  //| ieR, hneRi, hneiR, heRin, heRni, heiRn, heinR, henRi, heniR, iRhne, iRhen, i
                                                  //| Rnhe, iRneh, iRehn, iRenh, ihRne, ihRen, ihnRe, ihneR, iheRn, ihenR, inRhe, 
                                                  //| inReh, inhRe, inheR, ineRh, inehR, ieRhn, ieRnh, iehRn, iehnR, ienRh, ienhR,
                                                  //|  nRhie, nRhei, nRihe, nRieh, nRehi, nReih, nhRie, nhRei, nhiRe, nhieR, nheRi
                                                  //| , nheiR, niRhe, niReh, nihRe, niheR, nieRh, niehR, neRhi, neRih, nehRi, nehi
                                                  //| R, neiRh, neihR, eRhin, eRhni, eRihn, eRinh, eRnhi, eRnih, ehRin, ehRni, ehi
                                                  //| Rn, ehinR, ehnRi, ehniR, eiRhn, eiRnh, eihRn, eihnR, einRh, einhR, enRhi, en
                                                  //| Rih, enhRi, enhiR, eniRh, enihR)
  "Rhine".permutations.toArray.size               //> res19: Int = 120
  "ABC".sum                                       //> res20: Char = 횈
  "ABC".sum.toInt                                 //> res21: Int = 198
  
  "123".permutations.toArray                      //> res22: Array[String] = Array(123, 132, 213, 231, 312, 321)
  
  var x = 1                                       //> x  : Int = 1
  val z = if(x > 0) 1 else "adef"                 //> z  : Any = 1
  val k = ()                                      //> k  : Unit = ()
  
  
  for(i <- 1 to 3; j <-1 to 3 if i!=j) print((10*i+j) + " ")
                                                  //> 12 13 21 23 31 32 
  for(i <- for(i <- 1 to 10) yield i % 3){
  	println(i)                                //> 1
                                                  //| 2
                                                  //| 0
                                                  //| 1
                                                  //| 2
                                                  //| 0
                                                  //| 1
                                                  //| 2
                                                  //| 0
                                                  //| 1
  }
                  
  val x0 = 0                                      //> x0  : Int = 0
  val y0 = 0                                      //> y0  : Int = 0
  x = 5
  var y = 10                                      //> y  : Int = 10
  
  val distance = {
  	val dx = x - x0
  	val dy = y - y0
  	sqrt(dx * dx + dy * dy)
  }                                               //> distance  : Double = 11.180339887498949

	var p = 0                                 //> p  : Int = 0
	var n = 20                                //> n  : Int = 20
	while(n > 0){
		p += 1
		n = n / 2
	}
	
	def sum(args: Int*)={
		var result = 0
		for(arg <- args) result += arg
		result
	}                                         //> sum: (args: Int*)Int
	
	val sumfromdef = sum(1 to 5:_*)           //> sumfromdef  : Int = 15
	
	// Coursera - Scala (You should watch this lesson)
	
	
	def printDebug(args: Any*) = {
		for(arg <- args.toArray) print(arg + " ")
	}                                         //> printDebug: (args: Any*)Unit
	
	
	// tail: Selects all elements except the first.
	def recursiveSum(args: Int*): Int = {
		printDebug(args)
		println()
		if(args.length == 0) 0
		else args.head + recursiveSum(args.tail:_*)
	}                                         //> recursiveSum: (args: Int*)Int
	
	recursiveSum(1, 2, 3, 4, 5)               //> WrappedArray(1, 2, 3, 4, 5) 
                                                  //| WrappedArray(2, 3, 4, 5) 
                                                  //| WrappedArray(3, 4, 5) 
                                                  //| WrappedArray(4, 5) 
                                                  //| WrappedArray(5) 
                                                  //| WrappedArray() 
                                                  //| res23: Int = 15

	
}