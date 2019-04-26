object Lesson7 {
  val zones = java.util.TimeZone.getAvailableIDs  //> zones  : Array[String] = Array(Africa/Abidjan, Africa/Accra, Africa/Addis_Aba
                                                  //| ba, Africa/Algiers, Africa/Asmara, Africa/Asmera, Africa/Bamako, Africa/Bangu
                                                  //| i, Africa/Banjul, Africa/Bissau, Africa/Blantyre, Africa/Brazzaville, Africa/
                                                  //| Bujumbura, Africa/Cairo, Africa/Casablanca, Africa/Ceuta, Africa/Conakry, Afr
                                                  //| ica/Dakar, Africa/Dar_es_Salaam, Africa/Djibouti, Africa/Douala, Africa/El_Aa
                                                  //| iun, Africa/Freetown, Africa/Gaborone, Africa/Harare, Africa/Johannesburg, Af
                                                  //| rica/Juba, Africa/Kampala, Africa/Khartoum, Africa/Kigali, Africa/Kinshasa, A
                                                  //| frica/Lagos, Africa/Libreville, Africa/Lome, Africa/Luanda, Africa/Lubumbashi
                                                  //| , Africa/Lusaka, Africa/Malabo, Africa/Maputo, Africa/Maseru, Africa/Mbabane,
                                                  //|  Africa/Mogadishu, Africa/Monrovia, Africa/Nairobi, Africa/Ndjamena, Africa/N
                                                  //| iamey, Africa/Nouakchott, Africa/Ouagadougou, Africa/Porto-Novo, Africa/Sao_T
                                                  //| ome, Africa/Timbuktu, Africa/Tripoli, Africa/Tunis, Africa/Windhoek, America/
                                                  //| Adak, America/Anchorage, 
                                                  //| Output exceeds cutoff limit.
  
  zones.map(s => s.split("/"))                    //> res0: Array[Array[String]] = Array(Array(Africa, Abidjan), Array(Africa, Accr
                                                  //| a), Array(Africa, Addis_Ababa), Array(Africa, Algiers), Array(Africa, Asmara)
                                                  //| , Array(Africa, Asmera), Array(Africa, Bamako), Array(Africa, Bangui), Array(
                                                  //| Africa, Banjul), Array(Africa, Bissau), Array(Africa, Blantyre), Array(Africa
                                                  //| , Brazzaville), Array(Africa, Bujumbura), Array(Africa, Cairo), Array(Africa,
                                                  //|  Casablanca), Array(Africa, Ceuta), Array(Africa, Conakry), Array(Africa, Dak
                                                  //| ar), Array(Africa, Dar_es_Salaam), Array(Africa, Djibouti), Array(Africa, Dou
                                                  //| ala), Array(Africa, El_Aaiun), Array(Africa, Freetown), Array(Africa, Gaboron
                                                  //| e), Array(Africa, Harare), Array(Africa, Johannesburg), Array(Africa, Juba), 
                                                  //| Array(Africa, Kampala), Array(Africa, Khartoum), Array(Africa, Kigali), Array
                                                  //| (Africa, Kinshasa), Array(Africa, Lagos), Array(Africa, Libreville), Array(Af
                                                  //| rica, Lome), Array(Africa, Luanda), Array(Africa, Lubumbashi), Array(Africa, 
                                                  //| Lusaka), Array(Africa, Ma
                                                  //| Output exceeds cutoff limit.
  zones.map(s => s.split("/"))
  .filter(_.length >=2)
  .map(_(1))
  .grouped(10)
  .map(_.last)
  .toList                                         //> res1: List[String] = List(Bissau, Djibouti, Kigali, Maseru, Sao_Tome, Argent
                                                  //| ina, Argentina, Belem, Caracas, Cuiaba, El_Salvador, Guadeloupe, Indiana, Ju
                                                  //| neau, Maceio, Metlakatla, Nipigon, Phoenix, Regina, Shiprock, Thule, Yellowk
                                                  //| nife, Syowa, Ashgabat, Brunei, Dili, Irkutsk, Katmandu, Makassar, Pyongyang,
                                                  //|  Singapore, Tomsk, Yekaterinburg, Reykjavik, Darwin, Queensland, West, Easte
                                                  //| rIsland, GMT+5, GMT-13, GMT0, Belfast, Dublin, Lisbon, Nicosia, Saratov, Vad
                                                  //| uz, Chagos, BajaNorte, Enderbury, Kiritimati, Pago_Pago, Tarawa, EST5, Aleut
                                                  //| ian, Pacific-New, Samoa)
  def power(numbers: Array[Int]) = {
  	import scala.math._
  }                                               //> power: (numbers: Array[Int])Unit

	power(Array(1, 2, 3))


	def concat(strings: Seq[String], seperator: String) = {
		strings.reduce(_ + seperator + _)
	}                                         //> concat: (strings: Seq[String], seperator: String)String
	
	concat(Array("Mary", "had", "a", "little", "lamb"), " ")
                                                  //> res2: String = Mary had a little lamb
  def powc(x: Double)(y: Double) : Double = {
  	(1 to y.toInt).map(s => x).reduceLeft(_*_)
  }                                               //> powc: (x: Double)(y: Double)Double
  
  powc(2)(powc(2)(5))                             //> res3: Double = 4.294967296E9
  
  val n = 10                                      //> n  : Int = 10
  var i = 1                                       //> i  : Int = 1
  var f = 1                                       //> f  : Int = 1
    
  def While1(cond: () => Boolean, body: () => Unit){
 		if(cond()){
 			body()
 			While1(cond, body)
 		}
  }                                               //> While1: (cond: () => Boolean, body: () => Unit)Unit
  
  While1(() => i<n, () => {f *= i; i += 1; println(f)})
                                                  //> 1
                                                  //| 2
                                                  //| 6
                                                  //| 24
                                                  //| 120
                                                  //| 720
                                                  //| 5040
                                                  //| 40320
                                                  //| 362880
                                                  
  val Array(first, second, last@_*) = Array(1, 2, 3, 4)
                                                  //> first  : Int = 1
                                                  //| second  : Int = 2
                                                  //| last  : Seq[Int] = Vector(3, 4)
                                                    
}