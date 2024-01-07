fun main(){


    val loginButton =  Button("Login", 1234, object : OnCliclListener {
        override fun onclick() {
            // login ythe user
        }
    })
    val signUpButton = Button("Sing Up", 1234, object : OnCliclListener {
        override fun onclick() {
            // sing up the user
        }
    } )
}