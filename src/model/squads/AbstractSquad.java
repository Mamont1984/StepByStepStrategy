package model.squads;

import model.characters.Character;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public abstract class AbstractSquad implements Squad {
    protected List<Character> charactersList = new ArrayList<>();
    private Random random = new Random();

    @Override
    public List<Character> getCharactersList() {
        Collections.shuffle(charactersList);
        Collections.sort(charactersList, (o1, o2) -> {
            if (o1.isBuffed() && !o2.isBuffed()) return -1;
            if (!o1.isBuffed() && o2.isBuffed())return 1;
            else return 0;
        });
        return charactersList;
    }

    @Override
    public Character getRandomCharacter() {
        return charactersList.get(random.nextInt(charactersList.size()));
    }

    @Override
    public boolean isDefeated() {
        return charactersList.isEmpty();
    }

    @Override
    public void removeKilledCharacter(Character character) {
        charactersList.remove(character);
    }
}
