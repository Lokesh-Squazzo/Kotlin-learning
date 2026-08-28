package collections
/*
So in Kotlin as far now i saw three types:
    1. Lists -> these are ordered in nature, which can also have duplicate items/elements too.
    2. Sets -> these are unordered in nature, it does not allow u to insert duplicate (if u do it will still ignore it).
    3. Maps -> these are key-value pair, like fruit --> price ( apple = 70 rupees) here fruit is key and price is value.
 */
/*
In kotlin the above collections have 2 nature
    First one is read-only (non-mutable), we can't change it.
    Second one is mutable, we can change it.

    Easy Syntax when we use collection if we are using direct name of collection then it is read-only.
    and if we use Mutable+Collection name then it is mutable.

   eg. List which is read-only; val nameList: List<String> = listOf("Lokesh", "Suraj");
       List which is mutable; val nameList: MutableList<String> = mutableListOf("Lokesh", "Suraj");
       same follows for Set and map ( map having 'to' in it go bellow.
 */
/*
we can .add() or .remove() elements in list and set, for map we have .remove(),
but we can add via mapName["NewKey"]= "Value";
 */
fun main(){
    /*
    ------------List--------------
    .add(), .remove(), .count(), .first(), .last(), [index], in (for checking if element present).
     */
    val nameList = listOf("Lokesh", "Suraj", "Jayesh");
    // we can't do nameList.add("Hitesh") it will give error.
    //kotlin will infer it to string type.
    val nameList2: MutableList<String> = mutableListOf("Lokesh");
    println(nameList2);
    nameList2.add("Jayesh");
    nameList2.add("Suraj")
    println(nameList2);
    nameList2.remove("Suraj");
    println(nameList2);
    println("Number of Element ${nameList2.count()}");
    println("Suraj Present in list : ${"Suraj" in nameList2}");

    /*
    ---------------Set----------------
    .add(), .remove(), in, .count()
     */
    val nameSet: Set<String> = setOf("Lokesh","Jayesh","Jayesh");
    println(nameSet);
    // same for mutable set.
    println("Lokesh is in set : ${"Lokesh" in nameSet}");

    /*
    ------------Map----------
    .keys, .values, in, .count(), remove(), .containsKey()
     */
    val mapOfName: MutableMap<String, Int> =
        mutableMapOf("Lokesh" to 1, "Jayesh" to 2, "Suraj" to 3);
    println("Number of Element ${mapOfName.count()}")
    println("Roll number of Lokesh: ${mapOfName["Lokesh"]}");
    mapOfName["Saurabh"] =4;
    println(mapOfName);
    mapOfName.remove("Saurabh");
    println("All keys: ${mapOfName.keys}");
    println(mapOfName.contains("Lokesh"))
    println("Lokesh" in mapOfName);

}
