fun main(args: Array<String>) {
    //Creating a variable using val keyword
    val firstNumber: Int = 10
    println(firstNumber)

    //Another way of creating a variable
    val secondNumber = 20
    println(secondNumber)

    //One more way of defining a variable
    val thirdNumber: Int
    thirdNumber = 30
    println(thirdNumber)

    //Another example of variable creation
    //This code will generate compilation error
    val fourthNumber    
    fourthNumber = 20
    println(fourthNumber)

    //val is the read only variable
    //this code will generate compilation error
    val fifthNumber = 40
    fifthNumber = 50
    println(fifthNumber)

}                                             