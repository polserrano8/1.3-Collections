package Model;

import java.util.Objects;

public class Restaurant {
    private String name;
    private int score;

    public Restaurant(String name, int score) {
        this.name = name;
        this.score = score;
    }

    @Override
    public boolean equals(Object same) {
        if (this == same) return true;
        if (same == null || getClass() != same.getClass()) return false;
        Restaurant myObject = (Restaurant) same;
        return Objects.equals(name, myObject.name) && Objects.equals(score, myObject.score);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }
}
