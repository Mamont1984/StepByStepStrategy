package model.characters;

import java.util.Random;

public abstract class Character {

    protected Random random = new Random();
    private int health = 100;
    protected int buff = 1;
    protected int disease = 1;

    public void setBuff(int buff) {
        this.buff = buff;
    }

    public void setDisease(int disease) {
        this.disease = disease;
    }

    abstract public void act(Character attacker, Character defender);

    public boolean isAlive(){
        return health > 0 ? true :false;
    }

    public void takeDamage(int dmg){
        System.out.println(" " + this.getClass().getSimpleName());
        this.health -= dmg;
    }

    public void killed(){
        System.out.println(this.getClass().getSimpleName() + " DEAD!!!");
    }
}
