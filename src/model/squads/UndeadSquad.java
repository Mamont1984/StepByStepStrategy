package model.squads;

import model.characters.undeads.UndeadArcher;
import model.characters.undeads.UndeadMage;
import model.characters.undeads.UndeadWarrior;
import model.forces.DarkForces;

public class UndeadSquad extends AbstractSquad implements DarkForces {
    public UndeadSquad() {
        characterList.add(new UndeadMage());

        characterList.add(new UndeadArcher());
        characterList.add(new UndeadArcher());
        characterList.add(new UndeadArcher());

        characterList.add(new UndeadWarrior());
        characterList.add(new UndeadWarrior());
        characterList.add(new UndeadWarrior());
        characterList.add(new UndeadWarrior());
    }
}
