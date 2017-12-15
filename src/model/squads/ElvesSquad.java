package model.squads;

import model.characters.elves.ElfArcher;
import model.characters.elves.ElfMage;
import model.characters.elves.ElfWarrior;
import model.forces.LightForces;

public class ElvesSquad extends AbstractSquad implements LightForces {
    public ElvesSquad() {
        characterList.add(new ElfMage());

        characterList.add(new ElfArcher());
        characterList.add(new ElfArcher());
        characterList.add(new ElfArcher());

        characterList.add(new ElfWarrior());
        characterList.add(new ElfWarrior());
        characterList.add(new ElfWarrior());
        characterList.add(new ElfWarrior());
    }
}
