import java.util.EventListener

class Button(val text: String, val id : Int, val onClickListener: OnCliclListener) {
}



interface OnCliclListener{
    fun onclick()
}