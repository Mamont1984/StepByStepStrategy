package model.characters.humans;

import model.characters.Character;
import model.characters.Warrior;

public class HumanWarrior extends Human implements Warrior {

    private int meleeAttack = 18;

    @Override
    public void act(Character attacker, Character defender) {
        defender.takeDamage(meleeAttack());
    }

    @Override
    public int meleeAttack() {
        int dmg = (int) (meleeAttack * getEffectsModificator());
        System.out.print(this.getClass().getSimpleName() + " melee attack ( HIT " + dmg + " HP!!! )");
        return dmg;
    }
}
