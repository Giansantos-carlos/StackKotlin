import java.text.FieldPosition

class ListView(val itens: Array<String>) {

    inner class ListviewItem(){

        fun displayItem(position: Int){
            println(itens[position])
        }
    }
}