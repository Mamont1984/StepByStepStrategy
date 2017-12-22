package model.characters.elves;

import model.characters.Character;

public abstract class Elf extends Character {
    public Elf() {
        super(base_health, base_long_range_attack, base_melee_attack, magic_attack);
    }
}
