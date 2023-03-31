fun main() {
    details()
    println(getHeight(listOf(12,2,14,21,11)))
    println(indices(listOf("Ivy","Yvonne","Marrion","Becky","Brandon","Halmart","Lewin",
        "Eliza","Wenxy","Violet","Milly")))
    println(car())


}
//Given a list of 10 strings, write a function that returns a list of the strings
//at even indices i.e index 2,4,6 etc (2 points)
fun indices(names:List<String>):List<String>{
    var evenList = mutableListOf<String>()
    names.forEachIndexed { index, m ->
        if (index%2 == 0)
            evenList.add(m)
    }
    return evenList
}



//Given a list of people’s heights in metres. Write a function that returns
//the average height and the total height (2 points)
fun getHeight(height:List<Int>):String{
    var a =height.average()
    var m =height.sum()
    var y ="The average is $a and the total is $m"
    return y
}


//Given a list of Person objects, each with the attributes, name, age,
//height and weight. Sort the list in order of descending age (2 points)
data class Person(var name:String, var age:Int, var height:Int, var weight:Double)
fun details() {
    val person1 = Person("Yvonne", 22, 17, 63.5)
    val person2 = Person("Lewin", 12, 9, 34.7)
    val person3 = Person("Oscar", 46, 18, 78.0)
    val person4 = Person("Akinyi", 23, 15, 53.7)
    val person5 = Person("Wenxy", 25, 19, 73.0)
    val data = listOf(person1, person2, person3, person4, person5)
    val sortedPerson = data.sortedByDescending { data -> data.age }
    println(sortedPerson)

    //Given a list similar to the one above, write a function in which you will
//create 2 more people objects and add them to the list at one go.

    var person7 = Person("Daddy", 13, 10, 23.7)
    var person6 = Person("Kareji", 10, 3, 43.7)
    var dada = listOf(person7, person6)
    println(data.plus(dada))
}
//Write a function that takes in a list of Car objects each with a
//registration and mileage attribute and returns the average mileage of
//all the vehicles in the list.
class Vehicle(var registration:String, var mileage: Double)
fun car():Double{
    val car1=Vehicle("KDE245",34.0)
    val car2=Vehicle("DGE4563",14.0)
    val car3=Vehicle("KPZ4537",12.0)
    var all=listOf(car1, car2, car3)
    var sumMileage=all.sumOf {miles->miles.mileage }
    var avgMileage=sumMileage/all.size
    return avgMileage
}



