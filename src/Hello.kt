import sealed.Manager

fun main(args: Array<String>) {
    val manager = Manager(yearsOfExperience = 7, name = "Leandro", lastName = "Maro")

    println("Manager seniority: ${manager.seniority} and Manager gender: ${manager.gender}")
    manager.gender = Gender.Male
    println("Manager gender: ${manager.gender}")
}
/*
  Data class wont compile because is outside of sealed package
 */
// data class Test(val test: String) : Human