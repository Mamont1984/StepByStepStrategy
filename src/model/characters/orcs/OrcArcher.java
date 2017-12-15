package model.characters.orcs;

import model.characters.Archer;
import model.characters.Character;

public class OrcArcher extends Orc implements Archer {

    private int longRangeAttack = 3;
    private int meleeAttack = 2;

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
        System.out.print(this.getClass().getSimpleName() + " bow attack ( HIT " + dmg + " HP!!! )");
        return dmg;
    }

    @Override
    public int meleeAttack() {
        int dmg = (int) (meleeAttack * getEffectsModificator());
        System.out.print(this.getClass().getSimpleName() + " blade attack ( HIT " + dmg + " HP!!! )");
        return dmg;
    }
}
