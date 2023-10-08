abstract class Character(
    var attack: Int,
    var defense: Int,
    var health: Int,
    var damage: Damage
) {
    abstract fun attack(): Int
    fun calculateAttackModifier(defenseEnemy: Int): Int{
        return attack - defenseEnemy + 1
    }
}