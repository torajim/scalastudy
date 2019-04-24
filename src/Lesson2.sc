object Lesson2 {
  def printDebug(args: Any*) = {
		for(arg <- args.toArray) print(arg + " ")
	}                                         //> printDebug: (args: Any*)Unit
	
	def isVowel(ch: Char) : Boolean = {
		val vowel = "aeiou"
		vowel.contains(ch)
	}                                         //> isVowel: (ch: Char)Boolean
	
	isVowel('k')                              //> res0: Boolean = false
	
	def vowels(s: String) = {
		for(ch <- s if isVowel(ch)) yield ch
	}                                         //> vowels: (s: String)String
	
	vowels("sdfwefsaidf")                     //> res1: String = eai
	
	var result = ""                           //> result  : String = ""
	
	def vowels_recursive(s: String) : String = {
		if(s.length == 0) ""
		else if(isVowel(s.head)) {
			result = result + s.head
			vowels_recursive(s.tail)
		}
		result
	}                                         //> vowels_recursive: (s: String)String
	
	vowels_recursive("aeisdf")                //> res2: String = aei


	def vowels_refined(s: String, vowelChars: String = "aeiou", ignoreCase: Boolean = true) = {
		for(ch <- if(ignoreCase) s.toLowerCase else s if vowelChars.contains(ch)) yield ch
	}                                         //> vowels_refined: (s: String, vowelChars: String, ignoreCase: Boolean)String
	
	vowels_refined("Abcdefghi", ignoreCase=false)
                                                  //> res3: String = ei
	vowels_refined("Abcdefghi", ignoreCase=true)
                                                  //> res4: String = aei
	
	vowels_refined("Abcdefghi", "AEIOU", false)
                                                  //> res5: String = A
}