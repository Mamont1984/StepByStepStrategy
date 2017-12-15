package model.squads;

import model.characters.orcs.OrcArcher;
import model.characters.orcs.OrcMage;
import model.characters.orcs.OrcWarrior;
import model.forces.DarkForces;

public class OrcsSquad extends AbstractSquad implements DarkForces {
    public OrcsSquad() {
        charactersList.add(new OrcMage());

        charactersList.add(new OrcArcher());
        charactersList.add(new OrcArcher());
        charactersList.add(new OrcArcher());

        charactersList.add(new OrcWarrior());
        charactersList.add(new OrcWarrior());
        charactersList.add(new OrcWarrior());
        charactersList.add(new OrcWarrior());
    }
}
