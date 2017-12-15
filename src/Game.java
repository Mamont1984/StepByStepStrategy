import model.characters.Character;
import model.squads.*;

import java.util.List;
import java.util.Random;

import static java.lang.Thread.sleep;

public class Game {

    private Random random = new Random();
    boolean gameOver;
    private Squad squad1;
    private Squad squad2;
    private boolean playersTurn = random.nextBoolean();
    private int turnNumber = 0;

    public Game() {
        squad1 = new HumanSquad();
        squad2 = new UndeadSquad();
    }

    public static void main(String[] args) {
        new Game().go();
    }

    private void go() {
        while (!gameOver) {
            System.out.println("           Turn #" + turnNumber++);
            Squad attacker;
            Squad defender;
                if (playersTurn) {
                    attacker = squad1;
                    defender = squad2;
                } else {
                    attacker = squad2;
                    defender = squad1;
                }

            List<Character> characterList = attacker.getCharactersList();
            for (Character character : characterList) {


                try {
                    sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }


                Character friend = attacker.getRandomCharacter();
                Character enemy = defender.getRandomCharacter();
                    character.act(friend, enemy);
                    if (!enemy.isAlive()) {
                        defender.removeKilledCharacter(enemy);
                    }

                    character.resetBuff();
                    character.resetDisease();

                    if (defender.isDefeated()) {
                        gameOver = true;
                        System.out.println("===========================================");
                        System.out.println("                GAME OVER!");
                    break;
                }
            }

            playersTurn = !playersTurn;
            System.out.println("===========================================");
        }
    }
}
