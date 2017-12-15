package model.characters.undeads;

import model.characters.Character;
import model.characters.Warrior;

public class UndeadWarrior extends Undead implements Warrior {
    private int meleeAttack = 18;

    @Override
    public void act(Character attacker, Character defender) {
        if (isBuffed()) System.out.print("! ");
        defender.takeDamage(meleeAttack());

    }

    @Override
    public int meleeAttack() {
        int dmg = this.isBuffed() ? (int) (meleeAttack * 1.5) : meleeAttack;
        System.out.print(this.getClass().getSimpleName() + " spear attack ( HIT " + dmg + " HP!!! )");
        return dmg;
    }
}
