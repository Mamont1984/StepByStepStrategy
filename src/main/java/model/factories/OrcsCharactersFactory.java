package model.factories;

import model.characters.Archer;
import model.characters.Mage;
import model.characters.Warrior;
import model.characters.orcs.OrcArcher;
import model.characters.orcs.OrcMage;
import model.characters.orcs.OrcWarrior;
import model.forces.DarkForces;

public class OrcsCharactersFactory implements CharactersFactory,DarkForces {
    @Override
    public Archer createArcher() {
        return new OrcArcher();
    }

    @Override
    public Mage createMage() {
        return new OrcMage();
    }

    @Override
    public Warrior createWarrior() {
        return new OrcWarrior();
    }
}
