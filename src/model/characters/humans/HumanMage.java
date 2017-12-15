package model.characters.humans;

import model.characters.Character;
import model.characters.Mage;

public class HumanMage extends Human implements Mage  {

    private int magicAttack = 4;

    @Override
    public void act(Character attacker, Character defender) {
        if (random.nextBoolean()) {
            attacker.setBuffed(buff());
        } else {
            defender.takeDamage(magicAttack());
        }
    }

    public boolean buff() {
        System.out.print(this.getClass().getSimpleName() + " buffed");
        return true;
    }

    public int magicAttack() {
        int dmg = (int) (magicAttack * getEffectsModificator());
        System.out.print(this.getClass().getSimpleName() + " magic attack ( HIT " + dmg + " HP!!! )");
        return dmg;
    }
}
