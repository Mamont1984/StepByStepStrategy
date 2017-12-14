package model.characters.humans;

import model.characters.Character;
import model.characters.Mage;

public class HumanMage extends Human implements Mage  {

    private int magicAttack = 10;

    @Override
    public void act(Character attacker, Character defender) {
        if (isBuffed()) System.out.print("! ");
        if (random.nextBoolean()) {
            attacker.setBuffed(buff());
        } else {
            defender.takeDamage(magicAttack());
        }
    }

    @Override
    public boolean buff() {
        System.out.println(this.getClass().getSimpleName() + " buff!");
        return true;
    }

    @Override
    public int magicAttack() {
        int dmg = this.isBuffed() ? (int) (magicAttack * 1.5) : magicAttack;
        System.out.println(this.getClass().getSimpleName() + " magic attack ( HIT " + dmg + " HP!!! )");
        return dmg;
    }
}
