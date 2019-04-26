object Lesson2 {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(96); 
  def printDebug(args: Any*) = {
		for(arg <- args.toArray) print(arg + " ")
	};System.out.println("""printDebug: (args: Any*)Unit""");$skip(85); 
	
	def isVowel(ch: Char) : Boolean = {
		val vowel = "aeiou"
		vowel.contains(ch)
	};System.out.println("""isVowel: (ch: Char)Boolean""");$skip(16); val res$0 = 
	
	isVowel('k');System.out.println("""res0: Boolean = """ + $show(res$0));$skip(71); 
	
	def vowels(s: String) = {
		for(ch <- s if isVowel(ch)) yield ch
	};System.out.println("""vowels: (s: String)String""");$skip(25); val res$1 = 
	
	vowels("sdfwefsaidf");System.out.println("""res1: String = """ + $show(res$1));$skip(19); 
	
	var result = "";System.out.println("""result  : String = """ + $show(result ));$skip(172); 
	
	def vowels_recursive(s: String) : String = {
		if(s.length == 0) ""
		else if(isVowel(s.head)) {
			result = result + s.head
			vowels_recursive(s.tail)
		}
		result
	};System.out.println("""vowels_recursive: (s: String)String""");$skip(30); val res$2 = 
	
	vowels_recursive("aeisdf");System.out.println("""res2: String = """ + $show(res$2));$skip(183); 


	def vowels_refined(s: String, vowelChars: String = "aeiou", ignoreCase: Boolean = true) = {
		for(ch <- if(ignoreCase) s.toLowerCase else s if vowelChars.contains(ch)) yield ch
	};System.out.println("""vowels_refined: (s: String, vowelChars: String, ignoreCase: Boolean)String""");$skip(49); val res$3 = 
	
	vowels_refined("Abcdefghi", ignoreCase=false);System.out.println("""res3: String = """ + $show(res$3));$skip(46); val res$4 = 
	vowels_refined("Abcdefghi", ignoreCase=true);System.out.println("""res4: String = """ + $show(res$4));$skip(47); val res$5 = 
	
	vowels_refined("Abcdefghi", "AEIOU", false);System.out.println("""res5: String = """ + $show(res$5))}
}
