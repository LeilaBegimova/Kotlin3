sealed class Character(
    val name: Strin,
    val weaponType: WeaponType
) {
    data class Warrior(val ability: Strin): Character(WARRIOR_NAME, WeaponType.SWORD)
    data class Mage(val ability: Strin) : Character(MAGE_NAME, WeaponType.STICK)
    data class Archer(val ability: Strin):Character(ARCHER_NAME,WeaponType.BOW)
    companion object{
        const val WARRIOR_NAME ="Воин"
        const val MAGE_NAME ="Маг"
        const val ARCHER_NAME ="Лучник"
    }

}

