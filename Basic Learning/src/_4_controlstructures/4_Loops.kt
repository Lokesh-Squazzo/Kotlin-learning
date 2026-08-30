package _4_controlstructures

import javax.xml.transform.sax.SAXResult

fun main(){
    /*
    here we have same 3 loops
        1. While
        2. For (changed)
        3. do-While
     */
    /*
    Before loop we need to understand 'range'(..) operator
    this tells start to end ( start<End)
    eg. 1..5  means 1,2,3,4,5
    if in reverse order then 5 downTo 1  means 5,4,3,2,1

    suppose we want to skip some means step like 5,3,1 step of 2
    so we will like 5 downTo 1 step 2
    or 1..5 step 2  it will be like 1,3,5

    suppose 1..5 but we want dont want 5 means below it so,
    1..<5  1,2,3,4
     */

    for(i in 1..5){
        println(i)
    }
    /*
    we can iterate over a collection to using this for()
     */
    val names:List<String> = listOf("Lokesh","Suresh","Jayesh","Sujal");
    for (name: String in names){
        println(name)
    }
    println("While loop below")
    var i = 0
    while (i < names.count()) {
        println(names[i])
        i++
    }
}