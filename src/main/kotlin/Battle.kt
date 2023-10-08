import kotlin.random.Random

class Battle(
    private val player: Player,
    private val monster: Monster
) {
    private var stopBattle = false

    fun start(){
        val attackModifierPlayer = player.calculateAttackModifier(monster.defense)
        val attackModifierMonster = monster.calculateAttackModifier(player.defense)

        while (!stopBattle){
            if(rollDice(attackModifierPlayer)){
                println("Игрок : удар")
                monster.health -= player.attack()
                println("Монстр : HP = ${monster.health}")
                if (monster.health <= 0) {
                    println("ПОБЕДА")
                    stopBattle = true
                    return
                }
            }
            if(rollDice(attackModifierMonster)){
                println("Монстр : удар")
                player.health -= monster.attack()
                println("Игрок : HP = ${player.health}")
                if (player.health <= 0) {
                    println("ГАМОВЕР")
                    stopBattle = true
                    return
                }else if(player.health < player.lvlHeal){
                    player.heal()
                }
            }
        }
    }

    private fun rollDice(attackModifier: Int): Boolean{
        for (i in 1..attackModifier){
            val result = Random.nextInt(1, 6)
            if (result >= 5) return true
        }
        return false
    }
}