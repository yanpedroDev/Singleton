fun main() {
    println("Quantos usuarios deseja cadastrar? ")
    val quantity = readLine()?.toIntOrNull() ?: 0

    for (i in 1..quantity) {
        println("Nome do usuario $i: ")
        val name = readLine() ?: ""
        UserManager.addUser(name)
    }
    val users = UserManager.listUsers()
}

class User(val id: Int, val name: String)
object UserManager {

    private val users = mutableListOf<User>()

    fun addUser(name: String) {
        val id = users.size + 1
        val user = User(id, name)
        users.add(user)
    }
    fun listUsers() {
        println("\nUsuarios Cadastrados: ")
        for (user in users) {
            println("${user.id} - ${user.name}")
        }
    }
}
