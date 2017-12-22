import model.SquadBuilder;
import model.StandardSquadBuilder;
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
    private SquadBuilder squadBuilder = new StandardSquadBuilder();
    private final int TURN_TIME_MILLS = 100;

    public static void main(String[] args) {
        try {
            new Game().go();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private void go() throws InterruptedException {

        init();

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

                sleep(TURN_TIME_MILLS);

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
//            System.out.println("Team1 " + squad1.getClass().getSimpleName() + " " + squad1.getAliveCount() +
//            " Team2 " + squad2.getClass().getSimpleName() + " " + squad2.getAliveCount());
        }
    }

    private void init() {
        squad1 = squadBuilder.buildLightSquad();
        squad2 = squadBuilder.buildDarkSquad();
    }
}
