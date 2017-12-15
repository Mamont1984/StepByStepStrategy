package model.characters.undeads;

import model.characters.Character;
import model.characters.Mage;

public class UndeadMage extends Undead implements Mage {
    private int magicAttack = 8;

    @Override
    public void act(Character attacker, Character defender) {
        if (isBuffed()) System.out.print("! ");
        if (random.nextBoolean()) {
            attacker.setBuffed(buff());
        } else {
            defender.takeDamage(magicAttack());
        }
    }

    public boolean buff() {
        System.out.print(this.getClass().getSimpleName() + " TODO buff!");
        return true;
    }

    public int magicAttack() {
        int dmg = this.isBuffed() ? (int) (magicAttack * 1.5) : magicAttack;
        System.out.print(this.getClass().getSimpleName() + " TODO magic attack ( HIT " + dmg + " HP!!! )");
        return dmg;
    }
}
