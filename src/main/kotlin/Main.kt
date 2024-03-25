fun main(){
Calculate(4)
 isPalindrome("madam")
}


// Question 1

fun fullSentence(word:String){
 var NewWord = word.sub()
}

//Question 2

 fun statistics(numbers:Array<Int>){
    println(numbers.sum())
     println(numbers.count())
    println(numbers.average())


}


// Question 3
fun Calculate(r:Int){
    var Volume = 4/3 * 3.14 * r*r*r
    println(Volume)
}

// Question 4
fun isPalindrome(word:String): Boolean{
   if (word == word.reversed()){
       return true
   }
    else{
        return false
   }
}