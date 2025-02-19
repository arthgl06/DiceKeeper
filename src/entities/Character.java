package entities;

public class Character {
    private String name;
    private String race;
    private Attributes attributes;
    private Inventory inventory;

    public Character() {
    }

    public Character(String name, String race, Attributes attributes, Inventory inventory) {
        this.name = name;
        this.race = race;
        this.attributes = attributes;
        this.inventory = inventory;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public Attributes getAttributes() {
        return attributes;
    }

    public void setAttributes(Attributes attributes) {
        this.attributes = attributes;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }
}
