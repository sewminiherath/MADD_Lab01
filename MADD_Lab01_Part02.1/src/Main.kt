abstract class Employee(val name: String, val id: Int) {
    abstract fun calculateSalary(): Double
    abstract fun displayInfo()
}

class TemporaryStaff(name: String, id: Int, val hoursWorked: Int, val hourlyRate: Double) : Employee(name, id) {
    override fun calculateSalary(): Double {
        return hoursWorked * hourlyRate
    }

    override fun displayInfo() {
        println("Temporary Staff - Name: $name, ID: $id, Salary: ${calculateSalary()}")
        }
}

class PermanentStaff(name: String, id: Int, val monthlySalary: Double, val bonus: Double) : Employee(name, id) {
    override fun calculateSalary(): Double {
        return monthlySalary + bonus
    }

    override fun displayInfo() {
        println("Permanent Staff - Name: $name, ID: $id, Salary: ${calculateSalary()}")
        }
}

fun main() {
    val temp = TemporaryStaff("Nimal", 101, 120, 500.0)
    val perm = PermanentStaff("Kamal", 102, 60000.0, 10000.0)

    temp.displayInfo()
    perm.displayInfo()
}