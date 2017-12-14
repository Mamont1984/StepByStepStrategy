package model.characters.humans;

import model.characters.Archer;
import model.characters.Character;
import model.squads.Squad;

public class HumanArcher extends Human implements Archer {

    private int longRangeAttack = 7;
    private int meleeAttack = 3;

    @Override
    public void act(Character attacker, Character defender) {
        if (random.nextBoolean()) {
            defender.takeDamage(longRangeAttack());
        } else {
            defender.takeDamage(meleeAttack());
        }
    }

    @Override
    public int longRangeAttack() {
        int dmg = this.isBuffed() ? (int) (longRangeAttack * 1.5) : longRangeAttack;
        System.out.println(this.getClass().getCanonicalName() + " crossbow attack ( HIT " + dmg + " HP!!! )");
        return dmg;
    }

    @Override
    public int meleeAttack() {
        int dmg = this.isBuffed() ? (int) (meleeAttack * 1.5) : meleeAttack;
        System.out.println(this.getClass().getCanonicalName() + " melee attack ( HIT " + dmg + " HP!!! )");
        return dmg;
    }
}
