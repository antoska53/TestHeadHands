import kotlin.random.Random

class Monster(
    attack: Int,
    defense: Int,
    health: Int,
    damage: Damage
) : Character(attack = attack, defense = defense, health = health, damage = damage) {
    override fun attack(): Int {
        return Random.nextInt(damage.minDamage, damage.maxDamage)
    }
}