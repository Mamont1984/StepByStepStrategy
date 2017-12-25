package model.characters;

import model.modifiers.Modifier;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public abstract class Character {

    protected Random random = new Random();

    private List<Modifier> modifiers = new ArrayList<>();

    private int baseHealth;
    private int baseLongRangeAttack;
    private int baseMeleeAttack;
    private int baseMagicAttack;

    private int health;
    protected int longRangeAttack;
    protected int meleeAttack;
    protected int magicAttack;

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
}
