package model.characters.orcs;

import model.characters.Character;
import model.characters.Mage;
import model.squads.Squad;

public class OrcMage extends Orc implements Mage {
    private int magicAttack = 8;

    @Override
    public void act(Character attacker, Character defender) {
        if (random.nextBoolean()) {
            attacker.setBuffed(buff());
        } else {
            defender.takeDamage(magicAttack());
        }
    }

    @Override
    public boolean buff() {
        System.out.println(this.getClass().getCanonicalName() + " buff!");
        return true;
    }

    @Override
    public int magicAttack() {
        int dmg = this.isBuffed() ? (int) (magicAttack * 1.5) : magicAttack;
        System.out.println(this.getClass().getCanonicalName() + " magic attack ( HIT " + dmg + " HP!!! )");
        return dmg;
    }
}
