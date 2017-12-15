package model.characters.undeads;

import model.characters.Archer;
import model.characters.Character;

public class UndeadArcher extends Undead implements Archer {

    private int longRangeAttack = 4;
    private int meleeAttack = 2;

    @Override
    public void act(Character attacker, Character defender) {
        if (isBuffed()) System.out.print("! ");
        if (random.nextBoolean()) {
            defender.takeDamage(longRangeAttack());
        } else {
            defender.takeDamage(meleeAttack());
        }
    }

    @Override
    public int longRangeAttack() {
        int dmg = this.isBuffed() ? (int) (longRangeAttack * 1.5) : longRangeAttack;
        System.out.print(this.getClass().getSimpleName() + " bow attack ( HIT " + dmg + " HP!!! )");
        return dmg;
    }

    @Override
    public int meleeAttack() {
        int dmg = this.isBuffed() ? (int) (meleeAttack * 1.5) : meleeAttack;
        System.out.print(this.getClass().getSimpleName() + " melee attack ( HIT " + dmg + " HP!!! )");
        return dmg;
    }
}
