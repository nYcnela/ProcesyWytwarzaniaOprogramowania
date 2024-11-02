package Zadanie3_5.Classes;

import Zadanie3_5.Interfaces.Avatar;

public class PlayerAvatar implements Avatar {
    private String playerName;

    public PlayerAvatar(String playerName) {
        this.playerName = playerName;
    }

    @Override
    public void display() {
        System.out.println("Wyświetlanie awatara gracza: " + playerName);
    }
}
