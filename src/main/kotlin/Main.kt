var attack: Int = 0
var defense: Int = 0
var health: Int = 0
var damageMin: Int = 0
var damageMax: Int = 0


fun main(args: Array<String>) {

    initCharacter("Игрок")
    val player = Player(attack, defense, health, Damage(damageMin, damageMax))
    initCharacter("Монстр")
    val monster = Monster(attack, defense, health, Damage(damageMin, damageMax))
    val battle = Battle(player, monster)
    battle.start()
}

fun initCharacter(character: String) {
    var correctEnter = false

    while (!correctEnter) {
        println("$character : Введите значение атаки от 1 до 30")
        attack = readlnOrNull()?.toIntOrNull() ?: 0
        if (attack in 1..30) correctEnter = true
        else println("Неверный ввод")
    }

    correctEnter = false
    while (!correctEnter) {
        println("$character : Введите значение защиты от 1 до 30")
        defense = readlnOrNull()?.toIntOrNull() ?: 0
        if (defense in 1..30) correctEnter = true
        else println("Неверный ввод")
    }

    correctEnter = false
    while (!correctEnter) {
        println("$character : Введите значение здоровья")
        health = readlnOrNull()?.toIntOrNull() ?: 0
        if (health > 0) correctEnter = true
        else println("Неверный ввод")
    }

    correctEnter = false
    while (!correctEnter) {
        println("$character : Введите значение минимального урона")
        damageMin = readlnOrNull()?.toIntOrNull() ?: 0
        if (damageMin > 0) correctEnter = true
        else println("Неверный ввод")
    }

    correctEnter = false
    while (!correctEnter) {
        println("$character : Введите значение максимального урона")
        damageMax = readlnOrNull()?.toIntOrNull() ?: 0
        if (damageMax > 0 && damageMax > damageMin) correctEnter = true
        else println("Неверный ввод")
    }
}