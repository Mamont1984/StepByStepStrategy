package model;

import model.forces.Forces;
import model.squads.Squad;

import java.util.ArrayList;
import java.util.List;

public class StandardSquadBuilder implements SquadBuilder {

    List<Character> lightSquads = new ArrayList<>();
    List<Character> darkSquads = new ArrayList<>();

    @Override
    public Squad setSide(Forces force) {
        return null;
    }

    @Override
    public Squad build() {
        return null;
    }
}
