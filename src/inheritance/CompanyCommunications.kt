package inheritance

import java.time.Year

fun main() {
    //Singleton
    println(CompanyCommunications.getTagLine())
    println(CompanyCommunications.getCopyrightLine())
    //Companion Object
    println(SomeClass.accessPrivateVar())
    val someClass1 = SomeClass.justAssign("just a string")
    val someClass2 = SomeClass.upperOrLowerCase("Want this to be upper", false)
    println(someClass1.SomeString)
    println(someClass2.SomeString)
    //Anonymous Object
    wantSomeInterface(object : SomeInterface {
        override fun mustImplementThis(num: Int): String = "this is from must Implement: ${num * 100}"
    })
    //Enum
    println(Department.IT.getDepInfo())

}

enum class Department(val fullname: String, val numEployees: Int) {
    HR("HR", 5),
    IT("IT", 45);

    fun getDepInfo() = "the $fullname dep has $numEployees employees"
}

object CompanyCommunications { //object keyword, no class. Singleton
    val currentYear = Year.now().value
    fun getTagLine() = "Our company is good company"
    fun getCopyrightLine() = "Copyright $currentYear"
}

class SomeClass private constructor(val SomeString: String) { // Companion object
    companion object {
        private var privateVar = 6
        fun accessPrivateVar() = "Accessing private var - $privateVar"

        fun justAssign(str: String) = SomeClass(str)
        fun upperOrLowerCase(str: String, lowerCase: Boolean): SomeClass {
            if (lowerCase) {
                return SomeClass(str.toLowerCase())
            } else {
                return SomeClass(str.toUpperCase())
            }
        }
    }
}

interface SomeInterface {
    fun mustImplementThis(num: Int): String
}

fun wantSomeInterface(someInterface: SomeInterface) {
    println("Printing from SomeInterface ${someInterface.mustImplementThis(22)}")
}