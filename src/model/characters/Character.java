package model.characters;

import java.util.Random;

public abstract class Character {

    protected Random random = new Random();
    private int health = 100;
    protected boolean buff;
    protected boolean disease;

    public boolean isBuffed() {
        return buff;
    }

    public boolean isDiseased() {
        return disease;
    }

    public void setBuffed(boolean buff) {
        this.buff = buff;
        System.out.println(" " + this.getClass().getSimpleName());
    }

    public void setDiseased(boolean disease) {
        this.disease = disease;
        System.out.println(" " + this.getClass().getSimpleName());
    }

    abstract public void act(Character attacker, Character defender);

    public boolean isAlive(){
        return health > 0 ? true :false;
    }

    public void takeDamage(int dmg){
        System.out.println(" " + this.getClass().getSimpleName());
        this.health -= dmg;
            if (health <= 0) killed();
    }

    public void killed(){
        System.out.println(this.getClass().getSimpleName() + " DEAD!!!");
    }

    public float getEffectsModificator() {
        return (buff ? 1.5F : 1F) * (disease ? 0.5F : 1F);
    }

    public void resetBuff() {
        this.buff = false;
    }

    public void resetDisease() {
        this.disease = false;
    }
}
