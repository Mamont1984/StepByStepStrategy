package model.characters.orcs;

import model.characters.Character;
import model.characters.Mage;

public class OrcMage extends Orc implements Mage {

    @Override
    public void act(Character attacker, Character defender) {
        if (random.nextBoolean()) {
            attacker.setBuffed(buff());
        } else {
            defender.setBuffed(deBuff());
        }
    }

    public boolean buff() {
        System.out.print(this.getClass().getSimpleName() + " buff!");
        return true;
    }

    public boolean deBuff() {
        System.out.print(this.getClass().getSimpleName() + " debuff!");
        return false;
    }
}
