package model.factories;

import model.characters.Archer;
import model.characters.Mage;
import model.characters.Warrior;

public interface CharactersFactory {
    Archer createArcher();
    Mage createMage();
    Warrior createWarrior();
}
