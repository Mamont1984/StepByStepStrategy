package model.squads;

import model.characters.elves.ElfArcher;
import model.characters.elves.ElfMage;
import model.characters.elves.ElfWarrior;
import model.forces.LightForces;

public class ElvesSquad extends AbstractSquad implements LightForces {
    public ElvesSquad() {
        charactersList.add(new ElfMage());

        charactersList.add(new ElfArcher());
        charactersList.add(new ElfArcher());
        charactersList.add(new ElfArcher());

        charactersList.add(new ElfWarrior());
        charactersList.add(new ElfWarrior());
        charactersList.add(new ElfWarrior());
        charactersList.add(new ElfWarrior());
    }
}
