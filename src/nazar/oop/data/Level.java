package nazar.oop.data;

public enum Level {
    STANDARD("Standard Edition"),
    PREMIUM("Premium Edition"),
    VIP("VIP Edition");

    // -> demo Enum Constructor
    private String description;
    Level(String description){
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
