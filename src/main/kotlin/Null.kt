fun main(){
    var text: String? = "Gian"
    text = "The variableis not null"
   if (text != null){
       println(text.length)
   }else{
       println("The vairiable is null!")
   }

    println(text?.length)

    var text2: String = text ?: "The variable is null"
    println(text2)
}