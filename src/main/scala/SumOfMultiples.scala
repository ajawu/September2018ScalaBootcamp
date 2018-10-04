object SumOfMultiples {
  def sum(factors: Set[Int], limit: Int): Int = {
    var total = 0
    def divisible(number: Int, facs: Set[Int]): Boolean={
      for(arg <- facs){
        if (number % arg == 0){
          return true
        }
      }
      return false
    }
    
    for (count <- 1 to limit - 1){
      if (divisible(count, factors)) total = total + count
    }
    total
  }
}