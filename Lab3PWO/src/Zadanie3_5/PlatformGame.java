package Zadanie3_5;

import Zadanie3_5.Interfaces.*;

import java.awt.*;
import java.util.ArrayList;

public class PlatformGame {
    private Level level;
    private GameMap gameMap;
    private ArrayList<Platform> platforms;
    private Player player;
    private ArrayList<Oponent> oponents;
    private ArrayList<Treasure> treasures;
    private double score;
    private String playerName;
    private Image avatar;

    public PlatformGame(String playerName, Level level, GameMap gameMap, Player player,
                        ArrayList<Platform> platforms, ArrayList<Oponent> oponents, ArrayList<Treasure> treasures) {
        this.level = level;
        this.gameMap = gameMap;
        this.player = player;
        this.platforms = platforms;
        this.oponents = oponents;
        this.treasures = treasures;
        this.score = 0;
        this.playerName = playerName;
        this.avatar = avatar;
    }

    public void changeLevel(Level newLevel) {
        this.level = newLevel;
    }

    public void movePlayer(int direction) {
        switch (direction) {
            case 1 -> player.moveUp();
            case 2 -> player.moveDown();
            case 3 -> player.moveForward();
            case 4 -> player.moveBackward();
            default -> player.stop();
        }
    }
}
