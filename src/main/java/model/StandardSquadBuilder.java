package model;

import model.factories.*;
import model.squads.Squad;
import model.squads.StandardSquad;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class StandardSquadBuilder implements SquadBuilder {

    private Random random = new Random();
    private List<CharactersFactory> lightCharactersFactory = new ArrayList<>();
    private List<CharactersFactory> darkCharactersFactory = new ArrayList<>();

    public StandardSquadBuilder() {
        lightCharactersFactory.add(new ElvesCharactersFactory());
        lightCharactersFactory.add(new HumansCharactersFactory());
        darkCharactersFactory.add(new OrcsCharactersFactory());
        darkCharactersFactory.add(new UndeadsCharactersFactory());
    }

    @Override
    public Squad buildLightSquad() {
        return build(lightCharactersFactory);
    }

    @Override
    public Squad buildDarkSquad() {
        return build(darkCharactersFactory);
    }

    private Squad build(List<CharactersFactory> squadsList) {
        int rnd = random.nextInt(squadsList.size());
        CharactersFactory charactersFactory = squadsList.get(rnd);
        Squad squad = new StandardSquad();

        squad.addCharacter((model.characters.Character) charactersFactory.createMage());
        for (int i = 0; i < 3; i++) {
            squad.addCharacter((model.characters.Character) charactersFactory.createArcher());
        }
        for (int i = 0; i < 4; i++) {
            squad.addCharacter((model.characters.Character) charactersFactory.createWarrior());
        }
        return squad;
    }
}
