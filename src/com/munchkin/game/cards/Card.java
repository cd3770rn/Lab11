package com.munchkin.game.cards;

public class Card {
    private String name;
    private String description;

    public Card(String name, String description){
        this.name = name;
        this.description = description;
    }

    public Card(){
        this.name = "NO_NAME";
        this.description = "NO_DESCRIPTION";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Card{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
