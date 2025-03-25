/*
One-on-one duel:
    1. class Warrior, the instances of which will have 2 parameters:
         a. health (equal to 50 points)
         b. attack (equal to 5 points)
       and 1 property:
         c. isAlive, which can be True (if warrior's health is > 0) or False (in the other case).

    2. class Knight, which should be the subclass of the Warrior.
        a. attack - 7.
    3. create a top-level function fight().
       which will initiate the duel between 2 warriors and define the strongest of them.
       The duel occurs according to the following principle:
            Every turn, the first warrior will hit the second and this second will lose his health
            in the same value as the attack of the first warrior. After that, if he is still alive,
            the second warrior will do the same to the first one.
    4. The fight ends with the death of one of them. If the first warrior is still alive
    (and thus the other one is not anymore), the function should return True, False otherwise.
*/

open class Warrior() {
    var health: Int = 50
    open var attack: Int = 5

    val isAlive: Boolean
        get() = health > 0
}

class Knight: Warrior () {
    override var attack: Int = 7
}

fun fight(fighter1: Warrior, fighter2: Warrior): Boolean {
    var round: Int = 0
    while(fighter1.isAlive && fighter2.isAlive) {
        println("Round: $round\n Health Fighter1: ${fighter1.health} and Fighter2: ${fighter2.health} \n")
        fighter2.health -= fighter1.attack
        fighter1.health -= fighter2.attack
        round++
    }
    return fighter1.isAlive
}

fun main() {
    val knight: Knight = Knight()
    val warrior: Warrior = Warrior()

    val result= fight(warrior, knight)
    println("is the first fighter still Alive? $result")
}