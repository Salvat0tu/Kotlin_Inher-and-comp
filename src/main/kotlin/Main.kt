fun main(args: Array<String>) {
    //INTERFACES
    val n1 = Sum(43, 7)
    val n2 = Subtraction(50, 25)
    println(n1.operation())
    println(n2.operation())

    //INHERITANCE
    val cucciolo = Pet("Cane", 6)
    val cucciolo1 = Fido(7)
    val cucciolo2 = Salem(3)
    println(cucciolo.showDetails())
    println(cucciolo1.showDetails())
    println(cucciolo2.showDetails())
}

// INTERFACES:
interface Calculator {
    val num1: Int
    val num2: Int
    fun operation(): Int
}

class Sum(override val num1: Int, override val num2: Int) : Calculator {
    override fun operation(): Int {
        return num1 + num2
    }
}

class Subtraction(override val num1: Int, override val num2: Int) : Calculator {
    override fun operation(): Int {
        return num1 - num2
    }
}


//INHERITANCE


open class Pet(val type: String, open val age: Int) {
    open fun showDetails(): String {
        return "Type of pet : $type  Age of pet : $age"
    }
}

class Fido(override val age: Int) : Pet("Cane", age) {
    override fun showDetails(): String {
        return  super.showDetails()
    }

}

class Salem(override val age: Int) : Pet("Gatto", age) {
    override fun showDetails(): String {
        return super.showDetails()
    }

}