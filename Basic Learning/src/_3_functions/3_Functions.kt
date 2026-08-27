/*
In kotlin we make function via fun keyword with passing arguments or empty arguments.
syntax fun funcName(parameter:Type,..):ReturnType
eg.     fun calculateSum( a:Int, b:Int) :Int {
            return a+b;
        }
           -----or-----
        fun calculateSum(a:Int, b:Int) :Int = a+b
        we can also omit :Int return type compiler will identidy automatically.

In java we have void when function/method does not return anything in kotlin
we have :Unit which is similar to void in java, but no exactly. void is keyword in java but Unit is class in kotlin.
 */
@file: JvmName("Util") //check line number 37
package _3_functions
//function 1.
fun sumOfTwo(a:Int, b:Int):Int{
    val sum:Int= a+b;
    return sum;
}
//function 2.
fun subOfTwo(a:Int, b:Int) = a-b;  // here i can omit the :Int return type because kt will treat as expression.
//function 3.
fun multiOfTwo(a:Int, b:Int):Unit{ //we can omit :Unit also.
    println(a*b);}
//function 4.
fun divideOfTwo(a: Int, b: Int){
    println(a/b);
}
fun main(){
    val sumOfTwo = sumOfTwo(2, 4);
    println(sumOfTwo);
    println(subOfTwo(1,2));
    multiOfTwo(2,3);
    divideOfTwo(8,2);
}
/*
we have 3 type of function, top level (similar to static in java), local, & class functions.
suppose when u want to use kotlin top level function in java class how we do it?
    -> we do it like static function ClassName.functionName();
    eg. suppose i have .kt file as MyFunc.kt in which top level fun is heyHi()
        function is in package first.
    i will simply import it as import first.MyFuncKt;
    then use it like
    Javaclass{
        MyFuncKt.heyHi();
    }
    or
    import static first.MyFuncKt;
    Javaclass {
        heyHi();
    }
    i can change JvmName for that class too via annoation
    @file:JvmName ("CustomName")

    check java class 'TestClassForKotlinFunction' for demonstration.
 */

