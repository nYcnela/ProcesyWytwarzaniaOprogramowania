package Zadanie3_5.Classes;

import Zadanie3_5.Interfaces.GameMap;

public class EuropeMap implements GameMap {
    private String background;

    public EuropeMap(String background) {
        this.background = background;
    }

    public String getBackground() {
        return background;
    }
}
