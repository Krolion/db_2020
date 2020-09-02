package homework.riddle_game;

import design_patterns.template_method.Game;

import javax.swing.*;
import java.util.concurrent.ThreadLocalRandom;

/**
 * @author Evgeny Borisov
 */
public class RiddleGame implements Game {

    //todo

    private final int maxLimit;
    private int trueNumber;
    private int numberOfGames;

    public RiddleGame(int max) {
        this.maxLimit = max;
    }

    public static void main(String[] args) {
        int tmp = Integer.parseInt(JOptionPane.showInputDialog("Enter max number:"));
        RiddleGame game = new RiddleGame(tmp);
        game.play();
    }

    @Override
    public void play() {
        int tmp = Integer.parseInt(JOptionPane.showInputDialog("Enter desired number of games:"));
        numberOfGames = tmp;
        int[] scores = new int[tmp];
        for (int i = 0; i < numberOfGames; ++i) {
            trueNumber = 1;
        }
    }
}
