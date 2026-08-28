@file: JvmName("Util2")
package _3_functions

/*
In this file i am trying to, learn default and arugment function.
 */

fun main(){
    println(
        listOf<String>("1","2","Lokesh","Suresh")
            .joinToString(separator = ",", prefix = "[ ", postfix=" ]")
    );
    /*
    here in this case, joinToString is a function which having three arguments.
        1.separator  -> default value is : ", "
        2.prefix  -> default value is : ""
        3.postfix -> default value is : ""
        but we provided our own values to.
     */

    printChar('$',7) //print $ 10 times
    println()
    printChar('@'); // print @ for 5 times(default)
//    printChar(10) // compile time error because it is expecting character in first arg.
    println()
    printChar(i=10) //this will work;

}

fun printChar(character: Char='*', i: Int= 5 ){
    repeat(i){
        print(character);
    }
    /*
     here by default it will print * 5 times.
     output: - *****
     */
}


/*
we can call default argument function in java,
but we need to give all argument it will not take default;
check TestClassForKotlinFunction class.
 */
/*
To overcome this thing, we have one annotation which will overload this above methods,
it will be done via Jvm.
annotation name is @JvmOverloads which create (number of arguments + 1) number of methods.
example in our case of
        fun printChar(character: Char='*', i: Int= 5 ) here we have 2 parameter so
        jvm will make 3 methods:
              1. fun printChar(character: Char='*', i: Int= 5 ){..}
              2. fun printChar(character: Char='*'){..}
              3. fun printChar(){..}
Check below function.
 */

@JvmOverloads
fun testWorkingOfJvmOverloads(char: Char='*', size: Int =6)= repeat(size){ print(char); }

