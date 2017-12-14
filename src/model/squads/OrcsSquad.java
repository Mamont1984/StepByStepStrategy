package model.squads;

import model.characters.orcs.OrcArcher;
import model.characters.orcs.OrcMage;
import model.characters.orcs.OrcWarrior;
import model.forces.DarkForces;

public class OrcsSquad extends AbstractSquad implements DarkForces {
    public OrcsSquad() {
        characterList.add(new OrcMage());

        characterList.add(new OrcArcher());
        characterList.add(new OrcArcher());
        characterList.add(new OrcArcher());

        characterList.add(new OrcWarrior());
        characterList.add(new OrcWarrior());
        characterList.add(new OrcWarrior());
        characterList.add(new OrcWarrior());
    }
}
