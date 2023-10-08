import kotlin.random.Random

class Player(
    attack: Int,
    defense: Int,
    health: Int,
    damage: Damage
) : Character(attack = attack, defense = defense, health = health, damage = damage) {
    private var manaHeal = 4
    val lvlHeal = (health / 100) * 30

    override fun attack(): Int {
        return Random.nextInt(damage.minDamage, damage.maxDamage)
    }

    fun heal(){
        if(manaHeal > 0){
            health += lvlHeal
            manaHeal--
            println("Игрок : исцеление")
            println("Игрок : Hp = $health")
        }
    }
}