import java.util.Objects;

public class Card {
    private int id;
    private String name;
    private int level;

    public Card(int id, String name) {
        this.id = id;
        this.name = name;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    @Override
    public String toString() {
        return "Card{" +
                name +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Card card = (Card) o;
        return id == card.id && level == card.level && Objects.equals(name, card.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, level);
    }
}
//done