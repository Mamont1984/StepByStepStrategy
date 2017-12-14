package model.squads;

import model.characters.humans.HumanArcher;
import model.characters.humans.HumanMage;
import model.characters.humans.HumanWarrior;
import model.forces.LightForces;

public class HumanSquad extends AbstractSquad implements LightForces {
    public HumanSquad() {
        characterList.add(new HumanMage());

        characterList.add(new HumanArcher());
        characterList.add(new HumanArcher());
        characterList.add(new HumanArcher());

        characterList.add(new HumanWarrior());
        characterList.add(new HumanWarrior());
        characterList.add(new HumanWarrior());
        characterList.add(new HumanWarrior());
    }
}
