package model.factories;

import model.characters.Archer;
import model.characters.Mage;
import model.characters.Warrior;
import model.characters.elves.ElfArcher;
import model.characters.elves.ElfMage;
import model.characters.elves.ElfWarrior;
import model.forces.LightForces;

public class ElvesCharactersFactory implements CharactersFactory,LightForces {
    @Override
    public Archer createArcher() {
        return new ElfArcher();
    }

    @Override
    public Mage createMage() {
        return new ElfMage();
    }

    @Override
    public Warrior createWarrior() {
        return new ElfWarrior();
    }
}
