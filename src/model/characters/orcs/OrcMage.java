package model.characters.orcs;

import model.characters.Character;
import model.characters.Mage;
import model.squads.Squad;

public class OrcMage extends Orc implements Mage {

    @Override
    public void act(Character attacker, Character defender) {
        if (isBuffed()) System.out.print("! ");
        if (random.nextBoolean()) {
            attacker.setBuffed(buff());
        } else {
            defender.setBuffed(unBuff());
        }
    }

    public boolean buff() {
        System.out.print(this.getClass().getSimpleName() + " buff!");
        return true;
    }

    public boolean unBuff() {
        System.out.print(this.getClass().getSimpleName() + " debuff!");
        return false;
    }
}
