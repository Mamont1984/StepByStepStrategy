package model.squads;

import model.characters.undeads.UndeadArcher;
import model.characters.undeads.UndeadMage;
import model.characters.undeads.UndeadWarrior;
import model.forces.DarkForces;

public class UndeadSquad extends AbstractSquad implements DarkForces {
    public UndeadSquad() {
        charactersList.add(new UndeadMage());

        charactersList.add(new UndeadArcher());
        charactersList.add(new UndeadArcher());
        charactersList.add(new UndeadArcher());

        charactersList.add(new UndeadWarrior());
        charactersList.add(new UndeadWarrior());
        charactersList.add(new UndeadWarrior());
        charactersList.add(new UndeadWarrior());
    }
}
