package model.characters.orcs;

import model.characters.Character;

public abstract class Orc extends Character {
    public Orc() {
        super(base_health, base_long_range_attack, base_melee_attack, magic_attack);
    }
}
