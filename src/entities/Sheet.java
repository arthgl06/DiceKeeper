package entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Sheet {
    private Character character;
    private LocalDate momentum = LocalDate.now();

    public Sheet() {}

    public Sheet(LocalDate momentum) {
        this.momentum = momentum;
    }

    List<Character> characterList = new ArrayList<>();

    public void addChar(Character character){
        characterList.add(character);
    }

    public void addChar(int i, Character character){
        characterList.add(i, character);
    }

    public void removeChar(Character character){
        characterList.remove(character);
    }

    public Character getCharacter() {
        return character;
    }

    public void setCharacter(Character character) {
        this.character = character;
    }

    public LocalDate getMomentum() {
        return momentum;
    }

    public void setMomentum(LocalDate momentum) {
        this.momentum = momentum;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Character chars : characterList) {
            sb.append("\n" + chars + "\n");
        }

        return sb.toString();
    }
}
