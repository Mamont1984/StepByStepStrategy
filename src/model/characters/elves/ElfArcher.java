package model.characters.elves;

import model.characters.Archer;
import model.characters.Character;

public class ElfArcher extends Elf implements Archer {

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
        int dmg = longRangeAttack * buff * disease;
        System.out.print(this.getClass().getSimpleName() + " bow attack ( HIT " + dmg + " HP!!! )");
        return dmg;
    }

    @Override
    public int meleeAttack() {
        int dmg = meleeAttack * buff * disease;
        System.out.print(this.getClass().getSimpleName() + " melee attack ( HIT " + dmg + " HP!!! )");
        return dmg;
    }
}
