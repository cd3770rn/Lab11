package com.munchkin.game.cards;

public class Monster extends Card{
    private int level;
    private String badStuff;
    private int treasures;
    private int levelsGainedOnDefeat;

    public Monster(String name, String description, String badStuff, int level, int treasures, int levelsGainedOnDefeat){
        super(name, description);
        this.badStuff = badStuff;
        this.level = level;
        this.treasures = treasures;
        this.levelsGainedOnDefeat = levelsGainedOnDefeat;
    }

    public Monster(){
        super();
    }

    @Override
    public String toString() {
        return "Monster{" +
                "name='" + getName() + '\'' +
                ", description='" + getDescription() + '\'' +
                ", level=" + level +
                ", badStuff='" + badStuff + '\'' +
                ", treasures=" + treasures +
                ", levelsGainedOnDefeat=" + levelsGainedOnDefeat +
                '}';
    }
}
