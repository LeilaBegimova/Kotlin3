object CharacterCommon {
    fun defend(target: Character) {
        when (target) {
            is Character.Warrior -> println("Warrior ${target.name} использовал отражающий меч!")
            is Character.Mage -> println("Mage ${target.name} использует магическую защиту!")
            is Character.Archer -> println("Archer ${target.name} использовал ловкость!")
            else -> println("Unknown character attacks!")
        }

    }


    fun attack(attacker: Character) {
        when (attacker) {
            is Character.Warrior -> println("Warrior ${attacker.name} swings a sword at you!")
            is Character.Mage -> println("Mage ${attacker.name} hurls a magical attack!")
            is Character.Archer -> println("Archer ${attacker.name} fires an arrow at you!")
            else -> println("Unknown character attacks!")
        }
    }
}



