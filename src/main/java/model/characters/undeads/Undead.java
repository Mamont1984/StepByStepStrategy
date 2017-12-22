package model.characters.undeads;

import model.characters.Character;

public abstract class Undead extends Character {
    public Undead() {
        super(base_health, base_long_range_attack, base_melee_attack, magic_attack);
    }
}
