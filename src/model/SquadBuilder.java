package model;

import model.forces.Forces;
import model.squads.Squad;

public interface SquadBuilder {
    Squad setSide(Forces force);
    Squad build();
}
