package model.squads;

import model.characters.Character;

import java.util.List;

public interface Squad {

    List<Character> getCharactersList();
    Character getRandomCharacter();
    boolean isDefeated();
    void removeKilledCharacter(Character character);
    int getAliveCount();
    void addCharacter(Character character);
}
