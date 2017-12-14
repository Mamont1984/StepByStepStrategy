package model.squads;

import model.characters.Character;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public abstract class AbstractSquad implements Squad {
    private Random random = new Random();
    protected List<Character> characterList = new ArrayList<>();

    @Override
    public List<Character> getCharactersList() {
        Collections.shuffle(characterList);
        Collections.sort(characterList, (o1, o2) -> {
            if (o1.isBuffed() && !o2.isBuffed()) return 1;
            if (!o1.isBuffed() && o2.isBuffed())return -1;
            else return 0;
        });
        return characterList;
    }

    @Override
    public Character getRandomCharacter() {
        return characterList.get(random.nextInt(characterList.size()));
    }

    @Override
    public boolean isDefeated() {
        return characterList.isEmpty();
    }

    @Override
    public void removeKilledCharacter(Character character) {
        characterList.remove(character);
    }
}
