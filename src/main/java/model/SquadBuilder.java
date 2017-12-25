package model;

import model.forces.Forces;
import model.squads.Squad;

public interface SquadBuilder {
    Squad buildLightSquad();
    Squad buildDarkSquad();
}
