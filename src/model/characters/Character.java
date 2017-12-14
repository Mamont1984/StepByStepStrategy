package model.characters;

import java.util.Random;

public abstract class Character {

    protected Random random = new Random();
    private int health = 100;
    private boolean buffed;

    public boolean isBuffed() {
        return buffed;
    }

    abstract public void act(Character attacker, Character defender);

    public void setBuffed(boolean buffed) {
        this.buffed = buffed;
    }

    public boolean isAlive(){
        return health > 0 ? true :false;
    }

    public void takeDamage(int dmg){
        this.health -= dmg;
    }

    public void killed(){
        System.out.println("DEAD!!!");
    }
}
