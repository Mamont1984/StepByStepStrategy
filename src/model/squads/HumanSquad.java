package model.squads;

import model.characters.humans.HumanArcher;
import model.characters.humans.HumanMage;
import model.characters.humans.HumanWarrior;
import model.forces.LightForces;

public class HumanSquad extends AbstractSquad implements LightForces {
    public HumanSquad() {
        charactersList.add(new HumanMage());

        charactersList.add(new HumanArcher());
        charactersList.add(new HumanArcher());
        charactersList.add(new HumanArcher());

        charactersList.add(new HumanWarrior());
        charactersList.add(new HumanWarrior());
        charactersList.add(new HumanWarrior());
        charactersList.add(new HumanWarrior());
    }
}
