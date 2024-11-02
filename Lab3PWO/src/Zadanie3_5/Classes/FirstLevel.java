package Zadanie3_5.Classes;

import Zadanie3_5.Interfaces.Level;

public class FirstLevel implements Level {
    private String description;

    public FirstLevel(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
