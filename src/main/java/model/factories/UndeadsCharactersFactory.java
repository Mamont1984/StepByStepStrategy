package model.factories;

import model.characters.Archer;
import model.characters.Mage;
import model.characters.Warrior;
import model.characters.undeads.UndeadArcher;
import model.characters.undeads.UndeadMage;
import model.characters.undeads.UndeadWarrior;
import model.forces.DarkForces;

public class UndeadsCharactersFactory implements CharactersFactory,DarkForces {
    @Override
    public Archer createArcher() {
        return new UndeadArcher();
    }

    @Override
    public Mage createMage() {
        return new UndeadMage();
    }

    @Override
    public Warrior createWarrior() {
        return new UndeadWarrior();
    }
}
