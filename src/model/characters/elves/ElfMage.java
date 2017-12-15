package model.characters.elves;

import model.characters.Character;
import model.characters.Mage;
import model.characters.humans.Human;

public class ElfMage extends Elf implements Mage  {

    private int magicAttack = 10;

    @Override
    public void act(Character attacker, Character defender) {
        if (random.nextBoolean()) {
            attacker.setBuffed(buff());
        } else {
            defender.takeDamage(magicAttack());
        }
    }

    public boolean buff() {
        System.out.print(this.getClass().getSimpleName() + " buff!");
        return true;
    }

    public int magicAttack() {
        int dmg = (int) (magicAttack * getEffectsModificator());
        System.out.print(this.getClass().getSimpleName() + " magic attack ( HIT " + dmg + " HP!!! )");
        return dmg;
    }
}
