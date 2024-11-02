package Zadanie3_5.Classes;

import Zadanie3_5.Interfaces.Player;

public class GreenSoldier implements Player {
    private String faction;

    public GreenSoldier(String faction) {
        this.faction = faction;
    }

    public void moveUp() { /* logic for moving up */ }
    public void moveDown() { /* logic for moving down */ }
    public void moveForward() { /* logic for moving forward */ }
    public void moveBackward() { /* logic for moving backward */ }
    public void stop() { /* logic for stopping */ }
}
