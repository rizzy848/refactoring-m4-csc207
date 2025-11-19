package theater;

/**
 * This class stores basic information about a play,
 * including its title and its genre or classification.
 * It provides getters and setters for both fields.
 */
public class Play {

    private String name;
    private String type;

    public Play(String name, String type) {
        this.setName(name);
        this.setType(type);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
