fun main(args: Array<String>) {
    //creating a variable using var keyword
    var firstNumber: Int = 10
    println(firstNumber)

    //another example of creating a variable
    var secondNumber = 20
    println(secondNumber)

    //var can be reassigned
    var test = 20
    test = 30
    println(test)

    //by default variables are non nullable
    var a: String = "abc"
    a = null  //this line will generate compilation error
    println(a)

    //declare a variable as nullable
    //Use question mark to declare a variable as nullable
    var b: String? = " abc"
    b = null
    println(b)
}