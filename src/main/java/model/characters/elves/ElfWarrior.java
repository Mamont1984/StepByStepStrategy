package model.characters.elves;

import model.characters.Character;
import model.characters.Warrior;
import model.characters.humans.Human;

public class ElfWarrior extends Elf implements Warrior {

    private int meleeAttack = 15;

    @Override
    public void act(Character attacker, Character defender) {
        defender.takeDamage(meleeAttack());
    }

    @Override
    public int meleeAttack() {
        int dmg = (int) (meleeAttack * getEffectsModificator());
        System.out.print(this.getClass().getSimpleName() + " sword attack ( HIT " + dmg + " HP!!! )");
        return dmg;
    }
}
