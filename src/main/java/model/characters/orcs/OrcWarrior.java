package model.characters.orcs;

import model.characters.Character;
import model.characters.Warrior;

public class OrcWarrior extends Orc implements Warrior {
    private int meleeAttack = 20;

    @Override
    public void act(Character attacker, Character defender) {
        defender.takeDamage(meleeAttack());
    }

    @Override
    public int meleeAttack() {
        int dmg = (int) (meleeAttack * getEffectsModificator());
        System.out.print(this.getClass().getSimpleName() + " club attack ( HIT " + dmg + " HP!!! )");
        return dmg;
    }
}
