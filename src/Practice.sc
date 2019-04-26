object Practice {
  // 함수 세개
  // (1) def recPas ==> algorithnm 실행 (에러체킹 없음) (헬퍼는 within scope으로 만들것)
  // (2) def callRecPas(row, col) ==> 에러체킹(에러던지기) else recPas 호출
  // (3) callRecPas를 써서 그리는 애
  
  def callRecPas(row : Int, col : Int) : Int = {
  	if(row < 0 || col < 0 || col > row){
  		throw new IllegalArgumentException("Illegal")
  	}
  	
  	var result = 0
  	result = recPas(row, col)
  	
  	def recPas(r: Int, c: Int) : Int= {
  		if(r==1 && c==1) 1
  		(r, c) match {
  		   case (_ , 1) => 1
  			 case (x , y) if x==y => 1
  			 case (x , y) => recPas(x-1, y-1) + recPas(x-1, y)
  		}
  	}
  	result
  }                                               //> callRecPas: (row: Int, col: Int)Int
  
  def drawPascal(depth : Integer) : Unit = {
  	for(i <- (1 to depth); j <- (1 to i)){
  		print(callRecPas(i, j) + " ")
  		if(i==j)println()
  	}
  }                                               //> drawPascal: (depth: Integer)Unit
  
  drawPascal(5)                                   //> 1 
                                                  //| 1 1 
                                                  //| 1 2 1 
                                                  //| 1 3 3 1 
                                                  //| 1 4 6 4 1 
}