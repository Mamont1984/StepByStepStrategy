package model.characters.undeads;

import model.characters.Character;
import model.characters.Mage;

public class UndeadMage extends Undead implements Mage {
    private int magicAttack = 5;

    @Override
    public void act(Character attacker, Character defender) {
        if (random.nextBoolean()) {
            defender.setDiseased(disease());
        } else {
            defender.takeDamage(magicAttack());
        }
    }

    public boolean disease() {
        System.out.print(this.getClass().getSimpleName() + " disease!");
        return true;
    }

    public int magicAttack() {
        int dmg = (int) (magicAttack * getEffectsModificator());
        System.out.print(this.getClass().getSimpleName() + " magic attack ( HIT " + dmg + " HP!!! )");
        return dmg;
    }
}
