/*
We have 2 types of vairable here
    1. Val -> it is like java final, which we can't reassign
    2. Var -> it is mutable means we can reassign it.
    example: val name= "Lokesh"
                name = "Suresh" ---> compilation error we can't reassign
             but,
             var name="Lokesh"
                name="Suresh" --> it works fine.
 */

fun main(){
    val name : String = "Lokesh"
    println("Hello $name");

    var name2: String ="lokesh"
    println("Hello $name2");
    name2 = "Suresh";
    println("Hello $name2");

    /*
    Even thought kotlin is static language but we can omit specifying the type of variable.
    but when we are not sure about what will be input it's better to provide type via :String, :Int etc.
     */

    var word = "Lokesh"
//    word=1;  // it wil give error becuase word was meant to store string not integer.
    println(word);


    /*
    Simple calculator program.
     */
    val person1: String= "Lokesh";
    val input1:Int = 1;
    val input2 : Int= 3 // it's fine to give space for declaring type.
    println("Calculator calculated values for $person1: ${input1 + input2}");



}