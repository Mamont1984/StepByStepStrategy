package model.factories;

import model.characters.Archer;
import model.characters.Mage;
import model.characters.Warrior;
import model.characters.humans.HumanArcher;
import model.characters.humans.HumanMage;
import model.characters.humans.HumanWarrior;
import model.forces.LightForces;

public class HumansCharactersFactory implements CharactersFactory,LightForces {
    @Override
    public Archer createArcher() {
        return new HumanArcher();
    }

    @Override
    public Mage createMage() {
        return new HumanMage();
    }

    @Override
    public Warrior createWarrior() {
        return new HumanWarrior();
    }
}
