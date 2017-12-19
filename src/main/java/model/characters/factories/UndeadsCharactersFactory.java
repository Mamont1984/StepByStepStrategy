package model.characters.factories;

import model.characters.Archer;
import model.characters.Mage;
import model.characters.Warrior;
import model.characters.orcs.OrcArcher;
import model.characters.orcs.OrcMage;
import model.characters.orcs.OrcWarrior;
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
