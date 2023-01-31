package ie.setu.classes
data class Person(var firstName: String, var lastName: String) {

    fun main(args: Array<String>) {

        val person1 = Person("Mark", "Roche")
        val person2 = person1.copy(firstName = "Clare")
        println(person1)
        println(person2.toString())
    }

}


