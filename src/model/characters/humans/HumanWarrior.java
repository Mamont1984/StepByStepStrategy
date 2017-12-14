package model.characters.humans;

import model.characters.Character;
import model.characters.Warrior;

public class HumanWarrior extends Human implements Warrior {

    private int meleeAttack = 15;

    @Override
    public void act(Character attacker, Character defender) {
        defender.takeDamage(meleeAttack());

    }

    @Override
    public int meleeAttack() {
        int dmg = this.isBuffed() ? (int) (meleeAttack * 1.5) : meleeAttack;
        System.out.println(this.getClass().getCanonicalName() + " melee attack ( HIT " + dmg + " HP!!! )");
        return dmg;
    }
}
