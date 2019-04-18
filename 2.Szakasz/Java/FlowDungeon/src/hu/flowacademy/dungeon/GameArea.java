package hu.flowacademy.dungeon;

import hu.flowacademy.dungeon.badge.AbstractBadge;
import hu.flowacademy.dungeon.quest.Quest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class GameArea {

    private List<Player> players = new ArrayList<>();

    private LinkedList<AbstractEnemy> map = new LinkedList<>();

    public static void main (String... args) throws IOException {
        System.out.println("Show me what you got!");

        GameArea gameArea = new GameArea();

        gameArea.initDefault();

        gameArea.readPlayers();

        gameArea.mainLoop();

    }

    private void mainLoop() {
        while (true) {
            if (gameEnded()) {
                break;
            }

            // get actual player
            // get enemy from actual position
            //


        }
    }

    private boolean gameEnded() {
        // TODO check players has all achievements
        // TODO check players ended all enemies
        return true;
    }

    private void initDefault() {
        map.add(new StaticObject("Budi", getRandomQuests()));
        map.add(new Enemy("Tasi's dungeon", getRandomQuests(), 20));
        map.add(new StaticObject("Detox", getRandomQuests()));
        map.add(new StaticObject("Mr. Place", getRandomQuests()));
        map.add(new Enemy("Pub", getRandomQuests(), 30));
        map.add(new Enemy("Feri's hell", getRandomQuests(), 45));
        map.add(new Enemy("Robi's arena", getRandomQuests(), 35));
        map.add(new StaticObject("Behind the door", getRandomQuests()));
        map.add(new Enemy("Vasrudazó", getRandomQuests(), Integer.MAX_VALUE));
        map.add(new StaticObject("Bankett", getRandomQuests()));
    }

    private List<Quest> getRandomQuests() {
        return List.of();
    }

    private void readPlayers() {
        System.out.println("How many players?");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    }

    private static void scanFromConsole() {
        Scanner scanner = new Scanner(System.in);

        var username = scanner.nextLine();

        System.out.println("Your name is " + username + "! Thanks!");

        System.out.println("Tell me your age!");

        var age = scanner.nextInt();

        System.out.println(age < 12 ? "Jackson likes you!" : "Too old!");
    }

    private static void readFromConsole() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String line;
        int i = 0;

        while ((line = bufferedReader.readLine()) != null) {
            if ("q".equalsIgnoreCase(line)) {
                System.exit(0);
            }
            System.out.println(i++ + " line >>" + line);
        }
    }
}
