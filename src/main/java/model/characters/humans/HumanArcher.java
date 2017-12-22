package model.characters.humans;

import model.characters.Archer;
import model.characters.Character;
import model.squads.Squad;

public class HumanArcher extends Human implements Archer {

    private int longRangeAttack = 5;
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
        int dmg = (int) (longRangeAttack * getEffectsModificator());
        System.out.print(this.getClass().getSimpleName() + " crossbow attack ( HIT " + dmg + " HP!!! )");
        return dmg;
    }

    @Override
    public int meleeAttack() {
        int dmg = (int) (meleeAttack * getEffectsModificator());
        System.out.print(this.getClass().getSimpleName() + " melee attack ( HIT " + dmg + " HP!!! )");
        return dmg;
    }
}
