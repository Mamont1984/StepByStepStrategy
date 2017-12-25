package model.characters.humans;

import model.characters.Character;

public abstract class Human extends Character {
    public Human() {
        super(base_health, base_long_range_attack, base_melee_attack, magic_attack);
    }
}
